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

WebUI.comment('VERDACHTE SIGNALEMENTEN')

'VERDACHTE SIGNALEMENTEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '16', false)

WebUI.waitForElementVisible(findTestObject('Actpol_Scripts/Extra script/VERDACHTE SIGNALEMENTEN Achternaam'), 40)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/VERDACHTE SIGNALEMENTEN Achternaam'), 'BOSS')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VERDACHTE SIGNALEMENTEN Achternaam lb 2'))

WebUI.delay(3)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Basis Signalement'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/HKS Signalementen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Gezicht Lengte Gemiddeld'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Gezicht Breedte Smal'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Kin Rechthoek'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Kuiltje Kin ja'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Kuiltje Wang nee'))

WebUI.delay(1)

'AMANDEL'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Oog Vorm'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Oog Grootte Gemiddeld'))

WebUI.delay(1)

'ALBINO'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Oog Kleur'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Wenkbrauwen Dun'))

WebUI.delay(1)

'HEEL LANG'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Neus Lengte'), '1', false)

WebUI.delay(1)

'BREED, WIJD, ROND'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Neus Breedte'), '1', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Mond Vorm Omhoog'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Lippen Gemiddeld'))

WebUI.delay(1)

'test2'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Tanden'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Oren Groot'))

WebUI.delay(1)

'MIDDELLENGTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Lengte'), '3', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Netheid Net'))

WebUI.delay(1)

'GLAD/STEIL'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Type'), '2', false)

WebUI.delay(1)

'GEDRAAID'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Stijl'), '2', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Maton Staart na'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Kleur'), 'ZWART')

WebUI.delay(1)

WebUI.focus(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Maton Staart na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Snor Geen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Haar Maton Staart na'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Baard Geen'))

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/HKS Signalementen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Uiterlijk Bijzonderheid'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Uiterlijk Bijzonderheid new'))

WebUI.delay(2)

'DIEPE VOORHOOFD RIMPELS'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Uiterlijke Bijzonderheid'), 
    '8', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Lichaamsdeel Bijzonderheid'), 'HALS')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Lichaamsdeel Bijzonderheid lb'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Uiterlijk Bijzonderheid save'))

WebUI.delay(2)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Uiterlijk Bijzonderheid'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VERDACHTE SIGNALEMENTEN Strafbare feiten new'))

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

'POGING'
not_run: WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Strafbare feiten Uitvoering'), 
    '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BETROKKENE/BETROKKENE Strafbare Feit Titel save popup window'))

WebUI.delay(4)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Verdachte Signalementen Voertuig'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Soort voertuig'), 'AUTOLADDER')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Merk'), 'ACURA')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Model Type'), 'MDX')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Kleur'), 'CHAMPAGNE')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Primaire kleur'), 'BLAUW')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Secundaire kleur'), 'CHAMPAGNE')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Bijzonderheden 1'), 'DEUK RECHTER ACHTERZIJKANT')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Bijzonderheden 2'), 'DEUK RECHTER ACHTERZIJKANT')

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Bijzonderheden 3'), 'DEUK RECHTER ACHTERZIJKANT')

WebUI.delay(1)

'Zonder Nummer'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Kenteken Type'), '2', false)

WebUI.delay(1)

WebUI.scrollToPosition(10, 8)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Verdachte Signalementen Voertuig'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VERDACHTE SIGNALEMENTEN Wapen new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen new new'))

WebUI.delay(3)

'ANDERE ZIE MUTATIE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen Reden Inschrijven'), '2', false)

WebUI.delay(1)

't3'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen Soort Wapen'), '7', false)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen save'))

WebUI.delay(5)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER Wapen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VS mo new new'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VERDACHTE SIGNALEMENTEN MO new'))

WebUI.delay(2)

'DWINGEN TOT AFGIFTE'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO dropdown selection'), '9', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VS mo text area'), 'testing')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VS mo save'))

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VS mo save'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/AANGEVER MO'))

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

WebUI.sendKeys(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Verklaring text area'), 'Joseph Maurice Ravel  7 March 1875 – 28 December 1937) was a French composer, pianist and conductor. He is often associated with impressionism along with his elder contemporary Claude Debussy, although both composers rejected the term. In the 1920s and 1930s Ravel was internationally regarded as France\'s greatest living composer.Born to a music-loving family, Ravel attended France\'s premier music college, the Paris Conservatoire; he was not well regarded by its conservative establishment, whose biased treatment of him caused a scandal. After leaving the conservatoire, Ravel found his own way as a composer, developing a style of great clarity, incorporating elements of baroque, neoclassicism and, in his later works, jazz. He liked to experiment with musical form, as in his best-known work, Boléro (1928), in which repetition takes the place of development. He made some orchestral arrangements of other composers\' music, of which his 1922 version of Mussorgsky\'s Pictures at an Exhibition is the best known.As a slow and painstaking worker, Ravel composed fewer pieces than many of his contemporaries. Among his works to enter the repertoire are pieces for piano, chamber music, two piano concertos, ballet music, two operas and eight song cycles; he wrote no symphonies or church music. Many of his works exist in two versions: first, a piano score and later an orchestration. Some of his piano music, such as Gaspard de la nuit (1908), is exceptionally difficult to play, and his complex orchestral works such as Daphnis et Chloé (1912) require skilful balance in performance.Ravel was among the first composers to recognise the potential of recording to bring their music to a wider public. From the 1920s, despite limited technique as a pianist or conductor, he took part in recordings of several of his works; others were made under his supervision.')

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Ambts Verslag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/Ambts Verslag text area'), 'Joseph Maurice Ravel 7 March 1875 – 28 December 1937) was a French composer, pianist and conductor. He is often associated with impressionism along with his elder contemporary Claude Debussy, although both composers rejected the term. In the 1920s and 1930s Ravel was internationally regarded as France\'s greatest living composer.Born to a music-loving family, Ravel attended France\'s premier music college, the Paris Conservatoire; he was not well regarded by its conservative establishment, whose biased treatment of him caused a scandal. After leaving the conservatoire, Ravel found his own way as a composer, developing a style of great clarity, incorporating elements of baroque, neoclassicism and, in his later works, jazz. He liked to experiment with musical form, as in his best-known work, Boléro (1928), in which repetition takes the place of development. He made some orchestral arrangements of other composers\' music, of which his 1922 version of Mussorgsky\'s Pictures at an Exhibition is the best known.As a slow and painstaking worker, Ravel composed fewer pieces than many of his contemporaries. Among his works to enter the repertoire are pieces for piano, chamber music, two piano concertos, ballet music, two operas and eight song cycles; he wrote no symphonies or church music. Many of his works exist in two versions: first, a piano score and later an orchestration. Some of his piano music, such as Gaspard de la nuit (1908), is exceptionally difficult to play, and his complex orchestral works such as Daphnis et Chloé (1912) require skilful balance in performance.Ravel was among the first composers to recognise the potential of recording to bring their music to a wider public. From the 1920s, despite limited technique as a pianist or conductor, he took part in recordings of several of his works; others were made under his supervision.')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A VERDACHTE SIGNALEMENTEN/VERDACHTE SIGNALEMENTEN save'))

WebUI.delay(5)

WebUI.takeScreenshot()

