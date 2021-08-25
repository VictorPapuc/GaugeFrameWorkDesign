package com.thoughtworks.gauge.configuration.enums;

public enum UrlConfiguration {

    ELEMENTS("/elements");

    private final String URL;

    UrlConfiguration(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return this.URL;
    }
}
