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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron'), 't')

WebUI.delay(2)

'Default first one is selected'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4754')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Latitude'), 'GG', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/ter hoogte van'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Nadere aanduiding'), 'Testing')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats lb'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Mensenhandel Mensensmokkel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

WebUI.delay(1)

'Select based on environment'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '3', false)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Ambulance'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Achternaam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Resultaat Personen bestand'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Mutatie'), 'Testing')

WebUI.focus(findTestObject('Actpol_Scripts/Intake/Calltaker/Intake Save'))

