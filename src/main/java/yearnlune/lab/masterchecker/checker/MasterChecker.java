package yearnlune.lab.masterchecker.checker;

import yearnlune.lab.masterchecker.checker.type.ip.IpChecker;
import yearnlune.lab.masterchecker.checker.type.mac.MacChecker;

/**
 * Project : masterchecker
 * Created by IntelliJ IDEA
 * Author : DONGHWAN, KIM
 * DATE : 2019.03.06
 * DESCRIPTION :
 */
public class MasterChecker {
    public enum Type {
        MAC_ADDRESS(0),
        IP_ADDRESS(1);

        Type(int value) {
            this.value = value;
        }

        private int value;
    }


    public static boolean check(Type type, String value) {
        switch (type) {
            case MAC_ADDRESS:
               return new MacChecker().check(value);
            case IP_ADDRESS:
                return new IpChecker().check(value);
            default:
                return false;
        }

    }
}
