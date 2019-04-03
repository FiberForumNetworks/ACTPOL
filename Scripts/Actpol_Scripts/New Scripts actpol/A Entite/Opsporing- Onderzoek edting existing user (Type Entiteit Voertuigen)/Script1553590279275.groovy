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

'Voertuigen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '16', false)

WebUI.delay(4)

'DT'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Kentekennummer drop down'), '14', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Kentekennummer text'), '1212')

WebUI.delay(1)

'EILANDSVOERTUIG'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Type Voertuig'), '7', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Soort Voertuig'), 'AUTOLADDER')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Soort Voertuig lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Merk'), 'ACURA')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Merk lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Model Type'), 'RL')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Model Type lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Chassisnummer'), '12')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Motornummer'), '198')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Kleur'), 'BLAUW')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Kleur lb'))

WebUI.delay(1)

'CNG'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Type Brandstof'), '66', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Bouwjaar'), '12')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Opmerking'), 'Testing data')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Entity - Voertuigen'))

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

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Voertuigen/Voertuigen savve'))

WebUI.delay(3)

WebUI.takeScreenshot()

