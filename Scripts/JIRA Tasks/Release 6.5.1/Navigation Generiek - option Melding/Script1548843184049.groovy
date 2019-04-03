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

WebUI.navigateToUrl('http://10.20.10.7:8202/actpoldev/JPOL462/nxmenu.pgm?docnum=604')

WebUI.setText(findTestObject('Actpol_Scripts/login/userid'), GlobalVariable.ID)

WebUI.setEncryptedText(findTestObject('Actpol_Scripts/login/password'), GlobalVariable.enpassword)

WebUI.click(findTestObject('Actpol_Scripts/login/login'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Melding'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Melding/new melding'))

WebUI.delay(2)

'Selecting Informatie'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Type Melding'), '214', false)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Naam Melder'), 'testing user')

'Selecting KMAR'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Werkzaam bij'), '110', false)

WebUI.setText(findTestObject('JIRA/Datum'), '30/01/2019')

WebUI.delay(1)

'Selecting Afgehandeld'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Melding/Status'), '115', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Generiek/Melding/Omschrijving'), 'The natural environment encompasses all living and non-living things occurring naturally, meaning in this case not artificial. The term is most often applied to the Earth or some parts of Earth. This environment encompasses the interaction of all living species, climate, weather and natural resources that affect human survival and economic activity. [1] The concept of the natural environment can be distinguished as components.Complete ecological units that function as natural systems without massive civilized human intervention, including all vegetation, microorganisms, soil, rocks, atmosphere, and natural phenomena that occur within their boundaries and their nature.Universal natural resources and physical phenomena that lack clear-cut boundaries, such as air, water, and climate, as well as energy, radiation, electric charge, and magnetism, not originating from civilized human actions.People seldom find absolutely natural environments on Earth, and naturalness usually varies in a continuum, from 100% natural in one extreme to 0% natural in the other. More precisely, we can consider the different aspects or components of an environment, and see that their degree of naturalness is not uniform.[2] If, for instance, in an agricultural field, the mineralogic composition and the structure of its soil are similar to those of an undisturbed forest soil, but the structure is quite different.')

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Melding save'))

WebUI.delay(2)

WebUI.setText(findTestObject('JIRA/Datum van'), '30/01/2019')

WebUI.setText(findTestObject('JIRA/Datum tot'), '30/01/2019')

WebUI.delay(1)

'Informatie'
WebUI.selectOptionByValue(findTestObject('JIRA/Type melding'), '214', false)

WebUI.delay(1)

'Afgehandeld'
WebUI.selectOptionByValue(findTestObject('JIRA/Status'), '115', false)

WebUI.delay(1)

'KMAR'
WebUI.selectOptionByValue(findTestObject('JIRA/Werkzaam bij'), '110', false)

WebUI.delay(1)

WebUI.click(findTestObject('JIRA/Filter'))

WebUI.scrollToPosition(5, 5)
