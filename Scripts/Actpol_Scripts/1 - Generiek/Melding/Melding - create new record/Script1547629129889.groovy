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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Melding'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/new melding'))

WebUI.delay(2)

'Selecting Informatie'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Type Melding'), '210', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Naam Melder'), 'aaa1226')

'Selecting KMAR'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Werkzaam bij'), '97', false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Dataam img src'))

WebUI.delay(1)

'jan'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

'2019\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

'Selecting Afgehandeld'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Status'), '95', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Omschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Melding'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Details'))

not_run: WebUI.delay(1)

'Vervoerswijze Bekend2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Vervoerswijze bekend'), '126', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Datum'))

not_run: WebUI.delay(1)

'jan'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

'2019\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

not_run: WebUI.delay(1)

'seksuele uitbuiting binnen BES2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/seksuele uitbuiting binnen BES'), '128', 
    false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/seksuele uitbuiting international ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitbuiting middles arbeid ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitbuiting ov. Lichamelijke integriteit ja'))

not_run: WebUI.delay(1)

'Uitb. Middels criminele activiteiten2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Uitb. Middels criminele activiteiten'), 
    '130', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitb.Gedwongen bedelarji ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Vrouwenhandel ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/art. 273.1.3 sr ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Slavernji ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Dienstbaarheid ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Overige parktijken ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitb. Middel diensten ja'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Orgaanhandel ja'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Reisinformatie'), 'new', FailureHandling.OPTIONAL)

'Dirty2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Dirty'), '132', false)

'Dangerous2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Dangerous'), '134', false)

'Degreeded2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Degreeded'), '136', false)

'Lich Integriteit2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Lich. integriteit'), '138', false)

'Middel2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Middel'), '140', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Middel 2'), 'test')

'Gedraging2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/gedraging'), '142', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/gedraging 2'), 'test')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Prostitutie aigemeen ja'))

'Raam2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Raam'), '144', false)

'Escort2'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Escort'), '146', false)

'Media2\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Media'), '148', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Hotel ja'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Meld save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/meld naam filter a-z'))

