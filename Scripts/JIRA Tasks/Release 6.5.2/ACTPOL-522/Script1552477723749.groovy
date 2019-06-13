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

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'alle'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Geavanceerd Zoekopdracht Type'), 
    'alle', false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Zoeken Text'), 'test')

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Nauwkeurigheid'), '90', false)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Zoeken 2'))

WebUI.delay(80, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/521 Arrestanten tab'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/522 Assistentie tab'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/522 Onderzoek tab'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/522 Entiteiten tab'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/522 Andere tab'))

WebUI.takeScreenshot()

WebUI.delay(2)

