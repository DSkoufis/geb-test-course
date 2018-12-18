package pages

import geb.Page

class ContactUsPage extends Page {

	// Relative URL of the page
	static url = "contact-us/" // --> baseUrl + static url

	// Identifies that we in the page
	static at = {
		title == "Contact Us - Abode QA"
	}

	static content = {
		// <navigator name><options map><actual selector>
		nameField(wait: true) { $("input.name") }
		emailField { $("input.email") }

		/*
		Options Map:
		wait: true false
		required: true false
		cache: true false
		 */
	}

	// Page functions
	def "Add name to name field"(nameString) {
		nameField.value(nameString)

		assert nameField.value() == nameString
	}
}
