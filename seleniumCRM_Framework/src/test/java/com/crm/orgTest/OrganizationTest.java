package com.crm.orgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrganizationTest {

	@Test(groups = "smokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest==>"+ System.getProperty("browser"));

	}
	
	@Test(groups = "regressionTest")
	public void moiifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}
	
	@Test(groups = "gegressionTest")
	public void mldifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}
	@Test(groups = "hegressionTest")
	public void vodifyContactTest() {
		System.out.println("execute modifyContactTest");
		
	}
		

}
