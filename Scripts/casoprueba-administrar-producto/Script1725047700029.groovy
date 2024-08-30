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

WebUI.callTestCase(findTestCase('casoprueba-login-inicio'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/span_concat(Pastelera  Repostera , , Paito,_c27d60'))

WebUI.click(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/a_Administrar'))

WebUI.click(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/button_Administrar categorias'))

WebUI.click(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/button_Administrar productos'))

WebUI.click(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/button_Eliminar'))

WebUI.setText(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/input_Nombre_nombre'), 'pastel de zanahora')

WebUI.setText(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/textarea_Descripcin_descripcion'), 
    'light')

WebUI.setText(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/input_Nombre_nombre'), 'pastel de zanahoria')

WebUI.setText(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/input_Precio_precio'), '4500000')

WebUI.setText(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/input_Stock_stock'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/select_Selecciona una categoraPastelesCupca_1d192f'), 
    '1: Object', true)

WebUI.setText(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/input_Imagen_imagen'), 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fthermomix-toledo.es%2Fmedia%2FGalleries%2Fattachments%2Feb05a7ae21715d9c1213a1874859ae3e.jpeg&f=1&nofb=1&ipt=016bcc0b10c4556522fff8bea529e3cae49e4561b05cf5be9509199bd71a2b2b&ipo=images')

WebUI.click(findTestObject('Object Repository/prueba de administrar_productos/Page_Reposteria/button_Guardar'))

