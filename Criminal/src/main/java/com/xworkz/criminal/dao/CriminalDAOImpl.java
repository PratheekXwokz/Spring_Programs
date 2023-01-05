package com.xworkz.criminal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.criminal.dto.CriminalDTO;

@Repository
public class CriminalDAOImpl implements CriminalDAO {

	@Autowired
	private EntityManagerFactory factory;

	EntityManager manager;

	@Override
	public void save(CriminalDTO criminal) {
		System.out.println("Calling Save Method of CriminalDAO");
		EntityManager createEntityManager = factory.createEntityManager();

		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(criminal);
			transaction.commit();
		} catch (PersistenceException e) {
			System.out.println("exception in save dao" + e.getMessage());
		} finally {
			createEntityManager.close();
		}
	}

	@Override
	public List<CriminalDTO> findAll() {
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
	public List<CriminalDTO> findByName(String name) {
		System.out.println("Calling findByName Method");
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName").setParameter("nm", name);
			List<CriminalDTO> criminal = query.getResultList();
			if (criminal != null) {
				return criminal;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();

		} finally {
			System.out.println("Closing Manager in findByName");
			manager.close();
		}
		return null;
	}

	@Override
	public List<CriminalDTO> findByNameAndGender(String name, String gender) {
		System.out.println("Running findByNameAndGender");
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByNameAndGender").setParameter("nm", name).setParameter("ge", gender);
			List<CriminalDTO> criminal = query.getResultList();
			if (criminal != null) {
				return criminal;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();

		} finally {
			System.out.println("Closing Manager in findByNameAndGender");
			manager.close();
		}
		return null;
	}

}
