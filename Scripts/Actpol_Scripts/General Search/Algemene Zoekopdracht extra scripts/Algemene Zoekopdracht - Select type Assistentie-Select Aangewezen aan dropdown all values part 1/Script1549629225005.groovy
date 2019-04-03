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

WebUI.takeScreenshot()

WebUI.comment('2nd drop down')

/* 2nd drop down*/
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('3rd drop down')

/* 3rd drop down */
WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('4th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('5th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '5', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('6th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '6', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('7th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('8th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '8', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('9th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '9', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('10th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '10', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('11th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '11', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('12th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '12', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('13th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '13', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('14th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '14', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('15th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '15', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('16th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '16', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('17th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '17', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('18th drop down')

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '18', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('19th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '19', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('20th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '20', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('21th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '21', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('22nd drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '22', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('23rd drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '23', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('24th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '24', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('25th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '25', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('26th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '26', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('27th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '27', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('28th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '28', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('29th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '29', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.comment('30th drop down')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Aangewezen aan'), 
    '30', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get text table Assistentie number'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2)

