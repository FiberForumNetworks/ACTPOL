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

WebUI.navigateToUrl('http://10.20.10.7:8202/actpoldev/JPOL392/nxmenu.pgm?docnum=604')

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.ID)

WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.enpassword)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/Assistentie editing'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '2', false)

WebUI.delay(3)

WebUI.setText(findTestObject('JIRA/Aangever Achternaam'), 'Duck')

WebUI.delay(2)

'Duck'
WebUI.click(findTestObject('JIRA/Aangever Achternaam LB'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('JIRA/Toevoegen als slachtoffer na'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.scrollToPosition(29, 7)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte new person'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click'))

WebUI.delay(2)

'Selecting asdf\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click lb'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/ra save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek'))

WebUI.delay(3)

'Selecting EILANDSBESLUIT ONDERWATERPARK BONAIRE'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))

'selecting Algemene beheersmaatregelen'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel new'), '298', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))

WebUI.delay(1)

'Selecting anu test 5'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering'), '10', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/sf save new'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Strafbaar feit edit 1'))

WebUI.delay(2)

'anu test 4'
WebUI.selectOptionByValue(findTestObject('JIRA/Uitvoering'), '9', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/vo save'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Strafbaar feit edit 2'))

WebUI.delay(2)

'anu test 4'
WebUI.selectOptionByValue(findTestObject('JIRA/Uitvoering'), '9', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/vo save'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Strafbaar feit edit 3'))

WebUI.delay(2)

'anu test 4'
WebUI.selectOptionByValue(findTestObject('JIRA/Uitvoering'), '9', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/vo save'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/total save'))

