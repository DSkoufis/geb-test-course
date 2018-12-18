package modules

import geb.Module

/**
 * With modules you define common elements across pages to reuse the components
 *
 * Ref: http://www.gebish.org/manual/current/#modules
 */
class TabsModule extends Module {
	static content = {
		discountCoupons(wait: true, required: true) { $("#mainnav-menu > li.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-4062 > a") }
	}

	def clickOnDiscountCoupons() {
		interact {
			moveToElement discountCoupons
		}
		discountCoupons.click()
	}
}
