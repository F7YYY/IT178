package org.andengine.opengl.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.andengine.b.a;
import org.andengine.b.c.d;
import org.andengine.opengl.util.e;

public class g implements GLSurfaceView.Renderer {
    final a a;
    final a b;
    final boolean c = this.a.d().e().a();
    final h d;
    final e e = new e();

    public g(a aVar, a aVar2, h hVar) {
        this.a = aVar;
        this.b = aVar2;
        this.d = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        org.andengine.d.e.a.b("GLThread interrupted!", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r4) {
        /*
            r3 = this;
            java.lang.Class<org.andengine.opengl.util.e> r1 = org.andengine.opengl.util.e.class
            monitor-enter(r1)
            boolean r0 = r3.c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            org.andengine.opengl.view.a r0 = r3.b     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            r0 = 32768(0x8000, float:4.5918E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ all -> 0x0025 }
        L_0x0015:
            org.andengine.b.a r0 = r3.a     // Catch:{ InterruptedException -> 0x001e }
            org.andengine.opengl.util.e r2 = r3.e     // Catch:{ InterruptedException -> 0x001e }
            r0.a((org.andengine.opengl.util.e) r2)     // Catch:{ InterruptedException -> 0x001e }
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            return
        L_0x001e:
            r0 = move-exception
            java.lang.String r2 = "GLThread interrupted!"
            org.andengine.d.e.a.b(r2, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x001c
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.andengine.opengl.view.g.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.a.a(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        this.e.o();
        if (this.d != null) {
            this.d.a(this.e, i, i2);
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (e.class) {
            d e2 = this.a.d().e();
            this.e.a(e2, this.b, eGLConfig);
            this.e.g();
            this.e.a();
            this.e.a(e2.b());
            if (this.d != null) {
                this.d.a(this.e);
            }
        }
    }
}
