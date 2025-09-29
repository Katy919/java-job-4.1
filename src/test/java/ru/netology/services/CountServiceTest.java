package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountServiceTest {

    @ParameterizedTest
    //@CsvSource({
    //    "3,3000,10000,20000",
    //    "2,60000,100000,150000"
    //})
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void testCalculateCountMonths(int expected, int expenses, int income, int threshold) {
        CountService service = new CountService();

        // int expected = 3;
        //  int expenses = 3_000;
        //  int income = 10_000;
        // int threshold = 20_000;
        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(actual, expected);
    }
}


//@Test
//public void testCalculateCountPonths() {
//  CountService service = new CountService();

//int expected = 2;
//int expenses = 60_000;
//int income = 100_000;
//int threshold = 150_000;
// вызываем целевой метод:
//int actual = service.calculate(income, expenses, threshold);

// производим проверку (сравниваем ожидаемый и фактический):
//Assertions.assertEquals(actual, expected);

