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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

'Creating New Incident\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie New'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bron'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Born lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Telefoon nummer'), '9999999999')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel'), 'Testing test')

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Lokatie type'), '8', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres'))

WebUI.delay(2)

'ANDRES BELLO WEG'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres lb'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/ter hoogte van'))

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Nadere Aanduiding'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekende plaats'))

WebUI.delay(2)

'Selecting AA\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekende plaats Lb'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Lb'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Relationeel Geweld'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Poging'))

'Select CALLTAKER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding Prioriteit'), '18', false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Contact verzoek ja'))

'Select ST Maarten\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Eiland'), 'SXM', false)

WebUI.scrollToPosition(29, 7)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

WebUI.delay(1)

'Select ILLEGAAL PERSOON\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol-Proces'), '26', false)

'Clicking new person\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam'))

WebUI.delay(2)

'Selecting "Overige"'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Zoek Criteria'), '201', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam new person'), 'Aaadak')

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Filter new person'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Resultaat Personen bestand person selection'))

WebUI.scrollToPosition(0, 21)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch'))

'Select "Vaartuig"\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Eenheid type'), '22', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Unit Id Kc number'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Unit Id Kc number lb'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Imgsrc/Datum Vertrek img src'))

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '11', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/27th'))

not_run: WebUI.scrollToPosition(29, 7)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Mutatie'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Mutatie'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Save melding'))

