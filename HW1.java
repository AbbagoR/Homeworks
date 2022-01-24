class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 6;
        int b = -18;
        int c = a + b;
        System.out.println(c > 0 ? "Summ positive" : "Summ negative");
    }

    static void printColor() {
        int value = 54;
        if (value <= 0) {
            System.out.println("Red");
        } else {
            if (value <= 100) {
                System.out.println("Yellow");
            } else {
                System.out.println("Green");
            }
        }
    }

    static void compareNumbers() {
        int a = 14;
        int b = 60;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}