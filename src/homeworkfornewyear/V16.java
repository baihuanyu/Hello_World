package homeworkfornewyear;

import java.lang.reflect.Array;
import java.util.Arrays;

public class V16 {
    public static void main(String[] args) {
        String s = "113@ ere qqq yyui";
        String[] s1 = s.split(" ");
        for (int i = 0;i<s1.length;i++)
            System.out.println(s1[i]);
    }

    public static boolean isSymmetry(String s) {
        if (s == null)
            return false;
        if (s.equals("") || s.length() == 1)
            return true;

        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        return true;
    }

}
