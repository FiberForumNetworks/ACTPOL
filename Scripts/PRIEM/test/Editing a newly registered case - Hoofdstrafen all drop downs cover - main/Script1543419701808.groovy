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

WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Verdenking'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Contact'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Contact'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Voorarrest'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Voorarrest'), 3)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging download'))

WebUI.delay(8)

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Afdoening'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '51', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '26', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'aa')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '2', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete 1'), '100,00')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup'), 'al')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup sel'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Uiterlijke betaaldatum img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '7', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '17', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '20', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

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

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/check elements/test'), 3)

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'), 4)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '14', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '10', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Optie'), '86', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '9', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '24', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '29', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '30', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '16', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '27', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum ingang img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Slachtoffer-Benadeelde Partij'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Te betalen bedrag 1'), '100,00')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Te betalen bedrag 2'), '3', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '15', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '18')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '8', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Aantal uren'), '20')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '22', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '13', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '22')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum aanvang img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '23', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '18', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '28', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Slachtoffer-Benadeelde Partij'), '1', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak'), '88', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 4 link '))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 5 link'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

not_run: WebUI.closeBrowser()

