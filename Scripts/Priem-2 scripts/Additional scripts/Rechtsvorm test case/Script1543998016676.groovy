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

WebUI.click(findTestObject('Priem-2 scripts/EA/Rechhtsvor'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.delay(2)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/Tenlastelegging'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Tenlastelegging'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Afdoening'), 3)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Datum ontvangst eind PV cal'), FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false, FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd pv save'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Afdoening dropdown'), '5', false)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Beslissing img caledar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen Door click'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen Door click'))

WebUI.click(findTestObject('Priem-2 scripts/EA/Beslissing genomen lb click'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Zitting img caledar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/Zittingslocatie'), '115', false)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Betekend img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

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

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/adf link est'))

WebUI.click(findTestObject('Priem-2 scripts/EA/adf link est'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Raadkamer'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Raadkamer'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Dossier'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Dossier'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Documenten'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Documenten'), 3)

WebUI.click(findTestObject('Priem-2 scripts/EA/doc new'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Priem-2 scripts/EA/sel doc'), '96 - VORDERING WIJZIGING SCHORS VH')

WebUI.click(findTestObject('Priem-2 scripts/EA/doc save'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 3)

WebUI.delay(1)

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

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Aanzegging Hoger Beroep img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum betekening Hoger Beroep img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/Hoofd down load'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/check elements/ex user selection'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Bijzondere voorwaarden link'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/ARTIKEL 1 link'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/link add ex a'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 3)

WebUI.closeBrowser()

