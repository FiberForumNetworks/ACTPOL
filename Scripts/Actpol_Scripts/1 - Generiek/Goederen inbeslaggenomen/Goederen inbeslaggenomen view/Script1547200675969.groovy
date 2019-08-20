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
import com.kms.katalon.core.testobject.ConditionType as type

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Goederen Inbeslaggenomen'))

WebUI.delay(2)

'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.GoederenLocatie

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[1]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', type.EQUALS, Assistentiexpath)

WebUI.click(to)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Goederen inbeslaggenomen-one locatie'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Nieuw Locatie'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Goed'))

'Ontvangen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Reden'), '78', false)

WebUI.delay(1)

'OM'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Type'), '81', false)

WebUI.delay(1)

'Aname1, Vname1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Type 2'), '86', false)

'Andere'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Locatie'), '83', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Locatie 2'), 'Test')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Goederen Locatie'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/save'))

