package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Rights.
 * @see entity.Rights
 * @author Hibernate Tools
 */
@Stateless
public class RightsHome {

	private static final Log log = LogFactory.getLog(RightsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Rights transientInstance) {
		log.debug("persisting Rights instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Rights persistentInstance) {
		log.debug("removing Rights instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Rights merge(Rights detachedInstance) {
		log.debug("merging Rights instance");
		try {
			Rights result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Rights findById(Integer id) {
		log.debug("getting Rights instance with id: " + id);
		try {
			Rights instance = entityManager.find(Rights.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
