package org.andengine.opengl.a;

import android.util.SparseIntArray;

public class d {
    public final char a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    private final boolean m;
    private SparseIntArray n;

    public boolean a() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.a == ((d) obj).a;
    }

    public int hashCode() {
        return this.a + 31;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "[Character=" + this.a + ", Whitespace=" + this.m + ", TextureX=" + this.b + ", TextureY=" + this.c + ", Width=" + this.d + ", Height=" + this.e + ", OffsetX=" + this.f + ", OffsetY=" + this.g + ", Advance=" + this.h + ", U=" + this.i + ", V=" + this.j + ", U2=" + this.k + ", V2=" + this.l + ", Kernings=" + this.n + "]";
    }
}
