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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Case Screening'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Invoer Case Screening select 1st user'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Case screning/Bureau'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Case screning/Bureau lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Case screning/Bekende Verdachte ja'))

WebUI.delay(1)

'2-Nader Onderzoek'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Case screning/Daderindicatie'), '183', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Case screning/Omschrijving extra factor'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Invoer Case Screening save'))

WebUI.comment('this record will go into opsporing tactiek')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Tactiek'))

WebUI.delay(2)

WebUI.focus(findTestObject('Actpol_Scripts/Extra script/Opti test click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/filter date'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/filter date'))

WebUI.delay(2)

