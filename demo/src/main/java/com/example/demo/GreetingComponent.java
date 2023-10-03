package com.example.demo;

import org.springframework.stereotype.Component;

// configure this greeting component to be injectable
@Component
public class GreetingComponent {

	public String getMessage() {
		return "Hello from GreetingComponent";
	}

}
