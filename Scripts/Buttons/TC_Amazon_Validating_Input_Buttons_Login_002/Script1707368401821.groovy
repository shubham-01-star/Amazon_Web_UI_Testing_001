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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon_Validate_login_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

boolean isUsernameFieldPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Valid_Login_OR/login/Page_Amazon Sign-In/input_Email or mobile phone number_email'),0)

if (!(isUsernameFieldPresent)) {
	KeywordUtil.markFailed('Username input field is not present')
}

String username = '9294923885'

String password = '123456789'

WebUI.setText(findTestObject('Object Repository/Amazon_Validate_login_OR/Page_Amazon Sign-In/input_email'), '9294923885')

WebUI.click(findTestObject('Object Repository/Amazon_Validate_login_OR/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Validate_login_OR/Page_Amazon Sign-In/input_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Amazon_Validate_login_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Valid_Login_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, DFGHJ'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Amazon_Valid_Login_OR/login/Page_Amazon.com. Spend less. Smile more/a_us'),0)

WebUI.closeBrowser()

