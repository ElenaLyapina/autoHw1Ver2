import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void CashBackService200(){
        CashbackHackService cashBackRemain = new CashbackHackService();

        int actual = cashBackRemain.remain(200);
        int expected = 800;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void CashBackService1(){
        CashbackHackService cashBackRemain = new CashbackHackService();

        int actual = cashBackRemain.remain(1);
        int expected = 999;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void CashBackService1000(){
        CashbackHackService cashBackRemain = new CashbackHackService();

        int actual = cashBackRemain.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }
}
