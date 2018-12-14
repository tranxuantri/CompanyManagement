package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class LaborContract.
 * @see company.entity.LaborContract
 * @author Hibernate Tools
 */
@Stateless
public class LaborContractHome {

	private static final Log log = LogFactory.getLog(LaborContractHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(LaborContract transientInstance) {
		log.debug("persisting LaborContract instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(LaborContract persistentInstance) {
		log.debug("removing LaborContract instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public LaborContract merge(LaborContract detachedInstance) {
		log.debug("merging LaborContract instance");
		try {
			LaborContract result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LaborContract findById(Integer id) {
		log.debug("getting LaborContract instance with id: " + id);
		try {
			LaborContract instance = entityManager.find(LaborContract.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
