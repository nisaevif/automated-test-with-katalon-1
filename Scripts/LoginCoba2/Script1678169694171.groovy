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

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Object Repository/logincoba3/Page_Explore  Twitter/span_Log in'))

WebUI.click(findTestObject('Object Repository/logincoba3/Page_Log in to Twitter  Twitter/div_Phone, email, or username_css-1dbjc4n r_655147'))

WebUI.setText(findTestObject('Object Repository/logincoba3/Page_Log in to Twitter  Twitter/input_Phone, email, or username_text'), 
    'nisaevidisney15@gmail.com')

WebUI.click(findTestObject('Object Repository/logincoba3/Page_Log in to Twitter  Twitter/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/logincoba3/Page_Log in to Twitter  Twitter/input_Password_password'), 
    'g8n7yPBo+oE=')

WebUI.click(findTestObject('Object Repository/logincoba3/Page_Log in to Twitter  Twitter/span_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/logincoba3/Page_(1) Home  Twitter/svg_Home_r-18jsvk2 r-4qtqp9 r-yyyyoo r-lwhw_946795'), 
    5)

WebUI.closeBrowser()

