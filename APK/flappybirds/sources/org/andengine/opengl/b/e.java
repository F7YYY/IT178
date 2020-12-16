package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;

public class e extends g {
    public static int a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;
    private static e e;

    private e() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform sampler2D u_texture_1;\nuniform bool u_textureselect_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tif(u_textureselect_texture_0) {\n\t\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n\t} else {\n\t\tgl_FragColor = texture2D(u_texture_1, v_textureCoordinates);\n\t}\n}");
    }

    public static e a() {
        if (e == null) {
            e = new e();
        }
        return e;
    }

    /* access modifiers changed from: protected */
    public void a(org.andengine.opengl.util.e eVar) {
        GLES20.glBindAttribLocation(this.h, 0, "a_position");
        GLES20.glBindAttribLocation(this.h, 3, "a_textureCoordinates");
        super.a(eVar);
        a = a("u_modelViewProjectionMatrix");
        b = a("u_texture_0");
        c = a("u_texture_1");
        d = a("u_textureselect_texture_0");
    }

    public void a(org.andengine.opengl.util.e eVar, c cVar) {
        GLES20.glDisableVertexAttribArray(1);
        super.a(eVar, cVar);
        GLES20.glUniformMatrix4fv(a, 1, false, eVar.p(), 0);
        GLES20.glUniform1i(b, 0);
        GLES20.glUniform1i(c, 1);
    }

    public void b(org.andengine.opengl.util.e eVar) {
        GLES20.glEnableVertexAttribArray(1);
        super.b(eVar);
    }
}
