package com.capgemini.obs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.obs.DAO.OrderDao;
import com.capgemini.obs.DAO.OrderDaoInterfac;
import com.capgemini.obs.Entity.OrderInfo;
import com.capgemini.obs.Exception.OrderException;

@Service
@Transactional
public class OrderService implements OrderInterfac {

	
	@Autowired
	private OrderDaoInterfac orderDao;
	
	@Override
	public OrderInfo getOrder(long Order_Id) throws OrderException{
		// TODO Auto-generated method stub
		if(orderDao.getOrder(Order_Id)!= null)
		{
		return orderDao.getOrder(Order_Id);
		}
		else {
			throw new OrderException("order id not found.");
		}
		
	}

	@Override
	public List<OrderInfo> getAllOrder() throws OrderException {
		// TODO Auto-generated method stub
		if(orderDao.getAllOrder()!=null)
			return orderDao.getAllOrder();
		else
			throw new OrderException("order is not present. ");
	}
	
	

}
