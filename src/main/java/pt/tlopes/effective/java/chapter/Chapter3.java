package pt.tlopes.effective.java.chapter;

import javax.enterprise.context.ApplicationScoped;
import pt.tlopes.effective.java.chapter.chapter3.Item10OverrideEquals;
import pt.tlopes.effective.java.chapter.chapter3.Item11OverrideHashCode;

/**
 * Methods Common to All Objects
 */
@ApplicationScoped
public class Chapter3 implements Chapter {


    @Override
    public void start() {

        final Item10OverrideEquals item10A = new Item10OverrideEquals(100, 200, 300);
        final Item10OverrideEquals item10B = new Item10OverrideEquals(100, 200, 300);
        assert item10A.equals(item10B);

        final Item11OverrideHashCode hashCodeA = new Item11OverrideHashCode(1, 2, 3);
        final Item11OverrideHashCode hashCodeB = new Item11OverrideHashCode(1, 2, 3);
        assert hashCodeA.hashCode() == hashCodeB.hashCode();
    }
}
