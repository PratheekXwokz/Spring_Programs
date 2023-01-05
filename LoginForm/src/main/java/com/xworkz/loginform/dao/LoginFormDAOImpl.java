package com.xworkz.loginform.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.loginform.dto.LoginFormDTO;

@Repository
public class LoginFormDAOImpl implements LoginFormDAO {
	@Autowired
	private EntityManagerFactory factory;

	EntityManager manager;

	@Override
	public void save(LoginFormDTO login) {
		System.out.println("Calling Save Method of LoginFormDAO");
		EntityManager createEntityManager = factory.createEntityManager();

		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(login);
			transaction.commit();
		} catch (PersistenceException e) {
			System.out.println("exception in save dao" + e.getMessage());
		} finally {
			createEntityManager.close();
		}
	}
	
	@Override
	public List<LoginFormDTO> findAll() {
		System.out.println("Calling findAll Method");
		try {
			manager = factory.createEntityManager();
			return manager.createNamedQuery("findAll").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing manager in findAll");
			manager.close();
		}
		return findAll();
	}
	
	@Override
	public List<LoginFormDTO> findByUserName(String name) {
		System.out.println("Calling findByName Method");
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByUserName").setParameter("nm", name);
			List<LoginFormDTO> login = query.getResultList();
			if (login != null) {
				return login;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();

		} finally {
			System.out.println("Closing Manager in findByName");
			manager.close();
		}
		return null;
	}

}
