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

driver = {
	System.setProperty("webdriver.chrome.driver", "/home/dimitrios/Documents/automation/chromedriver")
	new ChromeDriver()
}

// change the environment through command line
environments {
	chrome {
		driver = {
			System.setProperty("webdriver.chrome.driver", "/home/dimitrios/Documents/automation/chromedriver")
			new ChromeDriver()
		}
	}

	firefox {
		driver = {
			System.setProperty("webdriver.gecko.driver", "/home/dimitrios/Documents/automation/geckodriver")
			new FirefoxDriver()
		}
	}
}

baseUrl = "http://abodeqa.com/" // It's better to set the trailing slash here to not have slashes on the start of each url in the tests. Ref: http://www.gebish.org/manual/current/#base-url
reportsDir = "./target/report"

