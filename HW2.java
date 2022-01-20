/**
 * Java 1. Homework 2
 * 
 * @author Mikhail Dementev
 * @version 20.01.2022
 */
class HW2 {
    public static void main (String[] args) {
        System.out.println(checkSum(24, 2));
        checkNumber(-7);
        System.out.println(checkNegative(-8));
        writestring("apple", 3);
        System.out.println(checkYear(2400));
    }
    static boolean checkSum(int a, int b) {
        boolean c = (a + b > 10 && a + b <= 20);
        return c;
    }
    static void checkNumber(int a) {
        System.out.println(a >= 0? "Number is positive" : "Number is negative");
    }
    static boolean checkPositive(int a) {
        boolean c = a < 0;
        return c;
    }
    static void writestring(String a, int b) {
        int w = 1;
        while (w <= b) {
            System.out.println(a);
            w++;
        }
    }
    static boolean checkYear(int a) {
        boolean c = ((a % 4 == 0) && (a % 100 != 0)) || ((a % 100 == 0) && (a % 400 == 0));
        return c;
    }
}