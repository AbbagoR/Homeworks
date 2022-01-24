/**
 * Java 1. Homework 3
 * 
 * @author Mikhail Dementev
 * @version 24.01.2022
 */
 import java.util.Arrays;
 import java.util.Scanner;
 import java.util.Random;
class HW3 {
    public static void main (String[] args) {
        massivezeroone();
        massivehundred();
        massivesix();
        massivediagonal();
        System.out.println(Arrays.toString(massivelength()));
        massiveminmax();
    }
    static void massivezeroone() {
        int[] mss = {1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 61, 1, 1};
        System.out.println(Arrays.toString(mss));
        for (int i = 0; i < mss.length; i++) {
            mss[i] = (mss[i] == 0) ? mss[i] + 1 : mss[i] - 1;
        }
        System.out.println(Arrays.toString(mss));
    }
    static void massivehundred() {
        int[] msh = new int[100];
        for (int i = 0; i < msh.length; i++) {
            msh[i] = i + 1;
        }
        System.out.println(Arrays.toString(msh));
    }
    static void massivesix() {
        int[] msx = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(msx));
        for (int i = 0; i < msx.length; i++) {
            if (msx[i] < 6) {
                msx[i] = msx[i] * 2;
            }
        }
        System.out.println(Arrays.toString(msx));
    }
    static void massivediagonal() {
        int[][] msd = new int[5][5];
        for (int i = 0; i < msd.length; i++) {
            for (int j = 0, g = msd.length - 1; j < msd.length; j++, g--) {
                if (i == j || i == g) {
                    msd[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(msd));
    }
    static int[] massivelength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length= ");
        int len = scanner.nextInt();
        System.out.println("Value= ");
        int initialValue = scanner.nextInt();
        int[] msl = new int[len];
        for (int i = 0; i < msl.length; i++) {
            msl[i] = initialValue;
        }
        return msl;
    }
    static void massiveminmax() {
        int[] msm = new int[10];
        Random random = new Random();
        int min = 10;
        int max = 0;
        for (int i = 0; i < msm.length; i++) {
            msm[i] = random.nextInt(10);
            int c = msm[i];
            if (min > c) min = c;
            if (max < c) max = c;
        }
        System.out.println(Arrays.toString(msm));
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
    }
}