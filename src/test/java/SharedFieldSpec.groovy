import helper.Adder
import spock.lang.Shared
import spock.lang.Specification

class SharedFieldSpec extends Specification {

	def sum = new Adder("non-shared")
	@Shared def initialisedOnce = new Adder("shared")

	def "Feature method 1"() {
		given:
			sum
	}

	def "Feature method 2"() {
		given:
			sum
	}

	def "Shared feature one"() {
		given:
			initialisedOnce
	}

	def "Shared feature two"() {
		given:
			initialisedOnce
	}
}
