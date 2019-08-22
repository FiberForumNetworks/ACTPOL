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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

'Click new ongeval btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Nieuw Ongeval'))

WebUI.delay(5)

'Click Algemeen tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Algemeen tab'))

WebUI.delay(1)

'Click Partijen or Objecten tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Partijen or Objecten'))

WebUI.delay(1)

'Click Partijen or Objecten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Partijen or Objecten new'))

WebUI.delay(2)

'Click radio btn Voertuig'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Radio Voertuig'))

WebUI.delay(2)

'Click Voertuig nummer new '
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Voertuig nummer new'))

WebUI.delay(4)

'Click Voertuig new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Voertuig new btn'))

WebUI.delay(4)

'Click Voertuig select\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Nieuw Voertuig edit default'))

WebUI.delay(3)

'Select required drop down'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Reden Inschrijving'), 'ZAAKWAARNEMING', false)

WebUI.delay(2)

'Click Voertuig tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Voertuig'))

WebUI.delay(1)

'Click Bescheiden tab.'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Bescheiden'))

WebUI.delay(1)

'Click  Bestuurder tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Bestuurder new'))

WebUI.delay(4)

'Edit Select persoon'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/nieuw persoon edit default'))

WebUI.delay(1)

'Select required drop down :: Type verzekering'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-484/Type verzekering'), 'Comprehensive', false)

