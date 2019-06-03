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
import com.kms.katalon.core.testobject.ConditionType as con

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'SS')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb 37'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '7866')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Longitude'), '12', FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'ac')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

'ZELF CONSTATERING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '3', false)

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Melder Gegevens Achternaam'), 'te')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Melder Gegevens Achternaam lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/intake save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Actieve Assistentie click'))

WebUI.delay(2)

Assistentie = WebUI.getText(findTestObject('Actpol_Scripts/Extra script/Incident'))

WebUI.comment('creating dispath module')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Dispatch'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Dipath edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Unit radio click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Koppelen optie click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Koppelen save'))

WebUI.delay(1)

'DO'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'CT', false)

WebUI.delay(4)

'DH'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'TH', false)

WebUI.delay(4)

'DL'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'AH', false)

WebUI.delay(4)

'FR'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'FR', false)

