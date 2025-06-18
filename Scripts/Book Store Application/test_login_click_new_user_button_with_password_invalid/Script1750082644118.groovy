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

WebUI.verifyElementText(findTestObject('General-Object/txt_h5_subjudul_login'), 'Login in Book Store')

WebUI.scrollToElement(findTestObject('Book Store Application/btn_new_user'), 0)

WebUI.click(findTestObject('Book Store Application/btn_new_user'))

WebUI.scrollToElement(findTestObject('Book Store Application/checkbox_captcha'), 0)

WebUI.verifyElementPresent(findTestObject('Book Store Application/checkbox_captcha'), 0)

WebUI.verifyElementText(findTestObject('General-Object/txt-h1-judul'), 'Register')

WebUI.verifyElementText(findTestObject('General-Object/txt_h4_subjudul_register'), 'Register to Book Store')

WebUI.setText(findTestObject('Book Store Application/txt_first_name_register'), 'Margaretta')

WebUI.setText(findTestObject('Book Store Application/txt_last_name_register'), 'Ruth')

WebUI.setText(findTestObject('Book Store Application/txt_username_login'), 'Maru123')

WebUI.setText(findTestObject('Book Store Application/txt_password_login'), 'Maru123')

//WebUI.scrollToElement(findTestObject('Book Store Application/btn_register'), 0)
//
//WebUI.click(findTestObject('Book Store Application/btn_register'))
//
//WebUI.verifyElementText(findTestObject('Book Store Application/txt_message_invalid'), 'Passwords must have at least one non alphanumeric character, one digit (\'0\'-\'9\'), one uppercase (\'A\'-\'Z\'), one lowercase (\'a\'-\'z\'), one special character and Password must be eight characters or longer.')
//
