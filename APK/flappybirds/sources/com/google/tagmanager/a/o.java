package com.google.tagmanager.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class o {
    private static volatile boolean a = false;
    private static final o c = new o(true);
    private final Map b;

    o() {
        this.b = new HashMap();
    }

    private o(boolean z) {
        this.b = Collections.emptyMap();
    }

    public static o a() {
        return c;
    }

    public aa a(am amVar, int i) {
        return (aa) this.b.get(new p(amVar, i));
    }
}
