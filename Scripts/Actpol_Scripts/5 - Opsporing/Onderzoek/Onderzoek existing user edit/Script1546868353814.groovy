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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/existing user onderzoek'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

'Remember first set default assistentieid after run the script'
String OnderzoekID = GlobalVariable.OnderzoekID

String Assistentiexpath = ('//*[text()="' + OnderzoekID) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/Opsporing/Onderzoek/existing user onderzoek')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Importeren Entiteit'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Assistentie Nr'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Assistentie Nr lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/imp entite save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/imp ent close'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Import melding'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr'), '21')

WebUI.delay(2)

'Selecting 129'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Melding Nr lb 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/meld save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document open'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/dob'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Uitgewerkte Tapverslag'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/new doc upload'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document Naam'), 'NEW')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Betreft'), 'ddc')

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/doc save'), FailureHandling.STOP_ON_FAILURE)

