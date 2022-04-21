package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.DBConfig;

@RestController
public class TestController {
	
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	DBConfig dbConfig;
	
	@GetMapping(value = "/dbconfig")
	public String getDBConfig() {
		return this.dbConfig.toString();
	}
	
	
	@GetMapping(value = "/appname")
	public String getAppName() {
		return this.appName;
		
	}

}
