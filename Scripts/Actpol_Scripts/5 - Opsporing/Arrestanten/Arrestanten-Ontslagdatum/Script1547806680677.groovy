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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Arrestanten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/user edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Registratie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting'))

WebUI.delay(2)

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Ontslag Datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/18th'))

not_run: WebUI.acceptAlert()

not_run: WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting plush'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting plush'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestanten save'))

