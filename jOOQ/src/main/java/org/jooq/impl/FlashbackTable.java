/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is triple-licensed under ASL 2.0, AGPL 3.0, and jOOQ EULA
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   ASL 2.0 or jOOQ EULA.
 * - If you're using this work with at least one commercial database, you may
 *   choose AGPL 3.0 or jOOQ EULA.
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * AGPL 3.0
 * -----------------------------------------------------------------------------
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this library.
 * If not, see http://www.gnu.org/licenses.
 *
 * jOOQ End User License Agreement:
 * -----------------------------------------------------------------------------
 * This library is commercial software; you may not redistribute it nor
 * modify it.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ End User
 * License Agreement for more details: http://www.jooq.org/eula
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.keyword;
import static org.jooq.impl.DSL.val;

import org.jooq.BindContext;
import org.jooq.Field;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.RenderContext;
import org.jooq.Table;
import org.jooq.VersionsBetweenAndStep;

/**
 * A flashback query clause implementation.
 *
 * @author Lukas Eder
 */
class FlashbackTable<R extends Record, T>
extends AbstractTable<R>
implements VersionsBetweenAndStep<R, T> {

    /**
     * Generated UID
     */
    private static final long   serialVersionUID = -7918219502110473521L;

    private final Table<R>      table;
    private final QueryPart     type;
    private final Field<?>      asOf;
    private final QueryPart     minvalue;
    private QueryPart           maxvalue;

    FlashbackTable(Table<R> table, Field<?> asOf, Field<?> minvalue, FlashbackType type) {
        super("flashbackquery");

        this.table = table;
        this.asOf = asOf;
        this.minvalue = minvalue != null ? minvalue : keyword("minvalue");
        this.type = type == FlashbackType.SCN ? keyword("scn") : keyword("timestamp");
    }

    // ------------------------------------------------------------------------
    // XXX: Flashback API
    // ------------------------------------------------------------------------

    @Override
    public final Table<R> and(T value) {
        return and(val(value));
    }

    @Override
    public final Table<R> and(Field<? extends T> field) {
        maxvalue = field;
        return this;
    }

    @Override
    public final Table<R> andMaxvalue() {
        maxvalue = keyword("maxvalue");
        return this;
    }

    // ------------------------------------------------------------------------
    // XXX: Table API
    // ------------------------------------------------------------------------

    @Override
    public final Class<? extends R> getRecordType() {
        return table.getRecordType();
    }

    @Override
    public final void toSQL(RenderContext context) {
        context.visit(table);

        if (asOf != null) {
            context.sql(" ")
                   .keyword("as of")
                   .sql(" ")
                   .visit(type)
                   .sql(" ")
                   .visit(asOf);
        }
        else {
            context.sql(" ")
                   .keyword("versions between")
                   .sql(" ")
                   .visit(type)
                   .sql(" ")
                   .visit(minvalue)
                   .sql(" ")
                   .keyword("and")
                   .sql(" ")
                   .visit(maxvalue);
        }
    }

    @Override
    public final void bind(BindContext context) {
        context.visit(table);

        if (asOf != null) {
            context.visit(asOf);
        }
        else {
            context.visit(minvalue).visit(maxvalue);
        }
    }

    @Override
    public final boolean declaresTables() {
        return true;
    }

    @Override
    public final Table<R> as(String alias) {
        return new TableAlias<R>(this, alias, true);
    }

    @Override
    public final Table<R> as(String alias, String... fieldAliases) {
        return new TableAlias<R>(this, alias, fieldAliases, true);
    }

    @Override
    final Fields<R> fields0() {
        return new Fields<R>(table.fields());
    }

    /**
     * The flashback query clause type
     */
    enum FlashbackType {
        SCN, TIMESTAMP;
    }
}