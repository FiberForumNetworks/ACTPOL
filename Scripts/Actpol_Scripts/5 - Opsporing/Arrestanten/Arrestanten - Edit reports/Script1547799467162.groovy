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

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestanten user selection'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie controle'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Datum controle'), '04/01/2019')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Tijd'), '10.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Gecontroleerd door'), 'NOORDEN, Anouck')

WebUI.delay(1)

'1 - DEPRESSIEF'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Gesteldheid arrestant'), '6', false)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arts in kennis gesteld'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Verschafte voeding gegeten na'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Overige bijzonderheden'), 'Testing')

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/C save'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/C close'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie voeding'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Datum voorziening'), '04/01/2019')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/voeding Tijd'), '10.00.00')

'NOORDEN, Anouck'
WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Verzorgd door'), 'NOORDEN, Anouck')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Voeding gecontroleerd naa'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Voeding bijzonderheden'), 'Testing')

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/voeding save'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/voeding close'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie'))

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie lichten'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Datum ophalen'), '04/01/2019')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Tijd ophalen'), '10.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Op last van OVJ'), 'test')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Op last van HOVJ'), 'TESTER, Mcuser')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Opgehaald door'), 'HUPSEL, Antonio')

WebUI.delay(1)

'DOKTERSBEZOEK\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Reden ophalen'), '3', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Uit cel gehaald door'), 'NOORDEN, Anouck')

WebUI.delay(3)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/l save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/l close'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie terugbringen'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Actie bezoek'))

WebUI.delay(2)

'TEST\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Reden Bezoek'), '2', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/b Naam'), 'TARUN KUMAR Aaandres')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Datum aanvang'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/1st date'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/b Tijd'), '09.00.00')

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Datum beeindiging'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/4th date'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/bTijd 2'), '09.00.00')

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheden'), 'Testing')

WebUI.delay(3)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/b save'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/b close'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/actie Activiteiten Rapport'))

WebUI.delay(4)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestanten user selection'))

not_run: WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Rapportage'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/R activraplist'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/f Datum'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/List Activiteiten Rapport month'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/List Activiteiten Rapport year'), '2018', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/date select 1st'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Aangewezen aan'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Aangewezen aan lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/report-filters'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/List Activiteiten Rapport close'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Rapportage'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/List Arrestanten Rapport'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Wijkteam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Wijkteam lb'))

WebUI.delay(1)

'allebei'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Type'), 'A', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/List Arrestanten Rapport close'))

