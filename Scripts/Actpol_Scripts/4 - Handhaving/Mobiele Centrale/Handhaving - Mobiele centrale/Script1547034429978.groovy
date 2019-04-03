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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Mobiele Centrale'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/refre'))

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Mobiele Centrale new'))

WebUI.delay(2)

'GRAN MARCHA'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Event type'), '1', false)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Begin datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '2', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/4th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Begin tijd'), '18.00.00')

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Eind datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '2', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/4th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Eind tijd'), '22.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Omschrijving'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Event'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/newPersoneel'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Personeel txt'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Personeel txt lb'))

WebUI.delay(1)

'DIENSTREIS'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/p status'), '6', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/p Tijd'), '19.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Bijzonderheid'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/p save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Materiaal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/newMateriaal'))

'HANDBOEIEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Materiaal type'), '17', false)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Aantal'), 'TEst')

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/m save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Materiaal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Tijdschema'))

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/newTijd'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Positie'), 'New direction')

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Spitswagen datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Spitswagen tijd'), '10.00.00')

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Sluitwagen datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Sluitwagen tijd'), '10.00.00')

WebUI.delay(2)

WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/tid save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Tijdschema'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Mobiele Centrale total save'))

