package week4.singletons;

public class doubleCheckSingleton {
    private static volatile doubleCheckSingleton doubleCheckSingletonInstance = null;

    private doubleCheckSingleton() {

    }

    public static doubleCheckSingleton getInstance() {
        if (doubleCheckSingletonInstance == null) {
            synchronized (doubleCheckSingleton.class) {
                if (doubleCheckSingletonInstance == null) {
                    doubleCheckSingletonInstance = new doubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingletonInstance;
    }
}
