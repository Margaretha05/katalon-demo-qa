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

WebUI.openBrowser('https://demoqa.com/alerts')

WebUI.scrollToElement(findTestObject('Alerts, Frame and Windows/Alerts/btn_alert_immediate'), 0)

WebUI.click(findTestObject('Alerts, Frame and Windows/Alerts/btn_alert_immediate'))

WebUI.verifyAlertPresent(0)

String alertText = WebUI.getAlertText()

// a = 5 // untuk assign/masukkan nilai a jadi 5 (number)
// a == '5' // untuk check apakah a = 5, == tanpa melihat/membandingkan tipe datanya, disini a tipe datanya number sedangkan '5' string maka akan true 
// a === '5' //=== dia membandingkan tipe datanya, disini tipe data a number dan 5 adalah number maka akan false
assert alertText == 'You clicked a button'

WebUI.closeBrowser()

