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

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.takeScreenshot()

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?rnd=7036379')

WebUI.setText(findTestObject('test/Priem/Zaak EA Flow/Page_Login Page for ACTPRM Develope/input_User ID_user'), 'sasi2')

WebUI.setEncryptedText(findTestObject('test/Priem/Zaak EA Flow/Page_Login Page for ACTPRM Develope/input_Password_password'), 
    'yFGvMLXn1sM=')

WebUI.click(findTestObject('test/Priem/Zaak EA Flow/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

Thread.sleep(5000)

WebUI.mouseOver(findTestObject('test/Priem/Zaak EA Flow/menu/Registratie'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('test/Priem/HB/Page_ACTPRM Developer/a_Parket Zaak HB'))

WebUI.click(findTestObject('test/Priem/HB/Page_ACTPRM Developer/span_DAGVAARDING_glyphicon gly'))

Thread.sleep(5000)

WebUI.click(findTestObject('test/Priem/HB/Page_ACTPRM Developer/span_Veranderen Parket Zaak HB'))

