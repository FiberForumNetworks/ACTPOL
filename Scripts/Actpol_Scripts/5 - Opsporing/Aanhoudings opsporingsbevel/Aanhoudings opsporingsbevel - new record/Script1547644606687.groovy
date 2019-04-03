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

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('test/click preview'))

not_run: WebUI.delay(180, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('test/moord test'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Aanhoudings_Opsporings bevel'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Pagina chck'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Aanhoudings Opsporings bevel new'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Op Bevel van'), 'a')

WebUI.delay(2)

'HUPSEL, ANTONIO'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Op Bevel van lb'))

WebUI.delay(2)

'HEMELAAR, Maarten'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Met toestemming van'), '54', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Persoon'), 'a')

WebUI.delay(2)

'Aaftink'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Persoon lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Details'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant new'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Terzake'), 'New data check')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant plus'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/a o save'))

