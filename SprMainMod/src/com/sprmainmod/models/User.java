package com.sprmainmod.models;

public class User {
	String logInId="";
	String name="";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogInId() {
		return logInId;
	}

	public void setLogInId(String logInId) {
		this.logInId = logInId;
	}
	@Override
	public String toString(){
		return getLogInId()+"  hai "+getName();
	}


}
