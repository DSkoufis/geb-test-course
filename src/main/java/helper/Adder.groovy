package helper

class Adder {

	Adder(String attr) {
		println "${attr} - ${new Random().nextInt()}"
	}

	def adder(a, b) {
		a + b
	}
}
