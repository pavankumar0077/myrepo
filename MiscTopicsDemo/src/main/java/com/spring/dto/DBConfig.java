package com.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DBConfig {
	
	private String url;
	private String username;

}

