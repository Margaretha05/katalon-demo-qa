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

WebUI.openBrowser('https://demoqa.com/login')

WebUI.verifyElementText(findTestObject('General-Object/txt-h1-judul'), 'Login')

WebUI.scrollToElement(findTestObject('General-Object/txt_h5_subjudul_login'), 0)

WebUI.verifyElementText(findTestObject('General-Object/txt_h5_subjudul_login'), 'Login in Book Store')

WebUI.setText(findTestObject('Book Store Application/txt_username_login'), 'Maru12345')

WebUI.setText(findTestObject('Book Store Application/txt_password_login'), 'Secure9*88888')

WebUI.scrollToElement(findTestObject('Book Store Application/btn_login'), 0)

WebUI.click(findTestObject('Book Store Application/btn_login'))

WebUI.verifyElementText(findTestObject('Book Store Application/txt_message_invalid'), 'Invalid username or password!')

WebUI.closeBrowser()

