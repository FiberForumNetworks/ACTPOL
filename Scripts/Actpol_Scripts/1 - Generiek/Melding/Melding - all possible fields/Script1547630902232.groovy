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

'Mensensmokkel'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Type Melding'), '91', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Naam Melder'), 'aa1212')

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

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Details'))

WebUI.delay(1)

'Vervoerswijze Bekend2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Vervoerswijze bekend'), '126', false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Datum'))

WebUI.delay(1)

'jan'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

'2019\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

'seksuele uitbuiting binnen BES2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/seksuele uitbuiting binnen BES'), '128', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/seksuele uitbuiting international ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitbuiting middles arbeid ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitbuiting ov. Lichamelijke integriteit ja'))

WebUI.delay(1)

'Uitb. Middels criminele activiteiten2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Uitb. Middels criminele activiteiten'), '130', 
    false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitb.Gedwongen bedelarji ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Vrouwenhandel ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/art. 273.1.3 sr ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Slavernji ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Dienstbaarheid ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Overige parktijken ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/uitb. Middel diensten ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Orgaanhandel ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Reisinformatie'), 'new', FailureHandling.OPTIONAL)

'Dirty2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Dirty'), '132', false)

'Dangerous2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Dangerous'), '134', false)

'Degreeded2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Degreeded'), '136', false)

'Lich Integriteit2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Lich. integriteit'), '138', false)

'Middel2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Middel'), '140', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Middel 2'), 'test')

'Gedraging2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/gedraging'), '142', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/gedraging 2'), 'test')

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Prostitutie aigemeen ja'))

'Raam2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Raam'), '144', false)

'Escort2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Escort'), '146', false)

'Media2\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Media'), '148', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Thuisprostitutie ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Hotel ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Recreatieterreinen ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Club privehuis ja'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Straat tippelzone ja'))

WebUI.delay(1)

'Lifestyle-Branche2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Lifestyle-branche'), '150', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Lifestyle-branche 2'), 'Test')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Doorlaatverbod toegepast'), 'Test')

WebUI.delay(1)

'Mensensmokkel12'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Mensensmokkel'), '152', false)

'Mensensmokkel22'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Mensensmokkel 2'), '154', false)

'Nodale Punten bij smokkel1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Nodale punten bij smokkel'), '155', false)

'Hottime 2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Hottime hotspot hotcrime'), '158', false)

'Plus Identiteits fraude 2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Plus identiteitsfraude'), '160', false)

'Plus Reisdocumentatie Fraude 2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Plus reisdocumentatie-fraude'), '162', false)

'Plus Misbruik Migratiereglingen 2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Plus misbruik migratiereglingen'), '164', false)

'Nevenactiviteiten 2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Nevenactiviteiten'), '166', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/Meld save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/meld naam filter a-z'))

