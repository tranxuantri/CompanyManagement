package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Domain.
 * @see company.entity.Domain
 * @author Hibernate Tools
 */
@Stateless
public class DomainHome {

	private static final Log log = LogFactory.getLog(DomainHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Domain transientInstance) {
		log.debug("persisting Domain instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Domain persistentInstance) {
		log.debug("removing Domain instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Domain merge(Domain detachedInstance) {
		log.debug("merging Domain instance");
		try {
			Domain result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Domain findById(Integer id) {
		log.debug("getting Domain instance with id: " + id);
		try {
			Domain instance = entityManager.find(Domain.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
