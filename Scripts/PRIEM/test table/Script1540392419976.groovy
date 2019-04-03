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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

not_run: WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

not_run: WebUI.setText(findTestObject('test/Page_Login Page for ACTPRM Develope/input_User ID_user'), GlobalVariable.user2)

not_run: WebUI.setEncryptedText(findTestObject('test/Page_Login Page for ACTPRM Develope/input_Password_password'), 'yFGvMLXn1sM=')

not_run: WebUI.click(findTestObject('test/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

not_run: WebUI.mouseOver(findTestObject('test/temp/Page_ACTPRM Developer/span_1-Registratie'))

not_run: WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/a_Parket Zaak EA'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/a_3 (1)'))

not_run: WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/a_Log out'))

not_run: WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.20.10.7:8203/actprmdev/jprm270/nxmenu.pgm?docnum=551')

WebUI.setText(findTestObject('test/Page_Login Page for ACTPRM Develope/input_User ID_user'), 'sasi2')

WebUI.setEncryptedText(findTestObject('test/Page_Login Page for ACTPRM Develope/input_Password_password'), 'yFGvMLXn1sM=')

WebUI.click(findTestObject('test/Page_Login Page for ACTPRM Develope/input_Keep me logged in for my'))

not_run: WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/div_Algemene Zoekopdracht'))

WebUI.selectOptionByValue(findTestObject('test/temp/Page_ACTPRM Developer/select_Verdachte'), 'verdachte', 
    true)

WebUI.setText(findTestObject('test/temp/Page_ACTPRM Developer/input_Achternaam_anaam'), 'BOOM')

not_run: WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('test/temp/Page_ACTPRM Developer/clik date van'), '018/09/2018')

WebUI.setText(findTestObject('test/temp/Page_ACTPRM Developer/click date naar'), '018/09/2018')

WebUI.delay(3)

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/input_Achternaam_anaam'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Algemene Zoekopdracht/filter new'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/recordpull'), FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/span_1-Registratie'))

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/a_Parket Zaak EA'))

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/a_Parket Zaak EA_new-record lo'))

WebUI.selectOptionByValue(findTestObject('test/temp/Page_ACTPRM Developer/select_520 - VERKEER555 - VEEL'), 
    '520', true)

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/input_Rechtsvorm_PRKRSRPR'))

WebUI.setText(findTestObject('test/temp/Page_ACTPRM Developer/input__PRKRPERSac'), 'aa')

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/a__persoon-select btn btn-defa'))

WebUI.selectOptionByValue(findTestObject('test/temp/Page_ACTPRM Developer/select_IdentiteitKeno codeOver'), 
    '198', true)

WebUI.selectOptionByValue(findTestObject('test/temp/Page_ACTPRM Developer/select_IdentiteitKeno codeOver'), 
    '201', true)

WebUI.setText(findTestObject('test/temp/Page_ACTPRM Developer/input_Achternaam_ww_fBURLNAME'), 'a')

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/input_Geboorte datum_filter'))

WebUI.click(findTestObject('test/temp/Page_ACTPRM Developer/img'))

