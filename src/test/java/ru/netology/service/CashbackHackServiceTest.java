package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainder100() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainderZero() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainder1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainderOne() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldRedturnRemainder999() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual,expected);
    }
}