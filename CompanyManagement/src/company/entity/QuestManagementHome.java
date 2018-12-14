package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class QuestManagement.
 * @see company.entity.QuestManagement
 * @author Hibernate Tools
 */
@Stateless
public class QuestManagementHome {

	private static final Log log = LogFactory.getLog(QuestManagementHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(QuestManagement transientInstance) {
		log.debug("persisting QuestManagement instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(QuestManagement persistentInstance) {
		log.debug("removing QuestManagement instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public QuestManagement merge(QuestManagement detachedInstance) {
		log.debug("merging QuestManagement instance");
		try {
			QuestManagement result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QuestManagement findById(Integer id) {
		log.debug("getting QuestManagement instance with id: " + id);
		try {
			QuestManagement instance = entityManager.find(QuestManagement.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
