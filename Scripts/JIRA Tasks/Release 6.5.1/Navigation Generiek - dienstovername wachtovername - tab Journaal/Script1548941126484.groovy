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

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Dienstovername'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Dienstovername new'))

WebUI.delay(2)

'ADMINISTRATIE JUSTICIELE DIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Afdeling'), '45', false)

'AVONDDIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Type Dienst'), '2', false)

'2\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Team'), '17', false)

WebUI.delay(1)

'intake'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Type Proces'), '44', false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Datum'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Datum tm'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Diensttijd van'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Diensttijd van tm'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Teamleiding Naam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Teamleiding Naam lb'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Dienst'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel new'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Naam'), 'alex')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Naam lb'))

'ZIEK'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Bijzonderheden'), '2', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Aantal Uren'), '01.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p save'))

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/j click'))

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Journal'), 'Test441', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/j click'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/d total save'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/A NEW/Wachtovername Zoekopdracht Dataam'), '31/01/2019')

WebUI.delay(1)

'ADMINISTRATIE JUSTICIELE DIENST'
WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Wijkteam'), '45', false)

WebUI.delay(1)

'AVONDDIENST'
WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Type dienst'), '2', false)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A NEW/Journal'), 'Test441')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/submit'))

