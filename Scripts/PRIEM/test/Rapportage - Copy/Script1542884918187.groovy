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

WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/Parket Zaak EA'))

not_run: WebUI.delay(2)

not_run: WebUI.mouseOver(findTestObject('Priem-2 scripts/report/Rapportage'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Doorlooptijden'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Doorlooptijden edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/2 - Filter'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Parketsecretaris eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Parketsecretaris eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Parketsecretaris lb'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Officier van Justitie eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Officier van Justitie eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Maand click'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Officier van Justitie lb'))

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/report/Parketcode code'), '586', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/3 - Chart'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/report/3-chart 2'), 'area2d', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Stacked Chart'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/2 - Filter'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/3 - Chart'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/4-reports'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Aantal zaken per parketsecretaris'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Groene afdoeningszaken per secretaris'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Oranje afdoeningszaken per secretaris'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rood afdoeningszaken per secretaris'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Doorlooptijden Afdoening'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Parketcode code'))

not_run: WebUI.delay(3)

not_run: WebUI.mouseOver(findTestObject('Priem-2 scripts/report/Rapportage'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Instroom'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage IC-AO'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Voorarrest Overzicht'))

not_run: WebUI.switchToWindowIndex(0)

not_run: WebUI.delay(3)

not_run: WebUI.mouseOver(findTestObject('Priem-2 scripts/report/Rapportage'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Officier van Justitie'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Parketsecretaris'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/report/Rapportage Uitstroom'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

not_run: WebUI.closeBrowser()

WebUI.scrollToPosition(15, 1055)

