package com.nvd.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/main")
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	/*
	 * The @Value annotation is used to read the environment or application property
	 * value in Java code. If the property is not found while running the
	 * application, Spring Boot throws the Illegal Argument exception as Could not
	 * resolve placeholder 'spring.application.name' in value
	 * "${spring.application.name}".
	 */
	@Value("${spring.application.name}")
	private String name;

	@GetMapping("/message")
	public String getMessage() {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		return name;
	}
}
