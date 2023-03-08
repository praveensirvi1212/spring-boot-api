package com.GoCometAPI.GoCometAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/api/v1/hello")
	public hello hello() {
		hello message = new hello("hello-world");
		return message;
	}
	
}
