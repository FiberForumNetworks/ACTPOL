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

WebUI.click(findTestObject('Priem-2 scripts/check elements/existing file clicking'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Verdenking'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Verdenking'), 3)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking new'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Wetboek eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Wetboek lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel eye'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Titel lb'))

WebUI.delay(2)

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

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats eye'))

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats lb'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Uitvoering'), '8', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Daderschap'), '23', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/save vork'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Verdenking'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Contact'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Contact'), 3)

WebUI.click(findTestObject('Priem-2 scripts/Contact/contact new'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Contact/Relatie'), '5', false)

WebUI.click(findTestObject('Priem-2 scripts/Contact/Advocaat eye'))

WebUI.click(findTestObject('Priem-2 scripts/Contact/Advocaat lb'))

WebUI.click(findTestObject('Priem-2 scripts/Contact/Adress eye'))

WebUI.click(findTestObject('Priem-2 scripts/Contact/Adress lb'))

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Huisnummer'), '101')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Telefoon werk'), '9999999999')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Mobiel'), '9999999999')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Fax'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/EMail'), 'aa')

WebUI.click(findTestObject('Priem-2 scripts/EA/con save'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Voorarrest'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Voorarrest'), 3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Voorarrest new'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/EA/status'), '4', false)

WebUI.click(findTestObject('Priem-2 scripts/EA/Begin Datum'))

WebUI.click(findTestObject('Priem-2 scripts/EA/end date'))

WebUI.click(findTestObject('Priem-2 scripts/EA/voo save'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/Tenlastelegging'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Tenlastelegging'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/EA/Medeverdachte'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Medeverdachte'), 3)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/Afdoening'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Afdoening'), 3)

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

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Aanzegging Hoger Beroep img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum betekening Hoger Beroep img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/EA/Justi Documentatie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Justi Documentatie'), 3)

WebUI.focus(findTestObject('Priem-2 scripts/EA/comp save'))

WebUI.closeBrowser()

