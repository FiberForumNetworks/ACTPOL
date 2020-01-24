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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.doubleClick(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user 4'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting AANGEVER\r\n'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'AANGEVER', false)

WebUI.delay(3)

WebUI.delay(3)

WebUI.setText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-510/Aangever Achternaam'), 'a')

WebUI.delay(2)

'BESTER'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam lb'))

WebUI.delay(1)

String BEFOREID = WebUI.getText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-510/ID GET'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-510/edit person'))

WebUI.delay(5)

WebUI.setText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-510/ID lokaal'), id)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-510/save person'))

WebUI.delay(7)

String AFTEREID = WebUI.getText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-510/ID GET'))

println(BEFOREID)

println(AFTEREID)

if (id == AFTEREID) {
    print('success')
} else {
    print('faild')
}

