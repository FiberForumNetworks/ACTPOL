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
import com.kms.katalon.core.webui.helper.screenshot.WebUIScreenCaptor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/*WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(2)

//String s1="//*[text()="304"]/preceding-sibling::td/a[2]";
////*[text()="299"]/preceding-sibling::td/a[2][count(. | //*[@ref_element = 'Object Repository/Actpol_Scripts/Iframe/RightFrame']) = count(//*[@ref_element = 'Object Repository/Actpol_Scripts/Iframe/RightFrame'])]

 
String dynamicId ='300'
String xpath = '//*[text()="'+dynamicId+'"]/preceding-sibling::td/a[2]'
println(xpath)
//TestObject to = new TestObject("objectName")


TestObject to=findTestObject('Object Repository/Actpol_Scripts/Opsporing/Onderzoek/esisting new onderzoek user test')
to.addProperty('xpath', ConditionType.EQUALS, xpath)
WebUI.click(to)
*/
/*String s='26/08/2019'

String rev="";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i)

}
println(rev)*/
/*def Var mydate =new Date('26/08/2019');
Var str = mydate.toString("yy-mm-dd");

println(str)*/
/*String s1="28-08-2019";
String[] words=s1.split("-");//splits the string based on whitespace
//using java foreach loop to print elements of string array

System.out.println(words);*/
/*mydate = new Date("27/08/2019")
//mydate1=mydate.format("27/08/2019")
formattedDate = mydate.format("yyyy")
println(formattedDate)*/
//String="//*[@id="MiddelenAUform"]/table/tbody/tr[2]/td[2]/input[1]"
//String s1='//*[@id="MiddelenAUform"]/table/tbody/tr['
//String s2="]/td[2]/input[1]"
not_run: WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/MBES18 TAB'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/edit default mbes 18'))

not_run: WebUI.delay(8)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/Registratie tab'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Documenten tab'), FailureHandling.OPTIONAL)

/*
 * 
 * GENEESKUNDIGE VERKLARING BES 
KMAR AANVRAAG TAP EN INLICHTING 
KMAR AANVRAAG VERSTREKKING INLICHTINGEN 
KMAR AFSTANDSVERKLARING 
KMAR PV BEVINDINGEN 
KMAR PV BLANCO 
KMAR VOORBLADDOSSIER 
KMAR WERKOMSLAG 
KPA Mbes18 Insluiting 
KPM XML Aanvraag Onderzoek Witwassen (FIU) 
KPM XML Afstandsverklaring Goederen 
KPM XML Bewijs van Ontvangst 
KPM XML Bewijs Afgifte 
KPM XML Bewijsmatrix 
KPM XML Checklist Info Gesprek 
KPM XML Intake Digitale Opsporing 
KPM XML Post Mortem Formulier 
KPM XML PV BEVINDINGEN 
KPM XML Rapport Gebruik Dienstpistool 
ONTSLAGKAARTARRESTANTEN BES 
ONTVANGSTBEWIJS 
OPSPORING VERDACHTE BES 
PROCES VERBAAL INZAKE VERKEERS ONGEVAL BES 
PV BEVINDINGEN BES 
PV VERKEER MISDRIJF BES 
PV VERKEER OVERTREDING BES 
PV VERKEER 6AA BES 
RAPPORT VERKEERSONGEVAL VES 
Verkeersregistratie KPA 
VERPLAATSINGKAART ARRESTANTEN BES 
XML PV BEVINDINGEN 
XML PV MUTATIE 
XML VERZEKERINGSRAPPORT KPA
 * 
 * 
 */
not_run: for (int i = 1; i <= 34; i++) {
    println(i)

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('Actpol_Scripts/Opsporing/MBES18/3 INBEWARINGSTELLINGS_C.Q._PLAATSINGSGEGEVENS/INBEWARINGSTELLINGS C.Q. PLAATSINGSGEGEVENS tab'), 
        0)

    WebUI.delay(1)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Document new'), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.selectOptionByIndex(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Selecteer Documentsjabloon'), 
        i, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/new document save'))

    String list = 'Selecteer een ander document.'

    WebUI.delay(1)

    check = WebUI.getText(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/Selecteer Documentsjabloon error message'), 
        FailureHandling.OPTIONAL)

    WebUI.delay(4)

    if (check == list) {
        WebUI.click(findTestObject('Actpol_Scripts/Opsporing/MBES18/8 Documenten/New Document Close'))
    } else {
        println('document not selecting::' + check)
    }
}

String s='26/08/2019'

String[] values=s.split("/")

System.out.println(values[2]+"-"+values[1]+"*"+values[0])
Test=WebUI.concatenate(values[2]+"-"+values[1]+"*"+values[0])
System.out.println(Test);
 StringTokenizer tokenizer = new StringTokenizer(s, "/");
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
		 
String s1="12valii6i58"
String s2=s1.replaceAll("[^0-9^.]", "")
println(s2)
int sum=0

char[] s3 = s2.toCharArray();
for (int i=0;i<s3.length;i++)

{
	
int a=s3[i]	
//int a=Character.getNumericValue(s3[i])
sum=sum+a
println(sum)

/*println(s3[i])
	println(sum)
	sum =sum +integer.
	println(sum)*/
		
}
println(sum)