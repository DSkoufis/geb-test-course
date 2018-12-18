import geb.Browser
import pages.ContactUsPage

Browser.drive {
	to ContactUsPage // difference with go method --> Browser makes available the Page object in the page, moves into that page and checks that we are in the page by using the static at field

	// via method --> Same as the to method but it doesn't perform validation using the at field. Should be followed by at method

	println currentUrl

	"Add name to name field"("test")

	addNameToEmailField("email@test.com")
}
