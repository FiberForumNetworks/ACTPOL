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

WebUI.delay(4)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

log.logInfo('Successfully logged')

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

log.logInfo('Clicking MBES18 tab ')

WebUI.delay(3)

WebUI.takeScreenshot()

//KeywordLogger log = new KeywordLogger()
log.logInfo('MBES18 module is displayed')

WebUI.delay(1)

'Get text from the feild'
optie = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/optie'))

log.logInfo('Grid is shown contains columns mentioned ::' + optie)

WebUI.delay(1)

'Get text from the feild'
vlg = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Vlg. Nummer'))

log.logInfo('Grid is shown contains columns mentioned ::' + vlg)

WebUI.delay(1)

'Get text from the feild'
datam = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Datum Incident'))

log.logInfo('Grid is shown contains columns mentioned ::' + datam)

WebUI.delay(1)

/*'Get text from the feild'
bij = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Bijzonderheden'), FailureHandling.OPTIONAL)

log.logInfo('Grid is shown contains columns mentioned ::' + bij)

WebUI.delay(1)*/
'Get text from the feild'
org = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Organisatie'))

log.logInfo('Grid is shown contains columns mentioned ::' + org)

WebUI.delay(1)

/*'Get text from the feild'
con = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Contact persoon'), FailureHandling.OPTIONAL)

log.logInfo('Grid is shown contains columns mentioned ::' + con)

WebUI.delay(1)

'Get text from the feild'
telefoon = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Telefoon nummer'), FailureHandling.OPTIONAL)

log.logInfo('Grid is shown contains columns mentioned ::' + telefoon)

WebUI.delay(1)*/
'Get text from the feild'
voornaam = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Voornaam'))

log.logInfo('Grid is shown contains columns mentioned ::' + voornaam)

WebUI.delay(1)

'Get text from the feild'
achternaam = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Achternaam'))

log.logInfo('Grid is shown contains columns mentioned ::' + achternaam)

WebUI.delay(1)

'Get text from the feild'
geb = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-558/Geboortedatum'))

log.logInfo('Grid is shown contains columns mentioned ::' + geb)

log.logInfo('MBES18 module a grid will shown in Arrestanten, with the Options Vrnummer, Datum incident, Organisatie,Voornaam, Achternaam and  Geboortedatum.')

