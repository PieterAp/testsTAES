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

Mobile.startApplication('C:\\Users\\igors\\Desktop\\app-debug.apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Name (3)'), 'fghjj', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email (13)'), 'ergergre', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - PhoneNumber (2)'), '45645645645645', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - License Plate (3)'), '6456456456456', 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\igors\\Desktop\\app-debug.apk', true)

Mobile.getText(findTestObject('Object Repository/android.widget.EditText - 912345678'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\igors\\Desktop\\app-debug.apk', true)

Mobile.getText(findTestObject('Object Repository/android.widget.EditText - 99-BB-88'), 0)

Mobile.closeApplication()

