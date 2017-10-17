package week4.services.implement;

import week4.services.interfaces.builder;

public class buildPattern {
    private builder builder;

    public buildPattern(builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildFirstPart();
    }
}
