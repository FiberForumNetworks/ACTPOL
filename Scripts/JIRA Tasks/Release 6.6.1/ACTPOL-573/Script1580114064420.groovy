import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.util.KeywordUtil as key

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(2)

String infoorg = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

key.logInfo(infoorg)

String textinfo = 'Info organisatie'

if (infoorg == textinfo) {
    key.markPassed(textinfo + 'is visible')
} else {
    key.markFailed(textinfo + 'is not visible')
}

String jpur = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Journaal tab'))

key.logInfo(jpur)

String textjour = 'Journaal'

if (jpur == textjour) {
    key.markPassed(textjour + 'is visible')
} else {
    key.markFailed(textjour + 'is not visible')
}

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'), FailureHandling.OPTIONAL)

WebUI.delay(2)

String gridcheck = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Infodesk check'))

key.logInfo(gridcheck)

String gridverify = 'Infodesk'

if (gridcheck == gridverify) {
    key.markPassed(gridverify + 'Grid is visible')
} else {
    key.markFailed(gridverify + 'Grid is not visible')
}

