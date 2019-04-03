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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Rapportage/Rapportage'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Rapportage/Rapportages'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Openstaande Assistentie Opdrachten Per medewerker'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s van'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s Verwerken'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s close'))

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Openstaande Opsporings Opdrachten Per medewerker'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s van'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s Verwerken'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s close'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Overzicht Werkopdrachten Bestemd Voor'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s van'))

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Rapportage/s Medewerker'), 'DKTEST, DANI')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s Verwerken'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s close'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Reden Aangifte'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Datum aangifte van'), FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightmonth'), '0', false, FailureHandling.OPTIONAL)

not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Monthyear/Rightyear'), '2018', false, FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Date/8th right frame'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Poging'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Relationeel Geweld'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/Submit'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/excel report download'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Rapportage/s close'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

