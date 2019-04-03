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
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'officer', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/mEDEWAKER Achternaam'), 'Adamus')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker Voornaam'), 
    'GILBERT')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker KC nummer'), 
    '320')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker User ID'), 
    'GILBERT')

not_run: WebUI.delay(1)

'AANGEVER'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '2', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker Klasse click'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker Klasse click lb'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Next Poc van'), '21/01/2017')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Next Poc tot'), '21/01/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'))

