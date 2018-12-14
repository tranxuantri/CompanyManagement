package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Education.
 * @see entity.Education
 * @author Hibernate Tools
 */
@Stateless
public class EducationHome {

	private static final Log log = LogFactory.getLog(EducationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Education transientInstance) {
		log.debug("persisting Education instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Education persistentInstance) {
		log.debug("removing Education instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Education merge(Education detachedInstance) {
		log.debug("merging Education instance");
		try {
			Education result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Education findById(Integer id) {
		log.debug("getting Education instance with id: " + id);
		try {
			Education instance = entityManager.find(Education.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
