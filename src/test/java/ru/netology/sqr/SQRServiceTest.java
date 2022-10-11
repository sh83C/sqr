package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    // Числа, подходящие под диапазон: 15, 16, 17, 18, 19, 20, 21, 22

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 500);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
}
