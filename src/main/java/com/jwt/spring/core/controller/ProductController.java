package com.jwt.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.spring.core.config.ProductDetails;

@RestController
public class ProductController {
	
	@Autowired
	ProductDetails productDetails;
	
	@GetMapping("/product")
	public String getProductName() {
		return productDetails.getProductName();
	}

}
