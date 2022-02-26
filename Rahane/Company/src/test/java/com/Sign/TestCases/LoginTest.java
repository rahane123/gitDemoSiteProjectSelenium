package com.Sign.TestCases;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Sign.Pages.GmailLogin;
//import com.Sign.Pages.SignInPage;
import com.Sign.Pages.SignInPage1;
//import com.Sign.Pages.SignUpPage;
import com.Sign.Pages.SignUpPage1;

	public class LoginTest {

		@Test(priority=0)
		public void login() throws IOException {

			SignUpPage1 sp= new SignUpPage1();
			sp.signUpPage();
		}
		@Test(priority=1)
		public void gmailLogin() throws IOException {
			GmailLogin gm= new GmailLogin();
			gm.gmailLogin();
		}
		@Test(dependsOnMethods= {"gmailLogin"})
		public void signIn() throws IOException {
			SignInPage1 sn= new SignInPage1();
			sn.signIn();
		}

	}

