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

WebUI.delay(2)

/*not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

not_run: WebUI.delay(2)

'Creating New Incident\r\n'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie New'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/477 Bekende plaats'), 'CURTEST')

not_run: WebUI.delay(2)

'\r\n'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.5.2/477 Bekende plaats lb'))

not_run: WebUI.delay(1)*/
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Onderhoud/Onderhoud'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Onderhoud/Basis Bestanden Meldkamer'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/477 Bedrijf'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/477 Omschrijving enter required text'), 'CURTEST')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/477 search'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/477 edit Bedrijf'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/477 Inactief'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/477 Inactief'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/477 save'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

'Creating New Incident\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie New'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/477 Bekende plaats'), 'CURTEST')

WebUI.delay(1)

WebUI.takeScreenshot()

