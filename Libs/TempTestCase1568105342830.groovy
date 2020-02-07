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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.6\\ACTPOL-569\\20190910_141858\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

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

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Bijzonderheden'), 'AA')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Voornaam'), 'AAADAK123')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Achternaam'), 'AAADAK')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Geboortedatum textbox'), '26/06/2014')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/10 MBES search module/Filter'))

''', 'Test Cases/JIRA Tasks/Release 6.6/ACTPOL-569', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.6/ACTPOL-569',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
