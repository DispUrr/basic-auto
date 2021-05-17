package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceJupiterTest {

    public CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnBonusIfAmountUnder1000() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnBonusIfAmountOver1000() {
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnBonusIfAmount1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

}