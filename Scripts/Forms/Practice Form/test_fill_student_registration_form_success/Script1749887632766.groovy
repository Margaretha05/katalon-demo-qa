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

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

WebUI.verifyElementText(findTestObject('General-Object/txt-h1-judul'), 'Practice Form')

WebUI.setText(findTestObject('Forms/txt_first_name'), 'Margaretta')

WebUI.setText(findTestObject('Forms/txt_last_name'), 'Ruth')

WebUI.setText(findTestObject('Forms/txt_email'), 'margaretharuth5@gmail.com')

WebUI.scrollToElement(findTestObject('Forms/radio_gender_female'), 0)

WebUI.click(findTestObject('Forms/radio_gender_female'))

WebUI.setText(findTestObject('Forms/txt_mobile_number'), '081220280148')

WebUI.click(findTestObject('Forms/txt_date_of_birth'))

WebUI.click(findTestObject('Forms/Datepicker/choose-month'))

WebUI.click(findTestObject('Forms/Datepicker/choose-years'))

WebUI.click(findTestObject('Forms/Datepicker/choose-date'))

//WebUI.sendKeys(findTestObject('Forms/txt_date_of_birth'), Keys.chord(Keys.CONTROL, 'a'))
//WebUI.sendKeys(findTestObject('Forms/txt_date_of_birth'), Keys.BACK_SPACE)
//
//WebUI.setText(findTestObject('Forms/txt_date_of_birth'), '18 Jun 2025')
WebUI.click(findTestObject('Forms/txt_subjects'))

WebUI.setText(findTestObject('Forms/txt_subjects'), 'Computer')

WebUI.verifyElementPresent(findTestObject('Forms/choose_subject'), 0)

WebUI.click(findTestObject('Forms/choose_subject'))

WebUI.click(findTestObject('Forms/checkbox_hobby_sports'))

WebUI.uploadFile(findTestObject('Forms/upload_picture'), 'C:\\Users\\Franz\\Downloads\\upload\\IMG_20230326_012032.jpg')

WebUI.scrollToElement(findTestObject('Forms/dropdown_state'), 0)

WebUI.click(findTestObject('Forms/dropdown_state'))

WebUI.verifyElementPresent(findTestObject('Forms/choose_state'), 0)

WebUI.click(findTestObject('Forms/choose_state'))

WebUI.click(findTestObject('Forms/dropdown_city'))

WebUI.verifyElementPresent(findTestObject('Forms/choose_city'), 0)

WebUI.click(findTestObject('Forms/choose_city'))

WebUI.click(findTestObject('Forms/btn_submit'))

WebUI.verifyElementVisible(findTestObject('Forms/modal_success_submission'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Forms/modal_success_submission'), 'Thanks for submitting the form')

