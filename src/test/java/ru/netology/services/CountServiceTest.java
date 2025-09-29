package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CountServiceTest {

    @Test
    public void testCalculateCountMonths() {
        CountService service = new CountService();

        int expected = 3;
        int expenses = 3_000;
        int income = 10_000;
        int threshold = 20_000;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCalculateCountPonths() {
        CountService service = new CountService();

        int expected = 2;
        int expenses = 60_000;
        int income = 100_000;
        int threshold = 150_000;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(actual, expected);
    }
}