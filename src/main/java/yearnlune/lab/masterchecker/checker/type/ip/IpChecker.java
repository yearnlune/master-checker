package yearnlune.lab.masterchecker.checker.type.ip;

import yearnlune.lab.masterchecker.checker.Checker;

/**
 * Project : masterchecker
 * Created by IntelliJ IDEA
 * Author : DONGHWAN, KIM
 * DATE : 2019.03.07
 * DESCRIPTION :
 */
public class IpChecker extends Checker {
    private String regex = "(\\d{1,3}\\.){3}\\d{1,3}";

    public IpChecker() {
        super.setRegex(regex);
    }

    @Override
    public boolean check(String value) {
        if (super.check(value)) {
            String[] valueArry = value.split("[.]");

            for (String valueSplit : valueArry) {
                if (Integer.parseInt(valueSplit) > 255) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
