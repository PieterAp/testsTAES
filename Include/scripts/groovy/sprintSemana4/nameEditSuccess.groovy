package sprintSemana4
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

import io.appium.java_client.AppiumDriver
import io.appium.java_client.InteractsWithApps

class nameEditSuccess {
	@When("I click on the profile picture")
	public void i_click_on_the_profile_picture() {
		Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)
	}

	@When("I should see the profile tab")
	public void i_should_see_the_profile_tab() {
		Mobile.getText(findTestObject('Object Repository/android.widget.TextView - PROFILE'), 0)
	}

	@When("I change my name to {string}")
	public void i_change_my_name_to(String string) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Nuno Mota'), string, 0)
	}

	@When("I click on the save button")
	public void i_click_on_the_save_button() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - SAVE (10)'), 0)
	}

	@Then("I should see a message stating that was edited with success")
	public void i_should_see_a_message_stating_that_was_edited_with_success() {
		/*
		 AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		 def toast = driver.findElementByXPath('//android.widget.Toast[@text="Edit with success"]')
		 println("Toast element: " + toast)
		 if (toast == null) {
		 KeywordUtil.markFailed('ERROR: Toast object not found!')
		 }
		 Mobile.verifyEqual(toast, 'Edit with success')
		 */
	}

	@Then("I should see the name {string}")
	public void i_should_see_the_name(String string) {
		Mobile.getText(findTestObject('Object Repository/android.widget.EditText - Nuno Carro'), 0)
		Mobile.closeApplication()
	}
}