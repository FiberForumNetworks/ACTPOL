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

WebUI.delay(1)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

log.logInfo('Successfully logged')

WebUI.delay(3)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'), FailureHandling.OPTIONAL)

log.logInfo('Clicking MBES18 tab ')

WebUI.delay(1)

WebUI.delay(5)

'Click new btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/mbes new'))

log.logInfo('Clicking MBES18 new button ')

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.comment('Checking This should contain tab registratie, Personalia, Inbewaringstellings c.q. Plaatsingegevens, Gedrag/Medisch, Incidenten, Overige gegevens, Bezittingen/Bagage, Documenten. ')

'Registration tab is visible in in the grid.'
reg = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

log.logInfo('Grid is shown contains tabs mentioned ::' + reg)

WebUI.delay(1)

'Personalia tab is visible in in the grid.'
per = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/Personalia tab'))

log.logInfo('Grid is shown contains columns mentioned ::' + per)

WebUI.delay(1)

'INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS tab is visible in in the grid.'
inb = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS tab'))

log.logInfo('Grid is shown contains columns mentioned ::' + inb)

WebUI.delay(1)

'GEDRAG/MEDISCH tab is visible in in the grid.'
ged = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/4 GEDRAG_MEDISCH/GEDRAG MEDISCH tab'))

log.logInfo('Grid is shown contains columns mentioned ::' + ged)

WebUI.delay(1)

'INCIDENTEN tab is visible in in the grid.'
inc = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN tab'))

log.logInfo('Grid is shown contains columns mentioned ::' + inc)

WebUI.delay(1)

'OVERIGE GEGEVENS tab is visible in in the grid.'
over = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/OVERIGE GEGEVENS tab'))

log.logInfo('Grid is shown contains columns mentioned ::' + over)

WebUI.delay(1)

'BEZITTINGEN/BAGAGE tab is visible in in the grid.'
begi = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/BEZITTINGEN_BAGAGE tab'))

log.logInfo('Grid is shown contains columns mentioned ::' + begi)

WebUI.delay(1)

WebUI.comment('Data entering in Registratie tab')

WebUI.delay(1)

'Click new btn in Registratie'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie new'))

not_run: WebUI.delay(1)

'Click save btn'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie save'))

not_run: WebUI.delay(1)

not_run: WebUI.getAlertText()

not_run: WebUI.delay(1)

not_run: WebUI.acceptAlert()

not_run: WebUI.delay(3)

not_run: WebUI.takeScreenshot()

not_run: log.logInfo('without throwing error data is saved the grid...')

not_run: log.logInfo('not getting error message')

'Click new btn in Registratie'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie new'))

WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/temp/Page_ACTPOL Test/select_KORPS POLITIE CURACAOOPENBARE MINISTERIEAMBULANCESKSBRANDWEER'), 
    '1', true)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 1'), 'KORPS POLITIE CURACAO', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 1'), 'OPENBARE MINISTERIE', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 2'), 'AMBULANCE', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 2'), 'SKS', false)

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
not_run: WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum'), '23')

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

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.comment('Editing existing record in Registratie')

'Edit the existing record '
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-559/edit existing record in registratie'))

WebUI.delay(2)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 1'), 'KORPS POLITIE CURACAO', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 1'), 'OPENBARE MINISTERIE', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 2'), 'AMBULANCE', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 2'), 'SKS', false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Behandeld door'), 'Katalon testing :: Behandeld door')

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Telefoon'), '123456789')

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/E-Mail'), 'test@gmail.com')

WebUI.delay(1)

'Enter the date'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum'), '25/10/2019')

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie save'))

log.logInfo('edit mode working fine ')

WebUI.delay(1)

WebUI.comment('View existing record in Registratie')

WebUI.delay(1)

'Click view mode for existing saved record'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-559/View existing record'))

log.logInfo('View mode is displaying new button ')

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

'Click the close btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-559/View mode close btn'))

WebUI.delay(1)

WebUI.comment('View existing record in Registratie')

WebUI.delay(1)

'Click delete btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-559/Delete existing'))

WebUI.delay(1)

'Re conform the delete btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-559/Conform delete'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/registratie tab'))

