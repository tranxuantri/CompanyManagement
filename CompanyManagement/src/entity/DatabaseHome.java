package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Database.
 * @see entity.Database
 * @author Hibernate Tools
 */
@Stateless
public class DatabaseHome {

	private static final Log log = LogFactory.getLog(DatabaseHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Database transientInstance) {
		log.debug("persisting Database instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Database persistentInstance) {
		log.debug("removing Database instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Database merge(Database detachedInstance) {
		log.debug("merging Database instance");
		try {
			Database result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Database findById(Integer id) {
		log.debug("getting Database instance with id: " + id);
		try {
			Database instance = entityManager.find(Database.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
