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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi2')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'yFGvMLXn1sM=')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/registraite'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/HB'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/HB/testing 147'))

WebUI.setText(findTestObject('Priem-2 scripts/HB/Rechter'), '50027 - DENZEL ANDREA')

WebUI.setText(findTestObject('Priem-2 scripts/HB/Griffier'), '50033 - KIT ARMSTRONG')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/HB/contact'))

WebUI.click(findTestObject('Priem-2 scripts/HB/CONTACT NEW'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/HB/Relatie'), '99', false)

WebUI.click(findTestObject('Priem-2 scripts/HB/Relatie Person'))

WebUI.setText(findTestObject('Priem-2 scripts/HB/Achternaam new'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/HB/voornaam'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/HB/Geboortedatum'), '015/08/2019')

WebUI.setText(findTestObject('Priem-2 scripts/HB/Adress'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/HB/Huisnummer'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/HB/Telefoon werk'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/HB/mobiel'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/HB/EMail'), 'aa')

WebUI.click(findTestObject('Priem-2 scripts/HB/cancle'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Voorarrest'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Documenten'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Afdoening'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Tenlastelegging'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Executie EA'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Executie HB'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Medeverdachte'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Raadkamer'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Dossier'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Just Documentatie'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/menu cloase'))

WebUI.click(findTestObject('Priem-2 scripts/HB/next movie to 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/click Alexandra'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/menu cloase'))

WebUI.click(findTestObject('Priem-2 scripts/HB/next movie to 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/MAN HU-A-NG'))

WebUI.click(findTestObject('Priem-2 scripts/HB/MAN HU-A-NG close'))

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

