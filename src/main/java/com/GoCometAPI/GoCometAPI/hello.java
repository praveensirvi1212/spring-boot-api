package com.GoCometAPI.GoCometAPI;

public class hello {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public hello(String message) {
		super();
		this.message = message;
	}

	

	@Override
	public String toString() {
		return "hello [message=" + message + "]";
	}
	
	
}
