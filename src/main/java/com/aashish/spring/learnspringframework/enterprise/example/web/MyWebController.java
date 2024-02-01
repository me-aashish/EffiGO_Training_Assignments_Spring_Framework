package com.aashish.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aashish.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {

	BusinessService businessService;

	@Autowired
	public MyWebController(BusinessService businessService) {
		this.businessService = businessService;
	}

	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}
