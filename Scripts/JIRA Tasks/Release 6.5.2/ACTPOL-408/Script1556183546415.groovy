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

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Handhaving'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Doorsturen OPV'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/408 Voornaam text enter'), 5)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/408 Voornaam text enter'), 'Jaïm')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/408 Voornaam text lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/408 filter click'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/408 Achternaam text enter'), 'Rosiël')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/408 Achternaam text lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/408 filter click'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.takeScreenshot()

