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

not_run: WebUI.comment('starting  code Bijzondere voorwaarden ')

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '51', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.comment('starting  code Gelast de bewaring ten behoeve van de rechthebbende')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '26', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'aa')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.comment(' Geldboete ')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '2', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete 1'), '100,00')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup'), 'us')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup sel'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Uiterlijke betaaldatum img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Betalingstermijn door de rechter opgelegd'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Termijnen'), '2')

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Periode'), '49', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Bedrag per termijn'), '300,00')

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk Ja of Nee'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete'), '200,00')

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete 3'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete 3'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete 2'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '2')

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Vervangende hechtenis'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Vervangende hechtenis 2'), '28')

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.comment('Gevangenisstraf drop down selection \'1\'    ')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '1', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '20')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '3')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '8')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf maa'), '6')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd drop down 4'), '5')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd gva img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting gava img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.comment('drop down selection Hechtenis')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '7', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '23')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk ja'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf maan'), '12')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '3')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd hech img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting hech img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.focus(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.comment('drop down selection Jeugddetentie')

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '17', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '5')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '9')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting jeug img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Inrichting'), '41', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk jeug Ja'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf jaren'), '3')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '4')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd juah img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.focus(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.comment('drop down selection Leerstraf')

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '20', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.comment('drop down selection Maatregel betreffende het gedrag van de jeugdige')

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '25', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Maatregel'), '1', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.comment('drop down selection Onder curatele stelling (niet naast vrijheidstraf)')

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '14', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '20')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang () img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Soort inrichting'), '67', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

WebUI.comment('drop down selection Ontneming van het wederrechtelijk verkregen voordeel')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '10', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Optie'), '87', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Bedrag - Valuta'), '100,00')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Bedrag - Valuta 2'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Uiterste betaaldatum img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Duur vervangende hechtenis jaren'), '6')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Onttrekking aan het verkeer')

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '9', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '24', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '29', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '30', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '16', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '27', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '12', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '11', false)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Slachtoffer-Benadeelde Partij'), '1', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Te betalen bedrag 1'), '100,00')

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Te betalen bedrag 2'), '3', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '15', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '18')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '8', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Aantal uren'), '20')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '22', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '13', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum aanvang img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '23', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '18', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '28', false)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Slachtoffer-Benadeelde Partij'), '1', false)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak'), '88', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '19', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Hoofd down load'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Bijzondere voorwaarden link'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 1 link'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 2 link'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 3 link '))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 4 link '))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 5 link'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

not_run: WebUI.closeBrowser()

