import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user navigate to login page")
	def navigateToLoginPage() {
		println ("\n I am inside navigateLoginPage")
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.instagram.com/')
	}

	@When("user enters (.*) and (.*)")
	def enterCredentials(String username, String password) {
		println ("\n I am inside enter credentials")
		println ("username :"+username)
		println ("password :"+password)

		WebUI.setText(findTestObject('Object Repository/LoginCoba/Page_Instagram/input_Phone number, username, or email_username'),
				username)

		WebUI.setEncryptedText(findTestObject('Object Repository/LoginCoba/Page_Instagram/input_Password_password'), password)
	}

	@And("click on login button")
	def clickLogin() {
		println ("\n I am loging in")
		WebUI.click(findTestObject('Object Repository/LoginCoba/Page_Instagram/div_Log in'))
	}

	@Then("user is navigate to homepage")
	def instagramHomepage() {
		println ("\n I am inside Instagram's Homepage")

		WebUI.closeBrowser()
	}
}