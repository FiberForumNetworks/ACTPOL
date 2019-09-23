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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

'Creating New Incident\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie New'))

WebUI.delay(5)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bron'), 'k')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Born lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Telefoon nummer'), '9999999999', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel'), 'Testing test')

'Select drop down from the list :: COMERCIELE INSTELLING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Lokatie type'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres'))

WebUI.delay(2)

'ANDRES BELLO WEG'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres lb'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/ter hoogte van'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Nadere Aanduiding'), 'Testing')

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekende plaats'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bekende plaats Lb'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Lb'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Relationeel Geweld'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Poging'))

'Select ZELF CONSTATERING\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding Prioriteit'), '3', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch ja'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Contact verzoek ja'), FailureHandling.OPTIONAL)

WebUI.delay(1)

'Click on Aangewezen aan auto search titles'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangewezen aan'))

not_run: WebUI.delay(2)

'Select required dropdown'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangewezen aan lb'))

WebUI.delay(1)

'Select ST Maarten\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Eiland'), 'SXM', false)

WebUI.scrollToPosition(29, 7)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

WebUI.delay(1)

'Select required dropdown\r\n'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol-Proces'), 'AANGEVER', false)

'Clicking new person\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Resultaat Personen bestand person selection'))

WebUI.scrollToPosition(0, 21)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Save melding'))

WebUI.delay(8)

WebUI.takeScreenshot()

WebUI.delay(3)

'Click Melding tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Melding TAB'))

WebUI.delay(2)

'Get text from the feild:: Assistentie number'
Assistentienumber = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Assistentie number'))

WebUI.delay(1)

'Get text from the feild:: Incident Adres'
IncidentAdres = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Incident Adres'))

WebUI.delay(1)

'Get text from the feild:: Aangewezen aan'
Aangewezenaan = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Aangewezen aan'))

WebUI.delay(1)

'Get text from the feild:: Incident'
Incident = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Incident'))

WebUI.delay(1)

'Get text from the feild:: Datum Melding'
DatumMelding = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Datum Melding'))

WebUI.delay(1)

'Get text from the feild:: Tijd Melding'
TijdMelding = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Datum Melding'))

KeywordLogger log = new KeywordLogger()

log.logInfo('Assistentie number is : ' + Assistentienumber)

log.logInfo('Incident Adres is : ' + IncidentAdres)

log.logInfo('Aangewezen aan is : ' + Aangewezenaan)

log.logInfo('Incident is: ' + Incident)

log.logInfo('Datum Melding is : ' + DatumMelding)

log.logInfo('Tijd Melding is : ' + TijdMelding)

test = WebUI.concatenate('\n', 'Assistentie number is : ' + Assistentienumber, '\n', 'Incident Adres is : ' + IncidentAdres, 
    '\n', 'Incident is: ' + Incident, '\n', 'Datum Melding is : ' + DatumMelding, '\n', 'Tijd Melding is : ' + TijdMelding)

//println(test)
log.logInfo(test)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Melding'))

WebUI.delay(2)

'Melding view select'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/medlding view default first selected'))

WebUI.delay(2)

Omschrijving = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Omschrijving'))

log.logInfo(Omschrijving)

WebUI.comment('intake mode')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron'), 't')

WebUI.delay(2)

'Default first one is selected'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4754')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Latitude'), 'GG', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/ter hoogte van'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Nadere aanduiding'), 'Testing')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats lb'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Mensenhandel Mensensmokkel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

WebUI.delay(1)

'Select based on environment'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '3', false)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Achternaam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Resultaat Personen bestand'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Mutatie'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Intake Save'))

WebUI.delay(5)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Actieve Assistentie'))

WebUI.delay(2)

'Get text from the feild:: Incident number'
Incidentnumber = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Incident number'))

WebUI.delay(1)

'Get text from the feild:: Adres van incident.'
avi = WebUI.getAttribute(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Adres van incident'), 'value')

WebUI.delay(1)

'Get text from the feild::Adres # van incident'
avi1 = WebUI.getAttribute(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Adres van Incident 1'), 'value')

WebUI.delay(1)

'Get text from the feild:: Incident'
Incidentca = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Incident calltaker'))

WebUI.delay(1)

'Get text from the feild:: Datum Melding'
DatumMeldingca = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Datum Meldingca'))

WebUI.delay(1)

'Get text from the feild:: Tijd Melding'
TijdMeldingca = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Tijd Melding ca'))

WebUI.delay(1)

'Get text from the feild:: Aangewezen aan'
Aangewezenaan1 = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Aangewezen aanca'))

WebUI.delay(1)

KeywordLogger log1 = new KeywordLogger()

log1.logInfo('Assistentie number is : ' + Incidentnumber)

log1.logInfo('Adres van incident : ' + avi)

log1.logInfo('Adres #van incident : ' + avi1)

log1.logInfo('Incident is: ' + Incidentca)

log1.logInfo('Datum Melding is : ' + DatumMeldingca)

log1.logInfo('Tijd Melding is : ' + TijdMeldingca)

log1.logInfo('Tijd Melding is : ' + Aangewezenaan1)

test1 = WebUI.concatenate('\n', 'Incident number:' + Incidentnumber, '\n', 'Adres van incident:' + avi, '\n', 'Adres # van incident:' + 
    avi1, '\n', 'Incident:' + Incidentca, '\n', 'Datum Melding:' + DatumMeldingca, '\n', 'Tijd Melding:' + TijdMeldingca, 
    '\n', 'Aangewezen aan:' + Aangewezenaan1)

println(test1)

log1.logInfo(test1)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Melding'))

WebUI.delay(2)

'Melding view select'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/medlding view default first selected'))

WebUI.delay(2)

Omschrijving = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Omschrijving'))

println(Omschrijving)

if (test1 == Omschrijving) {
    println('Calltaker and melding both are match')

    log1.logInfo('Calltaker and melding both are match')
} else {
    println('Calltaker and melding both are not match')

    log1.logInfo('Calltaker and melding both are not match')
}

/*String s = DatumMeldingca

int len = s.length()

String rev = ''

for (int i = len - 1; i >= 0; i--) {
    rev = (rev + s.charAt(i))
}

println(rev)*/

