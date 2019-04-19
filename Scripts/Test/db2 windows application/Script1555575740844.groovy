import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver

WiniumDriver driver = null

String appPath = 'C:\\Program Files (x86)\\IBM\\Client Access\\cwbunnav.exe'

DesktopOptions option = new DesktopOptions()

option.setApplicationPath(appPath)

option.setDebugConnectToRunningApp(false)

option.setLaunchDelay(2)

driver = new WiniumDriver(new URL('http://localhost:9999'), option)

Thread.sleep(2000)

WebElement window = driver.findElementByName('iSeries Navigator')

driver.findElement(By.name('My Connections'))

driver.findElement(By.name('10.20.10.7')).click()

Thread.sleep(5000)

driver.findElement(By.name('Signon to iSeries'))

driver.findElement(By.id('1321')).sendKeys('sasi2')

driver.findElement(By.id('1323')).sendKeys('sasi2')

driver.findElement(By.name('OK')).click()

Thread.sleep(5000)

driver.findElement(By.name('Databases')).click()

Actions action = new Actions(driver)

By locator = By.name('Databases')

WebElement rightClickElement = driver.findElement(locator)

//contextClick() method to do right click on the element
action.contextClick(rightClickElement).build().perform()

WebElement getCopyText1 = driver.findElement(By.id('Item 1'))

getCopyText1.click()

Thread.sleep(15000)

driver.findElement(By.name('S1031e70')).click()

By locator1 = By.name('S1031e70')

WebElement rightClickElement1 = driver.findElement(locator1)

action.contextClick(rightClickElement1).build().perform()

WebElement getCopyText2 = driver.findElement(By.id('Item 1'))

getCopyText2.click()

Thread.sleep(10000)


driver.findElement(By.name('S1031e70')).click()

By locator3 = By.name('S1031e70')

WebElement rightClickElement3 = driver.findElement(locator3)

action.contextClick(rightClickElement3).build().perform()

WebElement getCopyText3 = driver.findElement(By.name('Run SQL Scripts...'))

getCopyText3.click()

Thread.sleep(10000)





not_run: driver.findElement(By.id('59664')).click()



//Vertical Scroll Bar
not_run: Thread.sleep(5000)

not_run: driver.findElement(By.name('Schemas')).click()

not_run: Thread.sleep(8000)

not_run: driver.findElement(By.name('KCDEVDTA')).click()

not_run: By locator13 = By.name('KCDEVDTA')

not_run: WebElement rightClickElementa = driver.findElement(locator13)

not_run: action.contextClick(rightClickElementa).build().perform()

not_run: WebElement getCopyTextd = driver.findElement(By.id('Item 1'))

not_run: getCopyTextd.click()

not_run: Thread.sleep(8000)

not_run: driver.findElement(By.name('Procedures')).click()

not_run: WebElement element = driver.findElement(By.name('Procedures'))

not_run: action.doubleClick(element).perform()

not_run: Thread.sleep(26000)

not_run: driver.findElement(By.name('ACTPOLGETVLGNR ( CHAR(), CHAR(), DECIMAL() ) ')).click()

not_run: Thread.sleep(5000)

not_run: driver.close()

