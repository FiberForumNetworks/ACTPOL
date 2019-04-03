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

'goederen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'goederen', 
    false)

WebUI.comment('1st dropdown "GEDEPONEERD"_Value-   1_')

WebUI.delay(1)

'GEDEPONEERD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '1_', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('2nd dropdown "IN BESLAGGENOMEN"_Value-   2_9')

WebUI.delay(2)

'IN BESLAGGENOMEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '2_9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('3rd dropdown "TERUGGEVONDEN"_Value-   3_5')

WebUI.delay(2)

'TERUGGEVONDEN\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '3_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('4th dropdown "VERBEURD VERKLAARD"_Value-   4_9')

WebUI.delay(2)

'VERBEURD VERKLAARD\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '4_9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('5th dropdown "VERBRAND"_Value-   5_5')

WebUI.delay(2)

'VERBRAND\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '5_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('6th dropdown "VERBRUIKT"_Value-   6_9')

WebUI.delay(2)

'VERBRUIKT\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '6_9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('7th dropdown "VERDUISTERD"_Value-   7_5')

WebUI.delay(2)

'VERDUISTERD\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '7_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('8th dropdown "VERLOREN"_Value-   8_5')

WebUI.delay(2)

'VERLOREN\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '8_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('9th dropdown "VERNIELD"_Value-   9_5')

WebUI.delay(2)

'VERNIELD\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '9_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('10th dropdown "VERVALST"_Value-   10_9')

WebUI.delay(2)

'VERVALS\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '10_9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('11th dropdown "WEGGENOMEN"_Value-   11_9')

WebUI.delay(2)

'WEGGENOMEN\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '11_9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('12th dropdown "ONBEKEND"_Value-   12_9')

WebUI.delay(2)

'ONBEKEND\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '12_9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('13th dropdown "TERUGGEGEVEN"_Value-   13_5')

WebUI.delay(2)

'TERUGGEGEVEN\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '13_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('14th dropdown "DDDDDDDDDDDDD"_Value-   14_5')

WebUI.delay(2)

'DDDDDDDDDDDDD\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '14_5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

WebUI.comment('15th dropdown "test"_Value-   15_')

WebUI.delay(2)

'test\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Goeden status'), 
    '15_', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(3)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text Serienummer is displayed'), 
    FailureHandling.OPTIONAL)

