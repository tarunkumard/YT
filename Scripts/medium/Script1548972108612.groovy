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

selenium.type('id=identifierId', 'email')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Gmail/Page_Gmail/content_Next'))

WebUI.delay(5)

selenium.type('name=password', 'passwd')

WebUI.click(findTestObject('Page_Gmail/Page_Gmail/span_Next'))

WebUI.delay(5)

selenium.open('https://medium.com/')

selenium.click('link=Sign in')

selenium.open('https://medium.com/s/user-friendly/why-im-done-saying-user-user-experience-and-ux-in-2019-4fdfc6b7de23')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Medium  a place to read and wr/button_Continue as george'))

WebUI.delay(4)

selenium.open('https://medium.com/')

//selenium.open('https://medium.com/s/user-friendly/why-im-done-saying-user-user-experience-and-ux-in-2019-4fdfc6b7de23')
selenium.open('https://medium.com/s/user-friendly/the-art-of-the-error-message-9f878d0bff80')

WebUI.waitForElementClickable(findTestObject('clap/clap'), 5)

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('clap/clap'), 0)

WebUI.focus(findTestObject('clap/clap'))

WebUI.doubleClick(findTestObject('clap/clap'), FailureHandling.STOP_ON_FAILURE)

