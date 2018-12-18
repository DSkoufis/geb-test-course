package gotchas

import geb.Browser
import helper.Post

def post = new Post(id: 1, title: "My first post")

Browser.drive {
	to new PostPage(post: post)
	assert title == post.title
}
