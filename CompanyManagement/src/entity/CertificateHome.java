package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Certificate.
 * @see entity.Certificate
 * @author Hibernate Tools
 */
@Stateless
public class CertificateHome {

	private static final Log log = LogFactory.getLog(CertificateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Certificate transientInstance) {
		log.debug("persisting Certificate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Certificate persistentInstance) {
		log.debug("removing Certificate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Certificate merge(Certificate detachedInstance) {
		log.debug("merging Certificate instance");
		try {
			Certificate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Certificate findById(Integer id) {
		log.debug("getting Certificate instance with id: " + id);
		try {
			Certificate instance = entityManager.find(Certificate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
