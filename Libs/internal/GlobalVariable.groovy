package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : URL of the Application Under Test (AUT)</p>
     */
    public static Object DEVURL
     
    /**
     * <p>Profile default : A valid account used during the test</p>
     */
    public static Object password
     
    /**
     * <p>Profile default : A valid account used during the test</p>
     */
    public static Object username
     
    /**
     * <p>Profile default : URL of the Application Under Test (AUT)</p>
     */
    public static Object TESTURL
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object AssistentieID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object ArrestantenId
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object OnderzoekID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object RegisterID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object AanhoudingsOpsporingsbevelID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object CaseScreeningID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object TaktiekID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object VoorarrestID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object Generiekassistenite_Module
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object NoodhulpID
     
    /**
     * <p>Profile default : Change evary time we need id</p>
     */
    public static Object Total_HandhavingID_OPV
     
    /**
     * <p></p>
     */
    public static Object Total_AutorisatieID
     
    /**
     * <p></p>
     */
    public static Object KCURL
     
    /**
     * <p></p>
     */
    public static Object KCusername
     
    /**
     * <p></p>
     */
    public static Object kcpassword
     
    /**
     * <p></p>
     */
    public static Object KBKPCNURL
     
    /**
     * <p></p>
     */
    public static Object KBKPCNusername
     
    /**
     * <p></p>
     */
    public static Object KBKMARURL
     
    /**
     * <p></p>
     */
    public static Object KBKMARusername
     
    /**
     * <p></p>
     */
    public static Object KMURL
     
    /**
     * <p></p>
     */
    public static Object KMusername
     
    /**
     * <p></p>
     */
    public static Object KWURL
     
    /**
     * <p></p>
     */
    public static Object KWusername
     
    /**
     * <p></p>
     */
    public static Object handhaving_mobileid
     
    /**
     * <p></p>
     */
    public static Object handhaving_patrouile
     
    /**
     * <p></p>
     */
    public static Object Groep_AutorisatieID
     
    /**
     * <p></p>
     */
    public static Object ClassificatieID
     
    /**
     * <p></p>
     */
    public static Object GoederenLocatie
     
    /**
     * <p></p>
     */
    public static Object Meldingid
     
    /**
     * <p></p>
     */
    public static Object Dienstovername_WachtovernameID
     
    /**
     * <p></p>
     */
    public static Object FATKPCNURL
     
    /**
     * <p></p>
     */
    public static Object FATKPCNID
     
    /**
     * <p></p>
     */
    public static Object FATKPCNPASSWORD
     
    /**
     * <p></p>
     */
    public static Object FATKUMARURL
     
    /**
     * <p></p>
     */
    public static Object FATKMARID
     
    /**
     * <p></p>
     */
    public static Object FATKMARPASWORD
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            DEVURL = selectedVariables['DEVURL']
            password = selectedVariables['password']
            username = selectedVariables['username']
            TESTURL = selectedVariables['TESTURL']
            AssistentieID = selectedVariables['AssistentieID']
            ArrestantenId = selectedVariables['ArrestantenId']
            OnderzoekID = selectedVariables['OnderzoekID']
            RegisterID = selectedVariables['RegisterID']
            AanhoudingsOpsporingsbevelID = selectedVariables['AanhoudingsOpsporingsbevelID']
            CaseScreeningID = selectedVariables['CaseScreeningID']
            TaktiekID = selectedVariables['TaktiekID']
            VoorarrestID = selectedVariables['VoorarrestID']
            Generiekassistenite_Module = selectedVariables['Generiekassistenite_Module']
            NoodhulpID = selectedVariables['NoodhulpID']
            Total_HandhavingID_OPV = selectedVariables['Total_HandhavingID_OPV']
            Total_AutorisatieID = selectedVariables['Total_AutorisatieID']
            KCURL = selectedVariables['KCURL']
            KCusername = selectedVariables['KCusername']
            kcpassword = selectedVariables['kcpassword']
            KBKPCNURL = selectedVariables['KBKPCNURL']
            KBKPCNusername = selectedVariables['KBKPCNusername']
            KBKMARURL = selectedVariables['KBKMARURL']
            KBKMARusername = selectedVariables['KBKMARusername']
            KMURL = selectedVariables['KMURL']
            KMusername = selectedVariables['KMusername']
            KWURL = selectedVariables['KWURL']
            KWusername = selectedVariables['KWusername']
            handhaving_mobileid = selectedVariables['handhaving_mobileid']
            handhaving_patrouile = selectedVariables['handhaving_patrouile']
            Groep_AutorisatieID = selectedVariables['Groep_AutorisatieID']
            ClassificatieID = selectedVariables['ClassificatieID']
            GoederenLocatie = selectedVariables['GoederenLocatie']
            Meldingid = selectedVariables['Meldingid']
            Dienstovername_WachtovernameID = selectedVariables['Dienstovername_WachtovernameID']
            FATKPCNURL = selectedVariables['FATKPCNURL']
            FATKPCNID = selectedVariables['FATKPCNID']
            FATKPCNPASSWORD = selectedVariables['FATKPCNPASSWORD']
            FATKUMARURL = selectedVariables['FATKUMARURL']
            FATKMARID = selectedVariables['FATKMARID']
            FATKMARPASWORD = selectedVariables['FATKMARPASWORD']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
