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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

'Login to the application'
WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

KeywordLogger log = new KeywordLogger()

'Mouse over to Generic tab'
WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

log.logInfo('Successfully logged')

WebUI.delay(4)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

WebUI.delay(2)

'Click MBES tab'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

log.logInfo('Clicking MBES18 tab ')

WebUI.delay(1)

WebUI.delay(9)

'Click new btn'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/mbes new'))

log.logInfo('Clicking MBES18 new button ')

WebUI.delay(6)

'Click new btn in Registratie'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie new'))

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 1'), 'KORPS POLITIE CURACAO', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 1'), 'OPENBARE MINISTERIE', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie van 2'), 'AMBULANCE', 
    false)

WebUI.delay(1)

'Select required dropdown fro the list'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/1 Registratie/Registratie Naar 2'), 'SKS', false)

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

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum aan_staandehouding Datum grensweigering'), 
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

WebUI.sendKeys(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum beeindiging rechtmatig verblijf'), 
    '02/09/2019')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/Datum beeindiging rechtmatig verblijf calendar icon'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), 'sep', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(2)

WebUI.scrollToPosition(10, 7)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/4 GEDRAG_MEDISCH/GEDRAG MEDISCH tab'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.comment('Checking jaa validation')

//ja
//WebUI.setText(findTestObject(null), '')
'checking ja radio button'
for (int i = 1; i <= 19; i++) {
    String AssistentiedynamicId = i

    String Assistentiexpath = ('//*[@id="MiddelenAUform"]/table/tbody/tr[' + AssistentiedynamicId) + ']/td[2]/input[1]'

    ////*[@id="MiddelenAUform"]/table/tbody/tr[1]/td[2]/input[2]
    println(Assistentiexpath)

    TestObject to = findTestObject('Actpol_Scripts/Opsporing/MBES18/test')

    to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

    'get text from the data'
    value1 = WebUI.getAttribute(to, 'value')

    println(value1)

    String value2 = 'J'

    if (value1 == value2) {
        WebUI.click(to /*if (i == 9) {
		 WebUI.click(to)
	 }*/ )
    } else {
        WebUI.setText(to, 'katalon testing')
    }
}

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.scrollToPosition(10, 7)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/4 GEDRAG_MEDISCH/GEDRAG MEDISCH tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN new'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Organisatie'), 'SKS', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Datum Incident'), '29/09/2019')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Bejzonderheden'), 'testing : Bejzonderheden')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Contactperson'), 'testing : Contactperson')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/Telefoonnummer'), '987512364')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN save'))

WebUI.delay(1)

WebUI.takeScreenshot()

log.logInfo('successfully saved data')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/5 INCIDENTEN/INCIDENTEN tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/OVERIGE GEGEVENS tab'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Uitzetting'), 'aa', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Uitzetting lb'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Datum vlucht'), '21/09/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Datum vlucht Calendar icon'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Tijdstip vlucht'), '010101')

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Arrival location'), 'Haven', 
    false)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Datum'), '21/09/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Datum calendar icon'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Claim vervoerder ja'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Claim vervoerder ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Removal orde ja'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Contact diplomatieke'), 'testing :: Contact diplomatieke vertegenwooediging ter verkrijging van een vervangend reisdocument')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Wanner'), '21/09/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Wanner calender'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Welke diplomatieke'), 'testing :: Welke diplomatieke vertegenwooedliging')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Reisdocument ja'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Soort'), 'REISDOCUMENT', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Nummer'), 'testing :: Nummer')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Geldig tot'), '21/09/2019')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Geldig tot Calendar icon'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/16th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/MBES18/6 Overige gegevens/Aanvullende identiteitsdocumenten'), 'testing :: Aanvullende identiteitsdocumenten')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBSC SAVE'))

