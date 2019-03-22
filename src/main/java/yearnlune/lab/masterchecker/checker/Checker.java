package yearnlune.lab.masterchecker.checker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project : masterchecker
 * Created by IntelliJ IDEA
 * Author : DONGHWAN, KIM
 * DATE : 2019.03.06
 * DESCRIPTION :
 */
public abstract class Checker {
    private String regex = "";

    public Checker() {
    }

    public boolean check(String value) {
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }

    public boolean find(String value) {
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);

        return matcher.find();
    }

    protected void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public String toString() {
        return "Checker{" +
                "regex='" + regex + '\'' +
                '}';
    }
}
