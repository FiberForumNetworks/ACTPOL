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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.20.10.7:8185/actpoltstpublic/nxlogin.pgm?TASK=BYPASS')

WebUI.setText(findTestObject('Object Repository/temp/Page_Login Page for ACTPOL Test/input_User ID_user'), 'vidhya')

WebUI.setEncryptedText(findTestObject('Object Repository/temp/Page_Login Page for ACTPOL Test/input_Password_password'), 
    'pj/so+TdXk/jLsAmtuEwZQ==')

WebUI.click(findTestObject('Object Repository/temp/Page_Login Page for ACTPOL Test/input_Keep me logged in for my next visit_my_nx_login'))

WebUI.click(findTestObject('Object Repository/temp/Page_ACTPOL Test/a_MBES18'))

WebUI.click(findTestObject('Object Repository/temp/Page_ACTPOL Test/a_MBES18'))

WebUI.click(findTestObject('Object Repository/temp/Page_ACTPOL Test/img'))

WebUI.click(findTestObject('Object Repository/temp/Page_ACTPOL Test/input'))

WebUI.click(findTestObject('Object Repository/temp/Page_ACTPOL Test/input_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/temp/Page_ACTPOL Test/select_KORPS POLITIE CURACAOOPENBARE MINISTERIEAMBULANCESKSBRANDWEER'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/temp/Page_ACTPOL Test/select_KORPS POLITIE CURACAOOPENBARE MINISTERIEAMBULANCESKSBRANDWEER_1'), 
    '2', true)

WebUI.closeBrowser()

