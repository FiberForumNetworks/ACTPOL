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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Case Screening'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/534 Case Screening Period van'), '28/02/2019')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/534 Case Screening Period tot'), '28/02/2019')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/534 Case Screening filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/534 existing user selection'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/534 screening hide'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/534 Verdachte open'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/534 Verdachte existing user view'))

WebUI.delay(2)

WebUI.takeScreenshot()

