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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

WebUI.comment('creating dispath module')

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Intake/Intake'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Intake/Dispatch'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Dipath edit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Unit radio click'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Koppelen optie click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Koppelen save'))

WebUI.delay(1)

'DA '
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'AR', false)

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Dipath Mutatie click'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Dipath Mutatie text area'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Mutatie save'))

WebUI.delay(1)

'DC'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/Dispath Status'), 'CL', false)

WebUI.switchToWindowIndex(0)

