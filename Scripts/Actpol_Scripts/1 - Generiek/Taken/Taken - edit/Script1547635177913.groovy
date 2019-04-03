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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Taken'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Taken/taken edit'))

WebUI.delay(2)

'CENTRALIST'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Taken/Rang'), '7', false)

'TER INFORMATIE'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Taken/Onderwerp'), '7', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Taken/Betreft'), 'Test')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Taken/Persoon click'))

not_run: WebUI.delay(2)

'10516 - BHUSHAN, Anuradha'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Taken/Persoon lb'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Taken/Taak Beschrijving'), 'Testing')

not_run: WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Taken/Taken save'))

