package sprintSemana1_2
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



class loginRemember {

	@When("I start the application for the first time")
	public void i_start_the_application_for_the_first_time() {
		Mobile.startApplication(GlobalVariable.apkPath,false)
	}

	@When("I click on the {string} checkbox")
	public void i_click_on_the_checkbox(String string) {
		Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox - Remember me (1)'), 0)
	}

	@When("I close the application")
	public void i_close_the_application() {
		Mobile.closeApplication()
	}

	@When("I start the application login remember")
	public void i_start_the_application_login_remember() {
		Mobile.startExistingApplication('com.example.fastuga', FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should see the dashboard interface")
	public void i_should_see_the_dashboard_interface() {
		Mobile.getText(findTestObject('Object Repository/android.widget.TextView - DashBoard (1)'), 0)
	}
}