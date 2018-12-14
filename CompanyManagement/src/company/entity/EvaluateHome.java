package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Evaluate.
 * @see company.entity.Evaluate
 * @author Hibernate Tools
 */
@Stateless
public class EvaluateHome {

	private static final Log log = LogFactory.getLog(EvaluateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Evaluate transientInstance) {
		log.debug("persisting Evaluate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Evaluate persistentInstance) {
		log.debug("removing Evaluate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Evaluate merge(Evaluate detachedInstance) {
		log.debug("merging Evaluate instance");
		try {
			Evaluate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Evaluate findById(Integer id) {
		log.debug("getting Evaluate instance with id: " + id);
		try {
			Evaluate instance = entityManager.find(Evaluate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
