package com.google.tagmanager.a;

public abstract class v extends b {
    private h a = h.a;

    protected v() {
    }

    public final v a(h hVar) {
        this.a = hVar;
        return this;
    }

    public abstract v a(t tVar);

    /* renamed from: e */
    public abstract t p();

    /* renamed from: f */
    public v g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public final h r() {
        return this.a;
    }
}
