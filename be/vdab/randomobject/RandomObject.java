package be.vdab.randomobject;

import java.util.Random;

public class RandomObject {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        for (int j : array) {
            System.out.println(j);
            if (j < 250) {
                System.out.println("PIEF");
            } else if (j < 500) {
                System.out.println("POEF");
            } else {
                System.out.println("PAF");
            }
        }
    }
}
