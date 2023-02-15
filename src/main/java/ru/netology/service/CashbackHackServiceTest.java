package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void notUpToTheBonus() {
        int amount = 800;
        int expected = 200;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }
    @Test
    public void notAddTheBonus() {
        int amount = 200;
        int expected = 800;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
    @Test
    public void testLimitBonus() {
        int amount = 1_000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
    @Test
    public void noUpBonus() {
        int amount = 500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
}