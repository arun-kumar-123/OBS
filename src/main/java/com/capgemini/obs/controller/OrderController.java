package com.capgemini.obs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.obs.Entity.OrderInfo;
import com.capgemini.obs.Exception.OrderException;
import com.capgemini.obs.service.OrderInterfac;

@RestController
public class OrderController {

	@Autowired
	OrderInterfac orderservice;
	
	@GetMapping("/orders")
	public List<OrderInfo> getAllOrder() throws OrderException {
		try{
			return orderservice.getAllOrder();
		}catch (Exception exception) {
			throw new OrderException(exception.getMessage());
		}
	}
	
	@GetMapping("/order/{OrderId}")
	public OrderInfo getOrder(@PathVariable long Order_Id) throws OrderException {
		try{
			return orderservice.getOrder(Order_Id);
		}catch (Exception exception) {
			throw new OrderException(exception.getMessage());
		}
	}
}
