package org.andengine.opengl.d.a;

import org.andengine.d.i.a;

public class d {
    private static final boolean a = a.a(8);
    private int b;
    private final a[] c;
    private int d;

    public d(int i) {
        this.c = new a[i];
    }

    public c a() {
        if (this.b == this.c.length) {
            return new c(this.d, this.c);
        }
        throw new org.andengine.d.f.a("Not enough " + a.class.getSimpleName() + "s added to this " + getClass().getSimpleName() + ".");
    }

    public d a(int i, String str, int i2, int i3, boolean z) {
        if (a) {
            this.c[this.b] = new b(i, str, i2, i3, z, this.d);
        } else {
            this.c[this.b] = new a(i, str, i2, i3, z, this.d);
        }
        switch (i3) {
            case 5121:
                this.d += i2 * 1;
                break;
            case 5126:
                this.d += i2 * 4;
                break;
            default:
                throw new IllegalArgumentException("Unexpected pType: '" + i3 + "'.");
        }
        this.b++;
        return this;
    }
}
