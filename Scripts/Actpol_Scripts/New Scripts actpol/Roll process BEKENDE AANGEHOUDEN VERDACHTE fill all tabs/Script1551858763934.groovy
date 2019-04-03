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

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('BEKENDE/AANGEHOUDEN VERDACHTE  start')

WebUI.delay(4)

'Selecting BEKENDE/AANGEHOUDEN VERDACHTE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '1', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam specific process'), 'yuiogi')

WebUI.delay(3)

'Secting abdctest'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam specific process 2 lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Alcohol gebruik ja'))

WebUI.delay(1)

'select anu test 1\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Alcohol gebruik type'), '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Drugs gebruik ja'))

WebUI.delay(1)

'LSD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Drugs gebruik type'), '3', false)

WebUI.delay(1)

'select I.V.M. GIJZELING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden'), '3', false)

WebUI.delay(1)

'select IN ONDERZOEK'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Type'), '5', false)

WebUI.delay(1)

'select Uitbuiter'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol'), '171', false)

WebUI.delay(2)

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Verdachte Info'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feitin'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feitin new'))

WebUI.delay(2)

'Pogging'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/UITVOERING'), '1', false)

WebUI.delay(1)

'MEDEPLEGEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Daderschap'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/stra save popup'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feitin'))

WebUI.delay(1)

WebUI.comment('Voorgeleiding/IVS')

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voorgeleiding IVS'))

WebUI.delay(2)

'ANGELA, Mario'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voorgeleiden voor (OVJ)'), 
    '60', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voorgeleiden voor HOVJ'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voorgeleiden voor HOVJ lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Datum'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Tijd'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Plaats'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Plaats lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Heenzending Datum'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Heenzending Tijd'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voorgeleiding IVS'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Arrest Log'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Arrest Log'))

WebUI.comment('Vaartuig')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voertuig new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voertuig new new new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voertuig new new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Voertuig new new select'))

WebUI.delay(2)

'AUTODIEFSTAL/JOYRIDING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Nieuw Voertuig Reden Inschrijving'), 
    '2', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Nieuw Voertuig save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig'))

WebUI.comment('Vaartuig')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Vaartuig new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Vaartuig new new new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Vaartuig new new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE vaartuig new new select'))

WebUI.delay(2)

'AUTODIEFSTAL/JOYRIDING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Nieuw Vaartuig Reden Inschrijving'), 
    '27', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Nieuw Vaartuig save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig'))

WebUI.delay(2)

WebUI.comment('Goederen')

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen new'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen new new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen Goed artikel'), 'ver')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen Goed artikel lb'))

WebUI.delay(1)

'GEDEPONEERD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen Status goed'), 
    '1_', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen save'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Goederen close'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen'))

WebUI.comment('Wapen')

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Wapen new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Wapen new new'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

'ANDERE ZIE MUTATIE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Wapen Reden Inschrijven'), 
    '2', false)

WebUI.delay(2)

'ANDERE ZIE MUTATIE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Wapen Soort Wapen'), 
    '1', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Wapen Omschrijving'), 'Testing')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Wapen Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen'))

WebUI.comment('Getuige')

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Getuige'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige new'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige new new'), FailureHandling.OPTIONAL)

WebUI.delay(6)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige new text box'), 'petertje')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige new text box lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Strafbare Feit na'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Strafbare Feit na'))

WebUI.delay(1)

WebUI.scrollToPosition(29, 7)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Reden Getuige'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Reden Getuige new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Reden Getuige new frame'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Reden Getuige new frame lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige Reden Getuige new frame save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Getuige total save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Getuige'))

WebUI.comment('Mede bekende/aangehouden verdachte')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Mede bekende aangehouden verdachte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Mede bekende aangehouden verdachte new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Mede bekende aangehouden verdachte'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/BEKENDE AANGEHOUDEN VERDACHTE Illegaal'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Datum Aankomst'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Legaal op het eiland na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Wijze van binnenkomst Per vliegtuig'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Naam vliegtuigmaatschappij of naam vaartuig'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Reis geregeld door'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Verblijfsvergunning ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Nummer vergunning'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Voorwaarden aan vergunning ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Zo ja welke voorwaarden'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Eigenaar weet verblijf is Legaal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Werkzaam ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Werkzaam bij voor (naam bedrijf of persoon)'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Datum in dienst werkzaam'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Werkvergunning ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Datum afgifte vergunning'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Vergunningnummer'), '12345')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Arbeidsovereenkomst of afspraken ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Wie bepaalt de werkzaamheden'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Werkdagen en werktijden'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Betalingsperiode'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Hoe wordt u betaald Bank'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Betalingsbewijs Wel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Inhouding belasting Niet'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Inhouding sociale premie Wel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/AZV verzekerd Niet'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Particuliar verzekerd Niet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Illegaal/Sinds wanneer verzekerd'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/SVB verzekeringskaart Wel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Illegaal/SVB verzekeringskaart wel eens gebruikt Nooit'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Verhoor'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Datum Verhoor'), 'bushan')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Datum Verhoor lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Rechter commisaris'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Datum in kennis gesteld'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Raadsman'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Datum in kennis gesteld 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Raadsman aanwezig ja'))

WebUI.delay(2)

'CHINEES'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Verhoor Taal'), '7', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Tolk'), 'Test')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Verhoor text area'), 'Test')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Verhoor text area 2'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Ambts Verslag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Verhoor/Ambts Verslag text area'), 'Test')

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte save'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte close'))

not_run: WebUI.delay(3)

