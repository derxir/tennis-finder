package com.derxir.domain;

/**
 * Created by justin on 4/20/17.
 */
public class CourtInfo {

    private final String name;

    private final String postcode;

    private final String description;

    public CourtInfo(String name, String postcode, String description) {
        this.name = name;
        this.postcode = postcode;
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public String getPostcode() {
        return postcode;
    }

    public String getDescription() {
        return description;
    }
}
