package org.andengine.a.c;

import android.media.SoundPool;
import org.andengine.a.c.a.b;

public class a extends org.andengine.a.a {
    private int c;
    private int d;
    private boolean e;
    private int f;
    private float g = 1.0f;

    a(c cVar, int i) {
        super(cVar);
        this.c = i;
    }

    private SoundPool j() {
        return a().c();
    }

    public void a(boolean z) {
        this.e = z;
    }

    /* access modifiers changed from: protected */
    public void c() {
        throw new b();
    }

    public void d() {
        super.d();
        float b = b();
        this.d = j().play(this.c, this.a * b, this.b * b, 1, this.f, this.g);
    }

    public void e() {
        super.e();
        if (this.d != 0) {
            j().stop(this.d);
        }
    }

    public void f() {
        g();
        j().unload(this.c);
        this.c = 0;
        this.e = false;
        a().b(this);
        super.f();
    }

    public int h() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public c a() {
        return (c) super.a();
    }
}
