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

Mobile.startApplication('C:\\Users\\M0hamede\\Desktop\\app-debug.apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email (11)'), 'manager_1@mail.pt', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (12)'), '123', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView -orderName'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - orderTime'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - pickup'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - delivery'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - profit'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - distance'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - time'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ACCEPT ORDER (1)'), 0)

Mobile.closeApplication()

WebUI.getAttribute(findTestObject('android.widget.TextView -orderName'), 'text')

