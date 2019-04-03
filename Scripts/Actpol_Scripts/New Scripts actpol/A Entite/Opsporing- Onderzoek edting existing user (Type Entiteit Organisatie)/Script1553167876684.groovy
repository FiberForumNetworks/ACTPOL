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

'Organisatie'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '12', false)

WebUI.delay(4)

'A O N ANTILLEN NV'
WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Organisatie'), 'A O N ANTILLEN NV', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'\r\n'
WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Organisatie lb'))

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Nadere aanduiding'), 'Holi [7]( /ˈhoʊliː/; Sanskrit: होली Holī) is an ancient Hindu spring festival, originating from the Indian subcontinent. It is celebrated predominantly in India, Excepting South India and Nepal, but has also spread to other areas of Asia and parts of the Western world through the diaspora from the Indian subcontinent. Holi is popularly known as the Indian "festival of spring", the "festival of colours", or the "festival of love".[8][1][9] The festival signifies the arrival of spring, the end of winter, the blossoming of love, and for many a festive day to meet others, play and laugh, forget and forgive, and repair broken relationships.[10][11] The festival also celebrates the beginning of a good spring harvest season.[10][11] It lasts for a night and a day, starting on the evening of the Purnima (Full Moon day) falling in the Vikram Samvat Hindu Calendar [12] month of Phalgun, which falls somewhere between the end of February and the middle of March in the Gregorian calendar. The first evening is known as Holika Dahan (burning of demon holika) or Chhoti Holi and the following day as Holi, Rangwali Holi, Dhuleti, Dhulandi,[13] or Phagwah.[14]')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Opgericht datum'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'test'
WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Branche'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/KVK nummer'), '12789456')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Handelsnaam KVK'), 'Test')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Opmerking'), 'Holi celebrations start on the night before Holi with a Holika Dahan where people gather, perform religious rituals in front of the bonfire, and pray that their internal evil be destroyed the way Holika, the sister of the demon king Hiranyakashipu, was killed in the fire. The next morning is celebrated as Rangwali Holi – a free-for-all festival of colours,[10] where people smear each other with colours and drench each other. Water guns and water-filled balloons are also used to play and colour each other. Anyone and everyone is fair game, friend or stranger, rich or poor, man or woman, children and elders. The frolic and fight with colours occurs in the open streets, open parks, outside temples and buildings. Groups carry drums and other musical instruments, go from place to place, sing and dance. People visit family, friends and foes to throw coloured powders on each other, laugh and gossip, then share Holi delicacies, food and drinks.[19][20] Some customary drinks include bhang (made from cannabis), which is intoxicating.[21][22] In the evening, after sobering up, people dress up and visit friends and family')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Entity - Organisatie'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen new'))

WebUI.delay(2)

'Adres'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Type Entiteit'), '7', false)

WebUI.delay(1)

'ALOE STRAAT 1226'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Entiteit drop down'), '174', 
    false)

WebUI.delay(2)

'BOVEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Soort Relatie'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Organisatie/Organisatie save'))

WebUI.delay(3)

WebUI.takeScreenshot()

