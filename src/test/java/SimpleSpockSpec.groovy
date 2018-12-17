import helper.Adder
import spock.lang.Specification

class SimpleSpockSpec extends Specification {

	def "Feature methods without blocks do not run"() {
		// will never run
		println "I ran #not"
	}

	def "Feature methods need at least one block"() {
		setup:
			println "I ran #YO"
	}

	def "Adding two numbers returns the sum"() {
		given:
			def sum = new Adder("test")

		when:
			def result = sum.adder(2, 3)
		then:
			result == 5
	}
}
