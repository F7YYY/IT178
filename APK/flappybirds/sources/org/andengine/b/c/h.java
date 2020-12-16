package org.andengine.b.c;

public enum h {
    BRIGHT(26),
    SCREEN_BRIGHT(10),
    SCREEN_DIM(6),
    SCREEN_ON(-1);
    
    private final int e;

    private h(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }
}
