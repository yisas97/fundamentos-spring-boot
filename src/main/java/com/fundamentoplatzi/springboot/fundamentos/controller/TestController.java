package com.fundamentoplatzi.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	//Para aceptar todas las solicitudes
	@RequestMapping
	@ResponseBody
	public ResponseEntity<String> function()
	{
		return new ResponseEntity<>("Hello from controller, se realizo un cambio en el pom", HttpStatus.OK);
	}
	
}
