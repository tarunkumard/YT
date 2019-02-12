import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://accounts.google.com')

WebUI.maximizeWindow()

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://accounts.google.com'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

//selenium.type('id=identifierId', 'georgejohn7866')

//selenium.type('id=identifierId', 'maddyvicki4ty')
//selenium.type('id=identifierId', 'marlynmonid6y')
selenium.type('id=identifierId', 'petersonnancy4563')
WebUI.delay(5)

WebUI.click(findTestObject('Page_Gmail/Page_Gmail/content_Next'))

WebUI.delay(5)

//selenium.type('name=password', 'George@321')
selenium.type('name=password', 'Peterson@321')
//selenium.type('name=password', 'Maddy@321')
//selenium.type('name=password', 'Monid@321')
WebUI.click(findTestObject('Page_Gmail/Page_Gmail/span_Next'))

WebUI.delay(5)


selenium.open('https://ifttt.com/login?wp_=1')

selenium.click('link=Continue with Google or Facebook')

selenium.click('link=Continue with Google')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your IFTTT account/a_Continue with Google'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

for (def index : (1..21)) {
	WebUI.click(findTestObject('Object Repository/Page_Discover IFTTT and Applets - I/span_georgejohn7866'))
	
	WebUI.delay(5)
	
	
	
	WebUI.click(findTestObject('Object Repository/Page_Discover IFTTT and Applets - I/a_New Applet'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/a_this'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/img'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/span_This Trigger fires every'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_httpcirilee.tumblr.co'), findTestData(
			'rss').getValue(1, index))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/input_visit the help page_btn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/span_'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/img_1'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/span_Create a photo post'))
	
	WebUI.delay(5)
	
	WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_Photo caption_fieldsc'), '')
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('Page_Make an Applet - IFTTT/textarea_a hrefhttpsamzn.to2CH'), Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('Page_Make an Applet - IFTTT/textarea_a hrefhttpsamzn.to2CH'), Keys.chord(Keys.DELETE))
	
	WebUI.delay(5)
	
	WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_a hrefhttpsamzn.to2CH'), '<a href="https://amzn.to/2CH5dsg">Buy Best Women\'s Intimates</a>')
	//WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_a hrefhttpsamzn.to2CH'), '<a href="http://www.nat4trck5.com/aff_c?offer_id=16520&aff_id=16818">I am Bored,send me message,my id here is cute_angel2k19</a>')
	
	WebUI.delay(5)
	
	WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_Tags_fieldstags'), '')
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('Page_Make an Applet - IFTTT/textarea_foodcakedessertpastri'), Keys.chord(Keys.CONTROL, 'a'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('Page_Make an Applet - IFTTT/textarea_foodcakedessertpastri'), Keys.chord(Keys.DELETE))
	
	WebUI.delay(5)
	
	WebUI.setText(findTestObject('Object Repository/Page_Make an Applet - IFTTT/textarea_foodcakedessertpastri'), 'food,cake,dessert,pastries,intersectional feminism,feminist,my hero academia,all might,lingerie,babe,sexy,babes,kakagai,halloween,horror,gold,gold flakes,nutrition,chocolate,cute,fitness,athletic,summer,fruit by the foot,fruit snacks,hot,bikini,fashion')
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/input_Publish_btn btn-on-color'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Page_Make an Applet - IFTTT/input_works with_btn btn-prima'))
	
	WebUI.delay(5)
	selenium.open('https://ifttt.com/create')
	WebUI.delay(5)
	
}



