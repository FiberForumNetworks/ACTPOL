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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Default edit'))

KeywordUtil.logInfo('Entiteiten lable check')

WebUI.comment('Entiteiten lable check')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(3)

'Selecting Adres\r\n'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), 'Adres', false)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Entity - Adres tab'))

WebUI.delay(1)

String getlabletext = WebUI.getText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label tab'))

String lableactualtext = 'Label'

if (getlabletext == lableactualtext) {
    KeywordUtil.markPassed('Lable Displayed Successfully')

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label tab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

    KeywordUtil.markPassed('Lable Successfully saved')

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb 1'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

    KeywordUtil.markPassed('Lable Successfully saved')

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb 2'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

    KeywordUtil.markPassed('Lable Successfully saved')

    KeywordUtil.markPassed('Lable Successfully saved multiple times')

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/entit adres close'))

    WebUI.delay(4)
} else {
    KeywordUtil.markError('Lable not Displayed in the list of tabs')
}

KeywordUtil.logInfo('Moved to Document tab')

WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Document tab'))

WebUI.delay(4)

String Elementisverify = WebUI.verifyElementPresent(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Verifyexisting document is present'), 
    1)

String actualtextelement = 'true'

if (Elementisverify == actualtextelement) {
    KeywordUtil.logInfo('Existing documents showing on the grid')

    WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Default edit document tab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Termijn Bewaking tab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Investigation Documents'))

    WebUI.delay(1)

    String getlabletextdoc = WebUI.getText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label tab'))

    String lableactualtextdoc = 'Label'

    if (getlabletextdoc == lableactualtextdoc) {
        KeywordUtil.markPassed('Lable Displayed Successfully')

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label tab'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Investigation Documents'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb'))

        WebUI.delay(1)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

        KeywordUtil.markPassed('Lable Successfully saved')

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb 1'))

        WebUI.delay(1)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

        KeywordUtil.markPassed('Lable Successfully saved')

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb 2'))

        WebUI.delay(1)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

        KeywordUtil.markPassed('Lable Successfully saved')

        KeywordUtil.markPassed('Lable Successfully saved multiple times')

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Close document tab'))

        WebUI.delay(2)
    } else {
        KeywordUtil.markError('Lable is not Displayed')
    }
} else {
    KeywordUtil.logInfo('Not showing documents on grid')

    KeywordUtil.markError('Not showing documents on grid')
}

KeywordUtil.logInfo('Moved to Activiteiten tab')

WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Activiteiten tab'))

WebUI.delay(2)

String existing_Activiteitendata = WebUI.verifyElementPresent(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Default edit document tab'), 
    1)

String Actualexisting_Activiteitendata = 'true'

if (existing_Activiteitendata == Actualexisting_Activiteitendata) {
    KeywordUtil.logInfo('Data displaying onActiviteiten grid')

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/JIRA/Aa Release 6.6.1/ACTPOL-581/Werkopdrachten tab'))

    WebUI.delay(5)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Default edit document tab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Journaal tab'))

    WebUI.delay(2)

    String getlabletextact = WebUI.getText(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label tab'))

    String lableactualtextact = 'Label'

    if (getlabletextact == lableactualtextact) {
        KeywordUtil.markPassed('Lable Displayed Successfully')

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label tab'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb'))

        WebUI.delay(1)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

        KeywordUtil.markPassed('Lable Successfully saved')

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb 1'))

        WebUI.delay(1)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

        KeywordUtil.markPassed('Lable Successfully saved')

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable new btn'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Label click'))

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/lb 2'))

        WebUI.delay(1)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Lable save btn'))

        KeywordUtil.markPassed('Lable Successfully saved')

        KeywordUtil.markPassed('Lable Successfully saved multiple times')

        WebUI.delay(2)

        WebUI.click(findTestObject('JIRA/Aa Release 6.6.1/ACTPOL-581/Close act btn'))

        WebUI.delay(2)
    } else {
        KeywordUtil.markError('Lable is not Displayed')
    }
} else {
    KeywordUtil.logInfo('Data not displaying on Activiteiten grid')
}

