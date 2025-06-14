package textBox

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TextBoxForm {

	String name = "Margaretta";
	String email = "margaretta@gmail.com";
	String currentAddress = "Hutabulu";
	String permanentAddress = "Jakarta Selatan";


	@Keyword
	def fillForm() {
		WebUI.setText(findTestObject('Element Repository/Text Box Object/txt-fullname'), name)

		WebUI.setText(findTestObject('Element Repository/Text Box Object/txt-email'), email)

		WebUI.setText(findTestObject('Element Repository/Text Box Object/txt-current-address'), currentAddress)

		WebUI.setText(findTestObject('Element Repository/Text Box Object/txt-permanent-address'), permanentAddress)
	}

	@Keyword
	def assertTextBoxForm() {

		WebUI.verifyElementText(findTestObject('Element Repository/Text Box Object/check-output-by-param', [('param') : 'name']), 'Name:'+name)

		WebUI.verifyElementText(findTestObject('Element Repository/Text Box Object/check-output-by-param', [('param') : 'email']), 'Email:'+email)

		WebUI.verifyElementText(findTestObject('Element Repository/Text Box Object/check-output-by-param', [('param') : 'currentAddress']),
		'Current Address :'+currentAddress)

		WebUI.verifyElementText(findTestObject('Element Repository/Text Box Object/check-output-by-param', [('param') : 'permanentAddress']),
		'Permananet Address :'+permanentAddress)
	}
}
