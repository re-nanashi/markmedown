package com.javadev;

public enum TextType {
    TEXT("text"), BOLD("bold"), ITALIC("italic"), CODE("code"), LINK("link"), IMAGE("image");

    private final String typeString;

    private TextType(String type) {
        typeString = type;
    }

    @Override
    public String toString() {
        return typeString;
    }
}
