package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RelativeInformation.
 * @see company.entity.RelativeInformation
 * @author Hibernate Tools
 */
@Stateless
public class RelativeInformationHome {

	private static final Log log = LogFactory.getLog(RelativeInformationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RelativeInformation transientInstance) {
		log.debug("persisting RelativeInformation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RelativeInformation persistentInstance) {
		log.debug("removing RelativeInformation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RelativeInformation merge(RelativeInformation detachedInstance) {
		log.debug("merging RelativeInformation instance");
		try {
			RelativeInformation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RelativeInformation findById(Integer id) {
		log.debug("getting RelativeInformation instance with id: " + id);
		try {
			RelativeInformation instance = entityManager.find(RelativeInformation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
