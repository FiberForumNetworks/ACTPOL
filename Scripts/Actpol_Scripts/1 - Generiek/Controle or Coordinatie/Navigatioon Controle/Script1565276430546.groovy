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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Controle'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Controal/Editing Coordinatie user'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Controal/Verwerkingsstatus naa'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Controal/coordinatie save'))

WebUI.closeBrowser()

not_run: WebUI.delay(1)

'test001'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Controal/Onderwerp'), '16', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Controal/Bericht'), 'Testing')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Controal/coordinatie save'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Controal/Editing Coordinatie user'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Controal/Verwerkingsstatus ja'))

not_run: WebUI.delay(2)

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Generiek/Controal/coordinatie save'))

