package io.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.api.NotFoundException;
import io.swagger.dao.OrderRepository;
import io.swagger.model.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public ResponseEntity<Order> orderDetailsOrderIdGet(Long orderId) throws NotFoundException {
		Order order = orderRepository.findOne(orderId);
		if (order == null) {
			throw new NotFoundException(500, "No order found for this orderID.");
		} else
			return new ResponseEntity<Order>(order, HttpStatus.ACCEPTED);

	}

	@Override
	public ResponseEntity<List<Order>> orderDetailsUserNameGet(String userName) throws NotFoundException {
		List<Order> orders = orderRepository.findByUserName(userName);
		if (orders.isEmpty()) {
			throw new NotFoundException(500, "No orders found for this username.");
		} else
			return new ResponseEntity<List<Order>>(orders, HttpStatus.ACCEPTED);
	}

}
