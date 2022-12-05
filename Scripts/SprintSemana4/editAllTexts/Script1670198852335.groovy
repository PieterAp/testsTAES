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

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email (12)'), 'nuno.mota@mail.pt', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (12)'), '123', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox - Remember me (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - PROFILE (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - nuno.mota@mail.pt'), 'nuno_mota@mail.pt', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 11-BB-11'), '99-BB-88', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 910000000'), '912345678', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password (13)'), '1234', 0)

Mobile.closeApplication()

Mobile.checkElement(findTestObject(null), 0)

