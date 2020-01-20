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

'Login to the application'
WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

KeywordLogger log = new KeywordLogger()

WebUI.delay(6)

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

log.logInfo('Successfully logged')

WebUI.delay(4)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'), FailureHandling.OPTIONAL)

log.logInfo('Clicking MBES18 tab ')

WebUI.delay(1)

WebUI.delay(8)

'Click new btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/mbes new'))

log.logInfo('Clicking MBES18 new button ')

WebUI.delay(9)

'Click new btn in Registratie'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie new'))

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 1'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 2'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 2'), '4', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Behandeld door'), 'Katalon testing :: Behandeld door')

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Telefoon'), '123456789')

WebUI.delay(1)

'Enter the text from the feild'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/E-Mail'), 'test@gmail.com')

WebUI.delay(1)

'Enter the date'
not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum'), '23/08/2019')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Datum calendar icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie save'))

WebUI.delay(1)

'Click on Registratie tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/registratie tab'))

WebUI.delay(1)

'Click on Personalia tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.delay(2)

'Click Save tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

WebUI.comment('Chcking validation')

WebUI.delay(1)

'Error message'
Achternaam = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam error messgae'))

//KeywordLogger log = new KeywordLogger()
achternaamverify = 'Dit is een vereiste veld'

log.logInfo(Achternaam)

if (Achternaam == achternaamverify) {
    log.logInfo('success and error message in Achternaam')
} else {
    log.logInfo('not showing error message in Achternaam')

    WebUI.takeScreenshot()
}

WebUI.delay(2)

Garantsteller = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller error message'))

Garantstellerverify = 'Dit is een vereiste veld'

log.logInfo(Garantsteller)

if (Garantsteller == Garantstellerverify) {
    log.logInfo('success and error message in Garantsteller/referent')
} else {
    log.logInfo('not showing error message in Garantsteller/referent')

    WebUI.takeScreenshot()
}

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia Achternaam new'))

not_run: WebUI.delay(4)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Select default persoon'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/new persoon close btn'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam text'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Achternaam text lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller new'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Garantsteller new lb'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/2 Personalia/Personalia tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS tab'))

WebUI.delay(2)

WebUI.comment('INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS  error messages')

WebUI.delay(1)

Inbewaringstellingsinds = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Inbewaringstelling sinds error message'), 
    FailureHandling.OPTIONAL)

//log.logInfo(Garantsteller)
if (Inbewaringstellingsinds == Garantstellerverify) {
    log.logInfo('success and error message in Inbewaringstelling sinds')
} else {
    log.logInfo('not showing error message in Inbewaringstelling sinds')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

OpgrondvanartikelWTUBES = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Op grond van artikel WTU_BES error message'), 
    FailureHandling.OPTIONAL)

//log.logInfo(OpgrondvanartikelWTUBES)
if (OpgrondvanartikelWTUBES == Garantstellerverify) {
    log.logInfo('success and error message in Op grond van artikel WTU-BES')
} else {
    log.logInfo('not showing error message in Op grond van artikel WTU-BES')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

staandehoudingDatumgrensweigering = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum aan_staandehouding Datum grensweigering error message'), 
    FailureHandling.OPTIONAL)

//log.logInfo(staandehoudingDatumgrensweigering)
if (staandehoudingDatumgrensweigering == Garantstellerverify) {
    log.logInfo('success and error message in Datum aan-/staandehouding Datum grensweigering')
} else {
    log.logInfo('not showing error message in Datum aan-/staandehouding Datum grensweigering')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Reden aan_staandehouding Reden grensweigering error message'), 
    2)

WebUI.delay(1)

Redenaanstaandehouding = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Reden aan_staandehouding Reden grensweigering error message'), 
    FailureHandling.OPTIONAL)

//log.logInfo(Redenaanstaandehouding)
if (Redenaanstaandehouding == Garantstellerverify) {
    log.logInfo('success and error message in Reden aan-/staandehouding Reden grensweigering')
} else {
    log.logInfo('not showing error message in Reden aan-/staandehouding Reden grensweigering')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

Inbewaringstellingslocatie = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Inbewaringstellings-locatie error message'), 
    FailureHandling.OPTIONAL)

//log.logInfo(Inbewaringstellingslocatie)
if (Inbewaringstellingslocatie == Garantstellerverify) {
    log.logInfo('success and error message in Inbewaringstellings locatie')
} else {
    log.logInfo('not showing error message in Inbewaringstellings locatie')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

INDCN = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Bekend bij IND-CN in het kader van toelating_bescherming error messaage'), 
    FailureHandling.OPTIONAL)

//log.logInfo(INDCN)
if (INDCN == Garantstellerverify) {
    log.logInfo('success and error message in Bekend bij IND-CN in het kader van toelating/bescherming')
} else {
    log.logInfo('not showing error message in Bekend bij IND-CN in het kader van toelating/bescherming')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

Datumbeeindigingrechtmatigverblijf = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum beeindiging rechtmatig verblijf error message'), 
    FailureHandling.OPTIONAL)

//log.logInfo(Datumbeeindigingrechtmatigverblijf)
if (Datumbeeindigingrechtmatigverblijf == Garantstellerverify) {
    log.logInfo('success and error message in Datum beeindiging rechtmatig verblijf')
} else {
    log.logInfo('not showing error message in Datum beeindiging rechtmatig verblijf')

    WebUI.takeScreenshot()
}

WebUI.delay(1)

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.comment('INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS tab data filling')

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Inbewaringstelling sinds'), 
    '02/09/2019')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Inbewaringstelling sinds calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Plaatsing sinds'), 
    '01012019')

WebUI.comment('Checking dropdown')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Op grond van artikel WTU-BES'), 
    'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Op grond van artikel WTU-BES lb'))

WebUI.comment('checking auto search')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-561/Op grond van artikel WTU-BES Auto search click'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-561/Op grond van artikel WTU-BES Auto search click lb'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum aan_staandehouding Datum grensweigering'), 
    '02/09/2019')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/staandehouding Datum grensweigering calender icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Reden aan_staandehouding Reden grensweigering'), 
    'testing :: Reden aan_staandehouding Reden grensweigering')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Inbewaringstellings-locatie'), 
    'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Inbewaringstellings-locatie lb'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Naam advocaat'), 
    'testing :: Naam advocaat')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/advocaat telefoonnummer'), 
    '985213647')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Naam ambtenaar KPCN _KmarCarib'), 
    'testing :: Naam ambtenaar KPCN /KmarCarib')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Bekend bij IND-CN in het kader van'), 
    'testing :: Bekend bij IND-CN in het kader van toelating/bescherming')

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum beeindiging rechtmatig verblijf'), 
    '02/09/2019')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum beeindiging rechtmatig verblijf calendar icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

