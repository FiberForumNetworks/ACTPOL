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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Geweld_ Disciplinaire Rapport'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Geweld - Disciplinaire Rapport new'))

WebUI.delay(2)

'Disciplinaire'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Rapport type'), '11', false, 
    FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Naam Personeel click'))

WebUI.delay(2)

'BUNNY\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Naam Personeel Lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Datum Rapport'))

'DAGDIENST'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Dienst'), '1', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/11th r f'))

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Tijd Rapport'), '11.11.11')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Reden Rapport'), 'Testing')

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Dienst tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/Reden Historie'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Geweld - Disciplinaire Rapport/save'))

WebUI.closeBrowser()

