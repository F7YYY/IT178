package org.andengine.opengl.d.a;

import android.opengl.GLES20;

public class a {
    final int a;
    final String b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public a(int i, String str, int i2, int i3, boolean z, int i4) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public void a(int i) {
        GLES20.glVertexAttribPointer(this.a, this.c, this.d, this.e, i, this.f);
    }
}
