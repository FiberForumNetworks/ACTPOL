import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default EDit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Algemeen tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal tab'))

WebUI.delay(1)

driver.switchTo().frame('ifrmviewdoc')

String total_rows = driver.findElements(By.xpath('//div[@id=\'POLINF002accordion-2\']//tr//td[1]//a[2]//img[1]')).size()

KeywordUtil.logInfo(total_rows)

driver.switchTo().defaultContent()

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Medewerker tab'))

driver.switchTo().frame('ifrmviewdoc')

String total_rows1 = driver.findElements(By.xpath('//div[@id=\'POLINF002accordion-9\']//tr//td[1]//a[2]//img[1]')).size()

KeywordUtil.logInfo(total_rows1)

driver.switchTo().defaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Medewerker new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verantwoordelijke'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Toegekend door'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Prio'), 2)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Onderwerp'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Datum van'), '07/02/2020')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Datum tot'), '07/02/2020')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Mediwaker save'))

WebUI.delay(2)

driver.switchTo().frame('ifrmviewdoc')

String total_rows2 = driver.findElements(By.xpath('//div[@id=\'POLINF002accordion-9\']//tr//td[1]//a[2]//img[1]')).size()

KeywordUtil.logInfo(total_rows2)

//println(total_rows2)
driver.switchTo().defaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Medewerker tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal tab'))

WebUI.delay(1)

driver.switchTo().frame('ifrmviewdoc')

String total_rows3 = driver.findElements(By.xpath('//div[@id=\'POLINF002accordion-2\']//tr//td[1]//a[2]//img[1]')).size()

KeywordUtil.logInfo(total_rows3)

KeywordUtil.logInfo(total_rows)

//println(total_rows3)
driver.switchTo().defaultContent()

WebUI.delay(1)

if (total_rows == total_rows3) {
    println('Faild')

    KeywordUtil.markError((((('  ' + total_rows) + ', ') + total_rows3) + '  ') + 'both are equal not added new record')
} else {
    println('Pass')

    KeywordUtil.markPassed((((('  ' + total_rows) + ', ') + total_rows3) + '  ') + 'both are not equal new record added grid')
}

