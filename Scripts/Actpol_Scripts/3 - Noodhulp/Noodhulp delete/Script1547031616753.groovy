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

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Noodhulp'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Onderhoud van Patrouilles'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Noodhulp/Filter lijst unit id'), GlobalVariable.NoodhulpID)

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/filter'))

WebUI.delay(2)

'Remember first set default assistentieid after run the script'
String Id = GlobalVariable.NoodhulpID

String xpath = ('//*[text()="' + Id) + '"]/preceding-sibling::td/span[3]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', type.EQUALS, xpath)

WebUI.click(to)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/unit user 32'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Optie user select'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Noodhulp/Optie user delete'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Unit save'))

