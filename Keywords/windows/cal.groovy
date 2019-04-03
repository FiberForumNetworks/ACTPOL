import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL

WiniumDriver driver = null
String appPath = "C:/windows/system32/calc.exe"
DesktopOptions option = new DesktopOptions()
option.setApplicationPath(appPath)
option.setDebugConnectToRunningApp(false)
option.setLaunchDelay(2)
driver = new WiniumDriver(new URL("http://localhost:9999"),option)
Thread.sleep(1000)
WebElement window = driver.findElementByClassName("CalcFrame")
WebElement menuItem = window.findElement(By.id("MenuBar")).findElement(By.name("View"))
menuItem.click()
driver.findElementByName("Scientific").click()
window.findElement(By.id("MenuBar")).findElement(By.name("View")).click()
driver.findElementByName("History").click()
window.findElement(By.id("MenuBar")).findElement(By.name("View")).click()
driver.findElementByName("History").click()
window.findElement(By.id("MenuBar")).findElement(By.name("View")).click()
driver.findElementByName("Standard").click()
driver.findElementByName("4").click()
driver.findElementByName("Add").click()
driver.findElementByName("5").click()
driver.findElementByName("Equals").click()
driver.close()