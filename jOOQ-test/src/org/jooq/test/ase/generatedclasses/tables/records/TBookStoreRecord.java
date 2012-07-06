/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ase.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 1598032000;

	/**
	 * The table column <code>dbo.t_book_store.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.TBookStore.NAME, value);
	}

	/**
	 * The table column <code>dbo.t_book_store.name</code>
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.TBookStore.NAME);
	}

	/**
	 * The table column <code>dbo.t_book_store.name</code>
	 */
	public java.util.List<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.ase.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME.equal(getValue(org.jooq.test.ase.generatedclasses.tables.TBookStore.NAME)))
			.fetch();
	}

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.ase.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
