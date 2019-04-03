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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'te')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4759')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Longitude'), '12')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'ac')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

WebUI.delay(1)

'ZELF CONSTATERING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Melder Gegevens Achternaam'), 'te')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Melder Gegevens Achternaam lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/intake save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Actieve Assistentie click'))

WebUI.delay(2)

Assistentie = WebUI.getText(findTestObject('Actpol_Scripts/Extra script/Incident'))

Ass = WebUI.concatenate('//*[text()="', Assistentie, '"]/preceding-sibling::td/a[1]')

println(Ass)

WebUI.comment('Dispath module start')

WebUI.callTestCase(findTestCase('Actpol_Scripts/New Scripts actpol/Dispatch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('creating Assistenties module')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user'))

'COMERCIELE INSTELLING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Lokatie type'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Melding Melder Dispatch assist save'))

WebUI.delay(10)

WebUI.comment('roll process start')

WebUI.callTestCase(findTestCase('Actpol_Scripts/New Scripts actpol/Assistentie roll process'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('then go into opsporing case screening and fetch this record and select iten 2- nader onderzoek in field dader indicatie')

WebUI.callTestCase(findTestCase('Actpol_Scripts/New Scripts actpol/Case Screening'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('based on this record you create a new onderzoek in opsporing onderzoek and import this assistentie number and add some entiteiten in tab entiteiten ')

WebUI.callTestCase(findTestCase('Actpol_Scripts/New Scripts actpol/Onderzoek'), [:], FailureHandling.STOP_ON_FAILURE)

