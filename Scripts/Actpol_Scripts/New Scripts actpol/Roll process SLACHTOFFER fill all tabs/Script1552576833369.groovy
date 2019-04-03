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

WebUI.mouseOver(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Generiek'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Menu navigation/Generiek/Assistenties'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user 4'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('SLACHTOFFER')

'SLACHTOFFER'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '15', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtoffer Naam'), 'ALONSO')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Slachtoffer Naam lb 3'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Toestand slachtoffer'), 'lag')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Toestand slachtoffer lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/SLACHTOFFER Slachtofferhulp na'))

WebUI.delay(3)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/Slachtoffer tab minimize'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer new'))

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer text'), 'aan')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer text lb'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtoffer Reden Slachtoffer'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/Mensenhandel'))

WebUI.delay(1)

'Herkomstregio 1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Herkomstregio'), '173', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Aangifte ja'))

WebUI.delay(1)

'PsychischeBinding1'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Psychische binding'), '175', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Gebruik geweld ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Sporen van geweld na'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Uiterlijke kenmerken'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Cosmetische ingrepen na'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Aantal klanten p d'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Bedrag per klant'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Bedrag afgestaan uitbuiter'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Hoeveel dagen per week'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Aantal uren per dag'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Bedenktijd genoten na'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Leefomstandigheden'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Sanitaire voorziening ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Alcohol gebruik ja'))

WebUI.delay(1)

'CRACK'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Drugsgebruik'), '6', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Aangifte na bedenktijd ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Verblijfstitel ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER B 8 aangeboden na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER cstratie Comensha na'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/Mensenhandel'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Overlijden Datum'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Overlijden Tijd'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Geconstateerd door'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Lijk in beslag genomen ja'))

WebUI.delay(1)

'ANTONIA, Carol'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Op last van HOVJ OVJ'), 
    '51', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Datum lijk vrijgegeven'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Tijd lijk vrijgegeven'))

WebUI.delay(1)

'DANDARE, Franklin'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden Op last van'), 
    '61', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Overlijden'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKEN VAARTUIG/Bekeurde persoon Verklaring Opmaak Increase indent'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/A ONBEKEND/ONBEKEND Verklaring built clicking'))

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Verklaring text area'), 
    'Joseph Maurice Ravel  7 March 1875 – 28 December 1937) was a French composer, pianist and conductor. He is often associated with impressionism along with his elder contemporary Claude Debussy, although both composers rejected the term. In the 1920s and 1930s Ravel was internationally regarded as France\'s greatest living composer.Born to a music-loving family, Ravel attended France\'s premier music college, the Paris Conservatoire; he was not well regarded by its conservative establishment, whose biased treatment of him caused a scandal. After leaving the conservatoire, Ravel found his own way as a composer, developing a style of great clarity, incorporating elements of baroque, neoclassicism and, in his later works, jazz. He liked to experiment with musical form, as in his best-known work, Boléro (1928), in which repetition takes the place of development.')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A ONBEKEND/ONBEKEND Verklaring color down arrow clicking'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A ONBEKEND/ONBEKEND Verklaring color select'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A ONBEKEND/ONBEKEND Verklaring number built select'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Verklaring text area'), 'He made some orchestral arrangements of other composers\' music, of which his 1922 version of Mussorgsky\'s Pictures at an Exhibition is the best known.As a slow and painstaking worker, Ravel composed fewer pieces than many of his contemporaries. Among his works to enter the repertoire are pieces for piano, chamber music, two piano concertos, ballet music, two operas and eight song cycles; he wrote no symphonies or church music. Many of his works exist in two versions: first, a piano score and later an orchestration. Some of his piano music, such as Gaspard de la nuit (1908), is exceptionally difficult to play, and his complex orchestral works such as Daphnis et Chloé (1912) require skilful balance in performance.Ravel was among the first composers to recognise the potential of recording to bring their music to a wider public. From the 1920s, despite limited technique as a pianist or conductor, he took part in recordings of several of his works; others were made under his supervision.')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Ambts Verslag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER Ambts Verslag text area'), 'Joseph Maurice Ravel 7 March 1875 – 28 December 1937) was a French composer, pianist and conductor. He is often associated with impressionism along with his elder contemporary Claude Debussy, although both composers rejected the term. In the 1920s and 1930s Ravel was internationally regarded as France\'s greatest living composer.Born to a music-loving family, Ravel attended France\'s premier music college, the Paris Conservatoire; he was not well regarded by its conservative establishment, whose biased treatment of him caused a scandal. After leaving the conservatoire, Ravel found his own way as a composer, developing a style of great clarity, incorporating elements of baroque, neoclassicism and, in his later works, jazz. He liked to experiment with musical form, as in his best-known work, Boléro (1928), in which repetition takes the place of development. He made some orchestral arrangements of other composers\' music, of which his 1922 version of Mussorgsky\'s Pictures at an Exhibition is the best known.As a slow and painstaking worker, Ravel composed fewer pieces than many of his contemporaries. Among his works to enter the repertoire are pieces for piano, chamber music, two piano concertos, ballet music, two operas and eight song cycles; he wrote no symphonies or church music. Many of his works exist in two versions: first, a piano score and later an orchestration. Some of his piano music, such as Gaspard de la nuit (1908), is exceptionally difficult to play, and his complex orchestral works such as Daphnis et Chloé (1912) require skilful balance in performance.Ravel was among the first composers to recognise the potential of recording to bring their music to a wider public. From the 1920s, despite limited technique as a pianist or conductor, he took part in recordings of several of his works; others were made under his supervision.')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A SLACHTOFFER/SLACHTOFFER roll save'))

WebUI.delay(5)

WebUI.takeScreenshot()

