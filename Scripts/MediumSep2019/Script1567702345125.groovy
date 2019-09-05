import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.google.com/')
WebUI.delay(4)
WebUI.maximizeWindow()
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
WebUI.delay(4)
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
WebUI.delay(5)
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='‪català‬'])[1]/following::span[1]")
//WebUI.delay(10)
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='‪English (United Kingdom)‬'])[2]/following::span[1]")
WebUI.delay(10)
selenium.type("id=identifierId", "natalie34e28robbins@gmail.com")
WebUI.delay(10)
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Learn more'])[1]/following::span[1]")
WebUI.delay(10)
selenium.type("name=password", "VMNJ915475")
WebUI.delay(10)
WebUI.click(findTestObject('Page_Gmail/Page_Gmail/span_Next'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(35)
selenium.open('https://medium.com/@dixon30r07gloria/losing-weight-for-teenage-girl-read-evidence-based-facts-how-teenage-girls-can-have-massive-weight-9782377e4781')
WebUI.delay(25)
for (def index : (1..50)) {
	WebUI.delay(8)

	WebUI.focus(findTestObject('clap/clap'))

	WebUI.waitForElementPresent(findTestObject('clap/clap'), 5)
	WebUI.delay(4)

	WebUI.scrollToElement(findTestObject('clap/clap'), 0)
	WebUI.delay(5)

	WebUI.click(findTestObject('clap/clap'))
}
