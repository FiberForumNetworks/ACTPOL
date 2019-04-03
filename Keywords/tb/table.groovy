package tb
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import bsh.ParseException

public class table {
	
	
	def readtable() throws ParseException {
		WebDriver wd;
		
		wd= new ChromeDriver();
		wd.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
		//No.of Columns
		List  col = wd.findElements(By.xpath("/html/body/div[3]/div[2]/table/thead/tr/th"));
		System.out.println("No of cols are : " +col.size());
		//No.of rows
		List  rows = wd.findElements(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr[1]/td"));
		System.out.println("No of rows are : " + rows.size());
		wd.close();
	}
}
