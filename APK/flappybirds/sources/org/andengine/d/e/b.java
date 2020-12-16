package org.andengine.d.e;

public enum b {
    NONE,
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;
    
    public static b g;

    static {
        g = VERBOSE;
    }

    public boolean a(b bVar) {
        return compareTo(bVar) >= 0;
    }
}
