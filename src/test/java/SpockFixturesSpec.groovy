import spock.lang.Specification

class SpockFixturesSpec extends Specification {

	def setupSpec() {
		println "In setup spec. Called once"
	}

	def setup() {
		println "In setup. Called before each test"
	}

	def cleanup() {
		println "In cleanup. Called after each test"
	}

	def cleanupSpec() {
		println "In cleanup spec. Called once in the end"
	}

	def "Feature 1"() {
		setup:
			println "Feature method 1"
	}

	def "Feature 2"() {
		setup:
			println "Feature method 2"
	}

	def "Feature 3"() {
		setup:
			println "Feature method 3"
	}

}
