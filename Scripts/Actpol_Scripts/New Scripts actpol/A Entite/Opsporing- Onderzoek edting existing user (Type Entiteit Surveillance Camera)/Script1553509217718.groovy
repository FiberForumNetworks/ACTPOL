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

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Edit user'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

'Surveillance Camera'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '9', false)

WebUI.delay(4)

'Digital'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Type camera'), '1', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Camera Lokatie Adres'), 'ANDRES BELLO WEG')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Camera Lokatie Adres lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Camera Lokatie Adres nr'), '1226')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Nadere aanduiding'), 'Project E was a Cold War arrangement under which the United States provided the United Kingdom with nuclear weapons for the Royal Air Force (RAF). It was later expanded to provide warheads to the British Army, and there was a maritime version known as Project N that provided nuclear depth bombs. US personnel retained custody of the weapons, and handled their storage, maintenance and readiness. The first bombers equipped with Project E weapons were Canberras (example pictured). Due to the operational restrictions, and the loss of independence of the British nuclear deterrent, Project E bombs were phased out in the strategic role in 1962, although they still equipped tactical bombers, and were used on the Thor missiles operated by the RAF from 1959 to 1963 under Project Emily. The British Army acquired Project E warheads for its Corporal, Honest John and Lance missiles, and its artillery pieces. The last Project E weapons were withdrawn from service in 1992. ')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Opmerking'), 'Project E was a Cold War arrangement under which the United States provided the United Kingdom with nuclear weapons for the Royal Air Force (RAF). It was later expanded to provide warheads to the British Army, and there was a maritime version known as Project N that provided nuclear depth bombs. US personnel retained custody of the weapons, and handled their storage, maintenance and readiness. The first bombers equipped with Project E weapons were Canberras (example pictured). Due to the operational restrictions, and the loss of independence of the British nuclear deterrent, Project E bombs were phased out in the strategic role in 1962, although they still equipped tactical bombers, and were used on the Thor missiles operated by the RAF from 1959 to 1963 under Project Emily. The British Army acquired Project E warheads for its Corporal, Honest John and Lance missiles, and its artillery pieces. The last Project E weapons were withdrawn from service in 1992. ')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Surveillance Camera'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen new'))

WebUI.delay(2)

'Communicatie Apparaat'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Type Entiteit'), '11', false)

WebUI.delay(1)

'Computer - test test'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Entiteit drop down'), '152', 
    false)

WebUI.delay(2)

'BOVEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Soort Relatie'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Surveillance Camera/Surveillance Camera save'))

WebUI.delay(3)

WebUI.takeScreenshot()

