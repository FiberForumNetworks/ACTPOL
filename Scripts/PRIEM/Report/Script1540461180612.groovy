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

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?rnd=7036379')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.setText(findTestObject('test/Priem/repo/Page_Login Page for ACTPRM Develope/input_User ID_user'), 'sasi')

WebUI.setEncryptedText(findTestObject('test/Priem/repo/Page_Login Page for ACTPRM Develope/input_Password_password'), 
    'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('test/Priem/repo/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

not_run: Thread.sleep(5000)

not_run: WebUI.mouseOver(findTestObject('menu/Registratie'))

not_run: Thread.sleep(5000)

WebUI.mouseOver(findTestObject('test/demo/demo3/menu/menu/report'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Rapportage Doorlooptijden'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Rapportage Instroom'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Rapportage IC-AO'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Rapportage Officier van Just'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Rapportage Parketsecretaris'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Rapportage Uitstroom'))

WebUI.mouseOver(findTestObject('test/Priem/repo/Page_ACTPRM Developer/span_3-Onderhoud'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Label Maintenance'))

WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Onderhoud EA'))

not_run: WebUI.click(findTestObject('test/Priem/repo/Page_ACTPRM Developer/a_Parketcode'))

WebUI.closeBrowser()

