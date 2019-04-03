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

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel'), 'Testing roll process')

'TEST1212'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Lokatie type'), '8', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres 5'), 'ANDRES BELLO WEG')

WebUI.delay(2)

'Selecting "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres 5 lb'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude 1'), 'GG')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude 2'), 'GG')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/ter hoogte van'))

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Nadere Aanduiding'), 'Testing')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekende plaats 5'), 'HAYWANG SERVICES')

WebUI.delay(2)

'Selecting AA\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekende plaats 5 lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident'))

WebUI.delay(2)

'AANSLAG'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Lb'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Relationeel Geweld'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Poging'))

'Select CALLTAKER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding Prioriteit'), '18', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude 2'), 'GG')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Contact verzoek ja'))

WebUI.delay(0)

'Select ST Maarten\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Eiland'), 'SXM', false)

WebUI.scrollToPosition(29, 7)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

'Select BEKENDE/AANGEHOUDEN VERDACHTE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol-Proces'), '1', false)

'Clicking new person\r\n'
WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam text'), 'Aaandres')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam text lb'))

'Selecting "Overige"'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Zoek Criteria'), '201', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam new person'), 'Aaadak')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Filter new person'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Resultaat Personen bestand person selection'))

WebUI.scrollToPosition(0, 21)

WebUI.delay(2)

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

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Tijd Vertrek'), '02.00.00')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Datum Aankomst'))

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '11', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/27th'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Tijd Aankomst'), '03.00.00')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Datum Afwikkeling'))

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '11', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/27th'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Tijd Afwikkeling'), '05.00.00')

not_run: WebUI.scrollToPosition(29, 7)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Mutatie'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Mutatie'), 'Testing')

not_run: WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistance save'))

WebUI.delay(8)

'TER BEWARING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden 5'), '4', false)

WebUI.delay(3)

'BUITEN HETERDAAD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Type 5'), '1', false)

WebUI.delay(1)

'DE JONG, Heiko'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/DA (OVJ)'), '64', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/DA (HOVJ)'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/DA (HOVJ) lb'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Fouillering na'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Gebruik handboeien na'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Gebruik geweld na'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude'), 'GG')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude 5'), 'GG')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aanhoudingslocatie'))

not_run: WebUI.delay(2)

'ABACO WEG'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aanhoudingslocatie lb'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Plaats van verhoo'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Plaats van verhoo lb'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Verdachte Info click'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbare feiten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbare feiten new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek 5'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek 5 lb 2'))

WebUI.delay(8)

'VERGUNNING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel 5'), '197', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel 5'))

WebUI.delay(2)

'3 LID 2'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel 5 lb'))

WebUI.delay(4)

'anu test2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering 5'), '1', false)

'MEDEPLEGEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Daderschap'), '2', false)

'new record'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Juntu'), '0', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/feit save'))

WebUI.delay(2)

not_run: WebUI.scrollToPosition(10, 8)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Verdachte Info click'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude'), 'GG')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Latitude Longitude 5'), 'GG')

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/roll save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/as close backend'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Arrestanten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/New'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Type Arrestant'), '3', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Naam Arrestant'), 'Aaandres')

WebUI.delay(2)

'Aaandres'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/naam arestaten'))

not_run: WebUI.closeBrowser()

