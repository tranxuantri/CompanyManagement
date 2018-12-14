package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MemberProject.
 * @see entity.MemberProject
 * @author Hibernate Tools
 */
@Stateless
public class MemberProjectHome {

	private static final Log log = LogFactory.getLog(MemberProjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MemberProject transientInstance) {
		log.debug("persisting MemberProject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MemberProject persistentInstance) {
		log.debug("removing MemberProject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MemberProject merge(MemberProject detachedInstance) {
		log.debug("merging MemberProject instance");
		try {
			MemberProject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MemberProject findById(MemberProjectId id) {
		log.debug("getting MemberProject instance with id: " + id);
		try {
			MemberProject instance = entityManager.find(MemberProject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
