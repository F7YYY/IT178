package org.andengine.opengl.c.c;

import org.andengine.opengl.c.a.a;
import org.andengine.opengl.c.a.b.b;

public class d {
    public static c a(a aVar, b bVar, int i, int i2) {
        return a(aVar, bVar, i, i2, false);
    }

    public static c a(a aVar, b bVar, int i, int i2, boolean z) {
        a aVar2 = aVar;
        c cVar = new c(aVar2, (float) i, (float) i2, (float) bVar.c(), (float) bVar.d(), z);
        aVar.a(bVar, i, i2);
        return cVar;
    }
}
