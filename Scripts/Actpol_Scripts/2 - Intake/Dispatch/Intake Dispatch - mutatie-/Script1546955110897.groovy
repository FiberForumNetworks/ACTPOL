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

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit POLITIE'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/alspolitie'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Optie'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kopplean save tab'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Status da'), 'AR', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit mutie'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Iframe/Unit mutie enter data'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit mutie save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit sks'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/als sks'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Optie'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kopplean save tab'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/sks status'), 'AR', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/unit mutatie 2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Iframe/Unit mutie enter data'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit mutie save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit KUSTWACHT'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/als KUSTWACHT'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Optie'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kopplean save tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/als KUSTWACHT mutatie'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Iframe/Unit mutie enter data'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/unit mutie save'))

WebUI.closeBrowser()

