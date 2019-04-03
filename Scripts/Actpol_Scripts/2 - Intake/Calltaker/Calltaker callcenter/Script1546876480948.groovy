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

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron'), 'test')

WebUI.delay(2)

'select user "test6"'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4754')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident'), 'weg')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb 3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Latitude'), 'GG')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Latitude 2'), 'GG')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/ter hoogte van'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Nadere aanduiding'), 'Testing')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'te')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'ac')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(2)

'DIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Categorie'), '4', false)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

WebUI.delay(1)

'select user "CALLTAKER"'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '18', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Ambulance'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Achternaam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Resultaat Personen bestand'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Mutatie'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Intake Save'))

