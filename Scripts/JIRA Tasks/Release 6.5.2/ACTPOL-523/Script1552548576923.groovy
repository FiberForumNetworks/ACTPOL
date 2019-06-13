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

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/523 user edit'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam lb'))

WebUI.delay(3)

'Vreemdeling\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '57', false)

WebUI.delay(2)

WebUI.takeScreenshot()

