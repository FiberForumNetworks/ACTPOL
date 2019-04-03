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

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking new'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Wetboek eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Wetboek lb'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel eye'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel lb'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Artikel eye'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Artikel eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Artikel lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Pleegdatum img calendar 1'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Pleegdatum img calendar 2'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats lb'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Uitvoering'), '8', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Daderschap'), '23', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/save vork'))

WebUI.click(findTestObject('Priem-2 scripts/EA/save vork'))

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

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '5', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img caledar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen Door click'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen Door click'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen lb click'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Zitting img caledar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Zittingslocatie'), '115', false)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Betekend img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Datum Betekend 3'), '21', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '10', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Afdoening/Overdracht Aan'), '224', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '26', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '7', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Afdoening/Sepot Grond 1'), '33', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '2', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Afdoening/Sepot Grond 1'), '33', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '24', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Zitting img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum informeren rechthebbende img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '11', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.setText(findTestObject('Priem-2 scripts/Afdoening/Voegen met eye'), 'sss')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Voegen met lb'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '3', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Voldaan jaa'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Afdoening down'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/DAGVAARDING default user'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/link user select'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/link user select - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/link afd'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(1)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '51', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '26', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'aa')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '2', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete 1'), '100')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup'), 'al')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete popup sel'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Uiterlijke betaaldatum img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '1', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '7', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '17', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '20', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

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

not_run: WebUI.acceptAlert()

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/comp save'), FailureHandling.OPTIONAL)

not_run: WebUI.closeBrowser()

