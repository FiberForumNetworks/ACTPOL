import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('test/click preview'))

/*change the span text ://*[@id="slides-container"]/a/div/div/span[text()="AAANDRES"]
	     * 
	     */
WebUI.waitForElementVisible(findTestObject('test/moord test'), 190)

WebUI.waitForElementClickable(findTestObject('test/moord test'), 1)

WebUI.click(findTestObject('test/moord test'))

