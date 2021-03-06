/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = -1842687351;

	/**
	 * The singleton instance of <code>X_TEST_CASE_2025</code>
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>X_TEST_CASE_2025.REF_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("REF_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("REF_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * Create a <code>X_TEST_CASE_2025</code> table reference
	 */
	public XTestCase_2025() {
		this("X_TEST_CASE_2025", null);
	}

	/**
	 * Create an aliased <code>X_TEST_CASE_2025</code> table reference
	 */
	public XTestCase_2025(java.lang.String alias) {
		this(alias, org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);
	}

	private XTestCase_2025(java.lang.String alias, org.jooq.Table<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_2025(java.lang.String alias, org.jooq.Table<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.firebird.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.firebird.generatedclasses.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.firebird.generatedclasses.Keys.FK_X_TEST_CASE_2025_1, org.jooq.test.firebird.generatedclasses.Keys.FK_X_TEST_CASE_2025_2, org.jooq.test.firebird.generatedclasses.Keys.FK_X_TEST_CASE_2025_3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025 as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025 rename(java.lang.String name) {
		return new org.jooq.test.firebird.generatedclasses.tables.XTestCase_2025(name, null);
	}
}
