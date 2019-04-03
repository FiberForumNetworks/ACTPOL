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

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/existing user onderzoek'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek close'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek existing user'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

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

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr'), '21')

WebUI.delay(2)

'Selecting 129'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr lb 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/meld save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document open'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/dob'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitgewerkte Tapverslag'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc upload'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document Naam'), 'NEW')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Betreft'), 'ddc')

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/doc save'), FailureHandling.STOP_ON_FAILURE)

