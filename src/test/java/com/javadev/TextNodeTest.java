package com.javadev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextNodeTest {
    @Test
    @DisplayName("Same TextNodes with same data values should be equal")
    public void testEquality() {
        TextNode node1 = new TextNode("This is a text node", TextType.BOLD);
        TextNode node2 = new TextNode("This is a text node", TextType.BOLD);
        assertEquals(node1, node2);
    }

    @Test
    @DisplayName("Different TextNodes instances (different types) should not be equal")
    public void testTypeEquality() {
        TextNode node1 = new TextNode("This is a text node", TextType.BOLD);
        TextNode node2 = new TextNode("This is a text node", TextType.ITALIC);
        assertNotEquals(node1, node2);
    }

    @Test
    @DisplayName("Different TextNodes instances (different text values) should not be equal")
    public void testTextEquality() {
        TextNode node1 = new TextNode("This is a text node", TextType.BOLD);
        TextNode node2 = new TextNode("This is a text node2", TextType.BOLD);
        assertNotEquals(node1, node2);
    }

    @Test
    @DisplayName("Same TextNodes instances with same URL should be equal")
    public void testURLEquality() {
        TextNode node1 = new TextNode("This is a text node", TextType.TEXT, "https://www.boot.dev");
        TextNode node2 = new TextNode("This is a text node", TextType.TEXT, "https://www.boot.dev");
        assertEquals(node1, node2);
    }

    @Test
    @DisplayName("Test string representation of instance")
    public void testInstanceStringRepr() {
        TextNode node = new TextNode("This is a text node", TextType.TEXT, "https.//www.boot.dev");
        String testString = "TextNode(This is a text node, text, https.//www.boot.dev)";
        assertEquals(testString, node.toString());
    }
}