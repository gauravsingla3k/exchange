package com.mule.exchange.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mule.exchange.dto.Request;
import com.mule.exchange.dto.Response;

@RestController
public class Controller {

	@GetMapping(path = "/status")
	public ResponseEntity<String> myGetMethod(@RequestParam(name = "id") String id) {
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

	@PostMapping(path = "/status")
	public ResponseEntity<Response> myPostMethod(@RequestParam(name = "id") String id, @RequestBody Request req) {
		String res = req.getEnvironment() + "-" + req.getBusinessGroup() + "-" + req.getApplicationName();
		return new ResponseEntity<>(new Response(res), HttpStatus.OK);
	}
}
