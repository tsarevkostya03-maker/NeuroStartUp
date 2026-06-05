package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals(result, 100, "Для 900 рублей нужно докупить 100");
    }

    @Test
    public void shouldReturn500WhenAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1500);
        assertEquals(result, 500, "Для 1500 рублей нужно докупить 500");
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(result, 0, "Для 1000 рублей докупать не нужно");
    }
    // Этот тест упадёт, потому что реальный результат = 1000
}
