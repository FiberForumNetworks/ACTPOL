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

WebUI.delay(2)

'Medewerker'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'officer', 
    false)

WebUI.comment('Select 1st "BEKENDE/AANGEHOUDEN VERDACHTE"')

WebUI.delay(1)

'BEKENDE/AANGEHOUDEN VERDACHTE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 2nd "AANGEVER"')

WebUI.delay(1)

'AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 3rd "BEKEURDE PERSOON"')

WebUI.delay(1)

'BEKEURDE PERSOON\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 5th "BETROKKENE"')

WebUI.delay(1)

'BETROKKENE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 7th "GETUIGE"')

WebUI.delay(1)

'GETUIGE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 10th "KENNISGEVER"')

WebUI.delay(1)

'KENNISGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '10', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 11th "MENS IN NOOD"')

WebUI.delay(1)

'MENS IN NOOD\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '11', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 12th "NIET BEKEND"')

WebUI.delay(1)

'NIET BEKEND\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '12', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 15th "SLACHTOFFER"')

WebUI.delay(1)

'SLACHTOFFER\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '15', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 16th "VERDACHTE SIGNALEMENTEN"')

WebUI.delay(1)

'VERDACHTE SIGNALEMENTEN\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '16', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 17th "VERMIST PERSOON"')

WebUI.delay(1)

'VERMIST PERSOON\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '17', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 18th "VERZOEKER"')

WebUI.delay(1)

'VERZOEKER\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '18', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 25th "BERISPTE PERSOON"')

WebUI.delay(1)

'BERISPTE PERSOON\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '25', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 26th "ILLEGAAL PERSOON"')

WebUI.delay(1)

'ILLEGAAL PERSOON\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '26', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 50th "GEVAARLIJKE HONDEN"')

WebUI.delay(1)

'GEVAARLIJKE HONDEN\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '50', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 51st "EIGEN WAARNEMING"')

WebUI.delay(1)

'EIGEN WAARNEMING\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '51', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 52nd "ONBEKEND"')

WebUI.delay(1)

'ONBEKEND\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '52', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 57th "VREEMDELING"')

WebUI.delay(1)

'VREEMDELING\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '57', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

WebUI.comment('Select 58th "BETROKKEN VAARTUIG"')

WebUI.delay(1)

'BETROKKEN VAARTUIG\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medewaker rol process type'), 
    '58', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Medweker display range'), FailureHandling.OPTIONAL)

