package org.andengine.opengl.c.a;

import java.util.ArrayList;
import org.andengine.opengl.c.a.b.b;
import org.andengine.opengl.c.d;
import org.andengine.opengl.c.e;
import org.andengine.opengl.c.f;

public abstract class c extends d implements a {
    protected final int g;
    protected final int h;
    protected final ArrayList i = new ArrayList();

    public c(e eVar, int i2, int i3, org.andengine.opengl.c.c cVar, f fVar, b bVar) {
        super(eVar, cVar, fVar, bVar);
        this.g = i2;
        this.h = i3;
    }

    private void b(b bVar, int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureX supplied: '" + i2 + "'");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureY supplied: '" + i3 + "'");
        } else if (bVar.c() + i2 > a() || bVar.d() + i3 > b()) {
            throw new IllegalArgumentException("Supplied pTextureAtlasSource must not exceed bounds of Texture.");
        }
    }

    public int a() {
        return this.g;
    }

    public void a(b bVar, int i2, int i3) {
        b(bVar, i2, i3);
        bVar.a(i2);
        bVar.b(i3);
        this.i.add(bVar);
        this.e = true;
    }

    public int b() {
        return this.h;
    }

    @Deprecated
    /* renamed from: j */
    public b h() {
        return k();
    }

    public b k() {
        return (b) super.h();
    }
}
