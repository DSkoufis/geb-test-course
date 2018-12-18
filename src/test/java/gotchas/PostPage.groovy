package gotchas

import geb.Page
import helper.Post

class PostPage extends Page {

	Post post

	/**
	 * Override the Page method. By default it is returning the static url field of the object. This way we let the Page object care about the URL
	 * of the post instead of our tests
	 *
	 * @return
	 */
	@Override
	String getPageUrl() {
		"posts/${post.id}/${post.title.toLowerCase().replaceAll(" ", "-")}"
	}

	static content = {
		loginPageLink { $("selector") }
	}
}
