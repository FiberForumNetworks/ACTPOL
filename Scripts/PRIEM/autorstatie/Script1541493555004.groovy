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

WebUI.setText(findTestObject('test/authorisatie priem/Page_Login Page for ACTPRM Develope/input_User ID_user'), 
    'sasi')

WebUI.setEncryptedText(findTestObject('test/authorisatie priem/Page_Login Page for ACTPRM Develope/input_Password_password'), 
    'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('test/authorisatie priem/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

WebUI.mouseOver(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/span_4-Autorisatie'))

WebUI.click(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/a_Gebruiker Autorisatie'))

WebUI.delay(2)

WebUI.click(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/click'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/click'), 'asdf')

WebUI.click(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/filter'))

WebUI.delay(2)

WebUI.click(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/span_Achternaam_glyphicon glyp'))

WebUI.click(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/button_Gebruiker Autorisatie_b'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/span_4-Autorisatie'))

WebUI.click(findTestObject('Priem-2 scripts/Autorisatie/Groep Bestand'))

WebUI.click(findTestObject('Priem-2 scripts/Autorisatie/testgroup'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Autorisatie/au close'))

WebUI.click(findTestObject('test/authorisatie priem/Page_ACTPRM Developer/a_Log out'))

WebUI.closeBrowser()

