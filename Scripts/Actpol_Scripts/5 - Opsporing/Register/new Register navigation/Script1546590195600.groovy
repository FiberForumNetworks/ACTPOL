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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Register'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/New register'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Afdeling'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Afdeling lb'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Register/Naam Onderzoek'), 'Test11')

'Proces-Verbaal TCI'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Register/Redden Opname Register'), '112', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Register/Opmerking'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Register'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse click lb'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Register/r save'))

WebUI.delay(1)

WebUI.closeBrowser()

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

not_run: WebUI.delay(6)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Import melding'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr'), '29')

not_run: WebUI.delay(2)

'29'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr lb 4'))

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

