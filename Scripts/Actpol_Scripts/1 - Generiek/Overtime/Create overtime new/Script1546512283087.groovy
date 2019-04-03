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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Overtime'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Overtime/new overtime'))

WebUI.delay(2)

'AFDELING LEC'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Overtime/Unit Bureau'), '22', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Overtime/IDnummer'), '123456')

'AVONDDIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Overtime/Type Dienst'), '2', false)

'A3-15:00-23:00'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Overtime/Dienst Tijd'), '3', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Overtime/Overtime van'), '08.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Overtime/Overtime tot'), '12.00.00')

WebUI.delay(1)

'AFDELING LEC'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Overtime/Ten behoeve van'), '22', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Overtime/Omschrijving'), 'testing')

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Overtime/overtime save'))

WebUI.closeBrowser()

