package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FrameworkProject.
 * @see entity.FrameworkProject
 * @author Hibernate Tools
 */
@Stateless
public class FrameworkProjectHome {

	private static final Log log = LogFactory.getLog(FrameworkProjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FrameworkProject transientInstance) {
		log.debug("persisting FrameworkProject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FrameworkProject persistentInstance) {
		log.debug("removing FrameworkProject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FrameworkProject merge(FrameworkProject detachedInstance) {
		log.debug("merging FrameworkProject instance");
		try {
			FrameworkProject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FrameworkProject findById(FrameworkProjectId id) {
		log.debug("getting FrameworkProject instance with id: " + id);
		try {
			FrameworkProject instance = entityManager.find(FrameworkProject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
