import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver

not_run: WiniumDriver driver = null

not_run: String appPath = 'C:\\Program Files (x86)\\IBM\\Client Access\\cwbunnav.exe'

not_run: DesktopOptions option = new DesktopOptions()

not_run: option.setApplicationPath(appPath)

not_run: option.setDebugConnectToRunningApp(false)

not_run: option.setLaunchDelay(2)

not_run: driver = new WiniumDriver(new URL('http://localhost:9999'), option)

not_run: Thread.sleep(2000)

not_run: WebElement window = driver.findElementByName('iSeries Navigator')

not_run: driver.findElement(By.name('My Connections'))

not_run: driver.findElement(By.name('10.20.10.7')).click()

not_run: Thread.sleep(5000)

not_run: driver.findElement(By.name('Signon to iSeries'))

not_run: driver.findElement(By.id('1321')).sendKeys('sasi2')

not_run: driver.findElement(By.id('1323')).sendKeys('sasi2')

not_run: driver.findElement(By.name('OK')).click()

not_run: Thread.sleep(5000)

not_run: driver.findElement(By.name('Databases')).click()

not_run: Actions action = new Actions(driver)

not_run: By locator = By.name('Databases')

not_run: WebElement rightClickElement = driver.findElement(locator)

//contextClick() method to do right click on the element
not_run: action.contextClick(rightClickElement).build().perform()

not_run: WebElement getCopyText1 = driver.findElement(By.id('Item 1'))

not_run: getCopyText1.click()

not_run: Thread.sleep(15000)

not_run: driver.findElement(By.name('S1031e70')).click()

not_run: By locator1 = By.name('S1031e70')

not_run: WebElement rightClickElement1 = driver.findElement(locator1)

not_run: action.contextClick(rightClickElement1).build().perform()

not_run: WebElement getCopyText2 = driver.findElement(By.id('Item 1'))

not_run: getCopyText2.click()

not_run: Thread.sleep(10000)

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

CustomKeywords.'dbdatabase.connectioncheck.database2'()

