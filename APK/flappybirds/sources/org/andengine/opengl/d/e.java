package org.andengine.opengl.d;

import java.util.ArrayList;

public class e {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    public void a() {
    }

    public synchronized void a(c cVar) {
        this.a.add(cVar);
    }

    public synchronized void a(org.andengine.opengl.util.e eVar) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = this.b;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.remove(size);
            if (cVar.d()) {
                cVar.a(eVar);
            }
            arrayList.remove(cVar);
        }
    }

    public synchronized void b() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c) arrayList.get(size)).e();
        }
        arrayList.clear();
    }

    public synchronized void b(c cVar) {
        if (this.a.remove(cVar)) {
            this.b.add(cVar);
        }
    }

    public synchronized void c() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c) arrayList.get(size)).e();
        }
        arrayList.clear();
    }
}
