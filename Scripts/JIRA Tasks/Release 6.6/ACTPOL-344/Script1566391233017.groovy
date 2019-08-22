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

WebUI.comment('Select process "VREEMDELING"')

'Select required dropdown'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'VREEMDELING', false)

WebUI.delay(3)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Vliegmaatschappij_Rederij'), 'Katalon testing')

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Naam boot_vliegtuig'), 'Katalon testing')

WebUI.delay(1)

'Enter the telefoon number'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Telefoon boot_vliegtuig'), 'Katalon testing')

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Agentschap'), 'Katalon testing')

WebUI.delay(1)

'Click Achternaam new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Achternaam new btn click'))

WebUI.delay(4)

'Click Personen  edit btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Persoon edit default'))

WebUI.delay(4)

'Click Personen  tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Personalia tab'))

WebUI.delay(2)

'Click Vaarbewijs tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Vaarbewijs'))

WebUI.delay(2)

'Click Vaarbewijs new'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Vaarbewijs new'))

WebUI.delay(1)

'Enter text from the feild:: Vaarbewijs'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Vaarbewijs Vaarbewijs'), 'Vaarbewijs test')

WebUI.delay(1)

'Select required dropdown from the list'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Vaarbewijs type'), 'INTERNATIONAAL', false)

WebUI.delay(1)

'Select required dropdown from the list'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Categorie'), 'Beroeps', false)

WebUI.delay(1)

'Select required dropdown from the list'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Land afgifte'), 'AFGHANISTAN', false)

WebUI.delay(1)

'Click Datum afgifte Calendar icon'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Datum afgifte'))

WebUI.delay(1)

'Select month'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/newpersonmonth'), 'maa', false)

WebUI.delay(1)

'Select year'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/newpersonyear'), '2018', false)

WebUI.delay(1)

'Click 10th date'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/newperson 10th'))

WebUI.delay(1)

'Click Verval datum Calendar icon'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Verval datum'))

WebUI.delay(1)

'Select month'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/newpersonmonth'), 'maa', false)

WebUI.delay(1)

'Select year'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/newpersonyear'), '2019', false)

WebUI.delay(1)

'Click 10th date'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/newperson 11th'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-344/Vaarbewijs add on'))

WebUI.delay(2)

WebUI.takeScreenshot()

