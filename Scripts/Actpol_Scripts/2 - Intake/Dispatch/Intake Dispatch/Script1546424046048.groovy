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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Dispatch'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken btn'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Naam'), 'aa')

WebUI.delay(2)

'select user "SAAB NAZIRA C.A."'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Naam lb'), FailureHandling.OPTIONAL)

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Kenteken'), 'BNA')

not_run: WebUI.delay(2)

'BNA  014'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Kentaken lb'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Chasissnr'), 'jn1taaw')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Chasissnr lb'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Merk'), 'adven')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Merk lb'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/Close tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Incidenten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van month'), 
    '11', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van year'), 
    '2018', false)

WebUI.delay(1)

'date 31 st selecting'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van date'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van month'), 
    '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Eerdere Incidenten dattam van year'), 
    '2019', false)

WebUI.delay(1)

'date 31 st selecting'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/date 3rd'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Straat'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Straat lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Incidenten/Incident close'))

WebUI.delay(2)

'clicking route btn'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Route/Route'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Route/Straat'), 'ANDRES BELLO WEG')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Route/Straat lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Route/Route close'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Unit Status/Unit'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Dispatch/Unit Status/Unit Id'), 'B-5')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Unit Status/unit filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Unit Status/Unit close'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kentaken/AMBULANCE'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Spoedgevallen AMBULANCE'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Optie'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Dispatch/Kopplean save tab'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/clear to dc'), 'AR', false, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Dispatch/clear to dc'), 'CL', false, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.closeBrowser()

