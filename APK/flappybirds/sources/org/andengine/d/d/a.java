package org.andengine.d.d;

public class a {
    public static final float A = i.f();
    public static final int B = a.g();
    public static final int C = b.g();
    public static final int D = c.g();
    public static final int E = d.g();
    public static final int F = e.g();
    public static final int G = f.g();
    public static final int H = g.g();
    public static final int I = h.g();
    public static final int J = i.g();
    public static final a a = new a(1.0f, 1.0f, 1.0f, 1.0f);
    public static final a b = new a(0.0f, 0.0f, 0.0f, 1.0f);
    public static final a c = new a(1.0f, 0.0f, 0.0f, 1.0f);
    public static final a d = new a(1.0f, 1.0f, 0.0f, 1.0f);
    public static final a e = new a(0.0f, 1.0f, 0.0f, 1.0f);
    public static final a f = new a(0.0f, 1.0f, 1.0f, 1.0f);
    public static final a g = new a(0.0f, 0.0f, 1.0f, 1.0f);
    public static final a h = new a(1.0f, 0.0f, 1.0f, 1.0f);
    public static final a i = new a(0.0f, 0.0f, 0.0f, 0.0f);
    public static final int j = a.e();
    public static final int k = b.e();
    public static final int l = c.e();
    public static final int m = d.e();
    public static final int n = e.e();
    public static final int o = f.e();
    public static final int p = g.e();
    public static final int q = h.e();
    public static final int r = i.e();
    public static final float s = a.f();
    public static final float t = b.f();
    public static final float u = c.f();
    public static final float v = d.f();
    public static final float w = e.f();
    public static final float x = f.f();
    public static final float y = g.f();
    public static final float z = h.f();
    private float K;
    private float L;
    private float M;
    private float N;
    private int O;
    private float P;

    public a(float f2, float f3, float f4, float f5) {
        a(f2, f3, f4, f5);
    }

    private final void h() {
        this.O = (this.O & 16777215) | (((int) (255.0f * this.N)) << 24);
        this.P = b.a(this.O);
    }

    private final void i() {
        this.O = b.b(this.K, this.L, this.M, this.N);
        this.P = b.a(this.O);
    }

    public final float a() {
        return this.K;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.K = f2;
        this.L = f3;
        this.M = f4;
        this.N = f5;
        i();
    }

    public final void a(a aVar) {
        this.K = aVar.K;
        this.L = aVar.L;
        this.M = aVar.M;
        this.N = aVar.N;
        this.O = aVar.O;
        this.P = aVar.P;
    }

    public final boolean a(float f2) {
        if (this.N == f2) {
            return false;
        }
        this.N = f2;
        h();
        return true;
    }

    public final float b() {
        return this.L;
    }

    public boolean b(a aVar) {
        return this.O == aVar.O;
    }

    public final float c() {
        return this.M;
    }

    public final float d() {
        return this.N;
    }

    public final int e() {
        return this.O;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return b((a) obj);
    }

    public final float f() {
        return this.P;
    }

    public final int g() {
        return b.a(this.K, this.L, this.M, this.N);
    }

    public int hashCode() {
        return this.O;
    }

    public String toString() {
        return "[Red: " + this.K + ", Green: " + this.L + ", Blue: " + this.M + ", Alpha: " + this.N + "]";
    }
}
