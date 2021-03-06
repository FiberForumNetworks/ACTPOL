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

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Autorisatie/Autorisatie'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Autorisatie/Onderhoud Groep Autorisatie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Onderhoud Groep Autorisatie -new'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Groep'), 'Test')

WebUI.delay(1)

'Everyone'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Nexus Groep'), '1', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Security Code'), '173')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Raadpleeg Record Niveau'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Organisatie Level'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Actief Ja'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Raadpleeg Organisatie Niveau Officer'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Copy program authorities from group'), 
    'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Copy program authorities from group lb'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/9 - Autorisatie/Onderhoud Groep Autorisatie/Groep save'), FailureHandling.STOP_ON_FAILURE)

