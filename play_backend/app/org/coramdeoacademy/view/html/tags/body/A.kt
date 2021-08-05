package org.coramdeoacademy.view.html.tags.body

import org.coramdeoacademy.view.html.attributes.Attribute

fun BodyTag.a(href: HRef, init: A.() -> Unit) {
    initTag(A(href), init)
}
class A(href: HRef) : BodyTag("a", href)

class HRef(value: String): Attribute("href", value)
fun href(value: String): HRef = HRef(value)