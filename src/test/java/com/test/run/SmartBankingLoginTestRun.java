package com.test.run;

import com.cucumber.java.SmartBankingLoginTest;

public class SmartBankingLoginTestRun {
	
	public static void main(String[] args) throws InterruptedException {
		
		SmartBankingLoginTest obj = new SmartBankingLoginTest();
		obj.getLogin();
	}

}
