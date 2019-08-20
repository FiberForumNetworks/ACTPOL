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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Classificatie'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Classificatie/new'))

WebUI.delay(2)

'Persoon'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Classificatie/Select Type Entiteit'), '204', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Classificatie/Achternaam'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Classificatie/Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Classificatie/Classificatie BeginDatum'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Classificatie/Classificatie BeginDatum'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Classificatie/Person Clasificatie'))

not_run: WebUI.delay(1)

not_run: WebUI.scrollToPosition(10, 8)

not_run: WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Classificatie/Save data'))

WebUI.closeBrowser()

