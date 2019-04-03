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

WebUI.delay(2)

'ILLEGAAL PERSOON'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '26', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/ILLEGAAL PERSOON Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/ILLEGAAL PERSOON Achternaam'), 'cova')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/ILLEGAAL PERSOON Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

'KENNISGEVER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '10', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/KENNISGEVER Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/KENNISGEVER Achternaam'), 'vanessa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/KENNISGEVER Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

'MENS IN NOOD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '11', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/MENS IN NOOD Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/MENS IN NOOD Achternaam'), 'terens')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/MENS IN NOOD Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

'NIET BEKEND'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '12', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/NIET BEKEND Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/NIET BEKEND Achternaam'), 'cleotis')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/NIET BEKEND Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

'ONBEKEND'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '52', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

'SLACHTOFFER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '15', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam'), 'setty')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Toestand slachtoffer'), 'lag')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Toestand slachtoffer lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtofferhulp na'))

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer tab minimize'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer new'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer text'), 'aan')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer text lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER roll process close'))

WebUI.delay(2)

'VERDACHTE SIGNALEMENTEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '16', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VERDACHTE SIGNALEMENTEN Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VERDACHTE SIGNALEMENTEN Achternaam'), 'voornaam')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VERDACHTE SIGNALEMENTEN Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte Signalementen roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte Signalementen roll process close'))

WebUI.delay(2)

'VERMIST PERSOON'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '17', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VERMIST PERSOON Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VERMIST PERSOON Achternaam'), 'awear')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VERMIST PERSOON Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

'VERZOEKER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '18', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VERZOEKER Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VERZOEKER Achternaam'), 'paul')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VERZOEKER Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/GEVAARLIJKE HONDEN roll process close'))

WebUI.delay(2)

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

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VREEMDELING roll process save'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/VREEMDELING roll process close'))

