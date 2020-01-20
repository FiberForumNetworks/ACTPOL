import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(9)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebDriver driver=DriverFactory.getWebDriver()

driver.switchTo().frame('ifrmviewdoc')

'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

String Assistentiexpath = '(//img[@alt="Edit"])[1]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.delay(5)

driver.findElement(By.xpath("(//table[@class='mainlist']//tr[@class='lightgreen']//a[2]/img[@alt='Edit'])[1]")).click()

WebUI.delay(10)


driver.findElement(By.xpath("//*[@title='Activiteiten']")).click()

WebUI.delay(2)

driver.findElement(By.xpath("//*[@id='add-POL19001']")).click()

WebUI.delay(4)

//click Activiteit

driver.findElement(By.name("CLSDESCR")).sendKeys("aa")

///html/body/div[9]/ul/li[1]
WebUI.delay(2)

driver.findElement(By.xpath("/html/body/div[9]/ul/li[1]")).click()

//Begin datum
WebUI.delay(2)
driver.findElement(By.id("DRGBGTM")).click()
driver.findElement(By.id("DRGBGTM")).sendKeys("010101")
WebUI.delay(2)
driver.findElement(By.id("DRGENTM")).click()
driver.findElement(By.id("DRGENTM")).sendKeys("010102")
WebUI.delay(2)
driver.findElement(By.id("DRGBIJZ")).sendKeys("testing")
WebUI.delay(2)
driver.findElement(By.xpath("//*[@key='save']")).click()
	



