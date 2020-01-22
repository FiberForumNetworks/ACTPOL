import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default mbes edit'))

KeywordUtil.logInfo('successfully Clicked Default MBES edit')

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

WebUI.delay(1)

WebUI.delay(1)

'Click on Personalia tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.delay(1)

BeforetextOmschrijving = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-605/Omschrijving'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-605/Omschrijving'), Textarea)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

WebUI.delay(6)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default mbes edit'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

WebUI.delay(1)

WebUI.delay(1)

'Click on Personalia tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.delay(1)

AftertextOmschrijving = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-605/Omschrijving'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

String checktext = Textarea

if (Textarea.equals(true) == AftertextOmschrijving.equals(true)) {
	
    KeywordUtil.logInfo(AftertextOmschrijving)

    KeywordUtil.logInfo(Textarea)

    KeywordUtil.markPassed(((Textarea + 'entered text and') + AftertextOmschrijving) + 'both are matching')
	
} else {
	
    KeywordUtil.logInfo(AftertextOmschrijving)

    KeywordUtil.logInfo(Textarea)

    KeywordUtil.markFailed(((Textarea + 'entered text and') + AftertextOmschrijving) + 'both are not matching')
}

