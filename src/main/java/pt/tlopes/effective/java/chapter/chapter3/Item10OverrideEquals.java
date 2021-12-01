package pt.tlopes.effective.java.chapter.chapter3;

public class Item10OverrideEquals {

    // Class with a typical equals method
    private final short areaCode;
    private final short prefix;
    private final short lineNum;

    public Item10OverrideEquals(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    /**
     * The equals method implements an equivalence relation. It has these properties:
     * • Reflexive: For any non-null reference value x, x.equals(x) must return true.
     * • Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true.
     * • Transitive: For any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true.
     * • Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) must consistently return true or consistently return false,
     * provided no information used in equals comparisons is modified.
     * • For any non-null reference value x, x.equals(null) must return false.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Item10OverrideEquals)) {
            return false;
        }
        Item10OverrideEquals pn = (Item10OverrideEquals) o;
        return pn.lineNum == lineNum && pn.prefix == prefix
            && pn.areaCode == areaCode;
    }
}
