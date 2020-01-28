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
import com.kms.katalon.core.util.KeywordUtil as key
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/info new btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verzoeker'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Afdeling'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Datum verzoek'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default date'))

WebUI.delay(1)

WebUI.setMaskedText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Tijd'), '02.02.02')

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Type verzoek'), 1)

WebUI.delay(1)

String name = 'abcdefghijklmnopqrstuvwxyz'

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Onderzoeknaam'), randomname(name, 7))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Zaakofficier'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Status'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Spoedverzoek ja'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verzochte informatie'), randomname(name, 150))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/info save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default EDit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Algemeen tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Objecten tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Objecten new'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Type'), 'Andere', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Omschrijving'), randomname(name, 150))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Bijzonderheden'), randomname(name, 150))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Objectn save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/info save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default EDit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Algemeen tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Medewerker tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Medewerker new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verantwoordelijke'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Toegekend door'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/lb'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Prio'), 2)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Onderwerp'), 'Test')

WebUI.delay(1)

WebUI.setMaskedText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Datum van'), '28012020')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Mediwaker save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/info save'))

WebUI.delay(5)

static String randomname(String name, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(name.charAt(rand.nextInt(name.length())))
    }
    
    return sb.toString()
}

