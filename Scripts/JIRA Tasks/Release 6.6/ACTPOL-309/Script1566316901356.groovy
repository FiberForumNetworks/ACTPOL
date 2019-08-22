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

WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie'), 'assist', 
    false)

WebUI.setText(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Assistentie Set text'), GlobalVariable.Generiekassistenite_Module)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Zoeken new'))

WebUI.delay(2)

//CHECK CODE 
//WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2'))
'Remember first set default assistentieid after run the script'
String AssistentiedynamicId = GlobalVariable.Generiekassistenite_Module

String Assistentiexpath = ('//*[text()="' + AssistentiedynamicId) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/View Assistentie')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.delay(5)

WebUI.click(to)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/General Search/Algemene Zoekopdracht -test env/Confirmeren'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('Select process "VREEMDELING"')

'Select required dropdown'
WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), 'VREEMDELING', false)

WebUI.delay(3)

'Click Vreemdeling tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Vreemdeling TAB'))

WebUI.delay(1)

'Click Reisdocumenten tab'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten tab'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: ID'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'ID', false)

WebUI.delay(4)

'Select required dropdown:: Identiteitsbewijs'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'Identiteitsbewijs', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: dienstpaspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'dienstpaspoort', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 2'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: diplomatiek paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'diplomatiek paspoort', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 3'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: laissez-passer'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'laissez-passer', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 4'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: nationaal paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'nationaal paspoort', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 5'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: noodpaspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'noodpaspoort', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 6'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: zakenpaspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'zakenpaspoort', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 7'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Paspoort', false)

WebUI.delay(4)

'Select required dropdown:: 2e paspoort'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), '2e paspoort', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 8'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: REISDOCUMENT'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'REISDOCUMENT', false)

WebUI.delay(4)

'Select required dropdown:: Reisdocument voor vluchtelingen'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'Reisdocument voor vluchtelingen', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 9'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: REISDOCUMENT'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'REISDOCUMENT', false)

WebUI.delay(4)

'Select required dropdown:: Reisdocument voor vreemdelingen'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'Reisdocument voor vreemdelingen', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 10'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Visum'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Visum', false)

WebUI.delay(4)

'Select required dropdown:: Studie'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'Studie', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 11'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Visum'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Visum', false)

WebUI.delay(4)

'Select required dropdown:: Toerist'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'Toerist', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 12'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

WebUI.delay(2)

'Click Reisdocumenten new btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten new'))

WebUI.delay(1)

'Select required dropdown:: Visum'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Soort Document'), 'Visum', false)

WebUI.delay(4)

'Select required dropdown:: Werk'
WebUI.selectOptionByLabel(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Type'), 'Werk', false)

WebUI.delay(1)

'Enter the text from the feild :: Document nummer'
WebUI.setText(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Document nummer'), '123456')

WebUI.delay(1)

'Click Plaats afgifte feild\r\n'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte'))

WebUI.delay(2)

'Select the required drop down'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Plaats afgifte lb 13'))

WebUI.delay(1)

'Click save btn'
WebUI.click(findTestObject('JIRA/A Relese 6.6/ACTPOL-309/Reisdocumenten save'))

