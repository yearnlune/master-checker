package yearnlune.lab.masterchecker.checker.type.computer;

import yearnlune.lab.masterchecker.checker.Checker;

/**
 * Project : master-checker
 * Created by IntelliJ IDEA
 * Author : DONGHWAN, KIM
 * DATE : 2019.03.22
 * DESCRIPTION :
 */
public class ComputerChecker extends Checker {
    private String regex = "(^\\d+$)|([~!@#$%^*\\(\\)=+_\\[\\]\\{\\}\\|;:.'\",<>\\/ㄱ-ㅎ ㅏ-ㅣ])";

    public ComputerChecker() {
        super.setRegex(regex);
    }

    @Override
    public boolean check(String value) {
        if (value.length() > 15) return false;
        return !super.find(value);
    }
}
