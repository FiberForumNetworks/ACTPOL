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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit'), 5)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit'), 'ARTIKEL 30 LID 1 A')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit lb'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 filter click test'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(2)

'Werkvoorraad'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.5.2/411 grid selection'), 'Werkvoorraad', false)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit'), '1:1 LID 2')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit lb 2'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 filter click test'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

not_run: WebUI.delay(1)

not_run: WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/411 optie move element'), 5)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Tactiek'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit'), 5)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit'), 'ARTIKEL 30 LID 1 A')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit lb'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 filter click test'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 Case Screening Uitgedeeld pdf report click'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(2)

'Gesloten'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.5.2/411 grid selection'), 'Gesloten', false)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit'), '3:85 LID 2')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 left menu Strafbaar feit lb 3'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 filter click test'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/411 optie move element'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/411 Gesloten pdf report click'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

