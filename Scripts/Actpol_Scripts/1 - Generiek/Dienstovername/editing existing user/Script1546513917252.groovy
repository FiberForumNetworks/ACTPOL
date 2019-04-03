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

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Dienstovername'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Edit Dienstovername'))

WebUI.delay(2)

'ADMINISTRATIE JUSTICIELE DIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Afdeling'), '45', false)

'AVONDDIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Type Dienst'), '2', false)

'2\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Team'), '17', false)

WebUI.delay(1)

'intake'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Type Proces'), '44', false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Datum'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Datum tm'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Diensttijd van'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Diensttijd van tm'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Teamleiding Naam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Teamleiding Naam lb'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Dienst'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel new'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Naam'), 'alex')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Naam lb'))

'ZIEK'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Bijzonderheden'), '2', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Aantal Uren'), '01.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p save'))

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Eenheden'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/e new'))

WebUI.delay(2)

'Dienstauto'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Eenheid type'), '21', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Gecontroleerd door'), 'webster')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Gecontroleerd door lb'))

WebUI.delay(1)

'456\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Dienstauto'), '2', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Kilometer stand'), '2')

'ja\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Reserve band'), '48', false)

'na\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Krik'), '49', false)

'ja'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Wielmoersleutel'), '48', false)

'na'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Gasoline Boek'), '49', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Motor olie'), '48', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Transmissie olie'), '49', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Deuk'), '48', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Kras'), '49', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Nieuwe schade'), '48', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Bijzonderheid'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/e save'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Eenheden'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Materiaal'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/m new'))

WebUI.delay(2)

'asdf sadf'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Materiaal 1'), '28', false)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/m save'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Materiaal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Briefing'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Briefing new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

'Afdeling'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Bestemd voor'), '73', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Beschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Briefing save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Briefing'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/d total save'))

