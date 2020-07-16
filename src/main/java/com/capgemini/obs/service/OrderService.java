package com.capgemini.obs.service;

import java.util.List;

import com.capgemini.obs.entity.OrderInfo;
import com.capgemini.obs.exception.OrderException;

public interface OrderService {
	
	public List<OrderInfo> getAllOrder() throws OrderException;

}
