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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info Aanvraag'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Bestand'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info area text'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info Ontvangen'))

WebUI.delay(4)

'Type 1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Verwijzen'), '11', false)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Bestand'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info area text'), 'Testing')

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info save'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaak'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaask mouse over'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaask click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaask click bold'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaask click center'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaask text color'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmaask click red color'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info area text'), '      ,Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Info save'))

