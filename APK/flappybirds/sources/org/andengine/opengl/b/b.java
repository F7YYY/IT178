package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.e;

public class b extends g {
    public static int a = -1;
    public static int b = -1;
    private static b c;

    private b() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_textureCoordinates;\nvarying vec4 v_color;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_color = a_color;\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nvarying lowp vec4 v_color;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = v_color * texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    public static b a() {
        if (c == null) {
            c = new b();
        }
        return c;
    }

    /* access modifiers changed from: protected */
    public void a(e eVar) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 1, "a_color");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.a(eVar);
        a = a("u_modelViewProjectionMatrix");
        b = a("u_texture_0");
    }

    public void a(e eVar, c cVar) {
        super.a(eVar, cVar);
        GLES20.glUniformMatrix4fv(a, 1, false, eVar.p(), 0);
        GLES20.glUniform1i(b, 0);
    }
}
