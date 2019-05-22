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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), GlobalVariable.AssistentieID)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

//CHECK CODE 
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.AssistentieID

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/New bekende aangehouden verdachte scripts/Conformation ok select'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('BEKENDE/AANGEHOUDEN VERDACHTE  start')

'Selecting BEKENDE/AANGEHOUDEN VERDACHTE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '1', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam specific process'), 'AC')

WebUI.delay(3)

'Secting abdctest'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam specific process 9 lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Alcohol gebruik ja'))

WebUI.delay(1)

'select anu test 1\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Alcohol gebruik type'), '7', false)

WebUI.delay(1)

'LSD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Drugs gebruik type'), '3', false, FailureHandling.OPTIONAL)

WebUI.delay(1)

'select I.V.M. MEDEBRENGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden'), '1', false)

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

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/New bekende aangehouden verdachte scripts/STRN new new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))

WebUI.delay(1)

'VERGUNNING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel new'), '197', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))

WebUI.delay(1)

'Pogging'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/UITVOERING'), '1', false)

WebUI.delay(1)

'MEDEPLEGEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Daderschap'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/STRA popup save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feitin'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/backend Process save'))

