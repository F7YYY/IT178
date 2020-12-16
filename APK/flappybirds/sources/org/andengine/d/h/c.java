package org.andengine.d.h;

import org.andengine.d.a.a.b;

public class c extends b implements org.andengine.b.b.c {
    private final Object a;

    /* renamed from: a */
    public boolean add(a aVar) {
        if (aVar != null) {
            return super.add(aVar);
        }
        throw new IllegalArgumentException("Supplied " + a.class.getSimpleName() + " must not be null.");
    }

    public void a_(float f) {
        int size = size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                a aVar = (a) get(i);
                aVar.a(f, this.a);
                if (aVar.a() && aVar.b()) {
                    remove(i);
                }
            }
        }
    }
}
