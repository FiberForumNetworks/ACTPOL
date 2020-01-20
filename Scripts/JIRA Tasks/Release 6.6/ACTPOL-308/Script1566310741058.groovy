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

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 
    'assist', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), 
    GlobalVariable.Generiekassistenite_Module)

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

not_run: WebUI.delay(2)

//CHECK CODE 
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.delay(5)

WebUI.click(to)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

not_run: WebUI.switchToWindowIndex(1)

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

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Achternaam'), 'kl')

WebUI.delay(2)

'Select required dropdown'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Achternaam lb'))

WebUI.delay(1)

'Get text frim the feild:: Geboorte Plaats'
Geboorteplaats = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Geboorte Plaats'), FailureHandling.OPTIONAL)

println(Geboorteplaats)

WebUI.delay(1)

'Enter Telefoon 1'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Telefoon 1'), '123456789')

WebUI.delay(1)

'Enter Telefoon 2'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Telefoon 2'), '987456123')

WebUI.delay(1)

'Enter Telefoon 3'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Telefoon 3'), '987456123')

WebUI.delay(1)

'Get text frim the feild:: CRV nummer'
CRVnummer = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/CRV nummer'), FailureHandling.OPTIONAL)

println(CRVnummer)

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/IND-BES nummer'), '123456789')

WebUI.delay(1)

'Enter the Ticket number'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Ticket nummer'), '987456123')

WebUI.delay(1)

'Enter the PNR number'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/PNR nummer'), '987456123')

WebUI.delay(1)

'Click radio btn Meereizende minderjarige kinderen ja'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Meereizende minderjarige kinderen ja'))

WebUI.delay(1)

'Enter the text'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Aantal'), '123456789')

WebUI.delay(1)

WebUI.focus(findTestObject('JIRA/A Relese 6.6/ACTPOL-308/Save Vreemdeling'), FailureHandling.OPTIONAL)

