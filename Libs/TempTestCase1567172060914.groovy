import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.6\\ACTPOL-560\\20190830_190416\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/mbes new'))

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie new'))

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 1'), 'KORPS POLITIE CURACAO', 
    false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 1'), 'OPENBARE MINISTERIE', 
    false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 2'), 'AMBULANCE', 
    false)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 2'), 'SKS', 
    false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Behandeld door'), 'Katalon testing :: Behandeld door')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Telefoon'), '123456789')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/E-Mail'), 'test@gmail.com')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum'), '23/08/2019')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie save'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/registratie tab'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

not_run: WebUI.delay(1)

'Error message'
Achternaam = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam error messgae'))

KeywordLogger log = new KeywordLogger()

achternaamverify = 'Dit is een vereiste veld'

log.logInfo(Achternaam)

if (Achternaam == achternaamverify) {
    log.logInfo('success and error message in Achternaam')
} else {
    log.logInfo('not showing error message in Achternaam')
}

WebUI.delay(2)

Garantsteller = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller error message'))

Garantstellerverify = 'Dit is een vereiste veld'

log.logInfo(Garantsteller)

if (Garantsteller == Garantstellerverify) {
    log.logInfo('success and error message in Garantsteller/referent')
} else {
    log.logInfo('not showing error message in Garantsteller/referent')
}

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia Achternaam new'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Select default persoon'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/new persoon close btn'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam text'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam text lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller new'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller new lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

test = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/test'))

log.logInfo(test)

''', 'Test Cases/JIRA Tasks/Release 6.6/ACTPOL-560', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.6/ACTPOL-560',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
