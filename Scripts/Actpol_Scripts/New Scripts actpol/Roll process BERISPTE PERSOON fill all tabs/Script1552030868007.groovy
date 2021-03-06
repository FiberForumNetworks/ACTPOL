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

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Edit assit user 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click roll process'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Generiek/Assistentie/Click new process'))

WebUI.delay(2)

WebUI.comment('BERISPTE PERSOON start')

'BERISPTE PERSOON'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Generiek/Assistentie/Rol Proces Type'), '25', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/Achternaam'), 'osama')

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Achternaam lb 2'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Slachtofferhulp na'))

WebUI.delay(3)

WebUI.scrollToPosition(10, 8)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/Contacten'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Strafbare feiten new'))

WebUI.delay(3)

'POGING'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Strafbare feiten Uitvoering'), 
    '1', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Strafbare feiten Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/Strafbare_feit click'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen new'))

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen new new'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.setText(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Goed artikel'), 'BAD/DOUCHSCHUIM')

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/Berispte persoon Goederen Goed artikel lb 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'IN BESLAGGENOMEN'
WebUI.selectOptionByValue(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Status goed'), 
    '2_9', false)

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Goederen Close'), FailureHandling.OPTIONAL)

WebUI.delay(3)

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

WebUI.delay(3)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Vaartuig'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen new'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen new new'))

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

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A BERISPTE PERSOON/BERISPTE PERSOON Wapen'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak mouse over Headings'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak mouse over Heading 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak bold'))

not_run: WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak center'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak font color'))

WebUI.delay(1)

WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak font color red'))

not_run: WebUI.click(findTestObject('Actpol_Scripts/Extra script/A Bekeurde persoon/Bekeurde persoon Verklaring Opmaak font color red'))

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

