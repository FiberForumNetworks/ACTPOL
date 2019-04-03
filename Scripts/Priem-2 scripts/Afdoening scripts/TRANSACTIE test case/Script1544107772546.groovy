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

WebUI.click(findTestObject('Priem-2 scripts/EA/Rechtsvorm user selection'))

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.delay(2)

WebUI.scrollToPosition(17, 349)

WebUI.click(findTestObject('Priem-2 scripts/EA/Tenlastelegging'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Tenlastelegging'), 3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/Tenlastelegging download'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Afdoening'), 3)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Afdoening/Datum ontvangst eind PV cal'), FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false, FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/afd pv save'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/newAfdeoning'))

'TRANSACTIE'
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

WebUI.delay(2)

'\r\n'
WebUI.click(findTestObject('Priem-2 scripts/EA/afd download'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/check elements/TRANSACTIE default user'))

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

WebUI.click(findTestObject('Priem-2 scripts/check elements/Executie edit element'))

WebUI.delay(1)

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

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/just doc download click'))

not_run: WebUI.delay(20)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Rechtsvorm user selection'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/just doc download click'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(20)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Rechtsvorm user selection'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/park'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/just doc download click'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(30, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/total close'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Rechtsvorm user selection'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/check elements/park'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Priem-2 scripts/EA/just doc download click'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

WebUI.closeBrowser()

