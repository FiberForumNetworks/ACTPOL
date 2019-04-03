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

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi2')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'yFGvMLXn1sM=')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/type'), 'Parketnummer', false)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketnummer'), '555.00108/18')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketcode'), '555', false)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/van'), '005/10/2018')

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/naar'), '005/10/2018')

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketnummer'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/text'), 'Algemene Zoekopdracht')

not_run: WebUI.uploadFile(findTestObject(null), '')

WebUI.delay(1)

WebUI.focus(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/filter new'))

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/filter new'))

WebUI.delay(3)

WebUI.refresh()

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

