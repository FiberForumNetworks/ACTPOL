import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Journaal tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Journaal tab'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Journaal tab'), FailureHandling.STOP_ON_FAILURE)

for (int i = 1; i <= 4; i++) {
    WebUI.delay(4)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Journaal new btn'))

    WebUI.delay(2)

    String name = 'abcdefghijklmnopqrstuvwxyz'

    WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Onderwerp text'), randomname(
            name, 6))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Datum'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Default date'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Tot Datum'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Default date'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Bericht'), randomname(name, 
            150))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/Journaal save'))

    WebUI.delay(1)
}

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A JOURNAAL search/Datum'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A JOURNAAL search/Default date search box'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A JOURNAAL search/Tot Datum'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A JOURNAAL search/Default date search box'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A JOURNAAL search/filter'))

WebUI.delay(4)

String readtext = WebUI.verifyElementPresent(findTestObject('Actpol_Scripts/Info organisatie/A Journaal/A journaal tab/get grid record'), 
    1)

KeywordUtil.logInfo(readtext)

String verify_text='true'
// Entered matching Journaal records should be displayed
if(readtext==verify_text)
{
	KeywordUtil.logInfo('Entered matching Journal records is displayed')
	KeywordUtil.markPassed('Entered matching Journal records is displayed')
}
else
{
	KeywordUtil.logInfo('Entered matching Journal records is not displayed')
	KeywordUtil.markFailed('Entered matching Journal records is not displayed')
}
static String randomname(String name, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(name.charAt(rand.nextInt(name.length())))
    }
    
    return sb.toString()
}

