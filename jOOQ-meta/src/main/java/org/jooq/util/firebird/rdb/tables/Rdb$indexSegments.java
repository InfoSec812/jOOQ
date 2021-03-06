/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$indexSegments extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1659502875;

	/**
	 * The singleton instance of <code>RDB$INDEX_SEGMENTS</code>
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$indexSegments RDB$INDEX_SEGMENTS = new org.jooq.util.firebird.rdb.tables.Rdb$indexSegments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>RDB$INDEX_SEGMENTS.RDB$INDEX_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$INDEX_NAME = createField("RDB$INDEX_NAME", org.jooq.impl.SQLDataType.CHAR.length(31), this, "");

	/**
	 * The column <code>RDB$INDEX_SEGMENTS.RDB$FIELD_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$FIELD_NAME = createField("RDB$FIELD_NAME", org.jooq.impl.SQLDataType.CHAR.length(31), this, "");

	/**
	 * The column <code>RDB$INDEX_SEGMENTS.RDB$FIELD_POSITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_POSITION = createField("RDB$FIELD_POSITION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$INDEX_SEGMENTS.RDB$STATISTICS</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Double> RDB$STATISTICS = createField("RDB$STATISTICS", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * Create a <code>RDB$INDEX_SEGMENTS</code> table reference
	 */
	public Rdb$indexSegments() {
		this("RDB$INDEX_SEGMENTS", null);
	}

	/**
	 * Create an aliased <code>RDB$INDEX_SEGMENTS</code> table reference
	 */
	public Rdb$indexSegments(java.lang.String alias) {
		this(alias, org.jooq.util.firebird.rdb.tables.Rdb$indexSegments.RDB$INDEX_SEGMENTS);
	}

	private Rdb$indexSegments(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Rdb$indexSegments(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.firebird.rdb.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$indexSegments as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$indexSegments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.firebird.rdb.tables.Rdb$indexSegments rename(java.lang.String name) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$indexSegments(name, null);
	}
}
