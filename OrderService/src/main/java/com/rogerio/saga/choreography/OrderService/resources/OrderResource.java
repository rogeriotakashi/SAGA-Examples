package com.rogerio.saga.choreography.OrderService.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerio.saga.choreography.OrderService.enums.OrderStatusEnum;
import com.rogerio.saga.choreography.OrderService.models.Order;
import com.rogerio.saga.choreography.OrderService.models.requests.CreateOrderRequest;
import com.rogerio.saga.choreography.OrderService.models.requests.RejectOrderRequest;
import com.rogerio.saga.choreography.OrderService.models.response.CreateOrderResponse;
import com.rogerio.saga.choreography.OrderService.models.response.RejectOrderResponse;
import com.rogerio.saga.choreography.OrderService.services.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderResource {
	
	@Autowired
	OrderService orderService;
		

	@PostMapping("/create")
	public ResponseEntity<CreateOrderResponse> createPendingOrder(@RequestBody CreateOrderRequest req) {	
		Order order = orderService.createOrder(req.getUser(), req.getTotal());
		CreateOrderResponse response = new CreateOrderResponse(order);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping("/reject")
	public ResponseEntity<RejectOrderResponse> rejectOrder(@RequestBody RejectOrderRequest req) {
		OrderStatusEnum status = orderService.rejectOrder(req.getOrderId());
		RejectOrderResponse rejectOrderResponse = new RejectOrderResponse(req.getOrderId(), status);
		return new ResponseEntity<>(rejectOrderResponse, HttpStatus.OK);
	}
	
}
