package calculatordemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private Pattern pattern;
    private Matcher matcher;
    //"2 + 2"
    private String expression;

    public InputHelper(String expression) {
        this.expression = expression;
        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
        matcher = pattern.matcher(expression);
        if (!isStringCorrect()) {
            throw new RuntimeException("String is not correct");
        }
    }

    public int getFirstArgument() {
        pattern = Pattern.compile("^(\\d+)");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }

    public int getSecondArgument() {
        pattern = Pattern.compile("(\\d+)$");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }

    public char getOperation() {
        pattern = Pattern.compile("([+-])");
        matcher = pattern.matcher(expression);
        matcher.find();
        return matcher.group().charAt(0);
    }

    //"2 + 2"
    //"2   + 2"
    //"200 - 200"
    private boolean isStringCorrect() {
        return matcher.matches();
    }
}