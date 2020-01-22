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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default mbes edit'))

KeywordUtil.logInfo('successfully Clicked Default MBES edit')

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN tab'), FailureHandling.OPTIONAL)

WebUI.delay(2)

String Verify = WebUI.verifyElementVisible(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default Incidenten edit'), FailureHandling.OPTIONAL)

KeywordUtil.logInfo(Verify)

String Verify2 = 'true'

if (Verify == Verify2) {
    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default Incidenten edit'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Bejzonderheden'), '/*-!@!@!@!@!#$^%$&%*&((&)()*_)_)+781613131zxzcbvcmbn,./alkjhfdsasqwqewrtetoiirpkp[[pkkgmengehhygpengheohgpeohgehbvlbde```````fefegeggegresvfrbrs2423432')

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN save'))

    WebUI.delay(1)

    KeywordUtil.logInfo('INCIDENTEN saved data')

    KeywordUtil.logInfo('Bijzonderheden in tab Incidenten and make this 350 characters is saved')

    KeywordUtil.markPassed('Bijzonderheden in tab Incidenten and make this 350 characters is saved')

    WebUI.closeBrowser()
} else {
    KeywordUtil.logInfo('INCIDENTEN data is not find')

    KeywordUtil.logInfo('Entering new INCIDENTEN data')

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN new'))

    WebUI.delay(1)

    WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Organisatie'), '1', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Datum Incident'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Datum Incident'), '30102019')

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Bejzonderheden'), 'testing : Bejzonderheden')

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Contactperson'), 'testing : Contactperson')

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Telefoonnummer'), '987512364')

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN save'))

    WebUI.delay(1)

    KeywordUtil.logInfo('successfully saved data')

    WebUI.delay(5)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default Incidenten edit'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Bejzonderheden'), 'testing sdadadddddddddddddddddddddddddsfdfdvfnvklnf kvs;vsn;nvdb d akkcbbabcbsb avs testing fcsbfvsvnsd ofocsbbvsvm testing kcmnsvndn db bvsknv1321wqw')

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN save'))

    WebUI.delay(1)

    KeywordUtil.logInfo('Bijzonderheden in tab Incidenten and make this 350 characters is saved')

    KeywordUtil.markPassed('Bijzonderheden in tab Incidenten and make this 350 characters is saved')

    WebUI.closeBrowser()
}

