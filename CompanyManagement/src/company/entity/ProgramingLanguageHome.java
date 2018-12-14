package company.entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProgramingLanguage.
 * @see company.entity.ProgramingLanguage
 * @author Hibernate Tools
 */
@Stateless
public class ProgramingLanguageHome {

	private static final Log log = LogFactory.getLog(ProgramingLanguageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProgramingLanguage transientInstance) {
		log.debug("persisting ProgramingLanguage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProgramingLanguage persistentInstance) {
		log.debug("removing ProgramingLanguage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProgramingLanguage merge(ProgramingLanguage detachedInstance) {
		log.debug("merging ProgramingLanguage instance");
		try {
			ProgramingLanguage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProgramingLanguage findById(Integer id) {
		log.debug("getting ProgramingLanguage instance with id: " + id);
		try {
			ProgramingLanguage instance = entityManager.find(ProgramingLanguage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
