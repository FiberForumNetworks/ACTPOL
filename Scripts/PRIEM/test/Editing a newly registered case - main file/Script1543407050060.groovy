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

WebUI.click(findTestObject('Priem-2 scripts/EA/click testing vali - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking new'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Wetboek eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Wetboek lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel eye'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel lb'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Artikel eye'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Artikel eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Artikel lb'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Pleegdatum img calendar 1'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Pleegdatum img calendar 2'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats lb'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Uitvoering'), '8', false)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Daderschap'), '23', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/save vork'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/save vork'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Verdenking'), 3)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Contact'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Contact'), 3)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Voorarrest'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Voorarrest'), 3)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging download'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening'))

not_run: WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Afdoening'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Datum ontvangst eind PV cal'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Priem-2 scripts/Afdoening/click 20th date'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd pv save'), FailureHandling.OPTIONAL)

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

'\r\n'
WebUI.click(findTestObject('Priem-2 scripts/EA/afd download'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/afd link add'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening per Strafbaar feit link 1'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening per Strafbaar feit link 2'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/adf link est'))

WebUI.click(findTestObject('Priem-2 scripts/EA/adf link est'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie new'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum vonnis rechtbank img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

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

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Aanzegging Hoger Beroep img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum betekening Hoger Beroep img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/Nieuw Hoofdstraffen'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Straffen en'), '21', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ja'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/Voorwaarde'), '51', false)

WebUI.click(findTestObject('Priem-2 scripts/check elements/hoof save'))

WebUI.delay(3)

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/Hoofd down load'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ex user selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Bijzondere voorwaarden link'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 1 link'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 2 link'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/check elements/document drop down'), '0', false, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/reg save'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Priem-2 scripts/EA/just doc download click'))

WebUI.delay(10)

WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'))

WebUI.click(findTestObject('Priem-2 scripts/EA/click testing vali - Copy'))

WebUI.delay(10)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 0)

WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/click Afdoening'))

WebUI.delay(10)

WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Priem-2 scripts/EA/click testing vali - Copy'), FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 0)

WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/click Afdoening'), FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.acceptAlert()

WebUI.click(findTestObject('Priem-2 scripts/EA/comp save'), FailureHandling.OPTIONAL)

WebUI.closeBrowser()

