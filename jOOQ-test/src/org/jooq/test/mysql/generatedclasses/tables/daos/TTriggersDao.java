/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TTriggersDao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.TTriggersRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TTriggers, java.lang.Integer> {

	/**
	 * Create a new TTriggersDao without any factory
	 */
	public TTriggersDao() {
		super(org.jooq.test.mysql.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.mysql.generatedclasses.tables.pojos.TTriggers.class);
	}

	/**
	 * Create a new TTriggersDao with an attached factory
	 */
	public TTriggersDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.mysql.generatedclasses.tables.pojos.TTriggers.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TTriggers object) {
		return object.getIdGenerated();
	}
}
