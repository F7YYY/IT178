package com.google.tagmanager.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

class ar extends h {
    /* access modifiers changed from: private */
    public static final int[] c;
    private final int d;
    /* access modifiers changed from: private */
    public final h e;
    /* access modifiers changed from: private */
    public final h f;
    private final int g;
    private final int h;
    private int i;

    static {
        int i2 = 1;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        c = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 < c.length) {
                c[i6] = ((Integer) arrayList.get(i6)).intValue();
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }

    private ar(h hVar, h hVar2) {
        this.i = 0;
        this.e = hVar;
        this.f = hVar2;
        this.g = hVar.a();
        this.d = this.g + hVar2.a();
        this.h = Math.max(hVar.j(), hVar2.j()) + 1;
    }

    static h a(h hVar, h hVar2) {
        ar arVar = hVar instanceof ar ? (ar) hVar : null;
        if (hVar2.a() == 0) {
            return hVar;
        }
        if (hVar.a() == 0) {
            return hVar2;
        }
        int a = hVar.a() + hVar2.a();
        if (a < 128) {
            return b(hVar, hVar2);
        }
        if (arVar != null && arVar.f.a() + hVar2.a() < 128) {
            return new ar(arVar.e, b(arVar.f, hVar2));
        } else if (arVar == null || arVar.e.j() <= arVar.f.j() || arVar.j() <= hVar2.j()) {
            return a >= c[Math.max(hVar.j(), hVar2.j()) + 1] ? new ar(hVar, hVar2) : new at().a(hVar, hVar2);
        } else {
            return new ar(arVar.e, new ar(arVar.f, hVar2));
        }
    }

    private static aj b(h hVar, h hVar2) {
        int a = hVar.a();
        int a2 = hVar2.a();
        byte[] bArr = new byte[(a + a2)];
        hVar.b(bArr, 0, 0, a);
        hVar2.b(bArr, 0, a, a2);
        return new aj(bArr);
    }

    private boolean b(h hVar) {
        int i2;
        aj ajVar;
        au auVar = new au(this);
        au auVar2 = new au(hVar);
        aj ajVar2 = (aj) auVar2.next();
        int i3 = 0;
        aj ajVar3 = (aj) auVar.next();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int a = ajVar3.a() - i4;
            int a2 = ajVar2.a() - i3;
            int min = Math.min(a, a2);
            if (!(i4 == 0 ? ajVar3.a(ajVar2, i3, min) : ajVar2.a(ajVar3, i4, min))) {
                return false;
            }
            int i6 = i5 + min;
            if (i6 < this.d) {
                if (min == a) {
                    ajVar3 = (aj) auVar.next();
                    i4 = 0;
                } else {
                    i4 += min;
                }
                if (min == a2) {
                    ajVar = (aj) auVar2.next();
                    i2 = 0;
                } else {
                    aj ajVar4 = ajVar2;
                    i2 = i3 + min;
                    ajVar = ajVar4;
                }
                i3 = i2;
                ajVar2 = ajVar;
                i5 = i6;
            } else if (i6 == this.d) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public int a(int i2, int i3, int i4) {
        if (i3 + i4 <= this.g) {
            return this.e.a(i2, i3, i4);
        }
        if (i3 >= this.g) {
            return this.f.a(i2, i3 - this.g, i4);
        }
        int i5 = this.g - i3;
        return this.f.a(this.e.a(i2, i3, i5), 0, i4 - i5);
    }

    public String a(String str) {
        return new String(e(), str);
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i2, int i3, int i4) {
        if (i2 + i4 <= this.g) {
            this.e.a(bArr, i2, i3, i4);
        } else if (i2 >= this.g) {
            this.f.a(bArr, i2 - this.g, i3, i4);
        } else {
            int i5 = this.g - i2;
            this.e.a(bArr, i2, i3, i5);
            this.f.a(bArr, 0, i3 + i5, i4 - i5);
        }
    }

    /* access modifiers changed from: protected */
    public int b(int i2, int i3, int i4) {
        if (i3 + i4 <= this.g) {
            return this.e.b(i2, i3, i4);
        }
        if (i3 >= this.g) {
            return this.f.b(i2, i3 - this.g, i4);
        }
        int i5 = this.g - i3;
        return this.f.b(this.e.b(i2, i3, i5), 0, i4 - i5);
    }

    /* access modifiers changed from: package-private */
    public void b(OutputStream outputStream, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            this.e.b(outputStream, i2, i3);
        } else if (i2 >= this.g) {
            this.f.b(outputStream, i2 - this.g, i3);
        } else {
            int i4 = this.g - i2;
            this.e.b(outputStream, i2, i4);
            this.f.b(outputStream, 0, i3 - i4);
        }
    }

    /* renamed from: c */
    public i iterator() {
        return new av(this);
    }

    public boolean equals(Object obj) {
        int l;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.d != hVar.a()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        if (this.i == 0 || (l = hVar.l()) == 0 || this.i == l) {
            return b(hVar);
        }
        return false;
    }

    public boolean g() {
        return this.f.a(this.e.a(0, 0, this.g), 0, this.f.a()) == 0;
    }

    public k h() {
        return k.a((InputStream) new aw(this));
    }

    public int hashCode() {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = b(this.d, 0, this.d);
            if (i2 == 0) {
                i2 = 1;
            }
            this.i = i2;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public int j() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return this.d >= c[this.h];
    }

    /* access modifiers changed from: protected */
    public int l() {
        return this.i;
    }
}
