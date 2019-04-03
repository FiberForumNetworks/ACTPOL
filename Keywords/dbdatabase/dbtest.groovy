package dbdatabase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class dbtest {
	private WebDriver Driver;
	@Keyword
	def refreshBrowser() throws SQLException, ClassNotFoundException {

		//10.20.10.7
		String dbURL = "jdbc:db2://10.20.10.7:4015/S1031e70";
		String username = "sasi2";
		String password = "sasi2";
		//Load DB2 JDBC Driver
		// example /com.ibm.db2.jcc.DB2Driver
		Class.forName("com.ibm.db2.jcc.DB2Driver");

		//Creating connection to the database
		Connection con = DriverManager.getConnection("dbURL","username","password");
		//Creating statement object
		//Statement st = con.createStatement();
		System.out.print("mani");
		con.close();

		/*String selectquery = "select  EIJDMLDMNT,EIJDVLGNR,EIJDDTM2,EIJDEXPRTM,EIJDRSLT from kcdevdta.pbbpf2070 where EIJDEVENT=5860001918;";
		 //Executing the SQL Query and store the results in ResultSet
		 ResultSet rs = st.executeQuery(selectquery);
		 //While loop to iterate through all data and print results
		 while (rs.next()) {
		 System.out.println("Displaying record...");
		 String  id  = rs.getInt("EIJDMLDMNT");
		 String  id2  = rs.getInt("EIJDVLGNR");
		 String	date = rs.getString ("EIJDDTM2");
		 String	time = rs.getString("EIJDEXPRTM");
		 String	yesorno = rs.getString("EIJDRSLT");
		 //Display values
		 System.out.print("EIJDMLDMNT: " + id);
		 System.out.print("EIJDVLGNR: " + id2);
		 System.out.print("EIJDDTM2: " + date);
		 System.out.print("EIJDEXPRTM: " + time);
		 System.out.println("EIJDRSLT: " + yesorno);*/
	}
	//Closing DB Connection

}





