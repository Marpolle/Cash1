package cashbacktest;

import org.testng.annotations.Test;
import ru.netology.cashback.CashbackHackService;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashBackIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashBackSIfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}
