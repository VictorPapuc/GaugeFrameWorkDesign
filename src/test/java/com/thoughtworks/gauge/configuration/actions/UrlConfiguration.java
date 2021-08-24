package com.thoughtworks.gauge.configuration.actions;

public enum UrlConfiguration {

    ELEMENTS("/elements");

    private String URL;

    UrlConfiguration(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return this.URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
