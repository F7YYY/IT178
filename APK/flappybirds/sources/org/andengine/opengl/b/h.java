package org.andengine.opengl.b;

import java.util.ArrayList;
import org.andengine.d.e.a;

public class h {
    private final ArrayList a = new ArrayList();

    public synchronized void a() {
        a(b.a());
        a(d.a());
        a(f.a());
        a(a.a());
        a(e.a());
        a(c.a());
    }

    public synchronized void a(g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("pShaderProgram must not be null!");
        }
        if (gVar.b()) {
            a.c("Loading an already compiled " + g.class.getSimpleName() + ": '" + gVar.getClass().getSimpleName() + "'. '" + gVar.getClass().getSimpleName() + "' will be recompiled.");
            gVar.a(false);
        }
        if (this.a.contains(gVar)) {
            a.c("Loading an already loaded " + g.class.getSimpleName() + ": '" + gVar.getClass().getSimpleName() + "'.");
        } else {
            this.a.add(gVar);
        }
    }

    public synchronized void b() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g) arrayList.get(size)).a(false);
        }
        this.a.clear();
    }

    public synchronized void c() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g) arrayList.get(size)).a(false);
        }
    }
}
