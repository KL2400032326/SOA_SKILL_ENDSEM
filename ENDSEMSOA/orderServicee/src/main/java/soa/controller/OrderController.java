package soa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.model.Order;
import soa.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
	OrderService os;
	@PostMapping("/order")
	public Object order(@RequestBody Order order) {
		return os.placeOrder(order);
	}

}
