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

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Autorisatie/Autorisatie'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Autorisatie/Onderhoud Gebruiker Autorisatie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Onderhoud Gebruiker Autorisatie-new'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Achternaam'), 'Test12')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Voornaam'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Middelnaam'), 'test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Geslacht Man'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Email'), 'Test@email.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Politieagent nummer'), '12')

WebUI.delay(1)

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Korps'), '1', false)

WebUI.delay(1)

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Wijkteam_Bureau'), '1', false)

WebUI.delay(1)

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Ploeg'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Soort Ambtenaar Burger'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Weergave in Lijs Ja'))

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Functie'), '1', false)

WebUI.delay(1)

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Rang'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Actief Ja'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Gebruiker id'), 'test18')

WebUI.delay(1)

WebUI.delay(1)

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Gebruikersgroep'), '1', false)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud autorisatie/Onderhoud Gebruiker Autorisatie-Save'))

