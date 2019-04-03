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

WebUI.click(findTestObject('Priem-2 scripts/EA/click testing vali'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

/*not_run: WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Verdenking'), 3)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Contact'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Contact'), 3)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Voorarrest'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Voorarrest'), 3)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging download'))

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Afdoening'), 3)*/
WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down OVAR')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '30', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down Pijmaatregel')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '16', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down Teruggave')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '22', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down TBS')

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down Verbeurdverklaring')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '23', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down Vervangende Jeugddetentie')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '18', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down Vordering Benadeelde partij')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '28', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Slachtoffer-Benadeelde Partij'), '1', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak'), '88', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.comment('Selecting drop down Werkstraf')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '19', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Hoofd down load'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Bijzondere voorwaarden link'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 1 link'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 2 link'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 3 link '))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 4 link '))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 5 link'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

WebUI.closeBrowser()

