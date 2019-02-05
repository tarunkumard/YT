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

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Page_Gmail/input_to continue to Gmail_ide'), 'Georgejohn7866')

WebUI.sendKeys(findTestObject('Page_Gmail/input_to continue to Gmail_ide'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Page_Gmail/input_Too many failed attempts'), 'wsG2wfbvSaf9ooD1E/D8vQ==')

WebUI.sendKeys(findTestObject('Page_Gmail/input_Too many failed attempts'), Keys.chord(Keys.ENTER))

WebUI.switchToWindowTitle('ifttt - Google Search')

WebUI.click(findTestObject('Page_ifttt - Google Search/a_Sign in'))

WebUI.click(findTestObject('Page_Sign in to your IFTTT account /a_Continue with Google'))

WebUI.click(findTestObject('Page_Discover IFTTT and Applets - I/span_georgejohn7866'))

WebUI.click(findTestObject('Page_Discover IFTTT and Applets - I/a_New Applet'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/a_this (1)'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/span_This Trigger fires every (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_httpcirilee.tumblr.co'), 'http://cirilee.tumblr.com/rss')

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/input_visit the help page_btn'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/span_'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/span_Create a photo post'))

WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_Photo caption_fieldsc'), '')

WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_a hrefhttpsamzn.to2CH'), '<a href="https://amzn.to/2CH5dsg">Buy Best Women\'s Intimates</a>')

WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_Tags_fieldstags'), '')

WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_foodcakedessertpastri'), 'food,cake,dessert,pastries,intersectional feminism,feminist,my hero academia,all might,lingerie,babe,sexy,babes,kakagai,halloween,horror,gold,gold flakes,nutrition,chocolate,cute,fitness,athletic,summer,fruit by the foot,fruit snacks')

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/input_Publish_btn btn-on-color'))

WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/input_works with_btn btn-prima'))

