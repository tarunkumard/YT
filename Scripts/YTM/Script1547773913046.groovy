import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.ytmonster.net/')

WebUI.click(findTestObject('Object Repository/Page_YTMonster  Free YouTube Views/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_YTMonster  Login/label_Username'))

WebUI.setText(findTestObject('Object Repository/Page_YTMonster  Login/input_Login_usernames'), 'wealthytarundas2015')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_YTMonster  Login/input_Username_passwords'), 'NWb4hwkuz3HgDrtaE3i19Q==')

WebUI.click(findTestObject('Object Repository/Page_YTMonster  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_YTMonster  Exchange/div_YouTube Likes'))

WebUI.click(findTestObject('Object Repository/Page_YTMonster  Exchange/div_Like'))

