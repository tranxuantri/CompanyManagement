package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Experience.
 * @see entity.Experience
 * @author Hibernate Tools
 */
@Stateless
public class ExperienceHome {

	private static final Log log = LogFactory.getLog(ExperienceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Experience transientInstance) {
		log.debug("persisting Experience instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Experience persistentInstance) {
		log.debug("removing Experience instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Experience merge(Experience detachedInstance) {
		log.debug("merging Experience instance");
		try {
			Experience result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Experience findById(Integer id) {
		log.debug("getting Experience instance with id: " + id);
		try {
			Experience instance = entityManager.find(Experience.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
