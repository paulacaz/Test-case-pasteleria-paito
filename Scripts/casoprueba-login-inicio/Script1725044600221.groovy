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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://35.232.32.201/inicio')

WebUI.click(findTestObject('Object Repository/prueba login-inicio/Page_Reposteria/span_concat(Pastelera  Repostera , , Paito,_c27d60'))

WebUI.click(findTestObject('Object Repository/prueba login-inicio/Page_Reposteria/a_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/prueba login-inicio/Page_Reposteria/input__email'), 'paca99@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/prueba login-inicio/Page_Reposteria/input_Por favor, completar_floatingPassword'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/prueba login-inicio/Page_Reposteria/input_Por favor, completar_flexCheckDefault'))

WebUI.click(findTestObject('Object Repository/prueba login-inicio/Page_Reposteria/a_Iniciar Sesin (1)'))

