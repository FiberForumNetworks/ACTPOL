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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

KeywordLogger log = new KeywordLogger()

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/mbes new'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN tab'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN new'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN save'))

not_run: WebUI.delay(2)

not_run: incidentalerttext = WebUI.getAlertText(FailureHandling.OPTIONAL)

not_run: log.logInfo(incidentalerttext)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.acceptAlert(FailureHandling.OPTIONAL)

not_run: WebUI.delay(1)

not_run: WebUI.takeScreenshot()

not_run: log.logInfo('successfully saved data without entering any details')

not_run: WebUI.delay(1)

'Mouse over to Generic tab'
not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN new'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Organisatie'), 'SKS', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Datum Incident'), '29/09/2019')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Bejzonderheden'), 'testing : Bejzonderheden')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Contactperson'), 'testing : Contactperson')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Telefoonnummer'), '987512364')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN save'))

WebUI.delay(1)

WebUI.takeScreenshot()

log.logInfo('successfully saved data')

