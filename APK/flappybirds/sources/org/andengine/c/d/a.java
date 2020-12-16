package org.andengine.c.d;

import org.andengine.c.c.c;
import org.andengine.opengl.b.g;
import org.andengine.opengl.c.c.b;
import org.andengine.opengl.d.a.d;
import org.andengine.opengl.d.e;

public class a extends c {
    public static final org.andengine.opengl.d.a.c g = new d(3).a(0, "a_position", 2, 5126, false).a(1, "a_color", 4, 5121, true).a(3, "a_textureCoordinates", 2, 5126, false).a();
    protected boolean I;
    public b h;
    protected final org.andengine.c.d.a.b i;
    protected boolean j;

    public a(float f, float f2, float f3, float f4, b bVar, org.andengine.c.d.a.b bVar2, g gVar) {
        super(f, f2, f3, f4, gVar);
        this.h = bVar;
        this.i = bVar2;
        b(true);
        a(bVar);
        x();
        b();
        y();
    }

    public a(float f, float f2, float f3, float f4, b bVar, e eVar, org.andengine.opengl.d.a aVar) {
        this(f, f2, f3, f4, bVar, eVar, aVar, org.andengine.opengl.b.b.a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(float r10, float r11, float r12, float r13, org.andengine.opengl.c.c.b r14, org.andengine.opengl.d.e r15, org.andengine.opengl.d.a r16, org.andengine.opengl.b.g r17) {
        /*
            r9 = this;
            org.andengine.c.d.a.a r0 = new org.andengine.c.d.a.a
            r2 = 20
            r4 = 1
            org.andengine.opengl.d.a.c r5 = g
            r1 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            r8 = r17
            r1.<init>((float) r2, (float) r3, (float) r4, (float) r5, (org.andengine.opengl.c.c.b) r6, (org.andengine.c.d.a.b) r7, (org.andengine.opengl.b.g) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.andengine.c.d.a.<init>(float, float, float, float, org.andengine.opengl.c.c.b, org.andengine.opengl.d.e, org.andengine.opengl.d.a, org.andengine.opengl.b.g):void");
    }

    public a(float f, float f2, b bVar, e eVar) {
        this(f, f2, bVar.b(), bVar.c(), bVar, eVar, org.andengine.opengl.d.a.STATIC);
    }

    /* access modifiers changed from: protected */
    public void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.i.a(this, f, f2, f3, f4, f5, f6, f7, f8);
    }

    public void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.v = f;
        this.w = f2;
        this.a = f3 - f;
        this.b = f4 - f2;
        a(f9, f10, f11, f12, f13, f14, f15, f16);
        this.h.a(f5, f6, f7, f8);
        y();
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.i.a(this);
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.v = f;
        this.w = f2;
        this.a = f3 - f;
        this.b = f4 - f2;
        x();
        this.h.a(f5, f6, f7, f8);
        y();
    }

    /* access modifiers changed from: protected */
    public void b(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        super.b(eVar, aVar);
        t().a().d(eVar);
        this.i.a(eVar, this.f);
    }

    /* access modifiers changed from: protected */
    public void c(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.i.a(5, 4);
    }

    /* access modifiers changed from: protected */
    public void d(org.andengine.opengl.util.e eVar, org.andengine.b.a.a aVar) {
        this.i.b(eVar, this.f);
        super.d(eVar, aVar);
    }

    public b t() {
        return this.h;
    }

    public boolean u() {
        return this.I;
    }

    public boolean v() {
        return this.j;
    }

    /* renamed from: w */
    public org.andengine.c.d.a.b a() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void x() {
        this.i.b(this);
    }

    /* access modifiers changed from: protected */
    public void y() {
        this.i.c(this);
    }
}
