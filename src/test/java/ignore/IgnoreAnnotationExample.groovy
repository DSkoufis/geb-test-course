package ignore

import spock.lang.Ignore
import spock.lang.Specification

class IgnoreAnnotationExample extends Specification {

	def "test one"() {
		setup:
			println "one"
	}

	@Ignore
	def "test two"() {
		setup:
			println "two"
	}

}
