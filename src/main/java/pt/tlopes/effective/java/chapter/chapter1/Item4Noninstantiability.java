package pt.tlopes.effective.java.chapter.chapter1;

// Noninstantiable utility class
public class Item4Noninstantiability {

    // Suppres default (public) constructor for noninstantiability
    private Item4Noninstantiability() {
        throw new AssertionError();
    }

    public static int sumInts(int a, int b) {
        return a + b;
    }
}
