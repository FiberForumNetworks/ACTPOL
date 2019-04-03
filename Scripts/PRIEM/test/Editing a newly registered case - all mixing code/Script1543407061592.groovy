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

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Datum ontvangst eind PV cal'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/click 20th date'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd pv save'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '5', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img caledar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen Door click'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen Door click'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen lb click'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Zitting img caledar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Zittingslocatie'), '115', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Betekend img calendar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Datum Betekend 3'), '21', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '10', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Afdoening/Overdracht Aan'), '224', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '26', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '7', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Afdoening/Sepot Grond 1'), '33', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '2', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Afdoening/Sepot Grond 1'), '33', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '24', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Zitting img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '1', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum informeren rechthebbende img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '11', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Afdoening/Voegen met eye'), 'sss')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Voegen met lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '3', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img src'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Beslissing genomen Door lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Voldaan jaa'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd save'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Afdoening down'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/DAGVAARDING default user'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/link user select'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/link user select - Copy'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/link afd'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Executie new'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum vonnis rechtbank img calendar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Verstek of Tegenspraak'), '7', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Dagvaarding nietig naa'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Schorsing van de vervolging naa'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/OM niet ontvankelijk naa'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Integrale vrijspraak naa'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Afstand hoger beroep verdachte OM'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Hoger Beroep ya'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/OM img calendar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Aanzegging Hoger Beroep img calendar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum betekening Hoger Beroep img calendar'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '51', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '26', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'aa')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '2', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Geldboete 1'), '100')

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '7', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '17', false)

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '20', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

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

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '14', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '10', false)

not_run: WebUI.delay(3)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Hoofdstraffen/Optie'), '86', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '9', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Omschrijving'), 'testing')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '24', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '29', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak Jaren'), '2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak maanden'), '11')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Hoofdstraffen/Uitspraak dagen'), '28')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '30', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '16', false)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

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

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Hoofd down load'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ex user selection'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/Bijzondere voorwaarden link'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 1 link'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 2 link'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/document drop down'), '0', false, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/reg save'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/click testing vali'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 0)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/click Afdoening'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/click testing vali'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 0)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/click Afdoening'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(10)

not_run: WebUI.acceptAlert()

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/comp save'), FailureHandling.OPTIONAL)

not_run: WebUI.closeBrowser()

