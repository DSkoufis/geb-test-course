import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	// default parameters
	timeout = 2
	retryInterval = 0.5


	includeCauseInMessage = true

	preset {
		slow {
			timeout = 20
			retryInterval = 1
		}

		verySlow {
			timeout = 50
		}
	}
}

// Default check waiting preset
//atCheckWaiting = "slow"
atCheckWaiting = true // can be modified from other calls instead of setting it globally

driver = { new ChromeDriver() }

// change the environment through command line
environments {
	chrome { driver = { new ChromeDriver() } }

	firefox { driver = { new FirefoxDriver() } }
}

baseUrl = "http://abodeqa.com"
reportsDir = "./target/report"

