import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

def isChrome = true
def browserSetup = isChrome ? "chrome" : "gecko"
def path = "/home/dimitrios/Documents/automation/${browserSetup}driver"
def prop = "webdriver.${browserSetup}.driver"
System.setProperty(prop, path)


String site = "http://elearntesting.com/for-students/demo-site-for-automation-practice/"

def browser = new Browser(driver: new ChromeDriver())

browser.go site

// Button click
//browser.$("#submit").click()


// Add text to elements
browser.$("input[name = 'lastname']").value("Last Name")
browser.$("input[name = 'firstname']")value "First name"
browser.$("#datepicker") << "20/12/2019"


// Select radio button
browser.$("#sex-0").click()
browser.$("#exp-4").click()


// Click checkbox
browser.$("input#profession-0").click()
browser.$("input#profession-1").click()


// Dropdown select
browser.$("form").continents = "Europe"
browser.$("#continents").value("Australia")


// exit window
//browser.quit()
