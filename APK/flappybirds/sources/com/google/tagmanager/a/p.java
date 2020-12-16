package com.google.tagmanager.a;

final class p {
    private final Object a;
    private final int b;

    p(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b;
    }

    public int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
