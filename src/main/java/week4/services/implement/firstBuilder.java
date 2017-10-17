package week4.services.implement;

import week4.services.interfaces.builder;
import week4.services.interfaces.builderPart;
import week4.services.interfaces.builderProduct;

public class firstBuilder implements builder {
    builderPart firstPart;

    public void buildFirstPart() {
        firstPart = new firstPart();
    }

    @Override
    public builderProduct getBuilderProduct() {
        return null;
    }
}