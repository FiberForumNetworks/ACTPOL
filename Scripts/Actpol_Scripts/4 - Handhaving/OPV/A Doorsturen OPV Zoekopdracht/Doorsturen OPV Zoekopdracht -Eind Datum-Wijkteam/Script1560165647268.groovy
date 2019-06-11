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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Handhaving'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Doorsturen OPV'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Start Datum'), '26/02/2012')

not_run: WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Eind Datum'), '26/02/2014')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Wijkteam'), '1', false)

WebUI.delay(1)

not_run: WebUI.clearText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Teamleiding naam'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Teamleiding naam'), 'JANSEN')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Teamleiding naam lb 2'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Achternaam'), 'JANSEN')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Voornaam'), 'EDGELE')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/KC nummer'), '10548')

not_run: WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/A Doorsturen OPV Zoekopdracht/Filter'))

WebUI.delay(2)

WebUI.takeScreenshot()

