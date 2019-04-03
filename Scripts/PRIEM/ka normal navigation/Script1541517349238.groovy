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

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('test/ea normal navigation/Page_Login Page for ACTPRM Develope/input_User ID_user'), 
    'sasi')

WebUI.setEncryptedText(findTestObject('test/ea normal navigation/Page_Login Page for ACTPRM Develope/input_Password_password'), 
    'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('test/ea normal navigation/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

WebUI.mouseOver(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_1-Registratie'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/a_Parket Zaak EA'))

WebUI.delay(5)

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/a_EDSEL RICARDO_load-in-record'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Delictsoort'))

WebUI.delay(8)

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Verdenking'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Contact'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Voorarrest'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Tenlastelegging'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Medeverdachte'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Afdoening'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Raadkamer'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Dossier'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Documenten'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Executie'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/span_Justitile Documentatie'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/button_Muteren parketnummer_bt'))

WebUI.click(findTestObject('test/ea normal navigation/Page_ACTPRM Developer/a_Log out'))

WebUI.closeBrowser()

