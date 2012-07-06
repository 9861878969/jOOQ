/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -29941087;

	/**
	 * The singleton instance of dbo.t_book_store
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.ase.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The table column <code>dbo.t_book_store.name</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("t_book_store", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.ase.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME);
	}
}
