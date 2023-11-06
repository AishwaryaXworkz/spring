package com.xworkz.leoffers.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.xworkz.leoffers.dto.LeOffersDto;
import com.xworkz.leoffers.entity.LeOffersEntity;

@Repository
public class LeOffersRepositoryImplementation implements LeOffersRepository{
 public LeOffersRepositoryImplementation() {
	System.out.println("this is LeOffersRepositoryImplementation");
}
 @Autowired
 EntityManagerFactory factory;
	@Override
	public boolean onSave(LeOffersDto dto) {
		System.out.println("this is onsave repo method");
		System.out.println(dto);
		
		LeOffersEntity entity=new LeOffersEntity();
	    entity.setUserName(dto.getUserName());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setEmail(dto.getEmail());
		entity.setProductName(dto.getProductName());
		entity.setPrice(dto.getPrice());
		entity.setAddress(dto.getAddress());
		entity.setFeatures(dto.getFeatures());
		entity.setDiscount(dto.getDiscount());
		entity.setChat(dto.getChat());
		entity.setPassword(dto.getPassword());
		entity.setConfirmPassword(dto.getConfirmPassword());
		entity.setRegisteredDateTime(LocalDateTime.now());
		System.out.println(entity);
		 
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	@Override
	public List<LeOffersEntity> findAll() {
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findAll");
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public LeOffersEntity findById(int id) {
		System.out.println("id is inisitiated"+id);
		EntityManager manager=factory.createEntityManager();
		LeOffersEntity entity=manager.find(LeOffersEntity.class, id);
		return entity;
	}
	@Override
	public List<LeOffersEntity> findByUserName(String userName) {
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByUserName");
		q.setParameter("un", userName);
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<LeOffersEntity> findByEmail(String email) {
		
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByEmail");
		q.setParameter("em",email);
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<LeOffersEntity> findByPhoneNumber(long phoneNumber) {
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByPhoneNumber");
		q.setParameter("ph",phoneNumber);
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<LeOffersEntity> findByAddress(String address) {
		
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByAddress");
		q.setParameter("addr",address);
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<LeOffersEntity> findByProductName(String productName) {
		
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByProductName");
		q.setParameter("prn",productName);
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public List<LeOffersEntity> findByPrice(double price) {
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createNamedQuery("findByPrice");
		q.setParameter("pr",price);
		List<LeOffersEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}
	@Override
	public boolean deleteById(int id) {
		EntityManager manager=factory.createEntityManager();
		LeOffersEntity entity=manager.find(LeOffersEntity.class, id);
		if(entity!=null) {
			System.out.println(entity);
			manager.getTransaction().begin();
			manager.remove(entity);
			manager.getTransaction().commit();
			manager.close();
			return true;
		}else {
		return false;
	}

	}

	@Override
	public boolean deleteByEmail(String email) {
		
		EntityManager manager=factory.createEntityManager();
		
		
		manager.getTransaction().begin();
		Query qe=manager.createNamedQuery("deleteByEmail");
		qe.setParameter("email",email);
		 int row=qe.executeUpdate();		
		manager.getTransaction().commit();
		manager.close();
		return row>0;
		}

	@Override
	public List<LeOffersEntity> deleteByUserName(String userName) {
		
EntityManager manager=factory.createEntityManager();
	
Query q=manager.createNamedQuery("findByUserName");
q.setParameter("un",userName);

List<LeOffersEntity> list=q.getResultList();

        manager.getTransaction().begin();
		Query qe=manager.createNamedQuery("deleteByName");
		qe.setParameter("un",userName);
		 
		
		for(LeOffersEntity leoffersentity:list) {
			manager.remove(leoffersentity);
		}
		manager.getTransaction().commit();
		manager.close();
		return list;
	}
	@Override
	public boolean onUpdate(LeOffersDto dto) {
    EntityManager manager=factory.createEntityManager();
		LeOffersEntity entity=new LeOffersEntity();
		BeanUtils.copyProperties(dto, entity);
		 manager.getTransaction().begin();
		 manager.merge(entity);
		 manager.getTransaction().commit();
		 manager.close();
		return true;
	}
	@Override
	public boolean onUpdateEmail(String email) {
		 EntityManager manager=factory.createEntityManager();
			
		 manager.getTransaction().begin();
			Query qe=manager.createNamedQuery("updateByEmail");
			qe.setParameter("em",email);
			 int row=qe.executeUpdate();		
			manager.getTransaction().commit();
			manager.close();
			return row>0;
		
	}
	@Override
	public LeOffersEntity checkLogin(String email, String password) {
		
		EntityManager manager = factory.createEntityManager();
		Query loginQuery = manager.createNamedQuery("checkLogin");
		loginQuery.setParameter("em", email);
		loginQuery.setParameter("pw", password);
		
		try {
			return (LeOffersEntity) loginQuery.getSingleResult();
		} catch (NoResultException e) {
			return null;
	}
}
}
	
