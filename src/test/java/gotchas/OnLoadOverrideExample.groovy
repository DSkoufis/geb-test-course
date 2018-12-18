package gotchas

import geb.Page

class OnLoadOverrideExample extends Page {

	boolean autoCloseCookieBar = true

	static content = {
		cookieBar { module CookieBarModule } // let's assume that this exists and is a common element on the bottom of the page
	}

	/**
	 * Use case of overriding this: The cookie text is on the bottom of the page and is above other elements, so tests cannot interact with them. This way we
	 * close the cookie bar as soon as the page loads into the browser, without polluting our tests with this action
	 * @param previousPage
	 */
	@Override
	void onLoad(Page previousPage) {
		super.onLoad(previousPage)

		if (autoCloseCookieBar && cookieBar) {
			cookieBar.close() // method that closes the window --> Should be inside the module
		}
	}
}
