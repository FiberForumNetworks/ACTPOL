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

'Voertuig\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'voertuig', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Kenteken'), 'A 21-12')

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Mark set text'), 'ALPHA')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Mark set text lb'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Model'), '14')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Model lb'))

WebUI.delay(1)

'Add moto number\r\n'
WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Motornummer'), '')

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Chassisnummer'), 'MYLRN84WXZ002161')

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Bouwjaar van'), '')

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Bouwjaar tot'), '1999')

WebUI.delay(1)

'test'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Voertuig Status'), '0', false, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc van'), '24/01/2017')

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Next Poc tot'), '24/01/2018')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/zoeken'))

