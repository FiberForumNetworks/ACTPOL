import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

File f=new File()
'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default mbes edit'))

KeywordUtil.logInfo('successfully Clicked Default MBES edit')

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/BEZITTINGEN_BAGAGE tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

Bedragbeforetext = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Bedrag en Valuta Omschrijving'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Bedrag en Valuta Omschrijving'), Textarea)

WebUI.delay(1)

Cardbeforetext = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Card Omschrijving'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Card Omschrijving'), Textarea)

WebUI.delay(1)

Toelichtingbeforetext = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Toelichting (preciosa)'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Toelichting (preciosa)'), Textarea)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

WebUI.delay(6)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-600/Default mbes edit'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/BEZITTINGEN_BAGAGE tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

Bedragaftertext = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Bedrag en Valuta Omschrijving'), 
    FailureHandling.OPTIONAL)

WebUI.delay(1)

Cardaftertext = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Card Omschrijving'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

Toelichtingaftertext = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/7 BEZITTINGEN_BAGAGE/Toelichting (preciosa)'), 
    FailureHandling.STOP_ON_FAILURE)

//String checktext = Textarea
KeywordUtil.logInfo(Bedragbeforetext)
KeywordUtil.logInfo(Cardbeforetext)
KeywordUtil.logInfo(Toelichtingbeforetext)

if (((Textarea.equals(true) == Bedragaftertext.equals(true)) == Cardaftertext.equals(true)) == Toelichtingaftertext.equals(
    true)) {
    KeywordUtil.logInfo(Bedragaftertext)

    KeywordUtil.logInfo(Cardaftertext)

    KeywordUtil.logInfo(Toelichtingaftertext)

    KeywordUtil.logInfo(Textarea)

    KeywordUtil.markPassed(((((Textarea + 'entered text and') + Bedragaftertext) + Cardaftertext) + Toelichtingaftertext) + 
        'both are matching')
} else {
    KeywordUtil.logInfo(Bedragaftertext)

    KeywordUtil.logInfo(Cardaftertext)

    KeywordUtil.logInfo(Toelichtingaftertext)

    KeywordUtil.logInfo(Textarea)

    KeywordUtil.markFailed(((((Textarea + 'entered text and') + Bedragaftertext) + Cardaftertext) + Toelichtingaftertext) + 
        'both are not matching')
}

