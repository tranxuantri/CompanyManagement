package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DocumentManagement.
 * @see company.entity.DocumentManagement
 * @author Hibernate Tools
 */
@Stateless
public class DocumentManagementHome {

	private static final Log log = LogFactory.getLog(DocumentManagementHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DocumentManagement transientInstance) {
		log.debug("persisting DocumentManagement instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DocumentManagement persistentInstance) {
		log.debug("removing DocumentManagement instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DocumentManagement merge(DocumentManagement detachedInstance) {
		log.debug("merging DocumentManagement instance");
		try {
			DocumentManagement result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DocumentManagement findById(Integer id) {
		log.debug("getting DocumentManagement instance with id: " + id);
		try {
			DocumentManagement instance = entityManager.find(DocumentManagement.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
