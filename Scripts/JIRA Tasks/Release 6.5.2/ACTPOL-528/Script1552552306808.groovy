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

'Medewerker'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'officer', 
    false)

WebUI.delay(4)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/528 unit id'), 'JAIRO')

WebUI.delay(1)

'BEKENDE/AANGEHOUDEN VERDACHTE'
WebUI.selectOptionByValue(findTestObject('JIRA/A Relese 6.5.2/528 roll process type'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/528 medewerker Klasse click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/528 medewerker Klasse'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/528 medewerker Next Poc van'), '21/01/2017')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/528 medewerker Next Poc tot'), '21/01/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/zoeken'))

WebUI.delay(2)

WebUI.takeScreenshot()

