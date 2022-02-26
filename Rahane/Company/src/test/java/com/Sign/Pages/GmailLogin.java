package com.Sign.Pages;

import java.io.IOException;

import com.Sign.Page.BasePage;

public class GmailLogin extends BasePage {
	public GmailLogin() throws IOException {
		super();

	}

	public void gmailLogin() {
		driver.get("https://accounts.google.com/signin/v2/identifier?continue="
				+ "https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu="
				+ "1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		sendKeys("EmailAddressOrPhoneNumber", "balurahane000@gmail.com");
		click("Next");
		sendKeys("Gmailpassword", "Jayshri#1990");
		click("LogIn");

		
	}

}
