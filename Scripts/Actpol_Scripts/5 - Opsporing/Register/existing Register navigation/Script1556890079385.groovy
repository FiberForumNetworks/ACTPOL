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
import com.kms.katalon.core.testobject.ConditionType as Vali

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Register'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

//WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/register existing user'))
'Remember first set default assistentieid after run the script'
String RegisterID = GlobalVariable.RegisterID

String Assistentiexpath = ('//*[text()="' + RegisterID) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/Opsporing/Register/register existing user')

to.addProperty('xpath', Vali.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Afdeling'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Afdeling lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Register/Naam Onderzoek'), 'Test1008')

'Aanleiding is melding van'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Register/Redden Opname Register'), '114', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Register/Opmerking'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Register'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse click'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Register/Klasse click lb'))

not_run: WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Register/r save'))

WebUI.closeBrowser()

