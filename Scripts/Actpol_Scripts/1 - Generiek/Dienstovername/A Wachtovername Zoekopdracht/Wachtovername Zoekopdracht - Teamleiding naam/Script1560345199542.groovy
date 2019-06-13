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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Dienstovername'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Datum'), '20/12/2018')

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Wijkteam'), 
    '1', false, FailureHandling.OPTIONAL)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Type dienst'), 
    '1', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Teamleiding naam'), 'VIDHYA', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Teamleiding naam LB'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Journal'), 'TestingAvan', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/a Wachtovername Zoekopdracht/Filter'))

WebUI.delay(2)

WebUI.takeScreenshot()

