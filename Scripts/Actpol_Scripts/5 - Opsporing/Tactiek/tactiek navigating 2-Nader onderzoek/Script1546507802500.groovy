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
import com.kms.katalon.core.testobject.ConditionType as type

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Tactiek'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/tactiek/ta Invoer Case Screening user selection'))

'Remember first set default assistentieid after run the script'
String Taktiek_ID = GlobalVariable.TaktiekID

String Casescreeingxpath = ('(//td[text()="' + Taktiek_ID) + '"]/preceding-sibling::td/a[2])[1]'

TestObject to = findTestObject('Actpol_Scripts/Opsporing/tactiek/ta Invoer Case Screening user selection')

to.addProperty('xpath', type.EQUALS, Casescreeingxpath)

WebUI.click(to)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Case screning/Bekende Verdachte ja'))

WebUI.delay(1)

'select Afronden\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/tactiek/Beslissing OM'), '3', false)

WebUI.delay(1)

'selecting 1-Ter aanhouding'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Case screning/Daderindicatie'), '183', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Case screning/Omschrijving extra factor'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Case screning/Invoer Case Screening close tab'))

WebUI.closeBrowser()

