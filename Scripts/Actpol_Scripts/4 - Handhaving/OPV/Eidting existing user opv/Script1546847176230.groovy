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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Doorsturen OPV'))

WebUI.delay(2)

//WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/OPV user view'))

'Remember first set default assistentieid after run the script'
String Id = GlobalVariable.Total_HandhavingID_OPV

String xpath = '(//*[text()="' + Id + '"]/preceding-sibling::td/a[2])[1]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', type.EQUALS, xpath)

WebUI.click(to)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Proces Verbaal'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Strafbaar feit'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/s new'))

not_run: WebUI.delay(1)

'anu test 5'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Handhaving/OPV/Uitvoering'), '10', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/s close'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Strafbaar feit'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Goederen'))

not_run: WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/OPV/Goederen new'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Goederen'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/bijlage'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/bijlage new'))

not_run: WebUI.delay(2)

not_run: WebUI.uploadFile(findTestObject('Actpol_Scripts/Handhaving/OPV/Selecteer Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/Document naam'), 'Test')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Handhaving/OPV/Omschrijving'), 'Test')

not_run: WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Handhaving/OPV/bijlage save'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/bijlage'))

