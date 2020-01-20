import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String home = System.getProperty('user.home')

String userDownloads = new File(home + '/Downloads/Aanrijden_MPO.pdf')

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Rapportage/Rapportage'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Actpol_Scripts/Menu navigation/Rapportage/Rapportages'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-554/Aanrijden M.P.O'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('JIRA/A Relese 6.6/ACTPOL-554/Datum van'), 120)

WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-554/Datum van'), '01012009')

WebUI.delay(1)

WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-554/Datum tot'), '01012019')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-554/submit'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-554/pdf download'))

WebUI.delay(18)

WebDriver driver = DriverFactory.getWebDriver()

driver.get(userDownloads)

