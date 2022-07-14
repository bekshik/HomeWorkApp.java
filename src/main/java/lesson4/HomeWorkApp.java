package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {

    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = "♥";
    public static final String SPACE_MAP = " ";

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int turnsCount;


    public static void main(String[] args) {
        do {
            System.out.println("\n\nИгра началась!");

            init();
            printMap();
            playGame();
        } while (isContinueGeme());
        endGame();
    }

    private static void init() {
        turnsCount = 0;

        initMap();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = getValidNumberFromScanner() - 1;

            System.out.print("Введите координату столбика: ");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }

            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n%n", rowNumber + 1,
                    columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int getValidNumberFromScanner() {
        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                  return  n;
                }
                System.out.println("Ошибка! От 1 до " + SIZE);
            } else {
                System.out.println("Ошибка! веди число!");
                in.next();
            }
        }
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;

    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("УРА ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("ПК победил!");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }


        return false;
    }

    private static boolean checkWin(char symbol) {

        boolean cols, rows;
        for (int columnNumber = 0; columnNumber < SIZE; columnNumber++) {
            cols = true;
            rows = true;
            for (int rowNumber = 0; rowNumber < SIZE; rowNumber++) {
                cols &= (MAP[columnNumber][rowNumber] == symbol);
                rows &= (MAP[rowNumber][columnNumber] == symbol);
            }
            if (cols || rows) return true;
        }
        boolean diagonal = true;
        for (int i = 0; i < SIZE; i++) {
            diagonal = diagonal & (MAP[i][i] == symbol);
        }


        return diagonal;
    }

    private static boolean checkDraw() {


        return turnsCount >= SIZE * SIZE;
    }

    private static void aiTurn() {
        System.out.println("\nХОД ПК!");

        int rowNumber;
        int columnNumber;


        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean isContinueGeme() {
        System.out.println("Хотите продолжить! если да y\\n");
        return switch (in.next()) {
            case "y", "да", "д", "yes", "+" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        in.close();
        System.out.println("ты заходи, если что!");
    }
}



