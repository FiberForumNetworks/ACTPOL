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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Case Screening'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

'Click Calendar icon'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-534/Period van'))

WebUI.delay(1)

'Select required month'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), '1', false)

WebUI.delay(1)

'Select required year'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Date/28th'))

WebUI.delay(1)

'Click Calendar icon'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-534/Period tot'))

WebUI.delay(1)

'Select required month'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), '1', false)

WebUI.delay(1)

'Select required year'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Date/28th'))

WebUI.delay(1)

'Click Filter btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-534/Filter'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Case screning/Invoer Case Screening user selection'))

'Remember first set default assistentieid after run the script'
String CaseScreeningID_ID = GlobalVariable.CaseScreeningID

String Casescreeingxpath = ('(//td[text()="' + CaseScreeningID_ID) + '"]/preceding-sibling::td/a[2])[1]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', type.EQUALS, Casescreeingxpath)

WebUI.click(to)

WebUI.delay(2)

'Click Screening tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-534/Screening'))

WebUI.delay(1)

'Click Verdachte tab.'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-534/Verdachte tab'))

WebUI.delay(1)

'Click Verdachte edit '
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-534/Verdachte edit'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.println('data displaying properly')

