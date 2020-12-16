package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.e;

public class a extends g {
    public static int a = -1;
    private static a b;

    private a() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nvarying vec4 v_color;\nvoid main() {\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n\tv_color = a_color;\n}", "precision lowp float;\nvarying vec4 v_color;\nvoid main() {\n\tgl_FragColor = v_color;\n}");
    }

    public static a a() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public void a(e eVar) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 1, "a_color");
        super.a(eVar);
        a = a("u_modelViewProjectionMatrix");
    }

    public void a(e eVar, c cVar) {
        GLES20.glDisableVertexAttribArray(3);
        super.a(eVar, cVar);
        GLES20.glUniformMatrix4fv(a, 1, false, eVar.p(), 0);
    }

    public void b(e eVar) {
        GLES20.glEnableVertexAttribArray(3);
        super.b(eVar);
    }
}
