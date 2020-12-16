package com.google.tagmanager.a;

public abstract class c implements ap {
    protected int a = -1;
    private boolean b = true;

    /* renamed from: a */
    public ap clone() {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    /* access modifiers changed from: package-private */
    public bf b() {
        return new bf(this);
    }

    public an n() {
        throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
    }

    public an o() {
        throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
    }
}
