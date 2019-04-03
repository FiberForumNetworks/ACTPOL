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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.20.10.7:8202/actpoldev/JPOL430/nxmenu.pgm?docnum=604')

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.ID)

WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.enpassword)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Voorarrest'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Voorarrest/Voorarrest edit'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Voorarrest/Verdachte Info'))

WebUI.scrollToPosition(29, 7)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Voorarrest/Ambts Verslag'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Voorarrest/Ambts Verslag new'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Voorarrest/Ambts Verslag area text'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Voorarrest/Ambts Verslag save'))

