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

'Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'persoon', 
    false)

WebUI.comment('Drop down selection 1 "BEKENDE/AANGEHOUDEN VERDACHTE"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'BEKENDE/AANGEHOUDEN VERDACHTE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 2 "AANGEVER"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'AANGEVER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 3 "BEKEURDE PERSOON"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'BEKEURDE PERSOON\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 5 "BETROKKENE"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'BETROKKENE\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 7 "GETUIGE"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'GETUIGE\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 10 "KENNISGEVER"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'KENNISGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '10', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 11 "MENS IN NOOD"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'MENS IN NOOD\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '11', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 12 "NIET BEKEND"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'NIET BEKEND\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '12', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 15 "SLACHTOFFER"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'SLACHTOFFER\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '15', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 16 "VERDACHTE SIGNALEMENTEN"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'VERDACHTE SIGNALEMENTEN\r\n\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '16', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 17 "VERMIST PERSOON"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'VERMIST PERSOON\r\n\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '17', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 18 "VERZOEKER"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'VERZOEKER\r\n\r\n\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '18', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 25 "BERISPTE PERSOON"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'BERISPTE PERSOON\r\n\r\n\r\n\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '25', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 26 "ILLEGAAL PERSOON"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'ILLEGAAL PERSOON\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '26', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 50 "GEVAARLIJKE HONDEN"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'GEVAARLIJKE HONDEN\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '50', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 51 "EIGEN WAARNEMING"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'EIGEN WAARNEMING\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '51', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 52 "ONBEKEND"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'ONBEKEND\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '52', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 57 "VREEMDELING"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'VREEMDELING\r\n\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '57', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

WebUI.comment('Drop down selection 58 "BETROKKEN VAARTUIG"')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Achternaam'), 'a')

WebUI.delay(1)

'BETROKKEN VAARTUIG\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Rol Proces Type'), 
    '58', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get date from Geboorte Datum'), 
    FailureHandling.OPTIONAL)

