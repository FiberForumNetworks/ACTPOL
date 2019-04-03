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

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.setText(findTestObject('test/Onderhoud acts/Page_Login Page for ACTPRM Develope/input_User ID_user'), 
    'sasi')

WebUI.setEncryptedText(findTestObject('test/Onderhoud acts/Page_Login Page for ACTPRM Develope/input_Password_password'), 
    'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('test/Onderhoud acts/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

WebUI.delay(8)

WebUI.mouseOver(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/span_3-Onderhoud'))

WebUI.click(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/a_Label Maintenance'))

WebUI.delay(9)

WebUI.click(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/a_Onderhoud EA'))

WebUI.click(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/a_Parketcode'))

WebUI.delay(9)

WebUI.click(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/span_Actief_glyphicon glyphico'))

WebUI.delay(9)

WebUI.click(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/span_Parket code_glyphicon gly'))

WebUI.click(findTestObject('test/Onderhoud acts/Page_ACTPRM Developer/span_Parket code_glyphicon gly_1'))

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

