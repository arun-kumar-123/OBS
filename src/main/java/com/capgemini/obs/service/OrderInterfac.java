package com.capgemini.obs.service;

import java.util.List;

import com.capgemini.obs.Entity.OrderInfo;
import com.capgemini.obs.Exception.OrderException;

public interface OrderInterfac {
	
	public OrderInfo getOrder(long Order_Id) throws OrderException ;
	public List<OrderInfo> getAllOrder() throws OrderException;
}
