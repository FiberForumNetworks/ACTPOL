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

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), GlobalVariable.Generiekassistenite_Module)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

//CHECK CODE
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.delay(5)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('Select process "BETROKKEN VAARTUIG"')

'Select required dropdown'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'BETROKKEN VAARTUIG', false)

WebUI.delay(3)

'Click Contacten tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Contacten'))

WebUI.delay(1)

'Click Vaartuig tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Vaartuig tab'))

WebUI.delay(2)

'Click Vaartuig  new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Vaartuig new'))

WebUI.delay(4)

'Click new Vaartuig  tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Nieuw Vaartuig -Vaartuig tab'))

WebUI.delay(1)

'Click Opvarende tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Opvarende tab'))

WebUI.delay(2)

'Click Opvarende new'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Opvarende new'))

WebUI.delay(4)

'enter text from the feild :: toevoegen inzittende'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/toevoegen inzittende Naam'), 'a')

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/toevoegen inzittende Naam lb'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/toevoegen inzittende save'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

'Select required drop down :: Bemaningslid ja'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Bemaningslid ja'), 'JA', false)

WebUI.delay(2)

'Select required drop down :: Bemaningslid Nee'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Bemaningslid na'), 'NEE', false)

WebUI.delay(2)

'Enter text from the feild :: toevoegen inzittende Naam 2'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Naam 2'), 'aa')

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/Naam 2 lb'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-548/toevoegen inzittende save'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

WebUI.takeScreenshot()

