import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Click Handhaving menu'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Handhaving'))

WebUI.delay(2)

'Click opv menu'
WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Handhaving/Doorsturen OPV'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

'Read before Proces Verbaal Nr  number '
Before = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-550/Before Proces Verbaal Nr text'))

KeywordLogger log = new KeywordLogger()

log.logInfo('Before Proces Verbaal Nr text is:' + Before)

println('Before Proces Verbaal Nr text is:' + Before)

WebUI.delay(2)

'Click OPV View icon'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-550/Doorsturen OPV view'))

WebUI.delay(6)

'Click Green approve btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-550/OPV approve btn'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.takeScreenshot()

'Read After Proces Verbaal Nr  number '
After = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-550/After Proces Verbaal Nr text'))

println('Before Proces Verbaal Nr text is:' + After)

log.logInfo('Before Proces Verbaal Nr text is:' + After)

WebUI.delay(1)

if (Before == After) {
    println('record should not send to Priem')
	log.logInfo('record should not send to Priem')
} else {
    println('record send to Priem successfully ')
	log.logInfo('record send to Priem successfully ')
}

