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
import com.kms.katalon.core.testobject.ConditionType as type

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Dienstovername'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Wachtovername Zoekopdracht Datum'), GlobalVariable.Dienstovername_WachtovernameID)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Wachtovername Zoekopdracht Filter'))

WebUI.delay(2)

//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Edit Dienstovername'))
'Remember first set default assistentieid after run the script'
String Mixingid = GlobalVariable.Dienstovername_WachtovernameID

String Assistentiexpath = ('//*[text()="' + Mixingid) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Edit Dienstovername')

to.addProperty('xpath', type.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(2)

'ADMINISTRATIE JUSTICIELE DIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Afdeling'), '7', false)

'AVONDDIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Type Dienst'), '2', false)

'2\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Team'), '17', false)

WebUI.delay(1)

'intake'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Type Proces'), '45', false)

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

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Personeel new'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/p Naam'), 'a')

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

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Eenheden'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/e new'))

not_run: WebUI.delay(2)

'Dienstauto'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Eenheid type'), '21', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Gecontroleerd door'), 'webster')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Gecontroleerd door lb'))

not_run: WebUI.delay(1)

'456\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Dienstauto'), '2', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Kilometer stand'), '2')

'ja\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Reserve band'), '48', false)

'na\r\n\r\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Krik'), '49', false)

'ja'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Wielmoersleutel'), '48', false)

'na'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Gasoline Boek'), '49', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Motor olie'), '48', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Transmissie olie'), '49', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Deuk'), '48', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Kras'), '49', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Nieuwe schade'), '48', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Bijzonderheid'), 'Testing')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/e save'))

not_run: WebUI.delay(1)

not_run: WebUI.scrollToPosition(10, 8)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Eenheden'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Materiaal'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/m new'))

not_run: WebUI.delay(2)

'asdf sadf'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Materiaal 1'), '28', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/m save'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Materiaal'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Briefing'))

'Afdeling'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Bestemd voor'), '73', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Beschrijving'), 'Testing')

not_run: WebUI.delay(1)

not_run: WebUI.scrollToPosition(10, 8)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Briefing'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/j click'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Journal'), 'testing', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Dienstovername/j click'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Dienstovername/Journal Journal set text'), 'Testing')

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Dienstovername/d total save'))

