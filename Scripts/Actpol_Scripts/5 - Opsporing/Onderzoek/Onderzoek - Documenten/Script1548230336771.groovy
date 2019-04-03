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

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'CLEOTIS')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam Document lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'Selecting AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '2', false)

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Toevoegen als slachtoffer naa'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte aa'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte lb aa'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte save aa'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit new'))

WebUI.delay(1)

'anu test 5'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering'), '10', false, FailureHandling.OPTIONAL)

'anu test 5'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 2'), '10', false, FailureHandling.OPTIONAL)

'anu test 5'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 3'), '10', false, FailureHandling.OPTIONAL)

'anu test 5'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 4'), '10', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click'))

WebUI.delay(2)

'anu test1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 2'))

WebUI.delay(2)

'anu test1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 3'))

WebUI.delay(2)

'anu test1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp na'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp na'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp na'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Slachtofferhulp na'))

'Selecting rada asdfsad12'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden new drop down'), '4', false)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangever save'))

WebUI.delay(6)

'close the persoon application'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangever save 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document open'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aangevers click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Verzoek Medische Informatie'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/aa doc save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc upload'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document Naam'), 'NEW')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Betreft'), 'ddc')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/doc save'), FailureHandling.STOP_ON_FAILURE)

