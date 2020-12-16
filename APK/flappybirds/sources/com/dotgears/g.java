package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class g extends m {
    public static g D;
    public int A;
    public l B;
    public p C;
    public final float E = 0.015f;
    public i[] a;
    public int[] b = new int[50];
    public int[] c = new int[50];
    public m[] d = new m[50];
    public int e;
    public r f;
    public int g;
    public r h;
    public int i;
    public int j;
    public int k;
    public int l;
    public n m;
    public n n;
    protected i o;
    protected i p;
    public int q = 1;
    public boolean r;
    protected int[] s = new int[10];
    protected int[] t = new int[10];
    protected int u;
    int v;
    int[] w = new int[50];
    double[] x = new double[50];
    public int y;
    public int z;

    public g(int i2, int i3, InputStream inputStream) {
        this.z = i2;
        this.A = i3;
        this.a = new i[512];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() > 1) {
                        String[] split = readLine.split("\\s+");
                        i iVar = new i(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]));
                        iVar.f = iVar.d + iVar.f;
                        iVar.g = iVar.e + iVar.g;
                        this.a[iVar.i] = iVar;
                        Log.i("FlappyBird", iVar.a + " " + iVar.b + " " + iVar.c + " " + iVar.d + " " + iVar.e + " " + iVar.f + " " + iVar.g);
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a() {
        j.x = new j();
        this.f = new r();
        this.h = new r();
        this.o = b("black");
        this.p = b("white");
        this.u = 0;
        this.m = new n();
        for (int i2 = 0; i2 < 20; i2++) {
            this.m.a((m) new o());
        }
        this.n = new n();
        for (int i3 = 0; i3 < 10; i3++) {
            this.n.a((m) new e());
        }
        this.B = new l("number_score");
        this.C = new p();
        this.l = 0;
        this.r = false;
        this.v = 0;
        d();
        c();
        a(false, 0, 0.5f);
    }

    public void a(int i2) {
        c(0, i2);
        if (i2 > this.z) {
            this.z = i2;
        }
    }

    public void a(int i2, float f2) {
    }

    public void a(int i2, int i3) {
    }

    public void a(int i2, int i3, int i4, float f2, float f3, float f4) {
        i iVar = this.a[i2];
        a(i3, i4, (int) (((float) i3) + (((float) iVar.b) * f2)), (int) (((float) i4) + (((float) iVar.c) * f3)), iVar.d, iVar.e, iVar.f, iVar.g, f4);
    }

    public void a(int i2, int i3, int i4, int i5) {
    }

    public void a(int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5, float f6) {
        c.a(i2, i3, i4, i5, f2, f3, f4, f5, f6);
    }

    public void a(int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5, float f6, int i6) {
        c.a(i2, i3, i4, i5, f2, f3, f4, f5, f6, (float) i6);
    }

    public void a(int i2, int i3, int i4, int i5, int i6, float f2) {
        i iVar = this.a[i2];
        float f3 = iVar.d;
        float f4 = iVar.e;
        float f5 = iVar.f;
        float f6 = iVar.g;
        a(i3, i4, i3 + i5, i4 + i6, f3, f4, f5, f6, f2);
    }

    public void a(int i2, m mVar) {
    }

    public void a(int i2, m mVar, int i3) {
        this.c[this.e] = i2;
        this.d[this.e] = mVar;
        this.b[this.e] = i3;
        this.e++;
        if (this.e >= 50) {
            this.e = 0;
        }
    }

    public void a(i iVar, int i2, int i3, float f2) {
        a(i2, i3, i2 + iVar.b, i3 + iVar.c, iVar.d, iVar.e, iVar.f, iVar.g, f2);
    }

    public void a(i iVar, int i2, int i3, float f2, int i4) {
        a(i2, i3, i2 + iVar.b, i3 + iVar.c, iVar.d, iVar.e, iVar.f, iVar.g, f2, i4);
    }

    public void a(boolean z2, int i2, float f2) {
        if (this.f.g) {
            if (z2) {
                this.f.a(0.0f, 1.0f, 5, f2);
            } else {
                this.f.a(1.0f, 0.0f, 5, f2);
            }
            this.f.a(0.0f);
            this.g = i2;
        }
    }

    public void a(float[] fArr, float[] fArr2) {
        for (int i2 = 0; i2 < 10; i2++) {
            this.s[i2] = (int) fArr[i2];
            this.t[i2] = (int) fArr2[i2];
        }
        this.u = 10;
    }

    public i[] a(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < 512; i3++) {
            if (this.a[i3] != null && this.a[i3].a.startsWith(str)) {
                i2++;
            }
        }
        if (i2 <= 0) {
            return null;
        }
        i[] iVarArr = new i[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < 512; i5++) {
            if (this.a[i5] != null && this.a[i5].a.startsWith(str)) {
                iVarArr[i4] = this.a[i5];
                i4++;
            }
        }
        return iVarArr;
    }

    public i b(String str) {
        for (int i2 = 0; i2 < 512; i2++) {
            if (this.a[i2] != null && this.a[i2].a.startsWith(str)) {
                return this.a[i2];
            }
        }
        return null;
    }

    public void b() {
        this.v = 0;
        if (!this.r) {
            for (int i2 = 0; i2 < 50; i2++) {
                if (this.b[i2] > 0) {
                    int[] iArr = this.b;
                    iArr[i2] = iArr[i2] - 30;
                    if (this.b[i2] <= 0) {
                        a(this.c[i2], this.d[i2]);
                    }
                }
            }
        }
        b(0.015f);
        if (!this.r) {
            this.C.a(0.015f);
            this.n.a(0.015f);
            if (!this.f.g || this.f.a != 0.0f) {
                this.f.a(0.015f);
                if (this.f.g) {
                    a(this.g, (m) this);
                }
            }
            if (!this.h.g || this.h.a != 0.0f) {
                this.h.a(0.015f);
            }
            if (this.l > 0) {
                this.l--;
                this.i = j.a(-this.k, this.k);
                this.j = j.a(-this.k, this.k);
            } else {
                this.i = 0;
                this.j = 0;
            }
        }
        this.C.a(this);
        this.n.a(this);
        if (!this.f.g || this.f.a != 0.0f) {
            a(this.o.i, -144, -256, 864, 1536, this.f.a);
        }
        if (!this.h.g || this.h.a != 0.0f) {
            a(this.p.i, -144, -256, 864, 1536, this.h.a);
        }
    }

    public void b(float f2) {
    }

    public void b(int i2, int i3) {
        ((e) this.n.c()).a(i2, i3);
    }

    public void c() {
    }

    public void c(float f2) {
        if (this.h.g) {
            this.h.a(1.0f, 0.0f, 11, f2);
            this.h.a(0.0f);
        }
    }

    public void c(int i2, int i3) {
        this.w[this.v] = i2;
        this.x[this.v] = (double) i3;
        this.v++;
    }

    public void d() {
        this.e = 0;
        for (int i2 = 0; i2 < 50; i2++) {
            this.b[i2] = 0;
        }
    }
}
