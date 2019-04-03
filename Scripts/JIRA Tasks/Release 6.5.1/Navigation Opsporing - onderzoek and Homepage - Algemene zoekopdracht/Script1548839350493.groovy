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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.20.10.7:8202/actpoldev/JPOL69/nxmenu.pgm?docnum=604')

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.ID)

WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.enpassword)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.scrollToPosition(5, 5)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Naam Onderzoek name'), 'Test107')

WebUI.delay(1)

'Select new record'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aanleiding Bron'), '4', false)

WebUI.delay(1)

'new record'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aanleiding Bron 1'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rechtsverzoek ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land lb'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Overdracht'), '3', false)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Embargo ja'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Prioriteit'), '1')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse Lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek close tab'))

WebUI.scrollToPosition(5, 5)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Naam Onderzoek name'), 'Test108')

WebUI.delay(1)

'Select new record'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aanleiding Bron'), '4', false)

WebUI.delay(1)

'new record'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aanleiding Bron 1'), '4', false)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rechtsverzoek ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land lb'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Overdracht'), '3', false)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Embargo ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Prioriteit'), '1')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse Lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek close tab'))

WebUI.delay(2)

'onderzoek'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'onderzoek', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Name Onderzoek'), 'Test107')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc van'), '21/01/2016')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc tot'), '30/01/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/zoeken 69'))

WebUI.delay(2)

'onderzoek'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'onderzoek', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Name Onderzoek'), 'Test108')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc van'), '21/01/2016')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc tot'), '30/01/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/zoeken 69'))

