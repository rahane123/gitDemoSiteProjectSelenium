package com.Sign.Pages;

import java.io.IOException;

import com.Sign.Page.BasePage;

public class SignInPage1 extends BasePage {
	public SignInPage1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//public void SignInPage() throws IOException {
	//	super();

	//}

	public void signIn() {
		click("Update");
		click("Quidlo");
		click("ActiveButton");
		sendKeys("EmailAddress", "balurahane000@gmail.com");
		sendKeys("password", "Jayshri#1990");

		
	}
}
