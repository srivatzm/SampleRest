package com.example.RestDemo;

import java.util.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class RestDemoApplication {

	@GetMapping("/prods")
	List<String> getProds() {
		List<String> list = new ArrayList<>();
		list.add("Test");
		list.add("Geo");
		return list;
	}
	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

}
