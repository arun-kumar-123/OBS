package com.capgemini.obs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.obs.dao.OrderDao;
import com.capgemini.obs.entity.OrderInfo;
import com.capgemini.obs.exception.OrderException;

@Transactional
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderDao orderDao;

	@Override
	public List<OrderInfo> getAllOrder() throws OrderException {
		// TODO Auto-generated method stub
		if(orderDao.getAllOrder()!=null)
			return orderDao.getAllOrder();
		else
			throw new OrderException("order is not present. ");
	}
	
	

}
