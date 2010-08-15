/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

import java.sql.Timestamp;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
public class Triggers extends TableImpl {

	private static final long serialVersionUID = -695726189787350313L;

	/**
	 * The singleton instance of TRIGGERS
	 */
	public static final Triggers TRIGGERS = new Triggers();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TRIGGER_CATALOG = new TableFieldImpl<String>("TRIGGER_CATALOG", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TRIGGER_SCHEMA = new TableFieldImpl<String>("TRIGGER_SCHEMA", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TRIGGER_NAME = new TableFieldImpl<String>("TRIGGER_NAME", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> EVENT_MANIPULATION = new TableFieldImpl<String>("EVENT_MANIPULATION", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> EVENT_OBJECT_CATALOG = new TableFieldImpl<String>("EVENT_OBJECT_CATALOG", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> EVENT_OBJECT_SCHEMA = new TableFieldImpl<String>("EVENT_OBJECT_SCHEMA", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> EVENT_OBJECT_TABLE = new TableFieldImpl<String>("EVENT_OBJECT_TABLE", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> ACTION_ORDER = new TableFieldImpl<Integer>("ACTION_ORDER", Integer.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_CONDITION = new TableFieldImpl<String>("ACTION_CONDITION", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_STATEMENT = new TableFieldImpl<String>("ACTION_STATEMENT", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_ORIENTATION = new TableFieldImpl<String>("ACTION_ORIENTATION", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_TIMING = new TableFieldImpl<String>("ACTION_TIMING", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_REFERENCE_OLD_TABLE = new TableFieldImpl<String>("ACTION_REFERENCE_OLD_TABLE", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_REFERENCE_NEW_TABLE = new TableFieldImpl<String>("ACTION_REFERENCE_NEW_TABLE", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_REFERENCE_OLD_ROW = new TableFieldImpl<String>("ACTION_REFERENCE_OLD_ROW", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ACTION_REFERENCE_NEW_ROW = new TableFieldImpl<String>("ACTION_REFERENCE_NEW_ROW", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> CREATED = new TableFieldImpl<Timestamp>("CREATED", Timestamp.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SQL_MODE = new TableFieldImpl<String>("SQL_MODE", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DEFINER = new TableFieldImpl<String>("DEFINER", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CHARACTER_SET_CLIENT = new TableFieldImpl<String>("CHARACTER_SET_CLIENT", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLLATION_CONNECTION = new TableFieldImpl<String>("COLLATION_CONNECTION", String.class, TRIGGERS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DATABASE_COLLATION = new TableFieldImpl<String>("DATABASE_COLLATION", String.class, TRIGGERS);

	/**
	 * No further instances allowed
	 */
	private Triggers() {
		super("TRIGGERS", InformationSchema.INFORMATION_SCHEMA);
	}
}
