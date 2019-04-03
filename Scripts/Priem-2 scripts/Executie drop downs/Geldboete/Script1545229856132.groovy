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

WebUI.click(findTestObject('Priem-2 scripts/check elements/ex/Geldboete'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/check elements/park'))

WebUI.delay(2)

WebUI.scrollToPosition(17, 636)

WebUI.click(findTestObject('Priem-2 scripts/EA/Executie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/EA/Executie'), 5)

WebUI.delay(3)

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

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Appel Ingetrokken OM img src'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Appel Ingetrokken Datum onherroepelijk img src'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '11', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.click(findTestObject('Priem-2 scripts/EA/exe save'))

WebUI.delay(1)

WebUI.scrollToPosition(17, 636)

WebUI.click(findTestObject('Priem-2 scripts/check elements/exu edit'))

WebUI.delay(2)

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

WebUI.closeBrowser()

