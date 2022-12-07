package sprintSemana5
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



class orderByNearest {
	@Then("I click order by the nearest location button")
	public void i_click_order_by_the_nearest_location_button() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Nearest to Furthest'), 0)
		Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Nearest to Furthest'), 0)
	}

	@Then("I should see the list of orders order by the nearest location")
	public void i_should_see_the_list_of_orders_order_by_the_nearest_location() {
		String distance1 = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - tvDistance1'), 'text',10)
		String distance2 = Mobile.getAttribute(findTestObject('Object Repository/android.widget.TextView - tvDistance2'), 'text',10)
			Mobile.verifyGreaterThanOrEqual(distance2.substring(0, distance2.length()-3),distance1.substring(0, distance1.length()-3))
	}
}