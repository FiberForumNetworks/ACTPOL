import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default EDit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Algemeen tab'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Bijlage tab'))

WebUI.delay(1)

String name = 'abcdefghijklmnopqrstuvwxyz'

String documentrootpath = System.getProperty('user.dir')

String adddocument = new File(documentrootpath + '/Data Files/document.pdf')

String adddjpg = new File(documentrootpath + '/Data Files/tempjpgfile.png')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Bijlage new'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Selecteer Document'), adddocument)

WebUI.delay(1)

String omstext = randomname(name, 7)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Omschrijving'), omstext)

KeywordUtil.logInfo(omstext)
//String mww='//td[contains(text(), "'+ omstext +'")]'
WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Submit btn'))

WebUI.delay(25)

String Omschrijvingexpath = '//td[contains(text(), "'+ omstext +'")]'
 
 TestObject to = findTestObject('Object Repository/Actpol_Scripts/Info organisatie/A Bijlage/Verifytext')
 
 to.addProperty('xpath', ConditionType.EQUALS, Omschrijvingexpath)
 
 String verifytextdocument=WebUI.verifyElementVisible(to)
 String expecteddoc='true'
 KeywordUtil.logInfo(verifytextdocument)
 
 if(verifytextdocument==expecteddoc)
 {
	 KeywordUtil.markPassed("Document stored correctly in Bijlage")
 
	}
else
{
	KeywordUtil.markWarning("Document not stored in Bijlage")
}

//png upload
WebUI.delay(3)


WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Bijlage new'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Selecteer Document'), adddocument)

WebUI.delay(1)

String omstext1 = randomname(name, 7)

WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Omschrijving'), omstext1)

KeywordUtil.logInfo(omstext1)
WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A Bijlage/Submit btn'))

WebUI.delay(25)

String Omschrijvingexpath1 = '//td[contains(text(), "'+ omstext1 +'")]'
 
 TestObject to1 = findTestObject('Object Repository/Actpol_Scripts/Info organisatie/A Bijlage/Verifytext')
 
 to1.addProperty('xpath', ConditionType.EQUALS, Omschrijvingexpath1)
 
 String verifytextdocument1=WebUI.verifyElementVisible(to)
 String expecteddoc1='true'
 KeywordUtil.logInfo(verifytextdocument1)
 
 if(verifytextdocument1==expecteddoc1)
 {
	 KeywordUtil.markPassed("Document stored correctly in Bijlage")
 
	}
else
{
	KeywordUtil.markWarning("Document not stored in Bijlage")
}
static String randomname(String name, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(name.charAt(rand.nextInt(name.length())))
    }
    
    return sb.toString()
}

