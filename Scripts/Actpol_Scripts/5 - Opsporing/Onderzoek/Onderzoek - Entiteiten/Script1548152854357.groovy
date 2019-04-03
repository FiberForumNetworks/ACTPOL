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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/entite user edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'aaa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam lb 2'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'Selecting BETROKKENE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '5', false)

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp ja'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Contacten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Slachtofferhulp'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden new'))

WebUI.delay(1)

'Selecting rada asdfsad12'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden new drop down'), '4', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/red Omschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Red save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/person save'))

WebUI.delay(6)

'close the persoon application'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/person save 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(10)

'Selecting Adres\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '7', false)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adres set text'), 'VA')

WebUI.delay(2)

'JAVA STRAAT'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adres set text lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adresnummer'), 'VA123456789')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nadere aanduiding'), 'Testing')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking addr'), 'Testing')

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entity - Adres'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Koppelen'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Koppelen new'))

WebUI.delay(2)

'Communicate'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit koppelen'), '20', false)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteit new'))

WebUI.delay(3)

'Anders'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Categorie'), '9', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Imsi'), '123456789123')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Provider'), 'Airtel')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking communicatie'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Communicatie save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Kopplan plush'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/ader save'))

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Importeren Entiteit'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Assistentie Nr'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Assistentie Nr lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/imp entite save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/imp ent close'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Import melding'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr'), '25')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr lb 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/meld save'))

WebUI.delay(3)

