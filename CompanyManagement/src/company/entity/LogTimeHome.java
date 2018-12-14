package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class LogTime.
 * @see company.entity.LogTime
 * @author Hibernate Tools
 */
@Stateless
public class LogTimeHome {

	private static final Log log = LogFactory.getLog(LogTimeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(LogTime transientInstance) {
		log.debug("persisting LogTime instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(LogTime persistentInstance) {
		log.debug("removing LogTime instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public LogTime merge(LogTime detachedInstance) {
		log.debug("merging LogTime instance");
		try {
			LogTime result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LogTime findById(Integer id) {
		log.debug("getting LogTime instance with id: " + id);
		try {
			LogTime instance = entityManager.find(LogTime.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
