/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TBooleansDao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TBooleans, java.lang.Integer> {

	/**
	 * Create a new TBooleansDao without any factory
	 */
	public TBooleansDao() {
		super(org.jooq.test.mysql.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.mysql.generatedclasses.tables.pojos.TBooleans.class);
	}

	/**
	 * Create a new TBooleansDao with an attached factory
	 */
	public TBooleansDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.mysql.generatedclasses.tables.pojos.TBooleans.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TBooleans object) {
		return object.getId();
	}
}
