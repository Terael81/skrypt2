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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()


WebUI.setText(findTestObject('Object Repository/LOGIN_INFO/inp_lastname'), lastname)

WebUI.setText(findTestObject('Object Repository/LOGIN_INFO/inp_address'), address)

WebUI.setText(findTestObject('Object Repository/LOGIN_INFO/inp_city'), city)

WebUI.setText(findTestObject('Object Repository/LOGIN_INFO/inp_state'), state)

WebUI.setText(findTestObject('Object Repository/LOGIN_INFO/inp_zipcode'), zipcode)

WebUI.setText(findTestObject('Object Repository/LOGIN_INFO/inp_ssn'), ssn)

WebUI.delay(GlobalVariable.delay)

WebUI.click(findTestObject('Object Repository/LOGIN_INFO/btn_find'))

WebUI.delay(GlobalVariable.delay)

String el_error_msg = WebUI.getText(findTestObject('Object Repository/LOGIN_INFO/str_error_msg'))

assert error_msg == el_error_msg

WebUI.closeBrowser()
