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

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Goederen Inbeslaggenomen'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Goederen inbeslaggenomen-one locatie'))

WebUI.delay(2)

//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Edit Dienstovername'))
'Remember first set default assistentieid after run the script'
String Mixingid = GlobalVariable.Total_Generiek_Module

String Assistentiexpath = ('//*[text()="' + Mixingid) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Edit Dienstovername')

to.addProperty('xpath', type.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Change locatie'))

WebUI.delay(2)

'Ontvangen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Reden'), '76', false)

WebUI.delay(1)

'OM'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Type'), '80', false)

WebUI.delay(1)

'Aname1, Vname1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Type 2'), '50014', false)

'Andere'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Locatie'), '83', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Locatie 2'), 'Test')

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/Goederen Locatie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Goederen inbeslaggenomen/save'))

