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

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'assist', false)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/90 Assistentie number'), '200601644')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/zoeken'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/90 selected user edit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/90 Confirmeren select'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/90 select page 2'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/90 select particular aangever'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Actpol_Scripts/Extra script/AANGEVER Documenten'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Documenten'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Actpol_Scripts/Extra script/AANGEVER Documenten new'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Documenten new'))

WebUI.delay(3)

'XML PV AANGIFTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER popup Documenten name'), '55', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER popup Documenten save'))

WebUI.delay(1)

WebUI.takeScreenshot()

