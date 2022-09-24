package com.zebra;

import java.util.Arrays;

public class Main {

    // Input    0 1 0 2 0 3 0 4
    // Output   1 2 3 4 0 0 0 0
    public static void main(String[] args) {
        int[] input = {0, 1, 0, 2, 0, 3, 0, 4};
        int[] output = processInput(input);
        Arrays.stream(output).forEach(System.out::println);
    }

    static int[] processInput(int[] input) {

        int forwardIndex = 0;
        for (int i = 0; i < input.length; i++) {

            if (input[i] != 0) {
                int aux = input[forwardIndex];
                input[forwardIndex] = input[i];
                input[i] = aux;
                forwardIndex++;
            }

        }
        return input;
    }
}

