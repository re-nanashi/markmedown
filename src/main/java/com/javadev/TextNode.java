package com.javadev;

import java.util.Objects;

// TODO: Test this:
public class TextNode {
    private String text;
    private TextType textType;
    private String url;

    public TextNode(String text, TextType type) {
        this(text, type, null);
    }

    public TextNode(String text, TextType type, String url) {
        this.text = text;
        this.textType = type;
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        // Return true if the object is being compared to itself
        if (o == this)
            return true;
        // Check if object is an instance of TextNode
        if (!(o instanceof  TextNode))
            return false;
        // Typecast o to TextNode so that we can compare data members
        TextNode otherTextNode = (TextNode) o;
        // Compare the data members and return accordingly
        return this.text.equals(otherTextNode.text)
                && this.textType == otherTextNode.textType
                && Objects.equals(this.url, otherTextNode.url); // url might be null
    }

    @Override
    public String toString() {
        return String.format("TextNode(%s, %s, %s)", this.text, this.textType, this.url);
    }

    // TODO: Create LeafNode class
    /*
    static public LeafNode convertTextNodeToHtmlNode(TextNode textNode) {
    }
     */
}
