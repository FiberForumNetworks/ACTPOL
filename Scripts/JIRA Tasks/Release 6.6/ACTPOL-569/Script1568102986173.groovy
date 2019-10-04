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

WebUI.delay(6)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(1)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Autorisatie/Autorisatie'))

WebUI.comment('Adding all feilds of MBES18 ')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/14 th'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Organisatie'), Bijzonderheden, 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Voornaam'), Voornaam)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Achternaam'), Achternaam)

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Geboortedatum textbox'), Geboortedatum)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Geboortedatum Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'jan', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2009', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '1999', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '1989', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '1985', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/26th'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Filter'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

KeywordLogger log = new KeywordLogger()

//log.logInfo("")
log.logInfo(WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident get text')))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/resetform'))

WebUI.delay(1)

WebUI.comment('Checking combinations Search module')

WebUI.delay(1)

WebUI.comment('Checking Datum Incident  and Bijzonderheden')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/14 th'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Organisatie'), Bijzonderheden, 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Filter'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

log.logInfo(WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident get text')))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/resetform'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.comment('Checking Datum Incident  and Voornaam')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/14 th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Voornaam'), Voornaam)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Filter'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

log.logInfo(WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident get text')))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/resetform'))

WebUI.comment('Checking Datum Incident  and Achternaam')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/14 th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Achternaam'), Achternaam)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Filter'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

log.logInfo(WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident get text')))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/resetform'))

WebUI.comment('Checking Datum Incident  and Geboortedatum')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/14 th'))

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Geboortedatum textbox'), Geboortedatum)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Geboortedatum Calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 'jan', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2009', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '1999', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '1989', false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '1985', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/26th'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Filter'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

log.logInfo(WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Datum Incident get text')))

WebUI.delay(1)

