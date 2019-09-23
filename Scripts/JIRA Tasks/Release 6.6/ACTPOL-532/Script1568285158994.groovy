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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Arrestanten'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(1)

//WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Arrestanten user selection'))
'Remember first set default assistentieid after run the script'
String ArrestantenId = GlobalVariable.ArrestantenId

String Assistentiexpath = ('(//*[text()="' + ArrestantenId) + '"]/preceding-sibling::td/a[2])[1]'

TestObject to = findTestObject('Actpol_Scripts/Opsporing/Arrestanten/user edit select radio btn')

to.addProperty('xpath', ConditionType.EQUALS, Assistentiexpath)

WebUI.click(to)

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Registratie'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Goederen new'))

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Voorwerpen'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Voorwerpen lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Merk'), Testing)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Model'), Testing)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Kleur'), Testing)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Serie nummer'), number)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Aantal'), number)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/In bewaring genomen door'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/In bewaring genomen door lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Onder supervisie van goed'), 'aa')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Onder supervisie van goed lb'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Opberg plaats dropdown'), dropdown, false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Bijzonderheden goed'), Testing)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Goed save'))

WebUI.delay(4)

if (findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Copy goed') == findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Copy goed')) {
    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Copy goed'))

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Hoeveel keren kopieren'), '2', false)

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Hoeveel keren kopieren right mark'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Kopieren Goed grid 2 display'))

    WebUI.delay(1)

     WebUI.takeScreenshot()
	 
} else {
    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Copy goed default'))

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Hoeveel keren kopieren'), '2', false)

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Hoeveel keren kopieren right mark'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Arrestanten/Kopieren Goed grid 2 display'))

    WebUI.delay(1)

    WebUI.takeScreenshot()
}

