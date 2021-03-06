import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

KeywordUtil.markPassed('PASS::Actpol web application login successfully')

KeywordLogger log = new KeywordLogger()

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), GlobalVariable.Generiekassistenite_Module)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(8)

'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

println(to)

WebUI.click(to)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

WebUI.delay(12)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

//checking existing Vreemdeling process
String Vreemdelingverify = WebUI.verifyElementVisible(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Vreemdeling verify'), 
    FailureHandling.OPTIONAL)

log.logInfo(Vreemdelingverify)

String verify2 = 'true'

if (Vreemdelingverify == verify2) {
    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-317/Vreemdeling verify'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Vreemdeling tab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Toegang'))

    WebUI.scrollToElement(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde toegang new'), 1)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde toegang new'))

    WebUI.delay(2)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde toegang type'), 
        'Oplegging van de plicht om zich binnen 72 uur bij u te melden', false)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde Toegang save'))



    KeywordUtil.markPassed('PASS::dropdown selected to oplegging van de plicht van 72 uren')

    WebUI.delay(5)

    String check = WebUI.verifyElementVisible(findTestObject('JIRA/A Relese 6.6/ACTPOL-317/ver verify text'))

    log.logInfo(check)
	
	String verify3 = 'true'

    if (check == verify3) {
        KeywordUtil.markPassed('PASS::oplegging van de plicht van 72 uren is visible')
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/ver save'))
    } else {
        KeywordUtil.markError('Faild::oplegging van de plicht van 72 uren is not visible')

        WebUI.takeScreenshot()
    }
} else {
    WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

    WebUI.delay(2)

    'Selecting Vreemdeling\r\n'
    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'VREEMDELING', false)

    WebUI.delay(3)

    WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), 40)

    'Luchthaven'
    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), 'Luchthaven', false)

    WebUI.delay(2)

    'laura'
    WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam'), 'laura', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam -lb'))

    WebUI.delay(1)

    WebUI.scrollToElement(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'), 5)

    not_run: WebUI.scrollToPosition(10, 7)

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Vreemdeling tab hide'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Toegang'))
	
	WebUI.scrollToElement(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde toegang new'), 1)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde toegang new'))

    WebUI.delay(2)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde toegang type'), 
        'Oplegging van de plicht om zich binnen 72 uur bij u te melden', false)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/Voorwaarde Toegang save'))

    
    KeywordUtil.markPassed('PASS::dropdown selected to oplegging van de plicht van 72 uren')
	WebUI.delay(5)
	
		String check = WebUI.verifyElementVisible(findTestObject('JIRA/A Relese 6.6/ACTPOL-317/ver verify text'))
	
		log.logInfo(check)
		
		String verify3 = 'true'
	
		if (check == verify3) {
			KeywordUtil.markPassed('PASS::oplegging van de plicht van 72 uren is visible')
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/JIRA/A Relese 6.6/ACTPOL-317/ver save'))
		} else {
			KeywordUtil.markError('Faild::oplegging van de plicht van 72 uren is not visible')
	
			WebUI.takeScreenshot()
		}
}

