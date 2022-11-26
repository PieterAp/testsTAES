package sprintSemana3
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



class registerSuccess {

	@When("I click on the register link")
	public void i_click_on_the_register_link() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Got no account Click here to register'), 0)
	}

	@When("I insert {string} in the name field")
	public void i_insert_in_the_name_field(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Name'), string, 0)
	}

	@When("I insert {string} in the email field on register page")
	public void i_insert_in_the_email_field_on_register_page(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email (5)'), string, 0)
	}

	@When("I insert {string} in the password field on register page")
	public void i_insert_in_the_password_field_on_register_page(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (5)'), string, 0)
	}


	@When("I insert {string} in the password confirmation field")
	public void i_insert_in_the_password_confirmation_field(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Confirm Password'), string, 0)
	}

	@When("I insert {string} in the  licence plate field")
	public void i_insert_in_the_licence_plate_field(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - License Plate'), string, 0)
	}

	@When("I insert {string} in the  phone number field")
	public void i_insert_in_the_phone_number_field(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - PhoneNumber'), string, 0)
	}

	@When("I click on the Register button")
	public void i_click_on_the_Register_button() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - SAVE'), 0)
	}

	@Then("I should see a confirmation message and be presented with the login interface")
	public void i_should_see_a_confirmation_message_and_be_presented_with_the_login_interface() {
		Mobile.verifyElementExist(findTestObject('android.widget.Button - LOGIN (1)'), 0)
		Mobile.closeApplication()
	}
}