package entity;
// Generated Dec 14, 2018 12:08:37 PM by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProgramingLanguageProject.
 * @see entity.ProgramingLanguageProject
 * @author Hibernate Tools
 */
@Stateless
public class ProgramingLanguageProjectHome {

	private static final Log log = LogFactory.getLog(ProgramingLanguageProjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProgramingLanguageProject transientInstance) {
		log.debug("persisting ProgramingLanguageProject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProgramingLanguageProject persistentInstance) {
		log.debug("removing ProgramingLanguageProject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProgramingLanguageProject merge(ProgramingLanguageProject detachedInstance) {
		log.debug("merging ProgramingLanguageProject instance");
		try {
			ProgramingLanguageProject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProgramingLanguageProject findById(Integer id) {
		log.debug("getting ProgramingLanguageProject instance with id: " + id);
		try {
			ProgramingLanguageProject instance = entityManager.find(ProgramingLanguageProject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
