package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EmployeeProfile.
 * @see entity.EmployeeProfile
 * @author Hibernate Tools
 */
@Stateless
public class EmployeeProfileHome {

	private static final Log log = LogFactory.getLog(EmployeeProfileHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EmployeeProfile transientInstance) {
		log.debug("persisting EmployeeProfile instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EmployeeProfile persistentInstance) {
		log.debug("removing EmployeeProfile instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EmployeeProfile merge(EmployeeProfile detachedInstance) {
		log.debug("merging EmployeeProfile instance");
		try {
			EmployeeProfile result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EmployeeProfile findById(Integer id) {
		log.debug("getting EmployeeProfile instance with id: " + id);
		try {
			EmployeeProfile instance = entityManager.find(EmployeeProfile.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
