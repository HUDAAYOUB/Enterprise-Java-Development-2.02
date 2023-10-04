package com.lab4.Q1;
import java.util.ArrayList;
import java.util.Arrays;

import static com.lab4.Q1.Main.OddNumbers.oddNumbers;

public class Main {
        public static void main(String[] args) {
                int n = 50;
                int[] result = oddNumbers(n);
                System.out.println(Arrays.toString(result));
        }
        public class OddNumbers {
                public static int[] oddNumbers(int n) {
                        if (n < 1) {
                                return new int[0];
                        }
                        int[] oddNumbers = new int[(n + 1) / 2];
                        int num = 0;
                        for (int i = 1; i <= n; i += 2) {
                                oddNumbers[num] = i;
                                num++;
                        }
                        return oddNumbers;}}}