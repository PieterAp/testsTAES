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

'Sprint Semana 1_2'
CucumberKW.runFeatureFile('Include/features/SprintSemana1_2/login.feature')

'Sprint Semana 3'
CucumberKW.runFeatureFile('Include/features/SprintSemana3/logout.feature')

'Sprint Semana 3'
CucumberKW.runFeatureFile('Include/features/SprintSemana3/register.feature')

'Sprint Semana 4\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/showOrders.feature')

'Sprint Semana 4\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/editProfile.feature')

'Sprint Semana 4\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/orderDetails.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/resumeActiveOrder.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/acceptOrder.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/cancelOrder.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/completeOrder.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/intermediateStepPickup.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/navigation.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/organizeOrderList.feature')

'Sprint Semana 5\r\n'
CucumberKW.runFeatureFile('Include/features/SprintSemana4/statistics.feature')

