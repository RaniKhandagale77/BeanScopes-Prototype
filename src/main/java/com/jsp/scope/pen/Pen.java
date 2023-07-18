package com.jsp.scope.pen;

public class Pen {
	
	public Pen() {
		System.out.println("Pen Object is Created.....");
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
