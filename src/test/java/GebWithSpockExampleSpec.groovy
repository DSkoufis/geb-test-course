import geb.spock.GebSpec
import pages.ContactUsPage
import pages.MessageSubmittedPage

class GebWithSpockExampleSpec extends GebSpec {

	def "Fill and submit form"() {
		given:
			to ContactUsPage
		and:
			"Add name to name field"("test")
			addNameToEmailField("test@test.com")
			"Enter comment"("Test")

		when:
			"Click submit"()
		then:
			at MessageSubmittedPage
	}
}
