package week3.services;

import java.util.Random;

public class randomService {
    public static int[] generateRandomArray() {
        Random random = new Random();

        int[] randomArray = new int[1000];

        for (int i = 0; i < 1000; i++) {
            randomArray[i] = (i * 100) + random.nextInt(99);
        }
        return randomArray;
    }
}