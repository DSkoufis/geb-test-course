package ignore

import spock.lang.IgnoreRest
import spock.lang.Specification

class IgnoreRestAnnotationExample extends Specification {

	def "test one"() {
		setup:
			println "one"
	}

	@IgnoreRest
	def "test two"() {
		setup:
			println "two"
	}
}
