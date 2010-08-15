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
public class Partitions extends TableImpl {

	private static final long serialVersionUID = -9110038408046597413L;

	/**
	 * The singleton instance of PARTITIONS
	 */
	public static final Partitions PARTITIONS = new Partitions();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_CATALOG = new TableFieldImpl<String>("TABLE_CATALOG", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_SCHEMA = new TableFieldImpl<String>("TABLE_SCHEMA", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PARTITION_NAME = new TableFieldImpl<String>("PARTITION_NAME", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SUBPARTITION_NAME = new TableFieldImpl<String>("SUBPARTITION_NAME", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> PARTITION_ORDINAL_POSITION = new TableFieldImpl<Integer>("PARTITION_ORDINAL_POSITION", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> SUBPARTITION_ORDINAL_POSITION = new TableFieldImpl<Integer>("SUBPARTITION_ORDINAL_POSITION", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PARTITION_METHOD = new TableFieldImpl<String>("PARTITION_METHOD", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SUBPARTITION_METHOD = new TableFieldImpl<String>("SUBPARTITION_METHOD", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PARTITION_EXPRESSION = new TableFieldImpl<String>("PARTITION_EXPRESSION", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SUBPARTITION_EXPRESSION = new TableFieldImpl<String>("SUBPARTITION_EXPRESSION", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PARTITION_DESCRIPTION = new TableFieldImpl<String>("PARTITION_DESCRIPTION", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> TABLE_ROWS = new TableFieldImpl<Integer>("TABLE_ROWS", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> AVG_ROW_LENGTH = new TableFieldImpl<Integer>("AVG_ROW_LENGTH", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> DATA_LENGTH = new TableFieldImpl<Integer>("DATA_LENGTH", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> MAX_DATA_LENGTH = new TableFieldImpl<Integer>("MAX_DATA_LENGTH", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> INDEX_LENGTH = new TableFieldImpl<Integer>("INDEX_LENGTH", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> DATA_FREE = new TableFieldImpl<Integer>("DATA_FREE", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> CREATE_TIME = new TableFieldImpl<Timestamp>("CREATE_TIME", Timestamp.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> UPDATE_TIME = new TableFieldImpl<Timestamp>("UPDATE_TIME", Timestamp.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> CHECK_TIME = new TableFieldImpl<Timestamp>("CHECK_TIME", Timestamp.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> CHECKSUM = new TableFieldImpl<Integer>("CHECKSUM", Integer.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PARTITION_COMMENT = new TableFieldImpl<String>("PARTITION_COMMENT", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> NODEGROUP = new TableFieldImpl<String>("NODEGROUP", String.class, PARTITIONS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLESPACE_NAME = new TableFieldImpl<String>("TABLESPACE_NAME", String.class, PARTITIONS);

	/**
	 * No further instances allowed
	 */
	private Partitions() {
		super("PARTITIONS", InformationSchema.INFORMATION_SCHEMA);
	}
}
