import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.util.List

WebUI.callTestCase(findTestCase('main/Actpol_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

String name = 'abcdefghijklmnopqrstuvwxyz'

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/A infoorg/Info organisatie sub tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default EDit'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Algemeen tab'))

WebUI.delay(1)

String Tab_Verify = WebUI.verifyElementPresent(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'), 
    1, FailureHandling.OPTIONAL)

String ambttabdispay = 'true'

if (Tab_Verify == ambttabdispay) {
 

	WebUI.delay(2)
	
		String jrecordcount = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal record count check'))
		//int n=jrecordcount.lenght()
		String jre=jrecordcount.substring(1)
		KeywordUtil.logInfo(jre)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'))
	
		for (int i = 1; i <= 4; i++) {
			WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag new'))
	
			WebUI.delay(7)
	
			WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verklaring registratie'), 'nvkldsnklvnklfdnbfdnlb knkgfv bklngfn ;fn lfdn knfn bnfgb o;lfnd l;fnl ngfn ;lfmb mfl;d fkn ;fldn \'lfd sp\'fwqhfwqofv eihgopewhg[[wekz;vm dsz/vm z jfwpjf;oeaighrep9-ghrepbnofaerb[horenbodn')
	
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/ambt dave'))
	
			WebUI.delay(4)
			
		}
		
		WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'))
		
		WebUI.delay(2)
		
			String jrecordcountafter = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal record count check'))
			
					//tring n1=jrecordcountafter.lenght()
					String jrev=jrecordcount.substring(1,3)
					KeywordUtil.logInfo(jrev)
			
			if(jre==jrev)
			{
				KeywordUtil.markError("Ambtsverslag data is not stroing on Journaal tab ")
			}
			else
			{
				WebUI.delay(2)
				KeywordUtil.logInfo("Ambtsverslag data is stroed on Journaal tab")
				 
				String totalcount=jre+jrev
				
				KeywordUtil.logInfo(totalcount   +": total count" )
				
			}
	
} else {
    KeywordUtil.logInfo('ambt tab is not showing on grid')

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Objecten tab'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Objecten new'))

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Type'), 'Andere', false)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Omschrijving'), randomname(name, 150))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Bijzonderheden'), randomname(name, 150))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Objectn save'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/info save'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Default EDit'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Algemeen tab'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'))

    WebUI.delay(2)

    String jrecordcount = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal record count check'))
	
	KeywordUtil.logInfo(jrecordcount[1])
	
    WebUI.delay(2)

    for (int i = 1; i <= 4; i++) {
        WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag new'))

        WebUI.delay(7)

        WebUI.setText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Verklaring registratie'), 'nvkldsnklvnklfdnbfdnlb knkgfv bklngfn ;fn lfdn knfn bnfgb o;lfnd l;fnl ngfn ;lfmb mfl;d fkn ;fldn \'lfd sp\'fwqhfwqofv eihgopewhg[[wekz;vm dsz/vm z jfwpjf;oeaighrep9-ghrepbnofaerb[horenbodn')

        WebUI.delay(2)

        WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/ambt dave'))

        WebUI.delay(4)
		
    }
	
	WebUI.click(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Ambtsverslag tab'))
	
	WebUI.delay(2)
	
		String jrecordcountafter = WebUI.getText(findTestObject('Actpol_Scripts/Info organisatie/a infodesk/Journaal record count check'))
		
		KeywordUtil.logInfo(jrecordcountafter[1])
		
		if(jrecordcountafter[1]==jrecordcount[1])
		{
			KeywordUtil.markError("Ambtsverslag data is not stroing on Journaal tab ")
		}
		else
		{
			WebUI.delay(2)
			KeywordUtil.logInfo("Ambtsverslag data is stroed on Journaal tab")
			 
			String totalcount=jrecordcountafter[1]+jrecordcount[1]
			
			KeywordUtil.logInfo(totalcount   +": total count" )
			
		}
	

}

static String randomname(String name, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(name.charAt(rand.nextInt(name.length())))
    }
    
    return sb.toString()
}

