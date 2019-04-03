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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Arrestanten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/New'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Type Arrestant'), '3', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Naam Arrestant'), 'TER')

WebUI.delay(2)

'Ter'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Naam Arrestant lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Onder Supervisie'), 'a')

WebUI.delay(2)

'MADURO, Chervin'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Onder Supervisie lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Advocaat Arrestant'), 'Test New')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheid Voeding'), 'Required')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Letsel Verwonding'), 'Testing')

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Registratie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting Datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '9', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2009', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/1st'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting Tijd'), '08.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting Plaats'), 'n')

WebUI.delay(2)

'BON FUTURO BLOK 1'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting Plaats lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/1ste Binnen gebracht door'), 'Anouck')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/1ste Binnen gebracht door lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Op last van'), 'Caroll')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Op last van lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/In kennis gesteld'), 'Cleotis')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/In kennis gesteld lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestant Celnumme'), 'n124')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Deurwaarder na'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Naam Van de Deurwaarder'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Ontslag Datum'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/18th'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Ontslag Tijd'), '20.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Ontslagen op last van'), 'dave')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Ontslagen op last van lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Teamleider bij ontslag'), 'dave')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Teamleider bij ontslag lb'))

'5-VERPLAATSING NAAR ANDERE POLITIE BUREAU\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Einde insluiting i.v.m'), '5', false)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheden einde arrestatie'), 'Testing')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting plush'))

WebUI.scrollToPosition(10, 8)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting plush'))

WebUI.delay(2)

not_run: WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Insluiting'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheid'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheid new'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/bij Bijzonderheid'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/bij save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheid'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Fouillering'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Fouillering new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Fouillering Datam'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/Right side/18th'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Fouillering Time'), '08.39.00')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Gefouilleerd door'), 'Jurgen')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Gefouilleerd door lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Onder supervisie van'), 'Gilbert')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Onder supervisie van lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestant Meewerkend na'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Gefouilleerd Kleding'), 'Testing')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Te Bewaren Voorwerp na'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Te Bewaren Cont. Middelen'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/foui Bijzonderheden'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Fouillering save'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Fouillering'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Goederen'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Goederen new'))

WebUI.delay(2)

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestanten save'))

