package com.example.mail;

import javax.persistence.criteria.Order;

public interface OrderMessage {

	void placeOrder(String sendto,String subject,String mainMessae);
}
