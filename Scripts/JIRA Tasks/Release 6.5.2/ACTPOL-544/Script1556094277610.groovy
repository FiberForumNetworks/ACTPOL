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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = '200601716'

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('VREEMDELING')

'VREEMDELING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '57', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), 40)

'Luchthaven'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), '86', false)

WebUI.delay(2)

'laura'
WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam'), 'laura', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam -lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Vreemdeling tab hide'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten new'))

WebUI.delay(1)

'Paspoort'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Soort Document'), '109', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Document nummer'), '1225')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Plaats afgifte'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Plaats afgifte lb'))

WebUI.delay(1)

'Studie'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Visuem Type'), '115', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Visum duur'), 'Test')

WebUI.delay(1)

'Officieel Bezoek'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Visum doel'), '117', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten save'))

WebUI.delay(4)

WebUI.takeScreenshot()

