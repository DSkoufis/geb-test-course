package gotchas

import geb.spock.GebSpec

class IdeSupportExampleSpec extends GebSpec {

	def "Setting the return value helps the IDE and developers"() {
		given:
			def postPage = to PostPage
			postPage.loginPageLink.click()

		when:
			def loginPage = at LoginPage // could be whatever
		then:
			def securePage = loginPage.login("user", "pass") // this way we help IntelliJ to understand which method is using that
	}
}
