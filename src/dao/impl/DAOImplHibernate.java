package dao.impl;

import config.HibernateUtil;
import utils.SiscomMessage;
import dao.DAO;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utils.SiscomException;

/**
 *
 * @author MANUEL LOZA
 */
public class DAOImplHibernate<T, String extends Serializable> implements DAO<T, String> {

    SessionFactory sessionFactory;

    private final static Logger LOGGER = Logger.getLogger(DAOImplHibernate.class.getName());

    public DAOImplHibernate() {
        if (sessionFactory == null) {
            sessionFactory = HibernateUtil.getSessionFactory();
        }
    }

    @Override
    public T create() throws SiscomException {
        try {
            return getEntityClass().newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        } catch (RuntimeException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void saveOrUpdate(T entity) throws SiscomException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(entity);
            session.getTransaction().commit();
        } catch (javax.validation.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
        } catch (org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        }
    }

    @Override
    public T get(String id) throws SiscomException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            T entity = (T) session.get(getEntityClass(), id);
            session.getTransaction().commit();

            return entity;
        } catch (javax.validation.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
        } catch (org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        }
        return null;
    }

    @Override
    public void delete(String id) throws SiscomException {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            T entity = (T) session.get(getEntityClass(), id);
            if (entity == null) {
                throw new SiscomException(new SiscomMessage(null, "Los datos a borrar ya no existen"));
            }
            session.delete(entity);
            session.getTransaction().commit();
        } catch (javax.validation.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new SiscomException(cve);
        } catch (org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new SiscomException(cve);
        } catch (SiscomException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<T> findAll() throws SiscomException {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        try {

            Query query = session.createQuery("FROM " + getEntityClass().getName() + " e");
            List<T> entities = query.list();
            return entities;
        } catch (javax.validation.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new SiscomException(cve);
        } catch (org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new SiscomException(cve);
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        } finally {
            session.close();
        }
    }

    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
