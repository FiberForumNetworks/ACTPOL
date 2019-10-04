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

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/voornaam PERFNAME'), 'CHRISTOFFER')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/voornaam PERFNAME lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/USER ID'), 'CHRIS')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc van'), '24/01/2018')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc tot'), '24/01/2019')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Zoekan'))

WebUI.delay(2)

