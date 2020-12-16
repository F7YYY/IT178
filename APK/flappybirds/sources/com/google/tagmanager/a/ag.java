package com.google.tagmanager.a;

import java.io.IOException;

class ag {
    private final am a;
    private final o b;
    private h c;
    private volatile am d;

    private void b() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    try {
                        if (this.c != null) {
                            this.d = (am) this.a.c().c(this.c, this.b);
                        }
                    } catch (IOException e) {
                    }
                }
            }
        }
    }

    public am a() {
        b();
        return this.d;
    }

    public boolean equals(Object obj) {
        b();
        return this.d.equals(obj);
    }

    public int hashCode() {
        b();
        return this.d.hashCode();
    }

    public String toString() {
        b();
        return this.d.toString();
    }
}
