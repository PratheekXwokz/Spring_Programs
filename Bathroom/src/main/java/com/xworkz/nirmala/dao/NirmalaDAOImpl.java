package com.xworkz.nirmala.dao;

import com.xworkz.nirmala.entity.NirmalaEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import static com.xworkz.nirmala.util.EMFUtil.*;

public class NirmalaDAOImpl implements NirmalaDAO {
	EntityManagerFactory factory=getFactory();
	EntityManager manager=null;
	public Boolean save(NirmalaEntity nirmalaEntity) {
		try {
			manager=factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(nirmalaEntity);
			transaction.commit();
		}
		catch (Exception e) {
			e.getMessage();
		}
		finally {
			manager.close();
		}
		return null;
	}

}

