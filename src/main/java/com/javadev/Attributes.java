package com.javadev;

import java.util.HashMap;
import java.util.Map;

public class Attributes {
    private final Map<String, String> attributes = new HashMap<>();
    public Attributes() {}

    @Override
    public String toString() {
        if (attributes.isEmpty())
            return "";
        StringBuilder htmlStringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String attributeString = String.format(" {%s}=\"{%s}\"", entry.getKey(), entry.getValue());
            htmlStringBuilder.append(attributeString);
        }
        return htmlStringBuilder.toString();
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void addAttribute(String key, String value) {
        if (key.isEmpty()) {
            throw new IllegalArgumentException("Invalid key string input");
        }
        attributes.put(key, value);
    }

    public boolean isEmpty() {
        return this.attributes.isEmpty();
    }
}
