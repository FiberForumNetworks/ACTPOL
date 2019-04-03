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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.20.10.7:8202/actpoldev/JPOL438/nxmenu.pgm?docnum=604')

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.ID)

WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.enpassword)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Assistentie editing'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/roll process edit Bijlage'))

WebUI.delay(2)

WebUI.scrollToPosition(31, 1164)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/bijlage'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/bijlage new'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('JIRA/a person/Selecteer Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(1)

'Change text'
WebUI.setText(findTestObject('JIRA/a person/Document naam'), 'TestNew')

WebUI.delay(3)

WebUI.setText(findTestObject('JIRA/a person/Omschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Plush'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Dienstovername'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Dienstovername edit'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Dienst'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('JIRA/a person/bijlage new new'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Bijlage add new'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('JIRA/a person/Selecteer Document'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(1)

'Change text'
WebUI.setText(findTestObject('JIRA/a person/Document naam'), 'TestNew')

WebUI.delay(3)

WebUI.setText(findTestObject('JIRA/a person/Omschrijving'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Plush'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/dien save'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Assistentie editing'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/roll process edit Bijlage'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Aangever'))

not_run: WebUI.scrollToPosition(32, 1164)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Voertuig editing'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/a person/Voertuig popup hide'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/a person/Bijlage popup'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Bijlage popup new'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('JIRA/a person/Selecteer Document popup'), 'C:\\Users\\user4\\Desktop\\test.docx')

WebUI.delay(1)

'Change text'
WebUI.setText(findTestObject('JIRA/a person/Document naam popup'), 'TestNew')

WebUI.delay(3)

WebUI.setText(findTestObject('JIRA/a person/Omschrijving popup'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/a person/Plush popup'))

WebUI.delay(1)

