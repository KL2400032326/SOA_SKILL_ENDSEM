package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.ResturantService;

@RestController
@RequestMapping("/api")
public class ResturantController {
@Autowired
ResturantService rs;
public ResturantController(ResturantService rs) {
	this.rs=rs;
}
@GetMapping("/resturants")
public Object resturant() {
	return rs.getAllResturants();
}	
}

