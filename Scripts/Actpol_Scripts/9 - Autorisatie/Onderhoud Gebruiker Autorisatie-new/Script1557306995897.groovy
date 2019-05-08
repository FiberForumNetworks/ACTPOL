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

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Gebruiker Autorisatie-new'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Achternaam'), 'Test12')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Voornaam'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Middelnaam'), 'test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Geslacht Man'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Email'), 'Test@email.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Politieagent nummer'), '12')

WebUI.delay(1)

'AMBULANCE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Korps'), '3', false)

WebUI.delay(1)

'ADMINISTRATIE JUSTICIELE DIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Wijkteam_Bureau'), '45', false)

WebUI.delay(1)

'PLOEG 1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Ploeg'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Soort Ambtenaar Burger'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Weergave in Lijs Ja'))

WebUI.delay(1)

'ADMINISTRATIEVE MEDEWERKER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Functie'), '2', false)

WebUI.delay(1)

'ADJUNCT-COMMIES 1STE KLASSE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Rang'), '2', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Gebruiker id'), 'test18')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Actief Ja'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'BUREAU CHEF BIJZONDERE ONDERZOEKEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Gebruikersgroep'), '62', false)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Gebruiker Autorisatie-Save'))

