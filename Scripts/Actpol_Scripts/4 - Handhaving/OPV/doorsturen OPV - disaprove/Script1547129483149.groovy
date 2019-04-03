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

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Stopsign'))

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/deney'))

WebUI.delay(1)

'DOSSIER VERZONDEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/OPV/Onderwerp'), '3', false)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/Betreft'), 'New')

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/Taak Beschrijving'), 'Testing')

WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/OPV/afk save'))

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/afk close'))

