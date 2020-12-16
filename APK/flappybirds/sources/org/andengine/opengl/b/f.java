package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.e;

public class f extends g {
    public static int a = -1;
    public static int b = -1;
    public static int c = -1;
    private static f d;

    private f() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform vec4 u_color;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = u_color * texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    public static f a() {
        if (d == null) {
            d = new f();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    public void a(e eVar) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.a(eVar);
        a = a("u_modelViewProjectionMatrix");
        b = a("u_texture_0");
        c = a("u_color");
    }

    public void a(e eVar, c cVar) {
        GLES20.glDisableVertexAttribArray(1);
        super.a(eVar, cVar);
        GLES20.glUniformMatrix4fv(a, 1, false, eVar.p(), 0);
        GLES20.glUniform1i(b, 0);
    }

    public void b(e eVar) {
        GLES20.glEnableVertexAttribArray(1);
        super.b(eVar);
    }
}
