package Dao;

import Model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class UserDAO {
	public void saveUser(User user) {
	    Transaction tx = null;
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        tx = session.beginTransaction();
	        session.save(user);
	        tx.commit();
	    } catch (Exception e) {
	        if (tx != null) tx.rollback();
	        e.printStackTrace();
	    }
	}

	public List<User> getAllUsers() {
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        return session.createQuery("from User", User.class).list();
	    }
	}

	public User getUserById(int id) {
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        return session.get(User.class, id);
	    }
	}

	public void updateUser(User user) {
	    Transaction tx = null;
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        tx = session.beginTransaction();
	        session.update(user);
	        tx.commit();
	    } catch (Exception e) {
	        if (tx != null) tx.rollback();
	        e.printStackTrace();
	    }
	}

	public void deleteUser(int id) {
	    Transaction tx = null;
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        tx = session.beginTransaction();
	        User user = session.get(User.class, id);
	        if (user != null) {
	            session.delete(user);
	            tx.commit();
	        }
	    } catch (Exception e) {
	        if (tx != null) tx.rollback();
	        e.printStackTrace();
	    }
	}

}
