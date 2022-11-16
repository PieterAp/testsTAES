package sprintSemana1
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


class NoEmail {
	@Given("I have the device ready")
	public void i_have_the_device_ready() {
	}

	@When("I start the application")
	public void i_start_the_application() {
		Mobile.startApplication('C:\\Users\\M0hamede\\Desktop\\app-debug.apk', true)
	}

	@When("I insert {string} in the password field")
	public void i_insert_in_the_password_field(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (1)'), string, 0)
	}

	@When("I click on the Login button")
	public void i_click_on_the_Login_button() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN'), 0)
	}

	@Then("I should see an error message stating that the email is required")
	public void i_should_see_an_error_message_stating_that_the_email_is_required() {
		Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Email is required'), 0)
		Mobile.closeApplication()
	}
}