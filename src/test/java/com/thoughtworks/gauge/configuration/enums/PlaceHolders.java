package com.thoughtworks.gauge.configuration.enums;

public enum PlaceHolders {


    FULL_NAME("Full Name"),
    EMAIL("name@example.com"),
    CURRENT_ADDRESS("Current Address");

    private final String identifier;

    public String getIdentifier() {
        return this.identifier;
    }


    PlaceHolders(String identifier) {
        this.identifier = identifier;
    }

}
