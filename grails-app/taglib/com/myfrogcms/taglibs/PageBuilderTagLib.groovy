package com.myfrogcms.taglibs

class PageBuilderTagLib {
    static defaultEncodeAs = [taglib:'html']
    static final namespace = "pagebuilder"

    /**
     * basic tag
     * use <pagebuilder:emoticon happy="true"/>
     */
    def emoticon = { attrs, body ->
        out << body() << (attrs.happy == 'true' ? " :-)" : " :-(")
    }
}
