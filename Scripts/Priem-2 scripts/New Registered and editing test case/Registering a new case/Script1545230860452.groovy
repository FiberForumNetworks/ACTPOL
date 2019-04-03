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

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/JPRM154/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('Priem-2 scripts/login/userid'), 'sasi')

WebUI.setEncryptedText(findTestObject('Priem-2 scripts/login/password'), 'ZL79PUUVa9nhd4g3NLBVYw==')

WebUI.click(findTestObject('Priem-2 scripts/login/login'))

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/Parket Zaak EA'))

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/new click'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parketcode/parketcode'), '586', false)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Registratiedatum img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '10', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Rechtsvorm'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Rechtsvorm/Rechtsvorm'), '26', false)

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Handelsnaam'), 'vali nmv')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Officiele benaming'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/adres'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/adres2'), 'aa')

WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Bestuurder_Vertegenwoordiger'), 'aa')

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Datum Oprichting'), '030/11/2018')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum Oprichting img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Datum laatste statutenwijziging'), '030/11/2018')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum laatste statutenwijziging img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Parket Zaak EA/Datum vestiging'), '030/11/2018')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Datum vestiging img calendar'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click1'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click2'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click3'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/click4'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/lb click 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Delictsoort'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parket Zaak EA/Omschrijving'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/Verdenking new'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Wetboek'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Wetboek lb click'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Titel'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Titel'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Titel lb click'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Artikel'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Artikel lb click'))

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegdatum 1'), '012/12/2019')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Pleegdatum img calendar 1'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

not_run: WebUI.setText(findTestObject('Priem-2 scripts/Verdenking/Pleegdatum 2'), '012/12/2019')

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Pleegdatum img calendar 2'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/month'))

WebUI.click(findTestObject('Priem-2 scripts/Calendar/year'))

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Pleegplaats'))

WebUI.delay(1)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Pleegplaats'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Pleegplaats lb click'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Uitvoering'), '8', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Verdenking/Daderschap'), '23', false)

WebUI.click(findTestObject('Priem-2 scripts/Verdenking/save data'))

WebUI.delay(5)

WebUI.click(findTestObject('Priem-2 scripts/Contact/location'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/Contact/conect'))

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Contact/contact new'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Contact/Relatie'), '5', false)

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Advocaat'))

WebUI.click(findTestObject('Priem-2 scripts/eye ea/Advocaat lb click'))

WebUI.click(findTestObject('Priem-2 scripts/Contact/save data con'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Priem-2 scripts/Contact/element'), 3)

WebUI.click(findTestObject('Priem-2 scripts/Contact/save ea total'))

WebUI.click(findTestObject('Priem-2 scripts/Contact/save ea total'))

WebUI.delay(5)

/*WebUI.mouseOver(findTestObject('Priem-2 scripts/Registratie/EA'))

WebUI.click(findTestObject('Priem-2 scripts/Registratie/Parket Zaak EA'))

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/new click'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Parketcode/parketcode'), '586', false)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Priem-2 scripts/calendar img src/Registratiedatum img calendar'))

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/month'), '10', false)

WebUI.selectOptionByValue(findTestObject('Priem-2 scripts/Calendar/year'), '2018', false)

WebUI.click(findTestObject('Priem-2 scripts/right calendar/21 st date'))

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

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Priem-2 scripts/Parket Zaak EA/ea close'))*/
WebUI.click(findTestObject('Priem-2 scripts/login/logout'))

WebUI.closeBrowser()

