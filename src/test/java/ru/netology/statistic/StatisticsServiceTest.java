package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 40, 5, 3, 8, 6, 15, 11, 12};
        long expected = 40;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
