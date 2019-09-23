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

WebUI.delay(1)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/edit default mbes 18'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Documenten tab'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.comment('Creating new document')

//32 DROP DOWN VALUES
for(int i=1;i<=32;i++)
{
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Document new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Selecteer Documentsjabloon'), 2, 
    FailureHandling.STOP_ON_FAILURE)

String list = 'Selecteer een ander document.'

WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Selecteer Documentsjabloon error message'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/new document save'))

WebUI.delay(4)
}
