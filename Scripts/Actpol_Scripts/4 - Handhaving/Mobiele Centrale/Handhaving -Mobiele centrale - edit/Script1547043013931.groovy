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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Handhaving'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Mobiele Centrale'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/refre'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/edit mobiele centrale'))

'Remember first set default assistentieid after run the script'
String Id = GlobalVariable.handhaving_mobileid

String xpath = ('(//*[text()="' + Id) + '"]/preceding-sibling::td/a[3])[1]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', type.EQUALS, xpath)

WebUI.click(to)

WebUI.delay(2)

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

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Materiaal'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/newMateriaal'))

'Test1'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Materiaal type'), '1', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Aantal'), 'TEst')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/m save'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Materiaal'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Tijdschema'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/newTijd'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Positie'), 'New direction')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Spitswagen datum'))

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Spitswagen tijd'), '10.00.00')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Sluitwagen datum'))

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Sluitwagen tijd'), '10.00.00')

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/tid save'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Tijdschema'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/Mobiele Centrale/Mobiele Centrale total save'))

