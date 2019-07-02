package yearnlune.lab.masterchecker.checker.type.email;

import yearnlune.lab.masterchecker.checker.Checker;

public class EmailChecker extends Checker {
    private String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$";

    public EmailChecker() {
        super.setRegex(regex);
    }

    @Override
    public boolean check(String value) {
        return super.check(value);
    }
}
