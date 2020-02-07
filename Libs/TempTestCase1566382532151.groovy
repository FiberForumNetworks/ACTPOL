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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.6\\ACTPOL-316\\20190821_154527\\execution.properties')

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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

not_run: WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 
    'assist', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), 
    GlobalVariable.Generiekassistenite_Module)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

not_run: WebUI.delay(2)

//CHECK CODE 
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
not_run: String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

not_run: String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

not_run: TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

not_run: to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

not_run: WebUI.delay(5)

not_run: WebUI.click(to)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

not_run: WebUI.delay(2)

not_run: WebUI.comment('Select process "VREEMDELING"')

'Select required dropdown'
not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'VREEMDELING', 
    false)

not_run: WebUI.delay(3)

'Enter the text'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Vliegmaatschappij_Rederij'), 'Katalon testing')

not_run: WebUI.delay(1)

'Enter the text'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Naam boot_vliegtuig'), 'Katalon testing')

not_run: WebUI.delay(1)

'Enter the telefoon number'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Telefoon boot_vliegtuig'), 'Katalon testing')

not_run: WebUI.delay(1)

'Enter the text'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Agentschap'), 'Katalon testing')

not_run: WebUI.delay(1)

'Enter the text'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Achternaam'), 'aa')

not_run: WebUI.delay(2)

'Select required dropdown'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Achternaam lb'))

not_run: WebUI.delay(2)

not_run: WebUI.scrollToPosition(10, 8)

not_run: WebUI.delay(3)

'Click Vreemdeling tab'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Vreemdeling TAB'))

not_run: WebUI.delay(1)

'Click Weigering tab'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering tab'))

not_run: WebUI.delay(1)

'Click Weigering door1'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door1'))

not_run: WebUI.delay(2)

'Select required dropdown'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door1 lb1'))

not_run: WebUI.delay(1)

'Click Weigering door2'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door2'))

not_run: WebUI.delay(2)

'Select required dropdown'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door2 lb 2'))

not_run: WebUI.delay(1)

'Enter text from the feild :: Gebeld naar'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Gebeld naar'), 'Gebeld naar')

not_run: WebUI.delay(1)

'Enter text from the feild :: Gebelde nummer'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Gebelde nummer'), 'Gebelde nummer')

not_run: WebUI.delay(1)

'Enter text from the feild :: Telefax'
not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Telefax'), 'Telefax')

not_run: WebUI.delay(1)

'Click Beheerst nederlandse taal ja\\r\\n'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Beheerst nederlandse taal'))

not_run: WebUI.delay(1)

'Select required dropdown from the list'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Taal verhoor'), 'CHINEES', false)

WebUI.delay(1)

'Enter the text :: Naam Tolk'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Naam Tolk'), 'Naam Tolk')

WebUI.delay(1)

'Select required drop down :: Weigering post'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering post'), 'Bonaire Post 1', false)

WebUI.delay(1)

WebUI.focus(findTestObject('JIRA/A Relese 6.6/ACTPOL-310/Vreemdeling save'))

''', 'Test Cases/JIRA Tasks/Release 6.6/ACTPOL-316', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.6/ACTPOL-316',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
