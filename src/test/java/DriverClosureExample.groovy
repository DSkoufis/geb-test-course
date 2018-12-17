import geb.Browser

def isChrome = true
def browserSetup = isChrome ? "chrome" : "gecko"
def path = "/home/dimitrios/Documents/automation/${browserSetup}driver"
def prop = "webdriver.${browserSetup}.driver"
System.setProperty(prop, path)


String site = "/wp-content/uploads/2016/05/DemoSite.html" // appends this to the baseUrl in GebConfig

Browser.drive {
	go site

	// Button click
	//$("#submit").click()


	// Add text to elements
	$("input[name = 'lastname']").value("Last Name")
	$("input[name = 'firstname']")value "First name"
	$("#datepicker") << "20/12/2019"


	// Select radio button
	$("#sex-0").click()
	$("#exp-4").click()


	// Click checkbox
	$("input#profession-0").click()
	$("input#profession-1").click()


	// Dropdown select
	$("form").continents = "Europe"
	$("#continents").value("Australia")


	// File upload
	String filePath = "/home/dimitrios/work/private/geb-test-course/pom.xml"
	$("#photo").value(filePath)


	// exit window
	//quit()
}
