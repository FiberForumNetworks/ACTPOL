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

    String Relatietab = WebUI.verifyElementPresent(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Relatie tab'), 1)

    KeywordUtil.logInfo('Relatietab')

    String Relatietabe_verify = 'true'

    if (Relatietabe_verify == Relatietab) {
        KeywordUtil.logInfo('Relatie tab is showing the list')

        WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Relatie tab'))

        WebUI.delay(1)

        String newbtn_Relatie = WebUI.verifyElementPresent(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Relatie addr new'), 
            1)

        KeywordUtil.logInfo('newbtn_Relatie')

        String newbtn_Relatie_verify = 'true'

        if (newbtn_Relatie == newbtn_Relatie_verify) {
            KeywordUtil.markPassed('Relatie new button is showing')

            WebUI.delay(2)

            WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Relatie addr new'))

            String Type_verantwoording_textxox = 'Type verantwoording'

            String Verantwoording_textxox = 'Verantwoording'

            String Relatie_dropdown = 'Type verantwoording'

            String Begin_Datum_datefeild = 'Begin Datum'

            String Eind_Datum_datefeaild = 'Eind Datum'

            String Betrouwbaarheid_dropdown = 'Betrouwbaarheid'

            String Autorisatie_Niveau_dropdown = 'Autorisatie Niveau'

            String Toelichting_textxox = 'Toelichting'

            String Type_verantwoording_textxox_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Type verantwoording'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Type_verantwoording_textxox_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Type_verantwoording_textxox_verifytext + ' is not showing the list')
            }
            
            String Verantwoording_textxox_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Verantwoording Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Verantwoording_textxox_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Verantwoording_textxox_verifytext + ' is not showing the list')
            }
            
            String Relatie_dropdown_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Relatie Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Relatie_dropdown_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Relatie_dropdown_verifytext + ' is not showing the list')
            }
            
            String Begin_Datum_datefeild_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Begin Datum Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Begin_Datum_datefeild_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Begin_Datum_datefeild_verifytext + ' is not showing the list')
            }
            
            String Eind_Datum_datefeaild_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Eind Datum Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Eind_Datum_datefeaild_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Eind_Datum_datefeaild_verifytext + ' is not showing the list')
            }
            
            String Betrouwbaarheid_dropdown_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Betrouwbaarheid Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Betrouwbaarheid_dropdown_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Betrouwbaarheid_dropdown_verifytext + ' is not showing the list')
            }
            
            String Autorisatie_Niveau_dropdown_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Autorisatie Niveau Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Autorisatie_Niveau_dropdown_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Autorisatie_Niveau_dropdown_verifytext + ' is not showing the list')
            }
            
            String Toelichting_textxox_textxox_verifytext = WebUI.getText(findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/Toelichting Relatie'))

            if (Type_verantwoording_textxox == Type_verantwoording_textxox_verifytext) {
                KeywordUtil.markPassed(Toelichting_textxox_textxox_verifytext + ' is showing the list')
            } else {
                KeywordUtil.markError(Toelichting_textxox_textxox_verifytext + ' is not showing the list')
            }
            
            KeywordUtil.logInfo('Relatie tab is showing all the feilds')

            WebDriver driver = DriverFactory.getWebDriver()

            driver.switchTo().frame('ifrmviewdoc')

            String documentverifytext = driver.findElement(By.xpath('//select[@name=\'RLTVWLVLG\']//option[contains(text(),\'Document\')]')).getText()

            KeywordUtil.logInfo(documentverifytext)

            String Documentexpectedtext = 'Document'

            if (documentverifytext == Documentexpectedtext) {
                KeywordUtil.markPassed(Documentexpectedtext)
            } else {
                KeywordUtil.markError(Documentexpectedtext + 'is not added in dropdownlist')
            }
            
            String Journaalmutaties = driver.findElement(By.xpath('//option[contains(text(),\'Journaalmutaties\')]')).getText()

            KeywordUtil.logInfo(Journaalmutaties)

            String Journaalmutatiesexpectedtex = 'Journaalmutaties'

            if (Journaalmutaties == Journaalmutatiesexpectedtex) {
                KeywordUtil.markPassed(Journaalmutatiesexpectedtex)
            } else {
                KeywordUtil.markError(Journaalmutatiesexpectedtex + 'is not added in dropdownlist')
            }
            
            String Label = driver.findElement(By.xpath('//option[contains(text(),\'Label\')]')).getText()

            KeywordUtil.logInfo(Label)

            String lableexpectedtex = 'Label'

            if (Label == lableexpectedtex) {
                KeywordUtil.markPassed(lableexpectedtex)
            } else {
                KeywordUtil.markError(lableexpectedtex + 'is not added in dropdownlist')
            }
            
            String Werkopdracht = driver.findElement(By.xpath('//select[@name=\'RLTVWLVLG\']//option[contains(text(),\'Werkopdracht\')]')).getText()

            KeywordUtil.logInfo(Werkopdracht)

            String Werkopdrachtexpectedtex = 'Werkopdracht'

            if (Werkopdracht == Werkopdrachtexpectedtex) {
                KeywordUtil.markPassed(Werkopdrachtexpectedtex)
            } else {
                KeywordUtil.markError(Werkopdrachtexpectedtex + 'is not added in dropdownlist')
            }
            
            KeywordUtil.logInfo('verifying dropdown values')

            KeywordUtil.logInfo('Entering Relatie data in the feilds')

            driver.switchTo().defaultContent()

            WebUI.delay(2)

            WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Type verantwoording_dropdown'), 
                'Document', false)

            WebUI.delay(2)

            WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Select default document'))

            WebUI.delay(2)

            WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Relatie_dropdown'), 1, 
                FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(2)

            WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Begin Datum_datefeild'), '01012016')

            WebUI.delay(2)

            WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Eind Datum_datefeild'), '01122020')

            WebUI.delay(2)

            WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Betrouwbaarheid_dropdown'), 
                '2 - Medium', false)

            WebUI.delay(2)

            WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Autorisatie Niveau_dropdown'), 
                1, FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(2)

            WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Toelichting_textarea'), randomn_name(
                    name, 250))

            WebUI.delay(2)

            WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Relatie save'))

            WebUI.delay(5)

            not_run: WebUI.comment('edit mode entering data')

            not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Relatie default edit'))

            not_run: WebUI.delay(2)

            not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Type verantwoording_dropdown'), 
                'Journaalmutaties', false)

            not_run: WebUI.delay(2)

            not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Defaukt jouneral'))

            not_run: WebUI.delay(2)

            not_run: WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Relatie_dropdown'), 
                2, FailureHandling.STOP_ON_FAILURE)

            not_run: WebUI.delay(2)

            not_run: WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Begin Datum_datefeild'), 
                '01012023')

            not_run: WebUI.delay(2)

            not_run: WebUI.setMaskedText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Eind Datum_datefeild'), 
                '01122034')

            not_run: WebUI.delay(2)

            not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Betrouwbaarheid_dropdown'), 
                '2 - Medium', false)

            not_run: WebUI.delay(2)

            not_run: WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Autorisatie Niveau_dropdown'), 
                3, FailureHandling.STOP_ON_FAILURE)

            not_run: WebUI.delay(2)

            not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Toelichting_textarea'), 
                Spl_char(namespl, 250))

            not_run: WebUI.delay(2)

            not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Relatie save'))

            not_run: WebUI.delay(2)

            WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/A Relatie/Entite save'))
			WebUI.delay(6)
			KeywordUtil.logInfo(test)
        } else {
            KeywordUtil.markFailed('Relatie new button is not showing')
        }
    } else {
        KeywordUtil.markFailedAndStop('Relatie tab is not showing in the list')
    }
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

