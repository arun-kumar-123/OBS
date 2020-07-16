package com.capgemini.obs.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.obs.Entity.OrderInfo;

@Repository
public class OrderDao implements OrderDaoInterfac {

	@PersistenceContext
	EntityManager em;

	@Override
	public OrderInfo getOrder(long Order_Id) {
		// TODO Auto-generated method stub
			String str = "SELECT orderInfo FROM OrderInfo orderInfo WHERE orderInfo.Order_Id="
					+ Order_Id;
			TypedQuery<OrderInfo> query = em.createQuery(str, OrderInfo.class);
			return query.getSingleResult();
		}

	public List<OrderInfo> getAllOrder() {
		String str = "SELECT diagnosticCenter FROM DiagnosticCenter diagnosticCenter";
		TypedQuery<OrderInfo> query = em.createQuery(str, OrderInfo.class);
		return query.getResultList();
	}
	
}
