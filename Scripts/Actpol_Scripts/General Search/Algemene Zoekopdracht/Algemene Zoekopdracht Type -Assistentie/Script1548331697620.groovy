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

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'assist', false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Adres'), 'traaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Adres 1'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Klasse'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Klasses 2'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Klasse 1'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Status'), '12', false)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Poging'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Aangewezen aan'), '22', false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Titel'), 'Testing')

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Control'), '1', false)

WebUI.click(findTestObject('Actpol_Scripts/Imgsrc/Next Poc van'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), '11', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2018', false)

WebUI.click(findTestObject('Actpol_Scripts/Date/27th'))

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/zoeken'))

