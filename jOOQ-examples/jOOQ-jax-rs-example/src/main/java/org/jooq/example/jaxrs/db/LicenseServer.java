/**
 * This class is generated by jOOQ
 */
package org.jooq.example.jaxrs.db;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LicenseServer extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1750632487;

	/**
	 * The singleton instance of <code>license_server</code>
	 */
	public static final LicenseServer LICENSE_SERVER = new LicenseServer();

	/**
	 * No further instances allowed
	 */
	private LicenseServer() {
		super("license_server");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.example.jaxrs.db.Sequences.LICENSE_ID_SEQ,
			org.jooq.example.jaxrs.db.Sequences.LOG_VERIFY_ID_SEQ);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.example.jaxrs.db.tables.License.LICENSE,
			org.jooq.example.jaxrs.db.tables.LogVerify.LOG_VERIFY);
	}
}
