package pt.tlopes.effective.java.chapter.chapter3;

public class Item11OverrideHashCode {

    private final short areaCode;
    private final short prefix;
    private final short lineNum;

    public Item11OverrideHashCode(int areaCode, int prefix, int lineNum) {
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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Item11OverrideHashCode)) {
            return false;
        }
        Item11OverrideHashCode pn = (Item11OverrideHashCode) o;
        return pn.lineNum == lineNum && pn.prefix == prefix
            && pn.areaCode == areaCode;
    }

    /**
     * You must override hashCode in every class that overrides equals.
     * Equal objects must have equal hash codes.
     */
    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;
    }
}
