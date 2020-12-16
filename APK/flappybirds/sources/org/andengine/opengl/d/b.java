package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.d.i.a;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.BufferUtils;

public class b extends d {
    protected final float[] a;
    protected final FloatBuffer b;

    public b(e eVar, int i, a aVar, boolean z, c cVar) {
        super(eVar, i, aVar, z, cVar);
        this.a = new float[i];
        if (a.d) {
            this.b = this.f.asFloatBuffer();
        } else {
            this.b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (a.d) {
            this.b.position(0);
            this.b.put(this.a);
            GLES20.glBufferData(34962, this.f.capacity(), this.f, this.e);
            return;
        }
        BufferUtils.a(this.f, this.a, this.a.length, 0);
        GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
    }
}
