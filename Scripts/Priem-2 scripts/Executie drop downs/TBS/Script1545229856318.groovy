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

WebUI.click(findTestObject('Priem-2 scripts/check elements/ex/TBS'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.scrollToPosition(17, 636)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.scrollToPosition(17, 636)

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

WebUI.delay(2)

not_run: WebUI.scrollToPosition(65.34375, 1369.515625)

WebUI.comment('Selecting drop down TBS')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '13', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum aanvang img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Verlenging termijn'), '2')

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Met dwangverpleging ja'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden ja'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 2'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 3'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 4'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 5'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 6'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 7'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 8'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 9'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 10'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 11'))

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaarden/Voorwaarden 12'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Voorwaardelijke beeindiging verpleging img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/new onderhoud'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Periode onderbreking van'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Periode onderbreking tot img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Hernieuwde datum img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/tbs save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.closeBrowser()

