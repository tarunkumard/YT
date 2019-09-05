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
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://accounts.google.com')

WebUI.maximizeWindow()

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://accounts.google.com'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.delay(10)

//selenium.type('id=identifierId', 'georgejohn7866')
//selenium.type('id=identifierId', 'petersonnancy4563')
selenium.type('id=identifierId', 'maverickchrist345')

//selenium.type('id=identifierId', 'nathan786ongo@gmail.com')
//selenium.type('id=identifierId', 'michaeltrump786786@gmail.com')
//selenium.type('id=identifierId', 'marlynmonid6y')
//selenium.type('id=identifierId', 'pe.t.e.rsm.all.7.8.6@gmail.com')
WebUI.delay(5)

WebUI.click(findTestObject('Page_Gmail/Page_Gmail/content_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

//selenium.type('name=password', 'George@321')
//selenium.type('name=password', 'Peterson@321')
selenium.type('name=password', 'Maverick@321')

//selenium.type('name=password', 'Nathan@321')
//selenium.type('name=password', 'Monid@321')
//selenium.type('name=password', 'Trump@321')
//selenium.type('name=password', 'Peter@321')
WebUI.click(findTestObject('Page_Gmail/Page_Gmail/span_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(35)

selenium.open('https://medium.com/')

WebUI.delay(10)

//WebUI.click(findTestObject('Page_Where To Find Pocket friendly/button_Continue as george'), FailureHandling.CONTINUE_ON_FAILURE)
//selenium.click('link=Sign in')
//selenium.open('https://medium.com/@maverickchrist345/where-to-find-pocket-friendly-mold-removal-diy-bellevue-renton-seattle-ab19afb31448')
selenium.open('https://medium.com/@dixon30r07gloria/losing-weight-for-teenage-girl-read-evidence-based-facts-how-teenage-girls-can-have-massive-weight-9782377e4781')

//selenium.open('https://medium.com/@toulugary786/how-to-do-effective-devops-load-testing-using-cheap-cloud-load-testing-performance-testing-tools-8b04f80660bc')
WebUI.delay(4)

WebUI.delay(4)

//selenium.open('https://medium.com/')
//selenium.open('https://medium.com/s/user-friendly/why-im-done-saying-user-user-experience-and-ux-in-2019-4fdfc6b7de23')
//selenium.open('https://medium.com/s/user-friendly/the-art-of-the-error-message-9f878d0bff80')
//selenium.open('https://medium.com/@maverickchrist345/where-to-find-pocket-friendly-mold-removal-diy-bellevue-renton-seattle-ab19afb31448')
WebUI.delay(4)

WebUI.delay(4)

//WebUI.waitForElementClickable(findTestObject('clap/johnclap'), 5)
WebUI.delay(4)

//WebUI.scrollToElement(findTestObject('clap/johnclap'), 0)
//WebUI.focus(findTestObject('clap/johnclap'))
//selenium.click('css=g > path')
for (def index : (1..50)) {
    WebUI.delay(8)

    WebUI.focus(findTestObject('clap/clap'))

    WebUI.waitForElementPresent(findTestObject('clap/clap'), 5)
	WebUI.delay(4)

    WebUI.scrollToElement(findTestObject('clap/clap'), 0)
	WebUI.delay(5)

    WebUI.click(findTestObject('clap/clap'))
}

