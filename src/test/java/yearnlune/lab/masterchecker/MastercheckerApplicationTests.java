package yearnlune.lab.masterchecker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import yearnlune.lab.masterchecker.checker.MasterChecker;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MastercheckerApplicationTests {

    @Test
    public void contextLoads() {
        String[] values = {"48-031-CF-BC-75-90", "48:02:CF:BC:75:90"};

        for (String value : values) {
            boolean check = MasterChecker.check(MasterChecker.Type.MAC_ADDRESS, value);
            System.out.println(check ? "true" : "false");
        }
    }

    @Test
    public void checkIp() {
        String[] values = {"255.255.255.255", "0.1.2.324", "1.2.3.-1", "255.255.255.1"};

        for (String value : values) {
            boolean check = MasterChecker.check(MasterChecker.Type.IP_ADDRESS, value);
            System.out.println(check ? "true" : "false");
        }
    }

    @Test
    public void checkEmail() {
        String[] values = {"abc@email.com", "dadfa@dfafg.co.kr", "aba24124@feafae"};

        for (String value : values) {
            boolean check = MasterChecker.check(MasterChecker.Type.EMAIL, value);
            System.out.println(check ? "true" : "false");
        }
    }
}
