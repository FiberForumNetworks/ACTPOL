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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.util.UUID as UUID
import java.util.Date as Date
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//String uuid = UUID.randomUUID().toString()
String uuid = UUID.randomUUID().toString().substring(1, 7)

String uuid1 = UUID.randomUUID().toString()

String uuid2 = Date.julianCalendar.calendarDate.dayOfWeek

println(uuid)

println(uuid1)

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Afdeling lb'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Naam Onderzoek name'), uuid)

WebUI.delay(1)

'Aangifte'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Aanleiding Bron'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rechtsverzoek ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Land lb'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Overdracht'), '1', false, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Prioriteit'), '1')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Klasse Lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek save'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Onderzoek save'), FailureHandling.OPTIONAL)

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'aaa')

WebUI.delay(2)

String Assistentiexpath1 = '/html/body/div[6]/ul/li[1]'

TestObject to = findTestObject('Object Repository/Actpol_Scripts/Generiek/Assistentie/Achternaam text lb')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath1)

WebUI.click(to)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

WebUI.delay(1)

'Selecting process'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), 'AANGEVER', false)

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Toevoegen als slachtoffer na'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Slachtofferhulp nee'))

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

String Assistentiexpath2 = '/html/body/div[7]/ul/li[7]'

TestObject to2 = findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click lb')

to2.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath2)

WebUI.click(to2)

//'BEDREIGING\r\n'
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click lb'))
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

String Assistentiexpath3 = '//*[@id="nxmenu"]/div[5]/ul/li[1]'

TestObject to3 = findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb')

to3.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath3)

WebUI.click(to3)

//'VERGUNNINGSLANDSVERORDENING'
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))
'VERGUNNING'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel new'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel'))

WebUI.delay(2)

String Assistentiexpath4 = '//*[@id="nxmenu"]/div[6]/ul/li'

TestObject to4 = findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath4)

WebUI.click(to4)

//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))
WebUI.delay(1)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/save nieuw strafbaar feit'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Actpol_Scripts/Extra script/aangever save'))

WebUI.delay(15)

String Assistentiexpath5 = '//*[@id="INV23001_pgm"]/div[1]/span[3]/input[2]'

TestObject to5 = findTestObject('Actpol_Scripts/Extra script/Aangever close')

to5.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath5)

WebUI.click(to5)

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(4)

String Beforepersoontext = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/Persoon get text'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/Aangever edit'))

WebUI.delay(9)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/Aangever tab'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/M.O tab'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/MO new'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/MO drop down'), 1)

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/MO Omschrijving'), uuid1)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/MO save'))

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/MO save'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Actpol_Scripts/Extra script/aangever save'))

WebUI.delay(2)

String Assistentiexpath7 = '//*[@id="POL22001_pgm"]/div[1]/span[2]/input[2]'

TestObject to7 = findTestObject('Actpol_Scripts/Extra script/Aangever close')

to7.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath7)

WebUI.click(to7)

WebUI.delay(2)

String Assistentiexpath6 = '//*[@id="POL22001_pgm"]/div[1]/span[2]/input[3]'

TestObject to6 = findTestObject('Actpol_Scripts/Extra script/Aangever close')

to6.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath6)

WebUI.click(to6)

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

String Afterepersoontext = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-596/Persoon get text'))

WebUI.delay(1)

if (Beforepersoontext == Afterepersoontext) {
	
    KeywordUtil.markPassed((((Beforepersoontext + ' ') + Afterepersoontext) + ' ') + 'both are matching')
} else {
    KeywordUtil.markFailed((((Beforepersoontext + ' ') + Afterepersoontext) + ' ') + 'both are not  matching')
}

