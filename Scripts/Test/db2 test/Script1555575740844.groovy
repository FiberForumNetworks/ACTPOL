import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


import java.sql.SQLException

import org.openqa.selenium.WebDriver

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

		
		String dbURL = "jdbc:db2://10.20.10.7:4015/S1031e70";
		       String username = "SASI2";
			   String password = "SASI2";
			   //Load DB2 JDBC Driver
			   Class.forName("com.ibm.db2.jcc.DB2Driver");
			   //Creating connection to the database
			   Connection con = DriverManager.getConnection(dbURL,username,password);
			   //Creating statement object
			Statement st = con.createStatement();
			String selectquery = "select *  from KPNAPF25 where UNTCRTD='20190416';";
			   //Executing the SQL Query and store the results in ResultSet
			ResultSet rs = st.executeQuery(selectquery);
			//While loop to iterate through all data and print results
			while (rs.next()) {
			System.out.println(rs.getString("transaction_datetime"));
			}
			   //Closing DB Connection
			con.close();


