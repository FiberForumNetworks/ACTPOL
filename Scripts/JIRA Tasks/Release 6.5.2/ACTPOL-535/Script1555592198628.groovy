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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), '200601667')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

//CHECK CODE 
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = '200601667'

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 select popup'))

WebUI.delay(5)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Coordinatie'))

WebUI.delay(5)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Coordinatie hide'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Werkopdrachten'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Persoon toegestaan hide'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Controle'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Mutatie hide'))

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/A Relese 6.5.2/535 Slachtofferhulp Email hide'))

WebUI.delay(1)

WebUI.takeScreenshot()

