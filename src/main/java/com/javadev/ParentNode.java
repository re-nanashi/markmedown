package com.javadev;

import java.util.List;

public class ParentNode extends HTMLNode{

    public ParentNode(String tag, List<HTMLNode> children) {
        this(tag, children, null);
    }

    public ParentNode(String tag, List<HTMLNode> children, Attributes attrs) {
        super(tag, "", children, attrs);
    }

    @Override
    public String toHtml() {
        if (this.tag.isEmpty() || this.tag.isBlank())
            throw new IllegalArgumentException("Invalid HTML: no tag");
        if (this.children == null ||  this.children.isEmpty())
            throw new IllegalArgumentException("Invalid HTML: no children");
        StringBuilder htmlStringBuilder = new StringBuilder();
        for (HTMLNode child : this.children) {
            htmlStringBuilder.append(child.toHtml());
        }
        return String.format("<%s%s>%s</%s>", this.tag, this.attrs.toString(), htmlStringBuilder.toString(), this.tag);
    }
}
