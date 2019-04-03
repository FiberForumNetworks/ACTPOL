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

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting BEKEURDE PERSOON\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '3', false)

WebUI.delay(3)

'Selecting test8'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Soort Procesverbaal'), '5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/PV Locatie'))

WebUI.delay(2)

'selecting kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk street'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/PV Locatie lb'))

WebUI.delay(1)

'Clicking new person'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Voertuig drop down'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Voertuig new person'))

WebUI.delay(1)

'selecting vechile 7547533'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Vechile Selecting'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Hoofdkleur'))

WebUI.delay(2)

'Selecting test\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Hoofdkleur lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/vechile save'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Voertuig v drop down'), '693', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekeurde persoon'), '\'2')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekeurde persoon lb'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Proces Verbaal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/b Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/b Strafbaar feit new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/b Strafbaar feit new select person'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/b close'))

WebUI.closeBrowser()

