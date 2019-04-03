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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user 4'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('VREEMDELING')

'VREEMDELING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '57', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), 40)

'Luchthaven'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Locatie'), '86', false)

WebUI.delay(2)

'laura'
WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam'), 'laura', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VREEMDELING Achternaam -lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Vreemdeling tab hide'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten new'))

WebUI.delay(1)

'Paspoort'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Soort Document'), '109', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Document nummer'), '1225')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Plaats afgifte'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Plaats afgifte lb'))

WebUI.delay(1)

'Studie'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Visuem Type'), '115', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Visum duur'), 'Test')

WebUI.delay(1)

'Officieel Bezoek'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Visum doel'), '117', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Reisdocumenten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering door1'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering door1 lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering door2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering door2 lb'))

WebUI.delay(1)

'Bonaire Post 1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering post'), '88', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Weigering'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Toegang'))

WebUI.delay(1)

'Bonaire Post 1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Toegang post'), '88', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Bonaire Post 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Bonaire Post 1 lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Toegang door2'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Toegang door2 lb'))

WebUI.delay(1)

'Toerisme'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Doel van verblijf'), '100', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Duur'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Echtgeno(o)t(e) van de vreemdeling'), 'AAADAK')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Echtgeno(o)t(e) van de vreemdeling lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Garantsteller'), 'A\'CHTERNAAM')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Garantsteller lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Toegang'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Vertrek'))

WebUI.delay(2)

'Haven'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Locatie'), '87', false)

WebUI.delay(2)

'Bonaire Post 1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Post'), '88', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Verbalisant 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/Verbalisant 1 lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VREEMDELING/VREEMDELING save'))

WebUI.delay(6)

WebUI.takeScreenshot()

