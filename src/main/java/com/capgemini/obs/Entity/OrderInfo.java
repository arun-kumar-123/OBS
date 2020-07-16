package com.capgemini.obs.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="OrderInfo")
public class OrderInfo {
	
@Id
@Column(name="order_Id")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_seq")
@SequenceGenerator(sequenceName = "order_sequence", allocationSize = 10, name = "order_seq")
private Integer order_Id;

@Column(name="Quantity")
private Integer Quantity;


@Column(name="SubToatl")
private Float SubToatl;


@Column(name="Total")
private Float Total;


@Column(name="OrderStatus")
private String OrderStatus;

@NotEmpty(message = "PaymentMethod is mandatory")
@Column(name="PaymentMethod")
@Length(min=2, max=16)
private String PaymentMethod;



public Integer getOrder_Id() {
	return order_Id;
}

public void setOrder_Id(Integer order_Id) {
	this.order_Id = order_Id;
}

public Integer getQuantity() {
	return Quantity;
}

public void setQuantity(Integer quantity) {
	Quantity = quantity;
}

public Float getSubToatl() {
	return SubToatl;
}

public void setSubToatl(Float subToatl) {
	SubToatl = subToatl;
}

public Float getTotal() {
	return Total;
}

public void setTotal(Float total) {
	Total = total;
}

public String getOrderStatus() {
	return OrderStatus;
}

public void setOrderStatus(String orderStatus) {
	OrderStatus = orderStatus;
}

public String getPaymentMethod() {
	return PaymentMethod;
}

public void setPaymentMethod(String paymentMethod) {
	PaymentMethod = paymentMethod;
}


@Override
public String toString() {
	return "OrderInfo [order_Id=" + order_Id + ", Quantity=" + Quantity + ", SubToatl=" + SubToatl + ", Total=" + Total
			+ ", OrderStatus=" + OrderStatus + ", PaymentMethod=" + PaymentMethod + "]";
}

public OrderInfo(Integer order_Id, Integer quantity, Float subToatl, Float total, String orderStatus,
		@NotEmpty(message = "PaymentMethod is mandatory") @Length(min = 2, max = 16) String paymentMethod) {
	super();
	this.order_Id = order_Id;
	Quantity = quantity;
	SubToatl = subToatl;
	Total = total;
	OrderStatus = orderStatus;
	PaymentMethod = paymentMethod;
}

public OrderInfo() {
	super();
	// TODO Auto-generated constructor stub
}



}
