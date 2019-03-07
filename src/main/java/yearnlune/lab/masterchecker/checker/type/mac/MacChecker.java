package yearnlune.lab.masterchecker.checker.type.mac;

import yearnlune.lab.masterchecker.checker.Checker;

/**
 * Project : masterchecker
 * Created by IntelliJ IDEA
 * Author : DONGHWAN, KIM
 * DATE : 2019.03.06
 * DESCRIPTION :
 */
public class MacChecker extends Checker {
    private String regex = "(([0-9a-fA-F]{2}-){5}|([0-9a-fA-F]{2}:){5})[0-9a-fA-F]{2}";

    public MacChecker() {
        super.setRegex(regex);
    }


}
