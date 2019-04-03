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

WebUI.callTestCase(findTestCase('main/Actpol_Login_testenv'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Opsporing'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Opsporing/Onderzoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Edit user'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Entiteiten'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Nieuwe Entiteit'))

WebUI.delay(1)

'Persoon'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Opsporing/Onderzoek/Type Entiteit'), '13', false)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Achternaam'), 'BOMBAD')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Achternaam lb'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Opmerking'), 'English singer and songwriter Ellie Goulding has recorded songs for three studio albums and guest features. After signing a contract with record label Polydor Records in July 2009, Goulding began to work on her debut studio album, Lights, which was ultimately released in February 2010.[1] The first single released from the album was "Under the Sheets", which Goulding wrote in collaboration with Starsmith.[2] Starsmith co-wrote four other songs and served as the album\'s primary producer.[2] Goulding also collaborated with Jonny Lattimer on the singles "Starry Eyed" and "The Writer", and shared writing credits with Fraser T. Smith on "Your Biggest Mistake".[2] In November 2010, the singer re-released Lights as Bright Lights, which included the standard version of the album and several new songs.[2] She collaborated with Richard Stannard and Ash Howes on "Lights" and recorded a cover version of Elton John\'s "Your Song".[2] At this time, Goulding also contributed guest vocals on the song "Wonderman" for Tinie Tempah\'s debut studio album Disc-Overy (2010).[3]')

WebUI.delay(1)

'BETROKKENE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Rol Proces'), '5', false)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Slachtofferhulp ja'))

WebUI.delay(3)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/Contacten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Reden Slachtofferhulp'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Reden Slachtofferhulp new'))

WebUI.delay(2)

'ANDERE ZIE MUTATIE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Reden'), '1', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Omschrijving'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Reden Slachtofferhulp save'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Reden Slachtofferhulp'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Strafbare feiten new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit new new'), FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Wetboek'), 'WAPENVERORDENING 1930')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Wetboek lb'))

WebUI.delay(3)

'DRAAG- EN AFGIFTEPLICHT MACHTIGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Titel'), '48', 
    false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Artikel'), 'ARTIKEL 9')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare FeitArtikel lb'))

WebUI.delay(2)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Uitvoering'), 
    '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Titel save popup window'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen new new'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Goed artikel'), 'AANSTEKER')

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Goederen Goed artikel lb 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'IN BESLAGGENOMEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Status goed'), 
    '2_9', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Close'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig new new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig Voertuig'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig Voertuig user selection'))

WebUI.delay(3)

'OVERTREDING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig Reden Inschrijving'), 
    '5', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig save'))

WebUI.delay(6)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Voertuig'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig new'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig new new'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig Vaartuig'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig user selection'))

WebUI.delay(2)

'OVERTREDING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig Reden Inschrijving'), 
    '30', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen new new'), FailureHandling.OPTIONAL)

WebUI.delay(3)

'GEVONDEN EN INBESLAGGENOMEN IN VOERTUIG'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen Reden Inschrijven'), 
    '7', false)

WebUI.delay(2)

'SLAGWAPEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen Soort Wapen'), 
    '2', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen save'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKEN VAARTUIG/Bekeurde persoon Verklaring Opmaak Increase indent'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKEN VAARTUIG/Bekeurde persoon Verklaring Opmaak Increase indent'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKEN VAARTUIG/Bekeurde persoon Verklaring Opmaak Increase indent'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKEN VAARTUIG/Bekeurde persoon Verklaring Opmaak Increase indent'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKEN VAARTUIG/Bekeurde persoon Verklaring Opmaak Increase indent'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Verklaring text area'), 'Joseph Maurice Ravel (/rəˈvɛl/; French: [ʒozɛf mɔʁis ʁavɛl]; 7 March 1875 – 28 December 1937) was a French composer, pianist and conductor. He is often associated with impressionism along with his elder contemporary Claude Debussy, although both composers rejected the term. In the 1920s and 1930s Ravel was internationally regarded as France\'s greatest living composer.Born to a music-loving family, Ravel attended France\'s premier music college, the Paris Conservatoire; he was not well regarded by its conservative establishment, whose biased treatment of him caused a scandal. After leaving the conservatoire, Ravel found his own way as a composer, developing a style of great clarity, incorporating elements of baroque, neoclassicism and, in his later works, jazz. He liked to experiment with musical form, as in his best-known work, Boléro (1928), in which repetition takes the place of development. He made some orchestral arrangements of other composers\' music, of which his 1922 version of Mussorgsky\'s Pictures at an Exhibition is the best known.As a slow and painstaking worker, Ravel composed fewer pieces than many of his contemporaries. Among his works to enter the repertoire are pieces for piano, chamber music, two piano concertos, ballet music, two operas and eight song cycles; he wrote no symphonies or church music. Many of his works exist in two versions: first, a piano score and later an orchestration. Some of his piano music, such as Gaspard de la nuit (1908), is exceptionally difficult to play, and his complex orchestral works such as Daphnis et Chloé (1912) require skilful balance in performance.Ravel was among the first composers to recognise the potential of recording to bring their music to a wider public. From the 1920s, despite limited technique as a pianist or conductor, he took part in recordings of several of his works; others were made under his supervision.')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Ambts Verslag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Ambts Verslag text area'), 
    'Joseph Maurice Ravel (/rəˈvɛl/; French: [ʒozɛf mɔʁis ʁavɛl]; 7 March 1875 – 28 December 1937) was a French composer, pianist and conductor. He is often associated with impressionism along with his elder contemporary Claude Debussy, although both composers rejected the term. In the 1920s and 1930s Ravel was internationally regarded as France\'s greatest living composer.Born to a music-loving family, Ravel attended France\'s premier music college, the Paris Conservatoire; he was not well regarded by its conservative establishment, whose biased treatment of him caused a scandal. After leaving the conservatoire, Ravel found his own way as a composer, developing a style of great clarity, incorporating elements of baroque, neoclassicism and, in his later works, jazz. He liked to experiment with musical form, as in his best-known work, Boléro (1928), in which repetition takes the place of development. He made some orchestral arrangements of other composers\' music, of which his 1922 version of Mussorgsky\'s Pictures at an Exhibition is the best known.As a slow and painstaking worker, Ravel composed fewer pieces than many of his contemporaries. Among his works to enter the repertoire are pieces for piano, chamber music, two piano concertos, ballet music, two operas and eight song cycles; he wrote no symphonies or church music. Many of his works exist in two versions: first, a piano score and later an orchestration. Some of his piano music, such as Gaspard de la nuit (1908), is exceptionally difficult to play, and his complex orchestral works such as Daphnis et Chloé (1912) require skilful balance in performance.Ravel was among the first composers to recognise the potential of recording to bring their music to a wider public. From the 1920s, despite limited technique as a pianist or conductor, he took part in recordings of several of his works; others were made under his supervision.')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Contacten save'))

WebUI.delay(16)

WebUI.scrollToPosition(10, 8)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Personalia'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Bijnaam'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Bijnaam new'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Bijnaam text box'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Bijnaam save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Bijnaam'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Foto'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Foto new'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Bestand'), 'C:\\Users\\user4\\Desktop\\tasks.png')

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Omschrijving'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Foto submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Foto'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Attach'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Attach new'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Attach Bestand'), 'C:\\Users\\user4\\Desktop\\tasks.png')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Attach Omschrijving'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Attach submit'))

WebUI.delay(8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Attach'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Documenten'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Documenten new'))

WebUI.delay(2)

'XML PV ENTITEIT PERSOON'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Selecteer Documentsjabloon'), '139', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Doc save popup'))

WebUI.delay(2)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Documenten'))

WebUI.comment('Check')

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen new'))

WebUI.delay(2)

'Communicatie Apparaat'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Type Entiteit'), '11', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Entiteit new'))

WebUI.delay(4)

'Computer'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie Apparaat/Type apparaat'), '7', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/IMEI nummer'), '15')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/IMSI nummer'), '12')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Merk'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Model Type'), 'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Email address'), 'testing@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Web address'), 'www.testing.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/IP address'), '192.168.0.1')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Opmerking'), 'Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Communicate save'))

'Anders - aa aa'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Communicatie/Entiteit drop down'), 
    '149', false)

WebUI.delay(4)

'BOVEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Soort Relatie'), '4', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Adres/Koppelen save'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Person save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Entite/Persoon/Person close'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.takeScreenshot()

