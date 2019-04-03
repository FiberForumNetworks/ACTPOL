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

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting AANGEVER\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '2', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam'), 'AAADAK')

WebUI.delay(2)

'AAADAK'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Toevoegen als slachtoffer na'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Toevoegen als slachtoffer na'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Slachtofferhulp ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voegen in Strafproces na'))

WebUI.scrollToPosition(29, 7)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Aangever'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte new person'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click'))

WebUI.delay(2)

'BEDREIGING\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte click lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/reden_aangifte save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden Aangifte'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feit new new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek'))

WebUI.delay(3)

'VERGUNNINGSLANDSVERORDENING'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))

'VERGUNNING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel new'), '197', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))

WebUI.delay(1)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering'), '1', false)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/save nieuw strafbaar feit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/aangever save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Aangever close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'Selecting BEKENDE/AANGEHOUDEN VERDACHTE\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '1', false)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam specific process'), 'carmen')

WebUI.delay(5)

'Secting abdctest'
WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Achternaam specific process lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Alcohol gebruik ja'))

'select anu test 1\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Alcohol gebruik type'), '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Drugs gebruik ja'))

WebUI.delay(1)

'LSD'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Drugs gebruik type'), '3', false)

WebUI.delay(1)

'select I.V.M. GIJZELING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Reden'), '3', false)

'select IN ONDERZOEK'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Type'), '5', false)

'select Uitbuiter'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol'), '171', false)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Verdachte Info'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feitin'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Strafbaar feitin new'))

WebUI.delay(2)

'Pogging'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/UITVOERING'), '1', false)

WebUI.delay(1)

'MEDEPLEGEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Daderschap'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/stra save popup'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Verdachte close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'BEKEURDE PERSOON'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '3', false)

WebUI.delay(2)

'OPROEPINGSPROCES-VERBAAL'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Soort Procesverbaal'), '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voertuig radio click'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Proces Verbaal Nr'), 'PVN1231')

WebUI.delay(2)

'31122019'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Zittingsdatum'), '31122019', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voertuig new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voertuig new new popup'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voertuig new new select person'))

WebUI.delay(3)

'ONDERZOEK AANRIJDING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Reden Inschrijving'), '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Voertuig new new popup save'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Bekeurde persoon'), 'AAABBS')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Bekeurde persoon lb'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Proces_Verbaal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click new slect user'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Bekeurde persoon save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Bekeurde persoon close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'BERISPTE PERSOON'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '25', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Achternaam'), 'capa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'BETROKKEN VAARTUIG'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '58', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Contact Officer'), 'HUPSEL')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contact Officer lb'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten close'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

'BETROKKENE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '5', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Contacten Achternaam'), 'boom')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten Achternaam lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten close'))

