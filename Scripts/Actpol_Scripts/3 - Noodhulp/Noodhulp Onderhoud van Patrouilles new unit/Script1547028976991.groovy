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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Noodhulp'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Onderhoud van Patrouilles'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Nieuw Unit'))

WebUI.delay(2)

'Select based on the required dropdown'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Noodhulp/Unit Type'), 'P', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Noodhulp/Unit data name'), 'P999')

'Select based on the required dropdown'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Noodhulp/Wijkteam'), '30', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/OFFICER BUTTON'))

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Unit officier naam'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Unit officier naam lb'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Noodhulp/Unit officier naam 2'), 'TEEUWE, Santana')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Office save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/Unit save'))

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Noodhulp'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Noodhulp/Onderhoud van Patrouilles'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Noodhulp/Filter lijst unit id'), 'P999')

WebUI.click(findTestObject('Actpol_Scripts/Noodhulp/filter'))

WebUI.closeBrowser()

