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

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/date'), '030/11/2018')

WebUI.click(findTestObject('test/flipkart/temp/Registratiedatum'))

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/month'), '2', false)

WebUI.selectOptionByValue(findTestObject('test/flipkart/temp/year'), '2020', false)

WebUI.click(findTestObject('test/flipkart/temp/click 17'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Rechtsvorm'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Rechtsvorm/Rechtsvorm'), '22', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Handelsnaam'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Officiele benaming'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/adres'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/adres2'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Bestuurder_Vertegenwoordiger'), 'aa')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Datum Oprichting'), '030/11/2018')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Datum laatste statutenwijziging'), '030/11/2018')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Datum vestiging'), '030/11/2018')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Officier van Justitie'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Parketsecretaris'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Rechter'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Griffier'), 'aa')

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Delictsoort'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Omschrijving'), '1', false)

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking new'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Wetboek'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Titel'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Artikel'), 'aa')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegdatum 1'), '012/12/2019')

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegdatum 2'), '012/12/2019')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegplaats'), 'aa')

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Uitvoering'), '8', false)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Daderschap'), '23', false)

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Priem-2 scripts/Verdenking/cancle'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Contact/conect'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Contact/contact new'))

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Contact/Relatie'), '5', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/Advocaat'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/addres'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/Huisnummer'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/Telefoon werk'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/Mobiel'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/Fax'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Contact/EMail'), 'aa')

not_run: WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Priem-2 scripts/Contact/close'))

not_run: WebUI.refresh()

not_run: WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Registratie/Parket Zaak EA'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/new click'))

not_run: WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parketcode/parketcode'), '520', false)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/date'), '030/11/2018')

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdachte'))

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdachte n'), 'aa')

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Instantie'), '1', false)

not_run: WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Instantie 1'), '1', false)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Officier van Justitie'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Parketsecretaris'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Rechter'), 'aa')

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Griffier'), 'aa')

not_run: WebUI.takeScreenshot()

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/ea close'))

not_run: WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

not_run: WebUI.closeBrowser()

