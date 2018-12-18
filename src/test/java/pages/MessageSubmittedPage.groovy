package pages

import geb.Page

class MessageSubmittedPage extends Page {
	static at = {
		println "At the correct page"
		return true
	}
}
