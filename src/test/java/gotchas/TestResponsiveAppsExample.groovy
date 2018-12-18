package gotchas

import geb.ConfigurationLoader
import org.openqa.selenium.Dimension
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension
import org.spockframework.runtime.model.FeatureInfo

class TestResponsiveAppsExample extends AbstractAnnotationDrivenExtension<TestMobileView> {

	@Override
	void visitFeatureAnnotation(TestMobileView annotation, FeatureInfo feature) {
		feature.addInterceptor { invocation ->
			def window = new ConfigurationLoader().conf.driver.manage().window()
			def originalSize = window.size // get the original size of the window before resizing it to test a responsive component
			try {
				window.size = new Dimension(320, 568)
				invocation.proceed()
			} finally {
				window.size = originalSize // return the size to the previous one
			}
		}
	}
}
