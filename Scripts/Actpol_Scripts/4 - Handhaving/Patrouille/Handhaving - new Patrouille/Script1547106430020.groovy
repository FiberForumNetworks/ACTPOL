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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Handhaving'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Patrouille'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/refre'))

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Nieuw Patrouille'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Begin Datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '2', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/4th'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Eind Datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '2', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/4th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Begin tijd'), '01.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Eind tijd'), '15.00.00')

WebUI.delay(1)

'AMSTERDAM'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Wijk'), '4', false)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Politie Rayon'), '1')

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Bijzonderheden'), 'Testing')

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Patrouille Agenten 1'), 'aa')

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Patrouille/Patrouille Agenten lb'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/Patrouille/p save'))

