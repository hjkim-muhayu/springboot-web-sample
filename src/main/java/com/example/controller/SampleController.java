package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.SampleService;
import com.example.service.SampleService2;

@Controller
public class SampleController {
	
	@Autowired
	private SampleService2 sampleService;
	
	@RequestMapping("/")
	public String hello() {
		
		System.out.println(sampleService.selectList());
		
		return "sample";
	}
}
