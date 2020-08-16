package be.vdab.randomobject;

import java.util.Random;

public class RandomObject {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if(array[i]<250) {
                System.out.println("PIEF");
            }
            else if(array[i]<500) {
                System.out.println("POEF");
            }
            else {
                System.out.println("PAF");
            }
        }
    }
}
