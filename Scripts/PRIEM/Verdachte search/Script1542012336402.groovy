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

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi2')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'yFGvMLXn1sM=')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/type'), 'Verdachte', false)

WebUI.setText(findTestObject('Priem-2 scripts/Verdachte/Achternaam'), 'HU-A-NGIEE')

WebUI.setText(findTestObject('Priem-2 scripts/Verdachte/Voornaam'), 'v')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdachte/Datum Periode van'), '020/09/2018')

WebUI.click(findTestObject('Priem-2 scripts/Verdachte/Datum Periode van'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/month  left'), '7', false)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/year left'), '2018', false)

WebUI.click(findTestObject('test/flipkart/temp/15th'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Verdachte/Voornaam'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdachte/Right to left'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdachte/Right to left'))

WebUI.click(findTestObject('Priem-2 scripts/Verdachte/filter new 1'))

