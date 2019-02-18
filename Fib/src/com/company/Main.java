package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(numberFib(9));
    }

    public static int numberFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int firstNumber = 1;
        int secondNumber = 1;
        int numFib = 0;
        for (int i = 0; i < n - 2; i++) {
            numFib = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = numFib;
        }
        return numFib;
    }
}
