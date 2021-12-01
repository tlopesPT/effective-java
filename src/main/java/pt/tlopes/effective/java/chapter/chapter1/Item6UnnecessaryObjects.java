package pt.tlopes.effective.java.chapter.chapter1;

import java.util.regex.Pattern;

public class Item6UnnecessaryObjects {
    // instead of creating this pattern in each method call, cache it here and reuse for better performance
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    private Item6UnnecessaryObjects() {
        throw new AssertionError();
    }

    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
