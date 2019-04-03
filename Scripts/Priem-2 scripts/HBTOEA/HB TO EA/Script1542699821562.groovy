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

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/JPRM154/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/HB'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/table 2'))

WebUI.click(findTestObject('Priem-2 scripts/HB/click aa'))

WebUI.click(findTestObject('Priem-2 scripts/HB/Juridisch Medewerker'))

WebUI.click(findTestObject('Priem-2 scripts/HB/Juridisch Medewerker lb'))

WebUI.click(findTestObject('Priem-2 scripts/HB/AG'))

WebUI.click(findTestObject('Priem-2 scripts/HB/AG lb'))

WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/HB/contact'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Voorarrest'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Documenten'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Afdoening'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Tenlastelegging'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Executie EA'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Executie EA'), 3)

WebUI.click(findTestObject('Priem-2 scripts/HB/click ea'))

WebUI.verifyElementClickable(findTestObject('Priem-2 scripts/HB/Verdachte'))

WebUI.click(findTestObject('Priem-2 scripts/HB/Verdachte'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Priem-2 scripts/HB/Verdachte'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/HB/Verdachte'), '021/11/2018')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Verdachte img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/HB/OM'), '21/11/2018')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/OM Executie EA img calendar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/HB/OM'), '021/11/2018')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum onherroepelijk img calendar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/save ea'))

WebUI.click(findTestObject('Priem-2 scripts/HB/save ea'))

WebUI.click(findTestObject('Priem-2 scripts/HB/case save hb'))

WebUI.refresh()

WebUI.closeBrowser()

