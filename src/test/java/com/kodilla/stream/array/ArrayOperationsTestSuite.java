package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[20];
        numbers[0] = 5;
        numbers[1] = 25;
        numbers[2] = 95;
        numbers[3] = 25;
        numbers[4] = 53;
        numbers[5] = 15;
        numbers[6] = 52;
        numbers[7] = 35;
        numbers[8] = 55;
        numbers[9] = 57;
        numbers[10] = 25;
        numbers[11] = 15;
        numbers[12] = 5;
        numbers[13] = 85;
        numbers[14] = 95;
        numbers[15] = 5;
        numbers[16] = 45;
        numbers[17] = 25;
        numbers[18] = 54;
        numbers[19] = 58;
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(41.45, result, 0.001);
    }
}
