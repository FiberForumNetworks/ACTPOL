import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.sql.SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

@SuppressWarnings("unused")
public class db2 {
	@Keyword
	public static void selectQuery() throws SQLException, ClassNotFoundException {
		String dbURL = "jdbc:db2://10.20.10.7:50000/S1031e70";
		String username = "sasi2";
		String password = "sasi2";
		//Load DB2 JDBC Driver
		// example /com.ibm.db2.jcc.DB2Driver
		Class.forName("com.ibm.db2.jcc.DB2Driver");

		//Creating connection to the database
		Connection con = DriverManager.getConnection(dbURL,username,password);
		//Creating statement object
		Statement st = con.createStatement();
		//String selectquery = "update pbbpf2070 set   EIJDEXPRTM='16.58.00' , EIJDRSLt = 'ok',EIJDDTM2='2018-10-10'   WHERE EIJDEVENT = 5860001718; ";
		String selectquery = "select * from kcdevdta.pbbpf2070 where EIJDEVENT=5860001918;";
		//Executing the SQL Query and store the results in ResultSet
		ResultSet rs = st.executeQuery(selectquery);
		//While loop to iterate through all data and print results
		while (rs.next()) {
			System.out.println(rs.getString("transaction_datetime"));
		}
		//Closing DB Connection
		con.close();
	}


}
