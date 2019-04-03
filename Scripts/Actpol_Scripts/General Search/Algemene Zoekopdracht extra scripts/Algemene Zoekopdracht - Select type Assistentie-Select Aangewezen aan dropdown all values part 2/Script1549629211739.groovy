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

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '30', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('31th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '31', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('32 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '32', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('33 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '33', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('34 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '34', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('35 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '35', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('36 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '36', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('37 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '37', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('38 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '38', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('39 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '39', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('40 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '40', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('41 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '41', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('42 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '42', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('43 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '43', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('44 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '44', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('45 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '45', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('46 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '46', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('47 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '47', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('48 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '48', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('49 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '49', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('50 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '50', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('51 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '51', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('52 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '52', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('53 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '53', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('54 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '54', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('55 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '55', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('56 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '56', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('57 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '57', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('68 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '68', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('59 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '59', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('60 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '60', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('61 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '61', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('62 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '62', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('63 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '63', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('64 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '64', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('65 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '65', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('66 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '66', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('67 drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '67', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

