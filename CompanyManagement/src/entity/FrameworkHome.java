package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Framework.
 * @see entity.Framework
 * @author Hibernate Tools
 */
@Stateless
public class FrameworkHome {

	private static final Log log = LogFactory.getLog(FrameworkHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Framework transientInstance) {
		log.debug("persisting Framework instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Framework persistentInstance) {
		log.debug("removing Framework instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Framework merge(Framework detachedInstance) {
		log.debug("merging Framework instance");
		try {
			Framework result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Framework findById(Integer id) {
		log.debug("getting Framework instance with id: " + id);
		try {
			Framework instance = entityManager.find(Framework.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
