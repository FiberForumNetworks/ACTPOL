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

WebUI.click(findTestObject('Priem-2 scripts/recent items/MAN HU-A-NG'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/HB/Delictsoort'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Delictsoort'), 2)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/HB/contact'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/contact'), 3)

WebUI.click(findTestObject('Priem-2 scripts/HB/CONTACT NEW'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/HB/Relatie'), '99', false)

not_run: WebUI.click(findTestObject('Priem-2 scripts/HB/Relatie Person'))

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

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Documenten'), 3)

WebUI.click(findTestObject('Priem-2 scripts/recent items/BEVEL ANHOUD IVM SCHORSING'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/KB LIJST IN BESLAG'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Afdoening'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Afdoening'), 3)

WebUI.click(findTestObject('Priem-2 scripts/HB/Tenlastelegging'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Tenlastelegging'), 3)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/148'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/close Tenlastelegging'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Executie EA'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Executie EA'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Executie HB'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Executie HB'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Medeverdachte'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Raadkamer'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Dossier'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/recent items/Procesdossier'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/Procesdossier new'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/Vanessa'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/Vanessa new'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/Verdachtengegevens'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/recent items/Justite gegevens'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/recent items/Werkmap'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/HB/Just Documentatie'))

WebUI.scrollToElement(findTestObject('Priem-2 scripts/HB/Just Documentatie'), 3)

WebUI.delay(8)

WebUI.click(findTestObject('Priem-2 scripts/HB/next movie to 2'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/HB/click Alexandra'))

WebUI.click(findTestObject('Priem-2 scripts/HB/menu cloase'))

WebUI.click(findTestObject('Priem-2 scripts/HB/next movie to 3'))

WebUI.delay(2)

WebUI.refresh()

WebUI.selectOptionByLabel(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/type'), 'Parketnummer', false)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketnummer'), '555.00108/18')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketcode'), '555', false)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/van'), '005/10/2018')

WebUI.delay(3)

WebUI.setText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/naar'), '005/10/2018')

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/Parketnummer'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/text'), 'Algemene Zoekopdracht')

WebUI.delay(1)

WebUI.focus(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/filter new'))

WebUI.click(findTestObject('Priem-2 scripts/Algemene Zoekopdracht/filter new'))

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.delay(3)

WebUI.closeBrowser()

