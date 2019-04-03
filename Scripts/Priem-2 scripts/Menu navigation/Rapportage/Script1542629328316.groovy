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

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/JPRM154/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Priem-2 scripts/report/Rapportage'))

WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Doorlooptijden'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/report/Doorlooptijden Afdoening'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Priem-2 scripts/report/Rapportage'))

WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Instroom'))

WebUI.delay(6)

WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage IC-AO'))

WebUI.click(findTestObject('Priem-2 scripts/report/Voorarrest Overzicht'))

WebUI.switchToWindowIndex(0)

not_run: WebUI.closeWindowIndex(1)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Priem-2 scripts/report/Rapportage'))

WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Officier van Justitie'))

WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Parketsecretaris'))

WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Uitstroom'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

