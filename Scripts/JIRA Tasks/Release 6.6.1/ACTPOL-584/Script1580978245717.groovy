import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Label'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht/Assistentie'), 'Label', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Next Poc van calnder click'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 0)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2015', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Date/1st left'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Next Poc tot calnder click'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Monthyear/Leftmonth'), 1)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Leftyear'), '2020', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Date/1st left'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

String Label_text = WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get label name'))

KeywordUtil.logInfo(Label_text)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Label textbox'), Label_text)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

String Label_text_verify = WebUI.getText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Get label name'))

KeywordUtil.logInfo(Label_text_verify)

if(Label_text==Label_text_verify)
{
	KeywordUtil.markPassed("Lable text showing on the grid")
}
else
{
	KeywordUtil.markWarning("Lable text is not showing on the grid")
}