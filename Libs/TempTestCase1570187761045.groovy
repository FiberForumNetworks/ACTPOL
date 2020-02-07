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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.5.1\\Navigation Generiek - assistentie - rol proces aangever. Also Opsporing - entiteiten - Persoon - aangever\\20191004_164556\\execution.properties')

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

not_run: WebUI.waitForPageLoad(60)

not_run: WebUI.delay(2)

not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Assistentie editing'))

not_run: WebUI.delay(12)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Roll process edit'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Bekende Aangehouden Verdachte'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Bekende Aangehouden Verdachte new'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Bekende Aangehouden Verdachte new new'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('JIRA/A NEW/Verdachte Info new/Achternaam'), 'cal')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Achternaam lb'))

not_run: WebUI.delay(1)

'I.V.M. GIJZELING'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Reden'), '3', false)

not_run: WebUI.delay(1)

'test'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Type'), '3', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Verdachte Info'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Strafbare feiten'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Strafbare feiten new'))

not_run: WebUI.delay(4)

'anu test 3'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 1'), '1', FailureHandling.STOP_ON_FAILURE)

'new record'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 1'), '1', FailureHandling.STOP_ON_FAILURE)

'new record'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 1'), '1', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

'anu test 3'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 2'), '1', FailureHandling.OPTIONAL)

'new record'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 2'), '1', FailureHandling.OPTIONAL)

'new record'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 2'), '1', FailureHandling.OPTIONAL)

not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

'anu test 3'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 3'), '1', FailureHandling.OPTIONAL)

'new record'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 3'), '1', FailureHandling.OPTIONAL)

'new record'
not_run: WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 3'), '1', FailureHandling.OPTIONAL)

not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 4'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 4'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 4'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 5'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 5'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 5'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 6'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 6'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 6'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 7'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 7'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 7'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 8'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 8'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 8'), '10', false)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/sf save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/total save'))

WebUI.delay(10)

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Bekende Aangehouden Verdachte new'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A NEW/Verdachte Info new/Achternaam'), 'aaa')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Achetemaam lb2'))

WebUI.delay(1)

'I.V.M. GIJZELING'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Reden'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'test'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Type'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Verdachte Info'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Strafbare feiten'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/Strafbare feiten new'))

WebUI.delay(4)

'anu test 3'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 1'), '1', FailureHandling.STOP_ON_FAILURE)

'new record'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 1'), '1', FailureHandling.STOP_ON_FAILURE)

'new record'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.OPTIONAL)

'anu test 3'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 2'), '1', FailureHandling.OPTIONAL)

'new record'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 2'), '1', FailureHandling.OPTIONAL)

'new record'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 2'), '1', FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

'anu test 3'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 3'), '1', FailureHandling.OPTIONAL)

'new record'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 3'), '1', FailureHandling.OPTIONAL)

'new record'
WebUI.selectOptionByIndex(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 3'), '1', FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 4'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 4'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 4'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 5'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 5'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 5'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 6'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 6'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 6'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 7'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 7'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 7'), '10', false)

not_run: WebUI.delay(2)

'anu test 3'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Uitvoering 8'), '8', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Daderschap 8'), '23', false)

'new record'
not_run: WebUI.selectOptionByValue(findTestObject('JIRA/A NEW/Verdachte Info new/Juntu 8'), '10', false)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/sf save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A NEW/Verdachte Info new/total save'))

WebUI.delay(2)

WebUI.comment('Entiteiten proces start')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/onderzoek edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Entiteit - Persoon edit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Personalia'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Rol Proces'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Rol Proces new'))

WebUI.delay(1)

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Rol Proces type'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('JIRA/a person/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte lb'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/a person/RA save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit new'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/a person/Wetboek'), 'f')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Wetboek lb'))

WebUI.delay(1)

'AMBTSMISDRIJVEN'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Titel'), '9', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Artikel lb'))

WebUI.delay(1)

'anu test 3'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Uitvoering'), '8', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/sf save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/total save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Rol Proces new'))

WebUI.delay(1)

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/Rol Proces type'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('JIRA/a person/Toevoegen als slachtoffer na'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('JIRA/a person/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Reden Aangifte lb2'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/RA save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Strafbaar feit new'))

WebUI.delay(2)

'anu test1'
WebUI.selectOptionByValue(findTestObject('JIRA/a person/sf Uitvoering new'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/sf save new'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/sf save'))

''', 'Test Cases/JIRA Tasks/Release 6.5.1/Navigation Generiek - assistentie - rol proces aangever. Also Opsporing - entiteiten - Persoon - aangever', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.5.1/Navigation Generiek - assistentie - rol proces aangever. Also Opsporing - entiteiten - Persoon - aangever',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
