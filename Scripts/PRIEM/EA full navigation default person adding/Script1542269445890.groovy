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

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/Parket Zaak EA'))

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/new click'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parketcode/parketcode'), '520', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/date'), '030/11/2018')

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdachte'))

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdachte n'), 'aa')

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/person selection'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Zoek Criteria'), '201', false)

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Achternaam'), '\'a')

WebUI.delay(1)

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Geboorte datum'), '04/03/2005')

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/filter'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/display'))

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/select'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Instantie'), '1', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Instantie 1'), '1', false)

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Officier van Justitie'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Parketsecretaris'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Rechter'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Griffier'), 'aa')

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Delictsoort'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Omschrijving'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking new'))

WebUI.delay(1)

WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Wetboek'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Titel'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Artikel'), 'aa')

WebUI.delay(1)

WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegdatum 1'), '012/12/2019')

WebUI.delay(1)

WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegdatum 2'), '012/12/2019')

WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats'), 'aa')

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Uitvoering'), '8', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Daderschap'), '23', false)

WebUI.delay(3)

WebUI.click(findTestObject('Priem-2 scripts/Contact/conect'))

WebUI.click(findTestObject('Priem-2 scripts/Contact/contact new'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Contact/Relatie'), '5', false)

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Advocaat'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/addres'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Huisnummer'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Telefoon werk'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Mobiel'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/Fax'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Contact/EMail'), 'aa')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/ea close'))

WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

