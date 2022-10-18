package lang.print.gaps.task5;

import java.text.MessageFormat;

public class ThreeStuckVars {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        String vars = "({0}{1}{2})";
        String varsOut = MessageFormat.format(vars, first, second, third);
        System.out.println(varsOut);
    }
}
