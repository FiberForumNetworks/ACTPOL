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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Dispatch'))

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/AMBULANCE'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Spoedgevallen AMBULANCE'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/ka delofficer'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kopplean save tab'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/clear to dc'), 'AR', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/clear to dc'), 'DR', false)

WebUI.delay(2)

WebUI.closeBrowser()

