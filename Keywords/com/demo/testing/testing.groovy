package com.demo.testing
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.annotation.Keyword


class testing {


	/**
	 * data picker
	 */


	@Keyword

	def date() {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user4\\Desktop\\chromedriver.exe");
		wd=new ChromeDriver();

		wd.manage().window().maximize();


		wd.get("http://10.20.10.7:8203/actprmdev/jprm154/nxmenu.pgm?docnum=551");
		wd.findElement(By.id("nx_usr")).sendKeys("sasi");
		wd.findElement(By.id("nx_pwd")).sendKeys("kolanu13");
		wd.findElement(By.id("my_nx_login")).click();


		Thread.sleep(80000)
		wd.switchTo().frame("ifrmviewdoc");
		//No.of Columns
		/*List  col = wd.findElements(By.xpath("/html/body/div/div/div[2]/table/thead/tr/th"));
		 System.out.println("No of cols are : " +col.size());*/


		//No.of rows
		List  rows = wd.findElements(By.xpath("//*[@class='container-fluid']/div[2]/table/thead/tr/th"));
		System.out.println("No of rows are : " + rows.size());
		String rowtext = rows.GetText();
		System.out.println("Third row of table : "+rowtext);

		wd.close();
	}
}