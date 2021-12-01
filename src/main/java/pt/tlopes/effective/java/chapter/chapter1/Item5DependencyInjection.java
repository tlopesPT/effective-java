package pt.tlopes.effective.java.chapter.chapter1;

import java.util.Objects;
import java.util.regex.Pattern;

public class Item5DependencyInjection {

    // inject the dependency via constructor instead of hardwiring, makes it flexible and testable
    private final Pattern pattern;

    public Item5DependencyInjection(final Pattern pattern) {
        this.pattern = Objects.requireNonNull(pattern);
    }

    public boolean matchesPattern(final String aString) {
        return pattern.matcher(aString).matches();
    }
}
