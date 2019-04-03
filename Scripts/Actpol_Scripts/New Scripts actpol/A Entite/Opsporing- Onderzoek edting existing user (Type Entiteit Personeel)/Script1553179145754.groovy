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

'Personeel'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '10', false)

WebUI.delay(4)

'\r\n'
WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Naam'), 'Anouck', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Naam lb'))

WebUI.delay(2)

'\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Geboortedatum'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Geslacht Man'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'ADMINISTRATIEVE MEDEWERKER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Functie'), '2', false)

WebUI.delay(2)

'AFDELING LEC'
WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Afdeling'), 'AFDELING LEC')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Afdeling lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Opmerking'), 'Holi celebrations start on the night before Holi with a Holika Dahan where people gather, perform religious rituals in front of the bonfire, and pray that their internal evil be destroyed the way Holika, the sister of the demon king Hiranyakashipu, was killed in the fire. The next morning is celebrated as Rangwali Holi – a free-for-all festival of colours,[10] where people smear each other with colours and drench each other. Water guns and water-filled balloons are also used to play and colour each other. Anyone and everyone is fair game, friend or stranger, rich or poor, man or woman, children and elders. The frolic and fight with colours occurs in the open streets, open parks, outside temples and buildings. Groups carry drums and other musical instruments, go from place to place, sing and dance. People visit family, friends and foes to throw coloured powders on each other, laugh and gossip, then share Holi delicacies, food and drinks.[19][20] Some customary drinks include bhang (made from cannabis), which is intoxicating.[21][22] In the evening, after sobering up, people dress up and visit friends and family')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Entity - Personeel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Artikelen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Artikelen new'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Wetboek'), 'VERGUNNINGSLANDSVERORDENING', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Wetboek lb'))

WebUI.delay(1)

'VERGUNNING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Titel'), '197', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Artikel'), 'ARTIKEL 44 LID 1')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Artikel lb'))

WebUI.delay(1)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/UITVOERING'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Artikel save'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Artikel save'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Personeel/Personeel save'))

WebUI.delay(2)

WebUI.takeScreenshot()

