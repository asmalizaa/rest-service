package com.example.restservice;

import org.springframework.stereotype.Component;

@Component
public class GreetingComponent {

	public String getContent() {
		return "Hello from GreetingComponent";
	}
}

