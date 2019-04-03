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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Calltaker'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron'), 'test')

WebUI.delay(2)

'select user "test6"'
WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bron lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Telefoon nummer'), '4754')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident'), 'dafla')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Adres van Incident lb 2'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Latitude'), 'GG')

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/ter hoogte van'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Nadere aanduiding'), 'Testing')

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats'), 'te')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Bekende plaats lb'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident'), 'ac')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Incident lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Relationeel Geweld'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Poging'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Door CMK opgelost'))

WebUI.delay(1)

'select user "CALLTAKER"'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Intake/Calltaker/Melding Prioriteit'), '18', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Dispatch'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Contact verzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Ambulance'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Politie'))

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Achternaam'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Resultaat Personen bestand'))

WebUI.setText(findTestObject('Actpol_Scripts/Intake/Calltaker/Mutatie'), 'No Police day or incident is the same and ACTPOL is so flexible that it has managed to make it achievable to register all the possible scenario’s in the application and reduces unnecessarily repetitive data. Activities related to the day-to-day functioning of police departments, including back-end administrative processes are covered in ACTPOL. The processes have been incorporated in the application to ease the task of administration and record keeping via a document management system, thereby bringing in operational efficiency throughout the police department. The application enables each police station to function independently and the data to flow at the same time to a central server, thereby achieving the benefits of a centralized system. ACTPOL offers a flexible and advanced search option in addition to an extensive and advanced analysis capacity.No Police day or incident is the same and ACTPOL is so flexible that it has managed to make it achievable to register all the possible scenario’s in the application and reduces unnecessarily repetitive data. Activities related to the day-to-day functioning of police departments, including back-end administrative processes are covered in ACTPOL. The processes have been incorporated in the application to ease the task of administration and record keeping via a document management system, thereby bringing in operational efficiency throughout the police department. The application enables each police station to function independently and the data to flow at the same time to a central server, thereby achieving the benefits of a centralized system. ACTPOL offers a flexible and advanced search option in addition to an extensive and advanced analysis capacity.No Police day or incident is the same and ACTPOL is so flexible that it has managed to make it achievable to register all the possible scenario’s in the application and reduces unnecessarily repetitive data. Activities related to the day-to-day functioning of police departments, including back-end administrative processes are covered in ACTPOL. The processes have been incorporated in the application to ease the task of administration and record keeping via a document management system, thereby bringing in operational efficiency throughout the police department. The application enables each police station to function independently and the data to flow at the same time to a central server, thereby achieving the benefits of a centralized system. ACTPOL offers a flexible and advanced search option in addition to an extensive and advanced analysis capacity.No Police day or incident is the same and ACTPOL is so flexible that it has managed to make it achievable to register all the possible scenario’s in the application and reduces unnecessarily repetitive data. Activities related to the day-to-day functioning of police departments, including back-end administrative processes are covered in ACTPOL. The processes have been incorporated in the application to ease the task of administration and record keeping via a document management system, thereby bringing in operational efficiency throughout the police department. The application enables each police station to function independently and the data to flow at the same time to a central server, thereby achieving the benefits of a centralized system. ACTPOL offers a flexible and advanced search option in addition to an extensive and advanced analysis capacity.No Police day or incident is the same and ACTPOL is so flexible that it has managed to make it achievable to register all the possible scenario’s in the application and reduces unnecessarily repetitive data. Activities related to the day-to-day functioning of police departments, including back-end administrative processes are covered in ACTPOL. The processes have been incorporated in the application to ease the task of administration and record keeping via a document management system, thereby bringing in operational efficiency throughout the police department. The application enables each police station to function independently and the data to flow at the same time to a central server, thereby achieving the benefits of a centralized system. ACTPOL offers a flexible and advanced search option in addition to an extensive and advanced analysis capacity.No Police day or incident is the same and ACTPOL is so flexible that it has managed to make it achievable to register all the possible scenario’s in the application and reduces unnecessarily repetitive data. Activities related to the day-to-day functioning of police departments, including back-end administrative processes are covered in ACTPOL. The processes have been incorporated in the application to ease the task of administration and record keeping via a document management system, thereby bringing in operational efficiency throughout the police department. The application enables each police station to function independently and the data to flow at the same time to a central server, thereby achieving the benefits of a centralized system. ACTPOL offers a flexible and advanced search option in addition to an extensive and advanced analysis capacity.')

WebUI.click(findTestObject('Actpol_Scripts/Intake/Calltaker/Intake Save'))

