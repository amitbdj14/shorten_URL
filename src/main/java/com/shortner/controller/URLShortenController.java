package com.shortner.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shortner.model.ShortURLBean;

@RestController
public class URLShortenController {
	
	@PostMapping(path ="/shortenurl")
	public ResponseEntity<String> getShortenURL(@RequestBody ShortURLBean shortenURL){
		
		return null;
		
	}

	@GetMapping(path ="/s/{randomString}")
	public ResponseEntity<String> getFullURL(HttpServletResponse response, @PathVariable String randomString){
		
		return null;
		
	}
}
