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

WebUI.click(findTestObject('Priem-2 scripts/check elements/ex/Bijzondere click'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.delay(2)

WebUI.scrollToPosition(17, 636)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

not_run: WebUI.scrollToPosition(17, 636)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie new'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum vonnis rechtbank img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Verstek of Tegenspraak'), '7', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/Dagvaarding nietig naa'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Schorsing van de vervolging naa'))

WebUI.click(findTestObject('Priem-2 scripts/EA/OM niet ontvankelijk naa'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Integrale vrijspraak naa'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Afstand hoger beroep verdachte OM'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Hoger Beroep ya'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/OM img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Appel Ingetrokken OM img src'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Appel Ingetrokken Datum onherroepelijk img src'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.scrollToPosition(17, 636)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.comment('starting  code Bijzondere voorwaarden ')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '100', false)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum aanvang hf img src'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Verwachte einddatum img src'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.setText(findTestObject('Priem-2 scripts/check elements/ex/Verlenging termijn'), '2')

WebUI.setText(findTestObject('Priem-2 scripts/check elements/ex/Verlenging termijn 2'), 'testing')

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.closeBrowser()

