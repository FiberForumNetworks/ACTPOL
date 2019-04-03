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

WebUI.navigateToUrl('http://10.20.10.7:8202/actpoldev/JPOL392/nxmenu.pgm?docnum=604')

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.ID)

WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.enpassword)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Assistentie editing'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Roll process edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Bekende Aangehouden Verdachte'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Bekende Aangehouden Verdachte new'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/Verdachte Info new/Achternaam'), 'cal')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Achternaam lb'))

WebUI.delay(1)

'I.V.M. GIJZELING'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Reden'), '3', false)

'test'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Type'), '8', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Verdachte Info'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Strafbare feiten'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Strafbare feiten new'))

WebUI.delay(4)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 1'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 1'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 1'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 2'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 2'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 2'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 3'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 3'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 3'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 4'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 4'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 4'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 5'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 5'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 5'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 6'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 6'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 6'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 7'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 7'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 7'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 8'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 8'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 8'), '10', false)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Verdachte Info new/sf save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/Verdachte Info new/total save'))

WebUI.delay(10)

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Bekende Aangehouden Verdachte new'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/Verdachte Info new/Achternaam'), 'cal')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Achetemaam lb2'))

WebUI.delay(1)

'I.V.M. GIJZELING'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Reden'), '3', false)

'test'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Type'), '8', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Verdachte Info'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Strafbare feiten'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Verdachte Info new/Strafbare feiten new'))

WebUI.delay(4)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 1'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 1'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 1'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 2'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 2'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 2'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 3'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 3'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 3'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 4'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 4'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 4'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 5'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 5'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 5'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 6'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 6'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 6'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 7'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 7'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 7'), '10', false)

WebUI.delay(2)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Uitvoering 8'), '8', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Daderschap 8'), '23', false)

'new record'
WebUI.selectOptionByValue(findTestObject('JIRA/Verdachte Info new/Juntu 8'), '10', false)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Verdachte Info new/sf save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/Verdachte Info new/total save'))

WebUI.delay(2)

WebUI.comment('Entiteiten proces start')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/onderzoek edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Entiteit - Persoon edit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Personalia'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Rol Proces'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Rol Proces new'))

WebUI.delay(1)

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Rol Proces type'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('JIRA/a person/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte lb'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/a person/RA save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit new'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/a person/Wetboek'), 'f')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Wetboek lb'))

WebUI.delay(1)

'AMBTSMISDRIJVEN'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Titel'), '9', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Artikel lb'))

WebUI.delay(1)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Uitvoering'), '8', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/sf save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/total save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Rol Proces new'))

WebUI.delay(1)

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Rol Proces type'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('JIRA/a person/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte lb2'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/RA save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit new'))

WebUI.delay(2)

'anu test1'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/sf Uitvoering new'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/sf save new'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/sf save'))

