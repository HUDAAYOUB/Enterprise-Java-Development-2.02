package com.lab4.Q1;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {
    @Test
    public void testGetOddNumbers() {
        int n = 50;
        int[] expected = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49};
        int[] result = Main.OddNumbers.oddNumbers(n);
        assertArrayEquals(expected, result);
    }

}