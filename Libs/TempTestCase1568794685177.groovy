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


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.6\\ACTPOL-317\\20190918_134800\\execution.properties')

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

not_run: WebUI.click(to)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

not_run: WebUI.delay(2)

'Selecting Vreemdeling\\r\\n'
not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'Vreemdeling', 
    false)

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), 40)

'Luchthaven'
not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), 'Luchthaven', false)

not_run: WebUI.delay(2)

'laura'
not_run: WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam'), 'laura', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam -lb'))

not_run: WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'), 5)

not_run: WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Vreemdeling tab hide'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/VREEMDELING save'))

WebUI.delay(6)

WebUI.takeScreenshot()

''', 'Test Cases/JIRA Tasks/Release 6.6/ACTPOL-317', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.6/ACTPOL-317',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
