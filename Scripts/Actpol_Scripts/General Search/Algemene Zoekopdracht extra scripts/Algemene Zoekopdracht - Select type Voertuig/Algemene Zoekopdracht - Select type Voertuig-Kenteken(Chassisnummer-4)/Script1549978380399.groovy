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

'Voertuig\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'voertuig', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Kenteken'), 'H 29-90')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Merk'), 'TOYOTA')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Mark set text 2 lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Model'), 'YARIS')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Model 3 lb'))

WebUI.delay(1)

'\r\n'
WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Motornummer'), '6FM12458R')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Chassisnummer'), '95REQWF41RST55')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Bouwjaar van'), '')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Bouwjaar tot'), '1999')

WebUI.delay(1)

'test'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Voertuig Status'), 
    '0', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc van'), '24/01/2017')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc tot'), '24/01/2018')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get Adres text displayed'), 
    FailureHandling.OPTIONAL)

