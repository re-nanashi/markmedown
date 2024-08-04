package com.javadev;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class HTMLNode {
    protected String tag;
    protected String value;
    protected List<HTMLNode> children;
    protected Attributes attrs;

    public HTMLNode(String tag, String value, List<HTMLNode> children, Attributes attrs) {
        this.tag = tag;
        this.value = value ;
        this.children = children;
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        String childrenString = children.stream().map(Object::toString).collect(Collectors.joining(", "));
        return String.format("HTMLNode(%s, %s, %s, %s)", this.tag, this.value, childrenString, this.attrs.toString());
    }

    public abstract String toHtml();

    public String attributesToHtml() {
        return this.attrs.toString();
    }
}