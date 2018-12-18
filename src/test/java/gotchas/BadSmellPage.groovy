package gotchas

import geb.Page

class BadSmellPage extends Page {

	boolean autoCloseCookieBar = true

	static content = {
		cookieBar { $('.cookie-message') }
		cookieBarText { $('.cookie-message-text').text() }
		cookieBarCloseButton { $('.cookie-message-button > input') }
		/*
		Code smells here. This means that we could move those in a module to promote DRY

		Modules are good for:
		- Code reuse
		- Modeling logical components
		- Hiding component structure from tests
		- Hide complete interactions from the tests
		 */
	}
}
