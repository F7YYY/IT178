package org.andengine.opengl.d;

public enum a {
    STATIC(35044),
    DYNAMIC(35048),
    STREAM(35040);
    
    private final int d;

    private a(int i) {
        this.d = i;
    }

    public int a() {
        return this.d;
    }
}
