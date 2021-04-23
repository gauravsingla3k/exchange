package com.mule.exchange.dto;

public class Response {

	private String deployedApplicationName;

	public Response(String deployedApplicationName) {
		this.deployedApplicationName = deployedApplicationName;
	}

	public String getDeployedApplicationName() {
		return deployedApplicationName;
	}

	public void setDeployedApplicationName(String deployedApplicationName) {
		this.deployedApplicationName = deployedApplicationName;
	}

}
