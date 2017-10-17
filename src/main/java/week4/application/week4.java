package week4.application;

import week4.models.userModel;
import week4.services.implement.buildPattern;
import week4.services.implement.firstBuilder;
import week4.services.interfaces.builderProduct;
import week4.singletons.doubleCheckSingleton;
import week4.singletons.enumSingleton;

public class week4 {
    public static void main(String[] args) {
        doubleCheckSingleton doubleCheckSingletonInstance = doubleCheckSingleton.getInstance();
        enumSingleton enumSingletonInstance = enumSingleton.INSTNACE;

        userModel userModel = new userModel();
        userModel.Name = "AABBCC";

        firstBuilder firstBuilder = new firstBuilder();
        buildPattern buildPattern = new buildPattern(firstBuilder);

        buildPattern.construct();
        builderProduct product = firstBuilder.getBuilderProduct();

        System.out.println(doubleCheckSingletonInstance.hashCode());
        System.out.println(enumSingletonInstance.hashCode());
        System.out.println(userModel.Name);
        System.out.print(product == null);
    }
}
