package com.dotgears.flappy;

import com.dotgears.g;
import com.dotgears.i;
import com.dotgears.m;
import com.dotgears.r;
import com.google.android.gms.e;

public class f extends m {
    public r a = new r();
    public i b = g.D.b("text_ready");
    public i c = g.D.b("tutorial");
    int d;

    public void a() {
        this.F = true;
        this.G = true;
        this.a.a(0.0f, 1.0f, 0, 0.5f);
        this.d = 0;
    }

    public void a(float f) {
        this.a.a(f);
        switch (this.d) {
            case e.MapAttrs_mapType /*0*/:
                if (this.a.g) {
                    this.d = 1;
                    return;
                }
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                if (this.a.g) {
                    this.F = true;
                    this.G = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void a(g gVar) {
        gVar.a(this.b, (288 - this.b.b) >> 1, 146, this.a.a);
        gVar.a(this.c, (288 - this.c.b) >> 1, 220, this.a.a);
    }
}
