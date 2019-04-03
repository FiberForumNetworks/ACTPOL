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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Edit user'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

'Vaartuig'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '17', false)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Soort Vaartuig'), 'Hovercrafts')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Soort Vaartuig lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Type Vartuig'), 'Containerschip')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Type Vartuig lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Naam Vaartuig'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Registratienummer'), '12345678')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Merk'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Vermogen'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Aantal Motoren'), '1')

WebUI.delay(1)

'Binnen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Binnen Buiten'), '24', false)

WebUI.delay(1)

'hout'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Materiaal Type'), '1_', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Kleur'), 'FUSIA')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Kleur lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/VIN'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Land'), 'ALBANIE')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Land lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Opmerking'), 'Testing data')

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Entity - Vaartuig'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen new'))

WebUI.delay(2)

'Communicatie Apparaat'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Type Entiteit'), '11', false)

WebUI.delay(1)

'Computer - test test'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Entiteit drop down'), '152', 
    false)

WebUI.delay(2)

'BOVEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Soort Relatie'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Vaartuig/Vaartuig save'))

WebUI.delay(3)

WebUI.takeScreenshot()

