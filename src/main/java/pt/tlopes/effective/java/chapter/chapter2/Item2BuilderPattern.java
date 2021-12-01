package pt.tlopes.effective.java.chapter.chapter2;

public class Item2BuilderPattern {
    private final int x;
    private final int y;
    private final int w;
    private final int z;

    private Item2BuilderPattern(final Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
        this.w = builder.w;
        this.z = builder.z;
    }

    // implementation of the builder pattern
    public static class Builder {
        private final int x;
        private final int y;
        private int w;
        private int z;

        public Builder(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        public Builder w(int val) {
            w = val;
            return this;
        }

        public Builder z(int val) {
            z = val;
            return this;
        }

        public Item2BuilderPattern build() {
            return new Item2BuilderPattern(this);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getZ() {
        return z;
    }
}
