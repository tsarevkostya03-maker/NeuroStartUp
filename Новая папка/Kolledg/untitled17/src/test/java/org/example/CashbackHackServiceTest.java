package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals(result, 100, "For 900 rubles need 100");
    }

    @Test
    public void shouldReturn500WhenAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1500);
        assertEquals(result, 500, "For 1500 rubles need 500");
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(result, 0, "For 1000 rubles need 0");
    }
}