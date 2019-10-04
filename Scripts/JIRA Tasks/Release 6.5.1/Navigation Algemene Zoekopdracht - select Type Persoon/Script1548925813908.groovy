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

WebUI.delay(6)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'), FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.click(findTestObject('JIRA/A NEW/Generiek Assistenties user edit'))

WebUI.delay(12)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '2', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam'), 'a')

WebUI.delay(2)

'Secting abdctest'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam lb'))

WebUI.delay(4)

'textread'
Voornaam = WebUI.getText(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Voornaam get text'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Toevoegen als slachtoffer ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Toevoegen als slachtoffer ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Slachtoffer toestand'))

WebUI.delay(2)

'Selecting goed\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Slachtoffer toestand lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Slachtofferhulp ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Voegen in Strafproces ja'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Schade Bedrag'), 'testing')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Valuta'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Valuta lb'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Omschrijving'), 'Testing')

WebUI.scrollToPosition(10, 7)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte new person'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click'))

WebUI.delay(2)

'Selecting asdf\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click lb'))

WebUI.delay(5)

WebUI.click(findTestObject('JIRA/A NEW/ra save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek'))

WebUI.delay(3)

'Selecting EILANDSBESLUIT ONDERWATERPARK BONAIRE'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))

WebUI.delay(1)

'selecting Algemene beheersmaatregelen'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel new'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))

WebUI.delay(1)

'Selecting anu test 5'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/sf save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Strafbaar feit edit 1'))

WebUI.delay(2)

'anu test2'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Uitvoering'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/vo save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Strafbaar feit edit 2'))

WebUI.delay(4)

'anu test2'
WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Uitvoering'), '2', false)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/vo save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Strafbaar feit edit 3'))

WebUI.delay(2)

'anu test2'
WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Uitvoering'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/vo save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Reden Slachtofferhulp'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/rs new'))

WebUI.delay(1)

WebUI.delay(2)

'NEW RECORD'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/redenHulp'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/A NEW/Omschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/rs save'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/total save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Contact'))

WebUI.delay(4)

'Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'persoon', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Voornaam'), Voornaam)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/zoeken'))

