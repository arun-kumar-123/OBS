package com.capgemini.obs.DAO;

import java.util.List;

import com.capgemini.obs.Entity.OrderInfo;

public interface OrderDaoInterfac {
	
	public OrderInfo getOrder(long Order_Id);
	public List<OrderInfo> getAllOrder();

}
