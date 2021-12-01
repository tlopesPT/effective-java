package pt.tlopes.effective.java.chapter;

import java.util.regex.Pattern;
import javax.enterprise.context.ApplicationScoped;
import pt.tlopes.effective.java.chapter.chapter2.Item1StaticFactoryMethod;
import pt.tlopes.effective.java.chapter.chapter2.Item2BuilderPattern;
import pt.tlopes.effective.java.chapter.chapter2.Item3Singleton;
import pt.tlopes.effective.java.chapter.chapter2.Item4Noninstantiability;
import pt.tlopes.effective.java.chapter.chapter2.Item5DependencyInjection;
import pt.tlopes.effective.java.chapter.chapter2.Item6UnnecessaryObjects;
import pt.tlopes.effective.java.chapter.chapter2.Item7ObsoleteReferences;
import pt.tlopes.effective.java.chapter.chapter2.Item8AvoidCleaners;
import pt.tlopes.effective.java.chapter.chapter2.Item9TryResources;

/**
 * Creating and Destroying Objects
 */
@ApplicationScoped
public class Chapter2 implements Chapter {

    @SuppressWarnings("unused")
    @Override
    public void start() {
        final Item1StaticFactoryMethod item1 = Item1StaticFactoryMethod.of("str", 5);

        final Item2BuilderPattern item2 = new Item2BuilderPattern.Builder(1, 2).w(3).z(4).build();

        final String item3 = Item3Singleton.INSTANCE.something();

        final int item4 = Item4Noninstantiability.sumInts(1, 2);

        final Item5DependencyInjection item5 = new Item5DependencyInjection(Pattern.compile("aStr"));
        assert item5.matchesPattern("aStr");

        assert Item6UnnecessaryObjects.isRomanNumeral("MMCD");

        final Item7ObsoleteReferences item7 = new Item7ObsoleteReferences();
        item7.push("aStr");
        item7.pop();

        final Item8AvoidCleaners item8 = new Item8AvoidCleaners(2);

        final Item9TryResources item9 = new Item9TryResources();
        item9.copy("", "");
    }
}
