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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Dashboard/Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Dashboard/Rapportage'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/Begin Datum'), '30/01/2018')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/Eind Datum'), '30/01/2019')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('JIRA/Repo Status'), '', false)

WebUI.selectOptionByValue(findTestObject('JIRA/Repo Wijkteam'), '', false)

WebUI.selectOptionByValue(findTestObject('JIRA/Repo Wijk'), '', false)

'TEST1212'
WebUI.selectOptionByValue(findTestObject('JIRA/Lokatie type'), '8', false)

WebUI.selectOptionByValue(findTestObject('JIRA/Aangewezen aan'), '', false)

WebUI.delay(1)

WebUI.focus(findTestObject('JIRA/Periode niets'))

WebUI.click(findTestObject('JIRA/zoeken'))

WebUI.delay(3)

WebUI.scrollToPosition(149, 384)

WebUI.delay(2)

WebUI.scrollToPosition(236, 164)

WebUI.delay(2)

WebUI.scrollToPosition(125, 155)

WebUI.delay(2)

WebUI.scrollToPosition(132, 251)

