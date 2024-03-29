package login

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

public class LoginTestKeyWord {
	@Keyword
	public void LoginTestk()
	{
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://www.amazon.com/')
		
		WebUI.click(findTestObject('Object Repository/AMAZON_LOGIN_OR/Page_Your Account/div_Hello, sign in'))
		
		WebUI.setText(findTestObject('Object Repository/AMAZON_LOGIN_OR/Page_Amazon Sign-In/input_email'), '9294923885')
		
		WebUI.click(findTestObject('Object Repository/AMAZON_LOGIN_OR/Page_Amazon Sign-In/inputcontinue'))
		
		WebUI.setEncryptedText(findTestObject('Object Repository/AMAZON_LOGIN_OR/Page_Amazon Sign-In/input_password'), 'RigbBhfdqODKcAsiUrg+1Q==')
		
		WebUI.click(findTestObject('Object Repository/AMAZON_LOGIN_OR/Page_Amazon Sign-In/inputsignInSubmit'))
		
		
	}
	
}
