package com.google.tagmanager.a;

import com.google.android.gms.e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class k {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private l n;

    private k(aj ajVar) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = ajVar.c;
        this.e = ajVar.b();
        this.c = ajVar.b() + ajVar.a();
        this.i = -this.e;
        this.f = null;
        this.b = true;
    }

    private k(InputStream inputStream) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = new byte[4096];
        this.c = 0;
        this.e = 0;
        this.i = 0;
        this.f = inputStream;
        this.b = false;
    }

    public static long a(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    static k a(aj ajVar) {
        k kVar = new k(ajVar);
        try {
            kVar.c(ajVar.a());
            return kVar;
        } catch (af e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static k a(InputStream inputStream) {
        return new k(inputStream);
    }

    private boolean a(boolean z) {
        if (this.e < this.c) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        } else if (this.i + this.c != this.j) {
            if (this.n != null) {
                this.n.a();
            }
            this.i += this.c;
            this.e = 0;
            this.c = this.f == null ? -1 : this.f.read(this.a);
            if (this.c == 0 || this.c < -1) {
                throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.c + "\nThe InputStream implementation is buggy.");
            } else if (this.c == -1) {
                this.c = 0;
                if (!z) {
                    return false;
                }
                throw af.b();
            } else {
                z();
                int i2 = this.i + this.c + this.d;
                if (i2 <= this.m && i2 >= 0) {
                    return true;
                }
                throw af.i();
            }
        } else if (!z) {
            return false;
        } else {
            throw af.b();
        }
    }

    public static int b(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    private void z() {
        this.c += this.d;
        int i2 = this.i + this.c;
        if (i2 > this.j) {
            this.d = i2 - this.j;
            this.c -= this.d;
            return;
        }
        this.d = 0;
    }

    public int a() {
        if (x()) {
            this.g = 0;
            return 0;
        }
        this.g = s();
        if (bk.b(this.g) != 0) {
            return this.g;
        }
        throw af.e();
    }

    public am a(aq aqVar, o oVar) {
        int s = s();
        if (this.k >= this.l) {
            throw af.h();
        }
        int c2 = c(s);
        this.k++;
        am amVar = (am) aqVar.b(this, oVar);
        a(0);
        this.k--;
        d(c2);
        return amVar;
    }

    public void a(int i2) {
        if (this.g != i2) {
            throw af.f();
        }
    }

    public void a(int i2, an anVar, o oVar) {
        if (this.k >= this.l) {
            throw af.h();
        }
        this.k++;
        anVar.c(this, oVar);
        a(bk.a(i2, 4));
        this.k--;
    }

    public void a(an anVar, o oVar) {
        int s = s();
        if (this.k >= this.l) {
            throw af.h();
        }
        int c2 = c(s);
        this.k++;
        anVar.c(this, oVar);
        a(0);
        this.k--;
        d(c2);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void a(com.google.tagmanager.a.m r2) {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.a()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.a((int) r0, (com.google.tagmanager.a.m) r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.a.k.a(com.google.tagmanager.a.m):void");
    }

    public boolean a(int i2, m mVar) {
        switch (bk.a(i2)) {
            case e.MapAttrs_mapType:
                long e2 = e();
                mVar.d(i2);
                mVar.a(e2);
                return true;
            case e.MapAttrs_cameraBearing:
                long v = v();
                mVar.d(i2);
                mVar.b(v);
                return true;
            case e.MapAttrs_cameraTargetLat:
                h l2 = l();
                mVar.d(i2);
                mVar.a(l2);
                return true;
            case e.MapAttrs_cameraTargetLng:
                mVar.d(i2);
                a(mVar);
                int a2 = bk.a(bk.b(i2), 4);
                a(a2);
                mVar.d(a2);
                return true;
            case e.MapAttrs_cameraTilt:
                return false;
            case e.MapAttrs_cameraZoom:
                int u = u();
                mVar.d(i2);
                mVar.a(u);
                return true;
            default:
                throw af.g();
        }
    }

    public double b() {
        return Double.longBitsToDouble(v());
    }

    public float c() {
        return Float.intBitsToFloat(u());
    }

    public int c(int i2) {
        if (i2 < 0) {
            throw af.c();
        }
        int i3 = this.i + this.e + i2;
        int i4 = this.j;
        if (i3 > i4) {
            throw af.b();
        }
        this.j = i3;
        z();
        return i4;
    }

    public long d() {
        return t();
    }

    public void d(int i2) {
        this.j = i2;
        z();
    }

    public long e() {
        return t();
    }

    public byte[] e(int i2) {
        if (i2 < 0) {
            throw af.c();
        } else if (this.i + this.e + i2 > this.j) {
            f((this.j - this.i) - this.e);
            throw af.b();
        } else if (i2 <= this.c - this.e) {
            byte[] bArr = new byte[i2];
            System.arraycopy(this.a, this.e, bArr, 0, i2);
            this.e += i2;
            return bArr;
        } else if (i2 < 4096) {
            byte[] bArr2 = new byte[i2];
            int i3 = this.c - this.e;
            System.arraycopy(this.a, this.e, bArr2, 0, i3);
            this.e = this.c;
            a(true);
            while (i2 - i3 > this.c) {
                System.arraycopy(this.a, 0, bArr2, i3, this.c);
                i3 += this.c;
                this.e = this.c;
                a(true);
            }
            System.arraycopy(this.a, 0, bArr2, i3, i2 - i3);
            this.e = i2 - i3;
            return bArr2;
        } else {
            int i4 = this.e;
            int i5 = this.c;
            this.i += this.c;
            this.e = 0;
            this.c = 0;
            ArrayList arrayList = new ArrayList();
            int i6 = i2 - (i5 - i4);
            while (i6 > 0) {
                byte[] bArr3 = new byte[Math.min(i6, 4096)];
                int i7 = 0;
                while (i7 < bArr3.length) {
                    int read = this.f == null ? -1 : this.f.read(bArr3, i7, bArr3.length - i7);
                    if (read == -1) {
                        throw af.b();
                    }
                    this.i += read;
                    i7 += read;
                }
                arrayList.add(bArr3);
                i6 -= bArr3.length;
            }
            byte[] bArr4 = new byte[i2];
            int i8 = i5 - i4;
            System.arraycopy(this.a, i4, bArr4, 0, i8);
            Iterator it = arrayList.iterator();
            while (true) {
                int i9 = i8;
                if (!it.hasNext()) {
                    return bArr4;
                }
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i9, bArr5.length);
                i8 = bArr5.length + i9;
            }
        }
    }

    public int f() {
        return s();
    }

    public void f(int i2) {
        if (i2 < 0) {
            throw af.c();
        } else if (this.i + this.e + i2 > this.j) {
            f((this.j - this.i) - this.e);
            throw af.b();
        } else if (i2 <= this.c - this.e) {
            this.e += i2;
        } else {
            int i3 = this.c - this.e;
            this.e = this.c;
            a(true);
            while (i2 - i3 > this.c) {
                i3 += this.c;
                this.e = this.c;
                a(true);
            }
            this.e = i2 - i3;
        }
    }

    public long g() {
        return v();
    }

    public int h() {
        return u();
    }

    public boolean i() {
        return s() != 0;
    }

    public String j() {
        int s = s();
        if (s > this.c - this.e || s <= 0) {
            return new String(e(s), "UTF-8");
        }
        String str = new String(this.a, this.e, s, "UTF-8");
        this.e = s + this.e;
        return str;
    }

    public String k() {
        h ajVar;
        int s = s();
        if (s > this.c - this.e || s <= 0) {
            ajVar = new aj(e(s));
        } else {
            ajVar = h.a(this.a, this.e, s);
            this.e = s + this.e;
        }
        if (ajVar.g()) {
            return ajVar.f();
        }
        throw af.j();
    }

    public h l() {
        int s = s();
        if (s == 0) {
            return h.a;
        }
        if (s > this.c - this.e || s <= 0) {
            return new aj(e(s));
        }
        h a2 = (!this.b || !this.h) ? h.a(this.a, this.e, s) : new e(this.a, this.e, s);
        this.e = s + this.e;
        return a2;
    }

    public int m() {
        return s();
    }

    public int n() {
        return s();
    }

    public int o() {
        return u();
    }

    public long p() {
        return v();
    }

    public int q() {
        return b(s());
    }

    public long r() {
        return a(t());
    }

    public int s() {
        byte y = y();
        if (y >= 0) {
            return y;
        }
        byte b2 = y & Byte.MAX_VALUE;
        byte y2 = y();
        if (y2 >= 0) {
            return b2 | (y2 << 7);
        }
        byte b3 = b2 | ((y2 & Byte.MAX_VALUE) << 7);
        byte y3 = y();
        if (y3 >= 0) {
            return b3 | (y3 << 14);
        }
        byte b4 = b3 | ((y3 & Byte.MAX_VALUE) << 14);
        byte y4 = y();
        if (y4 >= 0) {
            return b4 | (y4 << 21);
        }
        byte b5 = b4 | ((y4 & Byte.MAX_VALUE) << 21);
        byte y5 = y();
        byte b6 = b5 | (y5 << 28);
        if (y5 >= 0) {
            return b6;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (y() >= 0) {
                return b6;
            }
        }
        throw af.d();
    }

    public long t() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte y = y();
            j2 |= ((long) (y & Byte.MAX_VALUE)) << i2;
            if ((y & 128) == 0) {
                return j2;
            }
        }
        throw af.d();
    }

    public int u() {
        return (y() & 255) | ((y() & 255) << 8) | ((y() & 255) << 16) | ((y() & 255) << 24);
    }

    public long v() {
        byte y = y();
        byte y2 = y();
        return ((((long) y2) & 255) << 8) | (((long) y) & 255) | ((((long) y()) & 255) << 16) | ((((long) y()) & 255) << 24) | ((((long) y()) & 255) << 32) | ((((long) y()) & 255) << 40) | ((((long) y()) & 255) << 48) | ((((long) y()) & 255) << 56);
    }

    public int w() {
        if (this.j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.j - (this.i + this.e);
    }

    public boolean x() {
        return this.e == this.c && !a(false);
    }

    public byte y() {
        if (this.e == this.c) {
            a(true);
        }
        byte[] bArr = this.a;
        int i2 = this.e;
        this.e = i2 + 1;
        return bArr[i2];
    }
}
