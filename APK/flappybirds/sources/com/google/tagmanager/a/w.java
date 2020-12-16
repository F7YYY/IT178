package com.google.tagmanager.a;

public abstract class w extends v implements y {
    private q a = q.b();
    private boolean b;

    protected w() {
    }

    private void a() {
        if (!this.b) {
            this.a = this.a.clone();
            this.b = true;
        }
    }

    /* access modifiers changed from: private */
    public q b() {
        this.a.c();
        this.b = false;
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void a(x xVar) {
        a();
        this.a.a(xVar.a);
    }

    /* renamed from: o */
    public w g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    public boolean s() {
        return this.a.e();
    }
}
