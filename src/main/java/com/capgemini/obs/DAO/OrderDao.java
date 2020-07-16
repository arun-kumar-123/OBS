package com.capgemini.obs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.obs.entity.OrderInfo;

@Repository
public class OrderDao {
	
	@PersistenceContext
	EntityManager em;
	
	public List<OrderInfo> getAllOrder() {
		String str = "SELECT orderInfo FROM OrderInfo orderInfo";
		TypedQuery<OrderInfo> query = em.createQuery(str, OrderInfo.class);
		return query.getResultList();
	}

}
