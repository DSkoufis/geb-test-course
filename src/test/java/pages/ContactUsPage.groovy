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
		commentField(wait: true) { $("#contact-form-comment-g1280-comment") }
		submitButton(wait: true) { $("input.pushbutton-wide") }

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

	def addNameToEmailField(email) {
		emailField.value(email)
		assert emailField.value() == email // verify that the email has been set
	}

	def "Enter comment"(comment) {
		commentField.value(comment)
	}

	def "Click submit"() {
		submitButton.click()
	}
}
