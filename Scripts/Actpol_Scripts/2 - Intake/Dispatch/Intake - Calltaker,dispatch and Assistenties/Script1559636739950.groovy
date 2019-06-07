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
import com.kms.katalon.core.testobject.ConditionType as con

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'OL')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb 39'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4754')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Longitude'), '12', FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'ac')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

WebUI.delay(1)

'ZELF CONSTATERING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Melder Gegevens Achternaam'), 'te')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Melder Gegevens Achternaam lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/intake save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Actieve Assistentie click'))

WebUI.delay(2)

Assistentie = WebUI.getText(findTestObject('Actpol_Scripts/Extra script/Incident'))

WebUI.comment('creating dispath module')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Dispatch'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Dipath edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Unit radio click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Koppelen optie click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Koppelen save'))

WebUI.delay(1)

'DA'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'AR', false)

WebUI.delay(2)

'DC'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'CL', false)

WebUI.delay(2)

'DC'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'CL', false, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('creating Assistenties module')

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), Assistentie)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = Assistentie

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', con.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Confirmeren'))

WebUI.delay(4)

'COMERCIELE INSTELLING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Lokatie type'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Melding Melder Dispatch assist save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '2', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam'), 'BESTER')

WebUI.delay(2)

'BESTER'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam lb'))

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

WebUI.click(findTestObject('Actpol_Scripts/Extra script/aangever save'))

WebUI.delay(9)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Aangever close'))

WebUI.comment('AANGEVER  process close')

