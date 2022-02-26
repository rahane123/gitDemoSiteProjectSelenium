package com.Sign.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Sign.Page.BasePage;

public class SignUpPage1 extends BasePage {

	public SignUpPage1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void SignUpPage() throws IOException {
		//super();

	}

	public void signUpPage() {

		click("SignUp");

		sendKeys("EmailAddress", "balurahane000@gmail.com");

		sendKeys("password", "Jayshri#1990");

		WebElement check = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div/div"));
		check.click();

		click("SignupButton");

		

		

	}
}
