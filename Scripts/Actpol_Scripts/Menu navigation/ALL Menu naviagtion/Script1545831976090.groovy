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

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Generiek navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Intake naviagtion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Noodhulp navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Handhaving navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Opsporing Navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Rapportage Navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Dashboard Navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Onderhoud Navigation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Actpol_Scripts/Menu navigation/Autorisatie Naviagation'), [:], FailureHandling.STOP_ON_FAILURE)

