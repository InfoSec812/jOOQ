/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2327UkOnly implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_2327UkOnly {

	private static final long serialVersionUID = 982047506;

	private java.lang.Integer id;

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_2327UkOnly from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_2327UkOnly> E into(E into) {
		into.from(this);
		return into;
	}
}
