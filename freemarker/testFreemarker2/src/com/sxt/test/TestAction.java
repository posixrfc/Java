package com.sxt.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	
	private String companyName="ÉÐÑ§ÌÃ";
	
	public String execute() throws Exception {
		System.out.println("TestAction.execute()");
		return SUCCESS;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
