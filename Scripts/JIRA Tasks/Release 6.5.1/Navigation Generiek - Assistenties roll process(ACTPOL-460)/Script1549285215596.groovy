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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Assistentie editing'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting Vreemdeling\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '57', false)

WebUI.delay(3)

'Luchthaven'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Locatie'), '86', false)

WebUI.delay(1)

'LOCATION 2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Post'), '89', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Achternaam'), 'le')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Vreemdeling'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Reisdocumenten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Reisdocumenten new'))

WebUI.delay(2)

'BANKBOOK'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Soort Document'), '101', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Document nummer'), '101')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Plaats afgifte'), 'la')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Plaats afgifte lb'))

WebUI.delay(1)

'STUDENT'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Visuem Type'), '104', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Visum duur'), 'Test')

WebUI.delay(1)

'RESEARCH'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Visum doel'), '105', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Reisdocumenten save'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Assistentie/A Vreemdeling/Vreemdeling save'))

