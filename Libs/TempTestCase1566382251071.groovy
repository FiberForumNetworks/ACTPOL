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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.6\\ACTPOL-316\\20190821_154046\\execution.properties')

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

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), GlobalVariable.Generiekassistenite_Module)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

//CHECK CODE 
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.delay(5)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('Select process "VREEMDELING"')

'Select required dropdown'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'VREEMDELING', false)

WebUI.delay(3)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Vliegmaatschappij_Rederij'), 'Katalon testing')

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Naam boot_vliegtuig'), 'Katalon testing')

WebUI.delay(1)

'Enter the telefoon number'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Telefoon boot_vliegtuig'), 'Katalon testing')

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Agentschap'), 'Katalon testing')

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Achternaam'), 'aa')

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Achternaam lb'))

WebUI.delay(2)

WebUI.scrollToPosition(10, 8)

WebUI.delay(3)

'Click Vreemdeling tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Vreemdeling TAB'))

WebUI.delay(1)

'Click Weigering tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering tab'))

WebUI.delay(1)

'Click Weigering door1'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door1'))

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door1 lb1'))

WebUI.delay(1)

'Click Weigering door2'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door2'))

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering door2 lb 2'))

WebUI.delay(1)

'Enter text from the feild :: Gebeld naar'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Gebeld naar'), 'Gebeld naar')

WebUI.delay(1)

'Enter text from the feild :: Gebelde nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Gebelde nummer'), 'Gebelde nummer')

WebUI.delay(1)

'Enter text from the feild :: Telefax'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Telefax'), 'Telefax')

WebUI.delay(1)

'Click Beheerst nederlandse taal ja\\r\\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Beheerst nederlandse taal'))

WebUI.delay(1)

'Select required dropdown from the list'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Taal verhoor'), 'CHINEES', false)

WebUI.delay(1)

'Enter the text :: Naam Tolk'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Naam Tolk'), 'Naam Tolk')

WebUI.delay(1)

'Select required drop down :: Weigering post'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.6/ACTPOL-316/Weigering post'), 'Bonaire Post 1', false)

WebUI.delay(1)

WebUI.focus(findTestObject('JIRA/A Relese 6.6/ACTPOL-310/Vreemdeling save'))

''', 'Test Cases/JIRA Tasks/Release 6.6/ACTPOL-316', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.6/ACTPOL-316',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
