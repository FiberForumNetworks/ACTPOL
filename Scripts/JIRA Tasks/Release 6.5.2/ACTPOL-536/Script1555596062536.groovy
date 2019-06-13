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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/536 view user'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Coordinatie'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Coordinatie hide'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Werkopdrachten'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Persoon toegestaan hide'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Controle'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Mutatie hide'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Slachtofferhulp Email hide'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

