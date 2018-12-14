package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RegistrationLeave.
 * @see entity.RegistrationLeave
 * @author Hibernate Tools
 */
@Stateless
public class RegistrationLeaveHome {

	private static final Log log = LogFactory.getLog(RegistrationLeaveHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RegistrationLeave transientInstance) {
		log.debug("persisting RegistrationLeave instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RegistrationLeave persistentInstance) {
		log.debug("removing RegistrationLeave instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RegistrationLeave merge(RegistrationLeave detachedInstance) {
		log.debug("merging RegistrationLeave instance");
		try {
			RegistrationLeave result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RegistrationLeave findById(Integer id) {
		log.debug("getting RegistrationLeave instance with id: " + id);
		try {
			RegistrationLeave instance = entityManager.find(RegistrationLeave.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
