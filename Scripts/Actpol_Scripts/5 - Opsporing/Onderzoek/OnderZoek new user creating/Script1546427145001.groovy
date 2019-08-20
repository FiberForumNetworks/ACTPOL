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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling lb'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Naam Onderzoek name'), 'Test1227')

WebUI.delay(1)

'Aangifte'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aanleiding Bron'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rechtsverzoek ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land lb'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Overdracht'), '1', false, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Prioriteit'), '1')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse Lb'))

WebUI.delay(2)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek save'))

WebUI.closeBrowser()

not_run: WebUI.delay(2)

not_run: WebUI.scrollToPosition(5, 5)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek close'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek existing user'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

not_run: WebUI.delay(1)

'Selecting Persoon\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'Test')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam lb'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'Selecting BETROKKENE\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '5', false)

not_run: WebUI.delay(6)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp ja'))

not_run: WebUI.scrollToPosition(10, 8)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Contacten'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Slachtofferhulp'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden new'))

not_run: WebUI.delay(1)

'Selecting rada asdfsad12'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden new drop down'), '4', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/red Omschrijving'), 'Testing')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Red save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/person save'))

not_run: WebUI.delay(6)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/person save 2'))

not_run: WebUI.delay(6)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Importeren Entiteit'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Assistentie Nr'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Assistentie Nr lb'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/imp entite save'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/imp ent close'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Import melding'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr'), '26')

not_run: WebUI.delay(2)

'Selecting 129'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr lb'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/meld save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document open'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/dob'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitgewerkte Tapverslag'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc close'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc upload'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document Naam'), 'NEW')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Betreft'), 'ddc')

not_run: WebUI.delay(1)

not_run: WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/doc save'), FailureHandling.STOP_ON_FAILURE)

