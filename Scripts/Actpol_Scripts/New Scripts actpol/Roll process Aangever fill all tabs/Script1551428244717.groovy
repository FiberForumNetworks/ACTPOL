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

WebUI.comment('AANGEVER  process start')

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '2', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam'), 'vicky')

WebUI.delay(2)

'vicky'
WebUI.click(findTestObject('Actpol_Scripts/Extra script/Aangever Achternaam 2 lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Toevoegen als slachtoffer na'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Slachtofferhulp ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voegen in Strafproces na'))

WebUI.scrollToPosition(29, 7)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte new person'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click'))

WebUI.delay(2)

'BEDREIGING\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/reden_aangifte save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek'))

WebUI.delay(3)

'VERGUNNINGSLANDSVERORDENING'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))

'VERGUNNING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel new'), '197', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))

WebUI.delay(1)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/save nieuw strafbaar feit'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Benadeelde'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Benadeelde persoon'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Benadeelde persoon lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Benadeelde'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Bekende Aangehouden Verdachte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Bekende Aangehouden Verdachte new new'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Bekende Aangehouden Verdachte new'), FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Bekende Aangehouden Verdachte new new'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Achternaam'), 'nathan')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Achternaam lb'))

WebUI.delay(1)

'TER BEWARING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Reden'), '4', false)

WebUI.delay(1)

'BUITEN HETERDAAD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Type'), '1', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Plaats van verhoor'), 'BUREAU')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Plaats van verhoor lb'))

WebUI.delay(2)

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Verdachte Info'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Strafbare feiten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Strafbare feiten new'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/UITVOERING 1'), '1', false)

'MEDEPLEGEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Daderschap 1'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/stra save popup'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Bekende Aangehouden Verdachte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Signalementen'))

WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Signalementen new'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Signalementen select data'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verdachte Signalementen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig new'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig popup new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig new text box'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig new text box user selection'))

WebUI.delay(3)

'OVERIGE MISDRIJVEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig Reden Inschrijving'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig new'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig popup new new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig popup text area'), 'naam')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig popup text area lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig popup save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Vaartuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO new'))

WebUI.delay(2)

'DWINGEN TOT AFGIFTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO dropdown selection'), '9', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO text area'), 'testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO save'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO save'), FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen new new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goed artikel'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goed artikel lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'ONBEKEND'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Status goed'), '12_9', false)

WebUI.delay(4)

WebUI.focus(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen save'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen new new'))

WebUI.delay(3)

'ANDERE ZIE MUTATIE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen Reden Inschrijven'), '2', false)

WebUI.delay(1)

't3'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen Soort Wapen'), '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Slachtoffer'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Slachtoffer new'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Slachtoffer new new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam'), 'aaa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam lb 2'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Toestand slachtoffer'), 'te')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Toestand slachtoffer lb 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer tab minimize'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer new'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer text'), 'MISDRIJF ANDERE')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer text lb 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER roll process save'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Slachtoffer'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Getuige'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Getuige new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Getuige new new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Getuige'), 'daniel')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige lb 2'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige Strafbare Feit na'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige Strafbare Feit na'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige click'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige new'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Reden Getuige new window'), 'DOODSLAG')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige new window lb 2'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige roll process save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Getuige'))

WebUI.delay(1)

WebUI.scrollToPosition(29, 7)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring Plaats van Verklaring'), 'BUREAU BIJZONDERE WETTEN')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring Plaats van Verklaring lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring Verklaring'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring save'), FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Verklaring'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Ambts Verslag'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Ambts Verslag new'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Ambts Verslag popup text area'), 'Testing')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Ambts Verslag save'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/aangever save'))

WebUI.delay(10)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Ambts Verslag'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER bijlage'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER bijlage new'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Extra script/AANGEVER Selecteer Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Selecteer Document Naam'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/AANGEVER Omschrijving'), 'Testing')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER bijlage save'))

WebUI.delay(3)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER bijlage'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Documenten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Documenten new'))

WebUI.delay(3)

'BEVESTIGING GEDANE AANGIFTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER popup Documenten name'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER popup Documenten save'))

WebUI.delay(8)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/aangever save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Aangever close'))

