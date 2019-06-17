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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Handhaving'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Doorsturen OPV'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Doorsturen OPV edit user'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Proces Verbaal'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Handhaving/OPV/Goederen new'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Goed artikel new'))

WebUI.delay(3)

WebUI.comment('Firest create new')

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Nieuw Goederen'))

WebUI.delay(2)

'change on run time'
WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/Goederen Goed artikel'), 'SLOOPAVAL')

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Goederen Goed artikel lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/Merk'), '9874')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/Goederen save'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/512 checkbox ignore click'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot()

