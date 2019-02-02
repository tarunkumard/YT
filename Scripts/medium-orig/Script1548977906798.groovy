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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Page_Gmail/input_to continue to Gmail_ide'), 'georgejohn7866')

WebUI.sendKeys(findTestObject('Page_Gmail/input_to continue to Gmail_ide'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Page_Gmail/input_Too many failed attempts'), 'sDnHzfgLdlicMeG8UcziLw==')

WebUI.sendKeys(findTestObject('Page_Gmail/input_Too many failed attempts'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Page_Gmail/input_Too many failed attempts'), 'wsG2wfbvSaf9ooD1E/D8vQ==')

WebUI.sendKeys(findTestObject('Page_Gmail/input_Too many failed attempts'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Medium  a place to read and wr/button_Continue as george (2)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_ide'), 'georgejohn7866')

WebUI.sendKeys(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_ide'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts'), 'wsG2wfbvSaf9ooD1E/D8vQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Medium  a place to read and wr/button_Continue as george (2)'))

WebUI.click(findTestObject('Object Repository/Page_Medium  a place to read and wr/a_More_u-block u-backgroundCov'))

WebUI.click(findTestObject('clap/button_Jan 23_button button--p'))

