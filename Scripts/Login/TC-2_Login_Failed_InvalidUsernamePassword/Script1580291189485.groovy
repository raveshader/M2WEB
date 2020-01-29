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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.idmarco.com/')

WebUI.click(findTestObject('PRD/Page_Homepage/a_Masuk'))

WebUI.setText(findTestObject('PRD/Page_Login/input_Nomor Ponsel atau Email_loginusername'), 
    '087809892005')

WebUI.setEncryptedText(findTestObject('PRD/Page_Login/input_Kata Sandi_loginpassword'), 
    'p4y+y39Ir5M5s9+buYNYVA==')

WebUI.click(findTestObject('PRD/Page_Login/span_Masuk Akun'))

WebUI.click(findTestObject('PRD/Page_Homepage/span_Test             My Account           _9ad412'))

WebUI.click(findTestObject('PRD/Page_Homepage/a_Logout'))

WebUI.closeBrowser()

