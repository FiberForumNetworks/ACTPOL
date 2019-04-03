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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Onderhoud/Onderhoud'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Onderhoud/Basis Bestanden Meldkamer'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/aa onderhoud/Officiele Straatnamen'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/aa onderhoud/Officiele Straatnamen new'))

WebUI.delay(4)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Straat Naam'), 'Nagu Street')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Straat Omschrijving'), 'Testing new')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Address Details set text'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/aa onderhoud/Address Details lb'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('JIRA/aa onderhoud/Zee ja'), 'J', false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('JIRA/aa onderhoud/Actief ja'), 'J', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/aa onderhoud/save'))

WebUI.comment('zaa na')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/aa onderhoud/Officiele Straatnamen new'))

WebUI.delay(4)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Straat Naam'), 'Nagu Land')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Straat Omschrijving'), 'Testing new')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Address Details set text'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/aa onderhoud/Address Details lb'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('JIRA/aa onderhoud/Zee ja'), 'N', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('JIRA/aa onderhoud/Actief ja'), 'J', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/aa onderhoud/save'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

'Creating New Incident\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie New'))

WebUI.delay(5)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Incident Adres'), 'Nagu Street')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/aa onderhoud/Entite edit'))

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.waitForElementClickable(findTestObject('JIRA/aa onderhoud/user add'), 20)

WebUI.click(findTestObject('JIRA/aa onderhoud/user add'))

WebUI.waitForElementClickable(findTestObject('JIRA/aa onderhoud/Personen edit'), 15)

WebUI.click(findTestObject('JIRA/aa onderhoud/Personen edit'))

WebUI.waitForElementClickable(findTestObject('JIRA/aa onderhoud/Adres Hide'), 15)

WebUI.click(findTestObject('JIRA/aa onderhoud/Adres Hide'))

WebUI.waitForElementClickable(findTestObject('JIRA/aa onderhoud/Personalia hide'), 15)

WebUI.click(findTestObject('JIRA/aa onderhoud/Personalia hide'))

WebUI.waitForElementVisible(findTestObject('JIRA/aa onderhoud/Adres set'), 15)

WebUI.setText(findTestObject('JIRA/aa onderhoud/Adres set'), 'Nagu Land')

