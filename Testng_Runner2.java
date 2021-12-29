package com.testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.pom.Page_Object_Manager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mini_Project_Dec.Base_Class;

public class Testng_Runner2 extends Base_Class {

	public static WebDriver driver;

	public static Page_Object_Manager pom;

	@BeforeTest
	private void chrome_launch() {
		driver = getbrowser("chrome");

		pom = new Page_Object_Manager(driver);
	}

	@BeforeClass
	private void url_link() {

		url("http://automationpractice.com/");

	}

	@BeforeMethod
	private void Login_Page() throws InterruptedException {

		clickOnElement(pom.gethp().getSignin());

		thread(5000);

		inputValueElement(pom.getlp().getEmailid(), "tamilselvanv3108@gmail.com");

		inputValueElement(pom.getlp().getPassword(), "tamilselvan3104");

		clickOnElement(pom.getlp().getLogin());

		thread(5000);

	}

	@Test(priority = -1)
	private void women_dress() throws InterruptedException {
		actions_methods("movetoelement", pom.getsp().getWomen());

		actions_methods("click", pom.getsp().getCasual_dresses());

		thread(5000);

		javascript("click", pom.getip().getColour());

		clickOnElement(pom.getpage6().getAddtocart1());

		javascript("click", pom.getpage7().getPc1());

		clickOnElement(pom.getpage8().getEight1());

		clickOnElement(pom.getpage9().getPage1());

		clickOnElement(pom.getpage10().getTen1());

		clickOnElement(pom.getpage11().getElevan1());

		clickOnElement(pom.getpage12().getCheque1());

		clickOnElement(pom.getpage13().getMyorder1());

		javascript("scrollintoview", pom.getpage13().getJscript1());

		scroll("scrollby");

	}

	@Test(priority = 0)
	private void dresses() throws InterruptedException {
		actions_methods("movetoelement", pom.getsp().getDresses());

		actions_methods("click", pom.getsp().getEvening());

		javascript("click", pom.getip().getPink_colour());

		clickOnElement(pom.getpage6().getAddtocart2());

		javascript("click", pom.getpage7().getPc2());

		clickOnElement(pom.getpage8().getEight2());

		clickOnElement(pom.getpage9().getPage2());

		clickOnElement(pom.getpage10().getTen2());

		clickOnElement(pom.getpage11().getElevan2());

		clickOnElement(pom.getpage12().getCheque2());

		clickOnElement(pom.getpage13().getMyorder2());

		javascript("scrollintoview", pom.getpage13().getJscript2());

		scroll("scrollby");

	}

	@Test(priority = 1)
	private void t_shirt() throws IOException, InterruptedException {
		clickOnElement(pom.getsp().getTshirt());

		clickOnElement(pom.getip().getImage());

		frame(pom.getsf().getFrame());

		clickOnElement(pom.getpage6().getPage());

		defaultcontent();

		thread(5000);

		clickOnElement(pom.getpage7().getSeven());

		clickOnElement(pom.getpage8().getEight());

		clickOnElement(pom.getpage9().getPage());

		clickOnElement(pom.getpage10().getTen());

		clickOnElement(pom.getpage11().getElevan());

		clickOnElement(pom.getpage12().getCheque());

		clickOnElement(pom.getpage13().getMyorder());

		javascript("scrollintoview", pom.getpage13().getJscript());

		scroll("scrollby");

		screenshot("C:\\Users\\KATHIR\\Desktop\\desktop\\Testing\\Screenshots\\pic4.png");

	}

	@AfterMethod
	private void Logout() throws InterruptedException {
		Thread.sleep(5000);
		clickOnElement(pom.getLop().getLogout1());
		Thread.sleep(5000);

	}

	@AfterClass
	private void close_page() {

		driver.close();

	}

	@AfterTest
	private void verify_page() {
		System.out.println("verify page ");
	}

}
