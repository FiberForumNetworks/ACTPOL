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

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/488 click existing roll process'))

WebUI.delay(3)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/488 Aangever Achternaam click edit'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('JIRA/A Relese 6.5.2/488 bijnaam tab'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/488 bijnaam tab'))

WebUI.delay(5)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/488 bijnaam new'))

WebUI.delay(1)

'cahnge every time'
WebUI.setText(findTestObject('JIRA/A Relese 6.5.2/488 bijnaam name enter(alias)'), 'ha18')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/488 bijnaam name save'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/488 bijnaam popup save'))

WebUI.delay(1)

'Persoon\r\n'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'persoon', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Alias'), 'ha18')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

