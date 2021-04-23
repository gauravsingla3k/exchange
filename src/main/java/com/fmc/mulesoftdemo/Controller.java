package com.fmc.mulesoftdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(path = "/status")
	public ResponseEntity<String> myGetMethod(@RequestParam(name = "fetch-data") String fetchData) {
		return new ResponseEntity<>(fetchData, HttpStatus.OK);
	}
	
	@PostMapping(path = "/status")
	public ResponseEntity<String> myPostMethod(@RequestParam(name = "fetch-data") String fetchData) {
		return new ResponseEntity<>(fetchData, HttpStatus.OK);
	}
}
