package org.andengine.opengl.c;

import android.opengl.GLES20;

public class f {
    public static final f a = new f(9728, 9728, 33071, 33071, false);
    public static final f b = new f(9729, 9729, 33071, 33071, false);
    public static final f c = new f(9728, 9728, 10497, 10497, false);
    public static final f d = new f(9729, 9729, 10497, 10497, false);
    public static final f e = new f(9728, 9728, 33071, 33071, true);
    public static final f f = new f(9729, 9729, 33071, 33071, true);
    public static final f g = new f(9728, 9728, 10497, 10497, true);
    public static final f h = new f(9729, 9729, 10497, 10497, true);
    public static final f i = a;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final boolean n;

    public f(int i2, int i3, int i4, int i5, boolean z) {
        this.k = i2;
        this.j = i3;
        this.l = (float) i4;
        this.m = (float) i5;
        this.n = z;
    }

    public void a() {
        GLES20.glTexParameterf(3553, 10241, (float) this.k);
        GLES20.glTexParameterf(3553, 10240, (float) this.j);
        GLES20.glTexParameterf(3553, 10242, this.m);
        GLES20.glTexParameterf(3553, 10243, this.l);
    }
}
