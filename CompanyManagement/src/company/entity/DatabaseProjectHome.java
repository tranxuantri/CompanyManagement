package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DatabaseProject.
 * @see company.entity.DatabaseProject
 * @author Hibernate Tools
 */
@Stateless
public class DatabaseProjectHome {

	private static final Log log = LogFactory.getLog(DatabaseProjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DatabaseProject transientInstance) {
		log.debug("persisting DatabaseProject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DatabaseProject persistentInstance) {
		log.debug("removing DatabaseProject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DatabaseProject merge(DatabaseProject detachedInstance) {
		log.debug("merging DatabaseProject instance");
		try {
			DatabaseProject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DatabaseProject findById(DatabaseProjectId id) {
		log.debug("getting DatabaseProject instance with id: " + id);
		try {
			DatabaseProject instance = entityManager.find(DatabaseProject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
