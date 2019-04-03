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

'Communicate\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '20', false)

WebUI.delay(4)

'Anders'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Categorie'), '9', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Imsi'), '123457896')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Provider'), 'New')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Opmerking'), 'Assuming spring showers stay at bay, sky-watchers in the Northern Hemisphere will get to see a cosmic triple play on March 20, as a “super worm moon” lights up the vernal equinox. According to astronomy website EarthSky.org, a full moon has not landed this close to the first day of spring since the year 2000, and the two celestial events won’t happen less than a day apart again until 2030.Because the moon’s orbit is egg-shaped, there are times when it is at what astronomers call perigee, or its shortest distance from Earth, and times when it is at apogee, or its farthest distance from Earth. And because the size of the moon\'s orbit varies slightly with each lunar cycle, perigee is not always the same distance from month to month')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Communicatie hide tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen new'))

WebUI.delay(2)

'Communicatie Apparaat'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Type Entiteit'), '11', false)

WebUI.delay(1)

'Marifoon - test test'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Entiteit drop down'), '146', 
    false)

WebUI.delay(2)

'BOVEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Soort Relatie'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Communicatie save'))

WebUI.delay(3)

WebUI.takeScreenshot()

