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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as vali

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

String name = 'abcdefghijklmnopqrstuvwxyz'

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.doubleClick(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user 4'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

String checkverifytrue = WebUI.verifyElementPresent(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/VREEMDELING VERIFY'), 2, 
    FailureHandling.OPTIONAL)

vali.logInfo(checkverifytrue)

String checkverifyvalue = 'true'

if (checkverifytrue == checkverifyvalue) {
    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/VREEMDELING VERIFY'))

    WebUI.delay(2)

    String Achternaam = WebUI.getAttribute(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Achternaam'), 'value', FailureHandling.STOP_ON_FAILURE)

    vali.logInfo(Achternaam)

    String Vreemdelingnr = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Vreemdeling nr'))

    vali.logInfo(Vreemdelingnr)

    WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'), FailureHandling.OPTIONAL)

    WebUI.delay(5)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Default edit'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Registratie ab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Personalia tab'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Achternaam'), Achternaam)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Achternaam lb'))

    String Vreemdelingnrget = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Vreemdeling nr'))

    if (Vreemdelingnr == Vreemdelingnrget) {
        vali.logInfo('Both vreemdeling nummer are same')

        WebUI.closeBrowser()
    }
} else {
    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

    WebUI.delay(2)

    WebUI.comment('VREEMDELING')

    'VREEMDELING'
    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'VREEMDELING', false)

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Achternaam new'))

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Zoek Criteria'), 'Keno code', false)

    WebUI.setText(findTestObject('Actpol_Scripts/Iframe test env/Keno code'), 'a')

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Filter'))

    WebUI.delay(4)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/New persoon'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Person Achternaam'), randomname(name, 7))

    WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Person Voornaam'), randomname(name, 7))

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Geslacht man'))

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Geboorte Datum click'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Date 1st'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Geboorte Land'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Geboorte Land lb'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Nationaliteit'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Nationaliteit lb'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Adres tab'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Adres tab'))

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Inwoner nee'))

    WebUI.selectOptionByIndex(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Adres relatie'), 1)

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Adres click'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Geboorte Land lb'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Internationaal adres'), randomname(name, 9))

    WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Adresnummer'), '12')

    WebUI.delay(1)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Land'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Geboorte Land lb'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/new person save'))

    WebUI.delay(7)

    String Voornaamget = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Voornaam get'))

    vali.logInfo(Voornaamget)

    String Vreemdelingnr = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Vreemdeling nr'))

    vali.logInfo(Vreemdelingnr)

    WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'), FailureHandling.OPTIONAL)

    WebUI.delay(5)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Default edit'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Registratie ab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Personalia tab'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Achternaam'), Voornaamget)

    WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Achternaam lb'))

    String Vreemdelingnrget = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-592/Vreemdeling nr'))

    if (Vreemdelingnr == Vreemdelingnrget) {
        vali.logInfo('Both vreemdeling nummer are same')

        WebUI.closeBrowser()
    }
}

static String randomname(String name, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(name.charAt(rand.nextInt(name.length())))
    }
    
    return sb.toString()
}

