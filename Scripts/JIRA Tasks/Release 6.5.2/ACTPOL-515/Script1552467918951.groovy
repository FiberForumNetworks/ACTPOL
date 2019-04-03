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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Noodhulp'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Onderhoud van Patrouilles'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/New Unit add'))

WebUI.delay(2)

'POLITIE'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.5.2/Unit Type'), 'P', false)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/Unit name'), 'Pa1213')

WebUI.delay(1)

'NOG EEN TEST'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.5.2/Wijkteam'), '68', false)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Unit save'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/Unit Id'), 'PA1213')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Unit filter'))

WebUI.delay(2)

WebUI.takeScreenshot()

