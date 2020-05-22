package co.edu.campusucc.sd.daos;
// Generated 13/04/2020 12:12:48 AM by Hibernate Tools 5.4.7.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import co.edu.campusucc.sd.modelos.TablaNegociacion;

/**
 * Home object for domain model class TablaNegociacion.
 * 
 * @see co.edu.campusucc.sd.modelos.TablaNegociacion
 * @author Hibernate Tools
 */
public class TablaNegociacionDAO {

	private static final Logger logger = Logger.getLogger(TablaNegociacionDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			// return (SessionFactory) new InitialContext().lookup("SessionFactory");
			return new Configuration().configure().buildSessionFactory();

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error creado sessionFactory", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TablaNegociacion transientInstance) {
		logger.log(Level.INFO, "persisting TablaNegociacion instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);

			if (tx != null)
				tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public void attachDirty(TablaNegociacion instance) {
		logger.log(Level.INFO, "attaching dirty TablaNegociacion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(TablaNegociacion instance) {
		logger.log(Level.INFO, "attaching clean TablaNegociacion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(TablaNegociacion persistentInstance) {
		logger.log(Level.INFO, "deleting TablaNegociacion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public TablaNegociacion merge(TablaNegociacion detachedInstance) {
		logger.log(Level.INFO, "merging TablaNegociacion instance");
		try {
			TablaNegociacion result = (TablaNegociacion) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public TablaNegociacion findById(java.lang.String id) {
		logger.log(Level.INFO, "getting TablaNegociacion instance with id: " + id);
		try {
			TablaNegociacion instance = (TablaNegociacion) sessionFactory.getCurrentSession()
					.get("co.edu.campusucc.sd.modelos.TablaNegociacion", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List<TablaNegociacion> findByExample(TablaNegociacion instance) {
		logger.log(Level.INFO, "finding TablaNegociacion instance by example");
		try {
			List<TablaNegociacion> results = sessionFactory.getCurrentSession()
					.createCriteria("co.edu.campusucc.sd.modelos.TablaNegociacion").add(Example.create(instance))
					.list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
