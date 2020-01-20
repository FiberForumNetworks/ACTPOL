import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(9)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

driver.switchTo().frame('ifrmviewdoc')

/*
 * 'Remember first set default assistentieid after run the script' String
 * AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module
 * 
 * String Assistentiexpath = '(//img[@alt="Edit"])[1]'
 * 
 * TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene
 * Zoekopdracht -test env/View Assistentie')
 * 
 * to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)
 */
WebUI.delay(5)

//WebUI.click(to)
driver.findElement(By.xpath('(//img[@alt=\'Edit\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.xpath('(//span[@key=\'registratie\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.xpath('(//span[@key=\'Personalia\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.name('PersoonC')).clear()

WebUI.delay(2)

driver.switchTo().defaultContent()

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

driver.switchTo().frame('ifrmviewdoc')

driver.findElement(By.xpath('(//span[@key=\'Personalia\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.xpath('(//span[@key=\'INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.id('MBESINBE')).clear()

WebUI.delay(2)

driver.findElement(By.id('MBESBDIN')).clear()

WebUI.delay(2)

driver.findElement(By.id('MBESBDRM')).clear()

driver.switchTo().defaultContent()

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

driver.switchTo().frame('ifrmviewdoc')

WebUI.delay(2)

driver.findElement(By.xpath('(//span[@key=\'INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.xpath('(//span[@key=\'OVERIGE_GEGEVENS\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.id('MBESCTDP')).clear()

WebUI.delay(2)

driver.findElement(By.xpath('(//span[@key=\'OVERIGE_GEGEVENS\'])[1]')).click()

WebUI.delay(2)

driver.findElement(By.xpath('(//input[@onclick=\'addUpdRecord()\'])[1]')).click()

WebUI.delay(2)

WebUI.closeBrowser()

