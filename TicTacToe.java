/**
 * Java 1. Homework 4
 * 
 * @author Mikhail Dementev
 * @version 27.01.2022
 */
 import java.util.Random;
 import java.util.Scanner;

class TicTacToe {

    final char CHAR_H = 'x';
    final char CHAR_A = 'o';
    final char CHAR_D = '*';
    Random random;
    Scanner scanner;
    char[][] table;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin(CHAR_H)) {
                System.out.println("WIN");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(CHAR_A)) {
                System.out.println("LOSE");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW");
                break;
            }
        }
        printTable();
        System.out.println("GameOver");
    }

    void initTable() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                table[y][x] = CHAR_D;
            }
        }
    }

    void printTable() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter x y [1..3]:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_H;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_A;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == CHAR_D;
    }

    boolean checkWin(char ch) {
        //if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        //if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        //if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //
        //if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        //if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        //if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        //
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) || (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)) return true;
        //
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }

    boolean isTableFull() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table[x][y] == CHAR_D) {
                    return false;
                }
            }
        }
        return true;
    }
}