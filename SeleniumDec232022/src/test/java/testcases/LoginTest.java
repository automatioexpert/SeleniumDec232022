package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("titleTest passed");
	}

}
