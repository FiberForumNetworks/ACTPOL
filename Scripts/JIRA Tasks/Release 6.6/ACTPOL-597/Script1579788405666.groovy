import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI 


WebDriver driver = DriverFactory.getWebDriver();
WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(6)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Default edit'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Entiteitenn tab'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

not_run: WebUI.delay(6)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteit new'))

WebUI.delay(3)

'Selecting Persoon\r\n'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), 'Persoon', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam'), 'c')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Achternaam lb 2'))

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Opmerking on'), 'Testing')

'Selecting BEKENDE/AANGEHOUDEN VERDACHTE'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Rol Proces'), 'BEKENDE/AANGEHOUDEN VERDACHTE', 
    false)

WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Reden'), 'TER BEWARING', false)

WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Type'), 'BUITEN HETERDAAD', false)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Plaats van verhoor'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Plaats van verhoor lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Verdachte Info tab'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Strafbare feiten'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Strafbare feiten new'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Strafbare feiten new-new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Wetboek lb'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Titel'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel 5'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Artikel lb'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Uitvoering'), 1)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Daderschap'), 1)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Generiek/Assistentie/Juntu'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/STRA popup save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Roll process save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Documenten new'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Indeling'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/BOB'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Aanvraag 177l planmatige observatie'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/doc save'))

WebUI.delay(4)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Termijnen'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-597/Page 2 click'))

