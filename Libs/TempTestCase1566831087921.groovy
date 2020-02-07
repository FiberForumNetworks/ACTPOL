import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\user4\\AppData\\Local\\Temp\\Katalon\\Test Cases\\JIRA Tasks\\Release 6.6\\ACTPOL-552\\20190826_202123\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

/*not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

not_run: WebUI.delay(2)

'Creating New Incident\\r\\n'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie New'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Bron'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Born lb'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Telefoon nummer'), '9999999999', FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel'), 'Testing test')

'Select drop down from the list :: COMERCIELE INSTELLING'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Lokatie type'), '1', false)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres'))

not_run: WebUI.delay(2)

'ANDRES BELLO WEG'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Adres lb'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/ter hoogte van'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Nadere Aanduiding'), 'Testing')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Incident Lb'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Relationeel Geweld'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Poging'))

'Select ZELF CONSTATERING\\r\\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding Prioriteit'), '3', false)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Dispatch ja'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Contact verzoek ja'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1)

'Click on Aangewezen aan auto search titles'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangewezen aan'))

not_run: WebUI.delay(2)

'Select required dropdown'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangewezen aan lb'))

not_run: WebUI.delay(1)

'Select ST Maarten\\r\\n'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Eiland'), 'SXM', false)

not_run: WebUI.scrollToPosition(29, 7)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melding'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

not_run: WebUI.delay(1)

'Select required dropdown\\r\\n'
not_run: WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol-Proces'), 'AANGEVER', false)

'Clicking new person\\r\\n'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Resultaat Personen bestand person selection'))

not_run: WebUI.scrollToPosition(0, 21)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Melder'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Save melding'))

not_run: WebUI.delay(8)

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(3)

'Click Melding tab'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Melding TAB'))

not_run: WebUI.delay(2)

'Get text from the feild:: Assistentie number'
not_run: Assistentienumber = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Assistentie number'))

not_run: WebUI.delay(1)

'Get text from the feild:: Incident Adres'
not_run: IncidentAdres = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Incident Adres'))

not_run: WebUI.delay(1)

'Get text from the feild:: Aangewezen aan'
not_run: Aangewezenaan = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Aangewezen aan'))

not_run: WebUI.delay(1)

'Get text from the feild:: Incident'
not_run: Incident = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Incident'))

not_run: WebUI.delay(1)

'Get text from the feild:: Datum Melding'
not_run: DatumMelding = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Datum Melding'))

not_run: WebUI.delay(1)

'Get text from the feild:: Tijd Melding'
not_run: TijdMelding = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Datum Melding'))

not_run: KeywordLogger log = new KeywordLogger()

not_run: log.logInfo('Assistentie number is : ' + Assistentienumber)

not_run: log.logInfo('Incident Adres is : ' + IncidentAdres)

not_run: log.logInfo('Aangewezen aan is : ' + Aangewezenaan)

not_run: log.logInfo('Incident is: ' + Incident)

not_run: log.logInfo('Datum Melding is : ' + DatumMelding)

not_run: log.logInfo('Tijd Melding is : ' + TijdMelding)

not_run: test = WebUI.concatenate('\\n', 'Assistentie number is : ' + Assistentienumber, '\\n', 'Incident Adres is : ' + IncidentAdres, 
    '\\n', 'Incident is: ' + Incident, '\\n', 'Datum Melding is : ' + DatumMelding, '\\n', 'Tijd Melding is : ' + TijdMelding)

//println(test)
not_run: log.logInfo(test)

not_run: WebUI.delay(2)

not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Melding'))

not_run: WebUI.delay(2)

'Melding view select'
not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/medlding view default first selected'))

not_run: WebUI.delay(2)

not_run: Omschrijving = WebUI.getText(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Omschrijving'))

not_run: log.logInfo(Omschrijving)

not_run: WebUI.comment('intake mode')

not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron'), 't')

not_run: WebUI.delay(2)

'Default first one is selected'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron lb'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4754')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident'), 'aa')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Latitude'), 'GG', FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/ter hoogte van'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Nadere aanduiding'), 'Testing')

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'a')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats lb'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'a')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Mensenhandel Mensensmokkel'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

not_run: WebUI.delay(1)

'Select based on environment'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '3', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Achternaam'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Resultaat Personen bestand'))

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Mutatie'), 'Testing')

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Intake/Calltaker/Intake Save'))*/
not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-552/Actieve Assistentie'))

not_run: WebUI.delay(2)

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

test1 = WebUI.concatenate('\\n', 'Incident number:' + Incidentnumber, '\\n', 'Adres van incident:' + avi, '\\n', 'Adres # van incident:' + 
    avi1, '\\n', 'Incident:' + Incidentca, '\\n', 'Datum Melding:' + DatumMeldingca, '\\n', 'Tijd Melding:' + TijdMeldingca, 
    '\\n', 'Aangewezen aan:' + Aangewezenaan1)

//println(test)
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

log1.logInfo(Omschrijving)

''', 'Test Cases/JIRA Tasks/Release 6.6/ACTPOL-552', new TestCaseBinding('Test Cases/JIRA Tasks/Release 6.6/ACTPOL-552',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
