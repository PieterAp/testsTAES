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



class showOrderDetails {
	@Then("I click on the first order")
	public void i_click_on_the_first_order() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 0)
	}

	@And("I should see the order customer name")
	public void i_should_see_the_order_customer_name() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView -orderName'), 'text',10)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see the amount off time passed since the order was created")
	public void i_should_see_the_amount_off_time_passed_since_the_order_was_created() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - orderTime'), 'text',5)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see order pickup location")
	public void i_should_see_order_pickup_location() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - pickup'), 'text',5)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see order destination")
	public void i_should_see_order_destination() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - delivery'), 'text',5)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see order profit")
	public void i_should_see_order_profit() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - profit'), 'text',5)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see order delivery distance")
	public void i_should_see_order_delivery_distance() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - distance'), 'text',5)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see order delivery estimated time")
	public void i_should_see_order_delivery_estimated_time() {
		// Write code here that turns the phrase above into concrete actions
		String value = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - time'), 'text',5)
		Mobile.verifyNotMatch(value, 'loading ...', false)
	}

	@And("I should see the map route")
	public void i_should_see_the_map_route() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.verifyElementExist(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)
	}

	@And("I should see a button to accept the order")
	public void i_should_see_a_button_to_accept_the_order() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.Button - ACCEPT ORDER'), 0)
	}
}