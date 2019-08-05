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

WebUI.deleteAllCookies()

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

/*WebUI.navigateToUrl(GlobalVariable.TESTURL)

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.username)

WebUI.setMaskedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.password)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))*/
int ACTPOLTESTENV = 1

int ACTPOLDEVENV = 2

int ACTPOLKCENV = 3

int ACTPOLKBKPCNENV = 4

int ACTPOLKBKMARENV = 5

int ACTPOLKMENV = 6

int ACTPOLKWENV = 7

int environment = ACTPOLKWENV

String Selectenv

switch (environment) {
    case 1:
        println(Selectenv = 'ACTPOL-TEST-ENV')

        WebUI.navigateToUrl(GlobalVariable.TESTURL)

        WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.username)

        WebUI.setMaskedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.password)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    case 2:
        println(Selectenv = 'ACTPOL-DEV-ENV')

        WebUI.navigateToUrl(GlobalVariable.DEVURL)

        WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.username)

        WebUI.setMaskedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.password)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    case 3:
        println(Selectenv = 'ACTPOL-KC-ENV')

        WebUI.navigateToUrl(GlobalVariable.KCURL)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.KCusername)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.kcpassword)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    case 4:
        println(Selectenv = 'ACTPOL-KBKPCN-ENV')

        WebUI.navigateToUrl(GlobalVariable.KBKPCNURL)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.KBKPCNusername)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.kcpassword)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    case 5:
        println(Selectenv = 'ACTPOL-KBKMAR-ENV')

        WebUI.navigateToUrl(GlobalVariable.KBKMARURL)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.KBKMARusername)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.kcpassword)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    case 6:
        println(Selectenv = 'ACTPOL-KM-ENV')

        WebUI.navigateToUrl(GlobalVariable.KMURL)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.KMusername)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.kcpassword)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    case 7:
        println(Selectenv = 'ACTPOL-KW-ENV')

        WebUI.navigateToUrl(GlobalVariable.KWURL)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.KWusername)

        WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.kcpassword)

        WebUI.click(findTestObject('Actpol_Scripts/login/login'))

        break
    default:
        println(Selectenv = 'Invalide environment selected')}

