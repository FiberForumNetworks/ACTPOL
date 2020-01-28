import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil as key
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('JIRA Tasks/Release 6.6.1/ACTPOL-577'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag new'))

WebUI.delay(7)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verklaring registratie'), 'nvkldsnklvnklfdnbfdnlb knkgfv bklngfn ;fn lfdn knfn bnfgb o;lfnd l;fnl ngfn ;lfmb mfl;d fkn ;fldn \'lfd sp\'fwqhfwqofv eihgopewhg[[wekz;vm dsz/vm z jfwpjf;oeaighrep9-ghrepbnofaerb[horenbodn')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/ambt dave'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal tab'))

