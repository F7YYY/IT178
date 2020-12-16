package org.andengine.a;

import java.util.ArrayList;

public abstract class b implements d {
    protected final ArrayList a = new ArrayList();
    protected float b = 1.0f;

    public float a() {
        return this.b;
    }

    public void a(c cVar) {
        this.a.add(cVar);
    }

    public void b() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            cVar.e();
            cVar.f();
        }
    }

    public boolean b(c cVar) {
        return this.a.remove(cVar);
    }
}
