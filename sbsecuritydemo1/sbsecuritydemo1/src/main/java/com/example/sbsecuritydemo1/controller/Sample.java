package com.example.sbsecuritydemo1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	//request handler
	//@RequestMapping(value="/break",method=RequestMethod.GET)
	@GetMapping(value="/break")
	public ResponseEntity<String>  function()
	{
		return new ResponseEntity<String>("Tea Break" ,HttpStatus.OK);
	}
}
