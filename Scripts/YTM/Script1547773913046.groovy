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

WebUI.navigateToUrl('https://www.youtube.com/')

WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_YouTube/input_to continue to YouTube_i'), 'meghanharry653@gmail.com')

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('Page_YouTube/div_Learn more_ZFr60d CeoRYc'), 5)

WebUI.doubleClick(findTestObject('Page_YouTube/div_Learn more_ZFr60d CeoRYc'))

//WebUI.navigateToUrl('https://www.youtube.com/watch?v=GAIli8yxomo')
WebUI.delay(4)

WebUI.setText(findTestObject('Page_YouTube/input_Too many failed attempts'), 'Meghan@321')

WebUI.waitForElementClickable(findTestObject('Page_YouTube/span_Next'), 5)

WebUI.doubleClick(findTestObject('Page_YouTube/span_Next'))

WebUI.navigateToUrl('https://www.youtube.com/watch?v=GAIli8yxomo')

WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_Sign in'))
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Where To Find Reliable Mold Re/video_Search_video-stream html'))

WebUI.click(findTestObject('Object Repository/Page_Where To Find Reliable Mold Re/yt-icon__style-scope ytd-toggl'))

