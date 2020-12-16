package org.andengine.opengl.d.a;

import org.andengine.opengl.GLES20Fix;

public class b extends a {
    public b(int i, String str, int i2, int i3, boolean z, int i4) {
        super(i, str, i2, i3, z, i4);
    }

    public void a(int i) {
        GLES20Fix.glVertexAttribPointer(this.a, this.c, this.d, this.e, i, this.f);
    }
}
