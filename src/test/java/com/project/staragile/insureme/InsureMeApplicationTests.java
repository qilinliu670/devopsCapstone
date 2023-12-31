package com.project.staragile.insureme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class InsureMeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreatePolicy() {
		Policy policy = new Policy(1, "Shubham", "Individual" , 10000, "10-Sep-2021", "10-Sep-2022");
		PolicyService pService = new PolicyService();
		//Policy outputPolicy = pService.CreatePolicy();
		assertEquals(policy.getPolicyId(), pService.generateDummyPolicy().getPolicyId());
		
	}
	
	@Test
	void testSearchPolicy() {
		PolicyService pService = new PolicyService();
		assertEquals(null,pService.searchPolicy());
	}

	/*@Test
	void seleniumTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jason\\Documents\\eclipse\\workspace\\devopsCapstone\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("myEmail");
        driver.findElement(By.id("pass")).sendKeys("myPassword");
        assertEquals(1, 1);
        driver.close();
	}*/
}
