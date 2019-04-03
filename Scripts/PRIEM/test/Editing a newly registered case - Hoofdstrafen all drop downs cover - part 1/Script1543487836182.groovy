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

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.comment('starting  code Bijzondere voorwaarden ')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '51', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.comment('starting  code Gelast de bewaring ten behoeve van de rechthebbende')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '26', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'aa')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment(' Geldboete ')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '2', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete 1'), '100,00')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup'), 'us')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup sel'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Uiterlijke betaaldatum img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Betalingstermijn door de rechter opgelegd'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Termijnen'), '2')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Periode'), '49', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Bedrag per termijn'), '300,00')

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk Ja of Nee'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete'), '200,00')

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke geldboete 2'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '2')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Vervangende hechtenis'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Vervangende hechtenis 2'), '28')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.comment('Gevangenisstraf drop down selection \'1\'    ')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '20')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '3')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '8')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf maa'), '6')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd drop down 4'), '5')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd gva img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting gava img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.comment('drop down selection Hechtenis')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '7', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '23')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk ja'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf maan'), '12')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '3')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd hech img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting hech img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Jeugddetentie')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '17', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '5')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '9')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting jeug img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Inrichting'), '41', false)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk jeug Ja'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf jaren'), '3')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '4')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd juah img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Leerstraf')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '20', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Maatregel betreffende het gedrag van de jeugdige')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '25', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Maatregel'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Onder curatele stelling (niet naast vrijheidstraf)')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '14', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '20')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang () img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Soort inrichting'), '67', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '9', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Ontzegging rijbevoegdheid')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '24', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk ontz'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk Straf daagen'), '15')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '5')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd ontz img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Rijbewijs ingenomen ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum inname rijbewijs ontz img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Ontzetting uit het ambt')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '29', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk ontze ja'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijke straf ontze maadn'), '12')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '5')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start Proeftijd ontze img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Plaatsing inrichting voor jeugdigen')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '27', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '8')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '2')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '15')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Plaatsing psychaitrische inrichtung')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '12', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Schadevergoeding')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Slachtoffer-Benadeelde Partij'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Te betalen bedrag 1'), '100,00')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Te betalen bedrag 2'), '3', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Strafrechtelijke opvang verslaafden')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '15', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ontslag vers img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk vers ja'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk Straf vers'), '12')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '9')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Start proeftijd vers img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.comment('drop down selection Taakstraf')

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '8', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Aantal uren'), '20')

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Vervangende hechtenis t ja'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Duur'), '10')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum insluiting taa img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Voorwaardelijk ja taa'))

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uren'), '3')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Proeftijd'), '1')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.closeBrowser()

