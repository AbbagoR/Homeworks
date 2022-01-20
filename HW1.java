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
        System.out.println(c > 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = 154;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    static void compareNumbers() {
        int a = 14;
        int b = 60;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}