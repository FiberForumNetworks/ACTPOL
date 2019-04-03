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

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Edit user Onderzoek'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 15)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'Test')

WebUI.delay(2)

'CESTER'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Toevoegen als slachtoffer naa'))

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Toevoegen als slachtoffer naa'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Slachtofferhulp na'))

WebUI.waitForElementVisible(findTestObject('JIRA/A onderzoel roll process/Aangever'), 15)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Aangever'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte'))

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte aa'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte lb aa'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Ra save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit new'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/SF save popup'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 2'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 3'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Aangever save'))

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Personalia'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process new'))

WebUI.delay(3)

'Selecting BETROKKENE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '5', false)

WebUI.delay(6)

WebUI.setText(findTestObject('JIRA/A onderzoel roll process/contactperson new person'), 'te')

WebUI.delay(2)

'ALSKJDFLAJ LSKDJFLAKSJFIOWE'
WebUI.click(findTestObject('JIRA/A onderzoel roll process/contactperson new person lb'))

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

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Red save'))

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/person save'))

WebUI.delay(9, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Close data'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Close 2 data'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 15)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'Test')

WebUI.delay(2)

'Error'
WebUI.click(findTestObject('JIRA/A onderzoel roll process/Acheternaam lb2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Toevoegen als slachtoffer naa'))

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Toevoegen als slachtoffer naa'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Slachtofferhulp na'))

WebUI.waitForElementVisible(findTestObject('JIRA/A onderzoel roll process/Aangever'), 15)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Aangever'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte'))

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte aa'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte lb2'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Ra save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit new'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/SF save popup'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 2'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 3'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/sf total save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Personalia'))

WebUI.delay(1)

WebUI.scrollToPosition(29, 7)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process new'))

WebUI.delay(1)

'BEKENDE/AANGEHOUDEN VERDACHTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '1', false)

WebUI.delay(6)

'test'
WebUI.selectOptionByValue(findTestObject('JIRA/A onderzoel roll process/Reden'), '6', false)

WebUI.delay(1)

'ONTBIEDEN'
WebUI.selectOptionByValue(findTestObject('JIRA/A onderzoel roll process/Type'), '3', false)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Strafbare feiten'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Strafbare feiten new'))

WebUI.delay(6, FailureHandling.STOP_ON_FAILURE)

'POGING'
WebUI.selectOptionByValue(findTestObject('JIRA/A onderzoel roll process/Uitvoering'), '1', false)

WebUI.delay(1)

'DOEN PLEGEN'
WebUI.selectOptionByValue(findTestObject('JIRA/A onderzoel roll process/Daderschap'), '5', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Sf save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/bakend aa save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 15)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'Test')

WebUI.delay(2)

'Error'
WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte lb3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'GETUIGE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '7', false)

WebUI.delay(5)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Slachtofferhulp naa'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Getuige'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Getuige'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Getuige new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Getuige click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Getuige lb'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/rg save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Strafbare feiten'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/RG Strafbare feiten new'))

WebUI.delay(6)

WebUI.selectOptionByValue(findTestObject('JIRA/A onderzoel roll process/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 2'), '1', false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 3'), '1', false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 4'), '1', false)

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/RG SF save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/GU save'))

WebUI.delay(6)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/again close'))

