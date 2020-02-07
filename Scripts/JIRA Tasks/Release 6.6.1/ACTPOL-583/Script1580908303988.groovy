import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

String number = '1234567890'

String name = 'abcdefghijklmnopqurstvuwxyz'

String namespl = '!@#$%^&*()_+?><'

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

String existing_data = WebUI.verifyElementPresent(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/entite user edit'), 
    1)

KeywordUtil.logInfo(existing_data)

String replaydata = 'true'

if (existing_data == replaydata) {
    KeywordUtil.logInfo('Data is showing on the Grid')

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/entite user edit'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

    WebUI.delay(3)

    'Selecting Adres\r\n'
    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), 'Adres', false)

    WebUI.delay(3)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adres click'))

    WebUI.delay(2)

    String test = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adres set text lb'))

    KeywordUtil.logInfo(test)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adres set text lb'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Adresnummer'), randomnumber(number, 5))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nadere aanduiding'), randomn_name(name, 250))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking addr'), randomn_name(name, 250))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entity - Adres'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/A Koppelen/Koppelen tab'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Koppelen/Koppelen new'))

    WebUI.delay(2)

    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Koppelen/Type Koppelen_dropdown'), 'Document', 
        false)

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Select default document'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Koppelen/Koppeling click'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Koppelen/Koppeling lb'))

    WebUI.delay(2)

    WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Begin Datum_datefeild'), '01012016')

    WebUI.delay(2)

    WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Eind Datum_datefeild'), '01122020')

    WebUI.delay(2)

    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Betrouwbaarheid_dropdown'), '2 - Medium', 
        false)

    WebUI.delay(2)

    WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Autorisatie Niveau_dropdown'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Toelichting_textarea'), randomn_name(name, 
            250))

    WebUI.delay(2)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Koppelen/Koppeling save'))

    WebUI.delay(5)
} else {
    KeywordUtil.logInfo('Data is not showing on the Grid')
}

static String randomnumber(String number, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(number.charAt(rand.nextInt(number.length())))
    }
    
    return sb.toString()
}

static String randomn_name(String name, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(name.charAt(rand.nextInt(name.length())))
    }
    
    return sb.toString()
}

static String Spl_char(String namespl, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(namespl.charAt(rand.nextInt(namespl.length())))
    }
    
    return sb.toString()
}

