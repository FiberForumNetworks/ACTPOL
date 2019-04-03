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

WebUI.comment('ACTPOL login userid and password')

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Opsporing module opening')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.comment('Selecting existing user')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Coordinatie exist user'))

WebUI.delay(2)

WebUI.comment('Selecting Coordinatie tab')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Coordinatie tab'))

WebUI.delay(2)

WebUI.comment('Selecting Nieuw Coordinatie')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuw Coordinatie'))

WebUI.delay(3)

'DOSSIER VERZONDEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderwerp'), '3', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangewezen aan'), 'wijkteam')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangewezen aan lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Beschermd ja'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Coordinate Bericht'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Coordinatie save'))

WebUI.delay(3)

WebUI.comment('Selecting Nieuw Werkopdracht')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuw Werkopdracht'))

WebUI.delay(3)

'DOSSIER ARCHIEF'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderwerp'), '4', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/act Betreft'), 'Test')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Persoon'), 'bhushan')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Persoon lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Taak Beschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Work save'))

WebUI.delay(2)

WebUI.comment('Selecting Teamleden')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Teamleden'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Persoon'), 'bhushan')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Persoon lb 2'))

WebUI.delay(1)

'MINIMALE BEVOEGDHEDEN                             '
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Team Rol'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Team save'))

WebUI.delay(2)

WebUI.comment('Nieuw Journaal start')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuw Journaal'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/journal Onderwerp'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Datum'))

WebUI.delay(1)

'jan'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

'2019\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/24th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Tot Datum'), '24/01/2019')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Coordinate Bericht new'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Co jou save'))

WebUI.delay(2)

WebUI.comment('Journaal Document start')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Journaal_Document'))

WebUI.delay(1)

'Algemeen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Journaal'), '2', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/jd Datum'), '21/01/2019')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/jd Tot Datum'), '24/01/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/jd cordinate create'))

