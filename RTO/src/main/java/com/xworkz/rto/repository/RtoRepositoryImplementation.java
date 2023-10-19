package com.xworkz.rto.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.rto.dto.RtoDto;
import com.xworkz.rto.entity.RtoEntity;

@Repository
public class RtoRepositoryImplementation implements RtoRepository{
public RtoRepositoryImplementation() {
	System.out.println("this is RtoRepositoryImplementation");
}

@Autowired
EntityManagerFactory factory;


	@Override
	public boolean onSave(RtoDto dto) {
		System.out.println("repo method");
		System.out.println(dto);
		
		RtoEntity entity =new RtoEntity();
		BeanUtils.copyProperties(dto, entity);
		
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}


	@Override
	public List<RtoEntity> findAll() {
		EntityManager manager =factory.createEntityManager();
		Query q=manager.createNamedQuery("FindAll");
		List<RtoEntity> list=q.getResultList();
		System.out.println(list.toString());
		return list;
	}

}
