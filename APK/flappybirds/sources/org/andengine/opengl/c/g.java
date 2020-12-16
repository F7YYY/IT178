package org.andengine.opengl.c;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.opengl.d.a;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.d.d;
import org.andengine.opengl.d.e;

public class g extends d {
    public static final c a = new org.andengine.opengl.d.a.d(2).a(0, "a_position", 2, 5126, false).a(3, "a_textureCoordinates", 2, 5126, false).a();
    protected final FloatBuffer b = this.f.asFloatBuffer();

    public g() {
        super((e) null, 12, a.STATIC, true, a);
        this.b.put(0, 0.0f);
        this.b.put(1, 0.0f);
        this.b.put(2, 0.0f);
        this.b.put(3, 0.0f);
        this.b.put(4, 1.0f);
        this.b.put(5, 0.0f);
        this.b.put(6, 1.0f);
        this.b.put(7, 0.0f);
        this.b.put(8, 0.0f);
        this.b.put(9, 1.0f);
        this.b.put(10, 0.0f);
        this.b.put(11, 1.0f);
    }

    /* access modifiers changed from: protected */
    public void a() {
        GLES20.glBufferData(34962, this.f.limit(), this.f, this.e);
    }

    public void a(org.andengine.opengl.util.e eVar, a aVar) {
        aVar.d(eVar);
        a(eVar, (org.andengine.opengl.b.g) org.andengine.opengl.b.d.a());
        eVar.j();
        eVar.l();
        eVar.a(1000000.0f, 1000000.0f, 0.0f);
        eVar.a(1.0E-4f, 1.0E-4f, 0);
        a(4, 3);
        eVar.k();
        b(eVar, org.andengine.opengl.b.d.a());
    }
}
