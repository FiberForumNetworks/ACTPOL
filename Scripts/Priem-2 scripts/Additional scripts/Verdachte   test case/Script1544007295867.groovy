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

WebUI.callTestCase(findTestCase('main/Priem_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/Parket Zaak EA'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Verdachte user selection'))

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdachte'))

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdachte n'), 'aa')

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/person selection'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Zoek Criteria'), '201', false)

'replace this one AAADAK\r\n'
WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Achternaam'), 'AAADAK')

WebUI.delay(1)

'replace this one 26/06/2014'
WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Geboorte datum'), '26/06/2014')

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/filter'))

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/display'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/select'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Instantie'), '1', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Instantie 1'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click1'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click1'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click2'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click2'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click3'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click4'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click4'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ea contact save'))

WebUI.delay(2)

WebUI.closeBrowser()

