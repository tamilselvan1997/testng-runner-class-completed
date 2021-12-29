package com.testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.pom.Page_Object_Manager;

import com.Mini_Project_Dec.Base_Class;

public class runner_testng extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		url("http://automationpractice.com/");

		clickOnElement(pom.gethp().getSignin());

		Thread.sleep(3000);

		inputValueElement(pom.getlp().getEmailid(), "tamilselvanv3108@gmail.com");

		inputValueElement(pom.getlp().getPassword(), "tamilselvanv3104");

		clickOnElement(pom.getlp().getLogin());

		actions_methods("movetoelement", pom.getsp().getWomen());

		actions_methods("click", pom.getsp().getCasual_dresses());

		Thread.sleep(3000);

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

		clickOnElement(pom.getLop().getLogout1());

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

}
