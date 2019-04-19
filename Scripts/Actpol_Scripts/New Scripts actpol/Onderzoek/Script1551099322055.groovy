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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

Assistentienummer = WebUI.getText(findTestObject('Actpol_Scripts/Extra script/Assistenties number store'))

println(Assistentienummer)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Edit user Onderzoek'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Assistentie\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '19', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 15)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Assistentienummer'), Assistentienummer)

WebUI.delay(2)

//Assistentienummer WebUI.click(findTestObject('Actpol_Scripts/Extra script/Assistentienummer lb'))
String Assistnumberpath = ('//*[contains(text(),"' + Assistentienummer) + '")]'

'based on user'
TestObject to = findTestObject('Actpol_Scripts/Extra script/Assistentienummer lb')

to.addProperty('xpath', ConditionType.EQUALS, Assistnumberpath)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Assistentienummer save data'))

WebUI.delay(4)

WebUI.comment('person based selecting roll process')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 15)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'Test')

WebUI.delay(2)

'CESTER'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '2', false)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Toevoegen als slachtoffer naa'))

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Toevoegen als slachtoffer naa'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Slachtofferhulp na'))

WebUI.waitForElementVisible(findTestObject('JIRA/A onderzoel roll process/Aangever'), 15)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Aangever'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte'))

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'), 15)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte aa'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Reden Aangifte lb aa'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Ra save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Reden Aangifte'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit new'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/SF save popup'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 2'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Strafbaar feit edit click 3'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitvoering 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/save'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Aangever save'))

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Personalia'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process new'))

WebUI.delay(3)

'BEKENDE/AANGEHOUDEN VERDACHTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '1', false)

WebUI.delay(4)

'TER BEWARING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Reden'), '4', false)

WebUI.delay(1)

'BUITEN HETERDAAD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Type'), '1', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Plaats van verhoo'), 'bon')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Plaats van verhoor lb'))

WebUI.delay(2)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte Info'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare feiten plan text'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare feiten plan text new'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/UITVOERING 1'), '1', false)

WebUI.delay(1)

'MEDEPLEGEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Daderschap 1'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/stra save popup'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte save'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A onderzoel roll process/Roll process new'))

WebUI.delay(3)

'GETUIGE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), '7', false)

WebUI.delay(3)

WebUI.focus(findTestObject('Actpol_Scripts/Extra script/Getuige Slachtofferhulp na'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige Slachtofferhulp na'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige new'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Reden Getuige new window'), 'BEDREIGING MET VUURWAPEN')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige new window lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Reden Getuige save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare feiten plan text'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare feiten Getuige new'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/UITVOERING 1'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/stra save popup'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Getuige save'))

WebUI.closeBrowser()

