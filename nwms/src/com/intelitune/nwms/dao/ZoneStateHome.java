package com.intelitune.nwms.dao;

// Generated 2008-12-31 13:55:49 by Hibernate Tools 3.2.2.GA

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.intelitune.nwms.model.ZoneState;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class ZoneState.
 * 
 * @see com.intelitune.nwms.model.ZoneState
 * @author Hibernate Tools
 */
public class ZoneStateHome {
	private final static ZoneStateHome instance = new ZoneStateHome();

	private ZoneStateHome() {
	}

	public static final ZoneStateHome getInstance() {
		return instance;
	}

	private static final Log log = LogFactory.getLog(ZoneStateHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("nWMSSessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ZoneState transientInstance) {
		log.debug("persisting ZoneState instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ZoneState instance) {
		log.debug("attaching dirty ZoneState instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ZoneState instance) {
		log.debug("attaching clean ZoneState instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ZoneState persistentInstance) {
		log.debug("deleting ZoneState instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ZoneState merge(ZoneState detachedInstance) {
		log.debug("merging ZoneState instance");
		try {
			ZoneState result = (ZoneState) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ZoneState findById(java.lang.String id) {
		log.debug("getting ZoneState instance with id: " + id);
		try {
			ZoneState instance = (ZoneState) sessionFactory.getCurrentSession()
					.get("com.intelitune.nwms.model.ZoneState", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ZoneState> findByExample(ZoneState instance) {
		log.debug("finding ZoneState instance by example");
		try {
			List<ZoneState> results = (List<ZoneState>) sessionFactory
					.getCurrentSession().createCriteria(
							"com.intelitune.nwms.model.ZoneState").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public ZoneState findZoneStateByCode(int code) {
		String str = code + "";
		String hql = "from ZoneState as z where z.code='" + str + "'";
		ZoneState zs = (ZoneState) sessionFactory.getCurrentSession()
				.createQuery(hql).list().get(0);
		return zs;
	}

}