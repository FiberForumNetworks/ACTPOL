import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.time.TimeCategory as TimeCategory
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

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Infodesk new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Verzoeker click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Verzoeker click lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Afdeling click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Afdeling click lb'))

WebUI.delay(1)

use(TimeCategory, { 
        today = new Date()

        lastWeek = (today - 1.week)

        NextWeek = (today + 1.week)

        NextMonth = (today + 1.month)

        twodaysAgo = (today - 2.days)

        tommorow = (today + 1.days)
    })

WebDriver driver = DriverFactory.getWebDriver()

String Todayd = today.format('dd')

String Todaym = today.format('MM')

String Todayy = today.format('yyyy')

println('todayday -- ' + Todayd)

println('todaymonth -- ' + Todaym)

println('todayyear -- ' + Todayy)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Datum verzoek'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), Todayy, false)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/1st'))

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Tijd'), '010101')

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Type verzoek'), 1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Onderzoeknaam'), 'test katalon')

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Zaakofficier click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Zaakofficier click lb'))

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Status'), 1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Verzochte informatie'), 'test katalon')

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/default save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/default edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Algemeen tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Doc tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Doc new'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Selecteer Documentsjabloon'), 'MBES18_Algemeen', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/doc save'))

