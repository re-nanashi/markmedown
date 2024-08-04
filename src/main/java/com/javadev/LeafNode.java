package com.javadev;

public class LeafNode extends HTMLNode {
    public LeafNode(String tag, String value, Attributes attrs) {
        super(tag, value, null, attrs);
    }

    @Override
    public String toHtml() {
        if (this.value.isEmpty())
            throw new IllegalArgumentException("Invalid HTML: no value");
        if (this.tag.isEmpty())
            return this.value;
        return String.format("<%s%s>%s</%s>", this.tag, this.attrs.toString(), this.value, this.tag);
    }

    @Override
    public String toString() {
        return String.format("LeafNode(%s, %s, %s)", this.tag, this.value, this.attrs.toString());
    }
}
