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
import com.kms.katalon.core.testobject.ConditionType as type

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Aanhoudings_Opsporings bevel'))

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/edit'))

'Remember first set default assistentieid after run the script'
String Aanhoudings_Opsporings_bevel_ID = GlobalVariable.AanhoudingsOpsporingsbevelID

String Assistentiexpath = ('//*[text()="' + Aanhoudings_Opsporings_bevel_ID) + '"]/preceding-sibling::td/a[2]'

TestObject to = findTestObject('Actpol_Scripts/Generiek/Assistentie/Assistentie editing user 2')

to.addProperty('xpath', type.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Op Bevel van'), 'a')

WebUI.delay(2)

'HUPSEL, ANTONIO'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Op Bevel van lb'))

WebUI.delay(2)

'Select required drop down'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Met toestemming van'), '2', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Persoon'), 'a')

WebUI.delay(2)

'Aaftink'
WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Persoon lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Details'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant new'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Terzake'), 'New data check')

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/a o save'))

WebUI.closeBrowser()

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant plus'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Reason for Warrant'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Event'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/event new'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Assistentie Nr'))

not_run: WebUI.delay(2)

'200600268\r\n'
not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Assistentie Nr lb'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Event plus'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Event'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Uiterlijke Bijzonderheid'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Uiterlijke Bijzonderheid new'))

not_run: WebUI.delay(1)

'4 - LITTEKEN                                                                   '
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Uiterlijke Bijzonderheid drop down'), 
    '4', false)

'3 - HALS                                                                       '
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Lichaamsdeel Bijzonderheid'), 
    '3', false)

not_run: WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Omschrijving'), 'Testing')

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Uiterlijke Bijzonderheid plush'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Uiterlijke Bijzonderheid'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Foto'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Foto new'))

not_run: WebUI.uploadFile(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/upload'), 'C:\\Users\\user4\\Desktop\\jquery\\old desktop\\opv 1.png')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Foto plush'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/Foto'))

not_run: WebUI.focus(findTestObject('Actpol_Scripts/Opsporing/Aanhoudings Opsporings bevel/a o save'))

not_run: WebUI.closeBrowser()

