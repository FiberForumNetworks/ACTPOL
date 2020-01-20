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

'Login to the application'
WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

KeywordLogger log = new KeywordLogger()

WebUI.delay(6)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

log.logInfo('Successfully logged')

WebUI.delay(4)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'), FailureHandling.OPTIONAL)

log.logInfo('Clicking MBES18 tab ')

WebUI.delay(1)

WebUI.delay(8)

'Click new btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/mbes new'))

log.logInfo('Clicking MBES18 new button ')

WebUI.delay(6)

'Click new btn in Registratie'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie new'))

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 1'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 2'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 2'), '4', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Behandeld door'), 'Katalon testing :: Behandeld door')

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Telefoon'), '123456789')

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/E-Mail'), 'test@gmail.com')

WebUI.delay(1)

'Enter the date'
not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum'), '23/08/2019')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum calendar icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie save'))

WebUI.delay(1)

'Click on Registratie tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/registratie tab'))

WebUI.delay(1)

'Click on Personalia tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.delay(2)

'Click Save tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

WebUI.delay(1)

'Checking Error message personalia tab'
Achternaam = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam error messgae'))

//KeywordLogger log = new KeywordLogger()
achternaamverify = 'Dit is een vereiste veld'

log.logInfo(Achternaam)

if (Achternaam == achternaamverify) {
    log.logInfo('success and error message in Achternaam')
} else {
    log.logInfo('not showing error message in Achternaam')
}

WebUI.delay(2)

'Checking Error message personalia tab'
Garantsteller = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller error message'))

Garantstellerverify = 'Dit is een vereiste veld'

log.logInfo(Garantsteller)

if (Garantsteller == Garantstellerverify) {
    log.logInfo('success and error message in Garantsteller/referent')
} else {
    log.logInfo('not showing error message in Garantsteller/referent')
}

WebUI.delay(2)

WebUI.comment('Checking button how it is working')

'Click Achternaam new btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia Achternaam new'))

WebUI.delay(4)

'Select default persoon'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Select default persoon'), FailureHandling.OPTIONAL)

WebUI.delay(2)

'Click close btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/new persoon close btn'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('Checking text box how it is working')

'Enter text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam text'), 'aa')

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam text lb'))

WebUI.comment('Checking edit btn how it is working')

WebUI.delay(1)

'Click edit btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-560/Edit btn check in personaila btn'))

WebUI.delay(6)

'Enter text from the feild'
WebUI.sendKeys(findTestObject('JIRA/A Relese 6.6/ACTPOL-560/Edit btn check in personaila btn'), '124')

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-560/Click new persoon save popup'))

WebUI.delay(4)

WebUI.comment('Checking Search btn how it is working')

'Click Search btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-560/Achternaam search btn click'))

WebUI.delay(1)

'Move to position'
WebUI.scrollToPosition(10, 7)

WebUI.delay(4)

'Click on close btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-560/Search close btn'))

WebUI.delay(6)

'Enter text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller new'), 'aa')

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller new lb'))

WebUI.delay(1)

'Click on Personalia tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

