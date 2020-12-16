package org.andengine.opengl.a;

import java.util.ArrayList;
import org.andengine.opengl.util.e;

public class c {
    private final ArrayList a = new ArrayList();

    public void a() {
    }

    public synchronized void a(e eVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size > 0) {
            for (int i = size - 1; i >= 0; i--) {
                ((a) arrayList.get(i)).a(eVar);
            }
        }
    }

    public synchronized void b() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).b();
        }
        this.a.clear();
    }

    public synchronized void c() {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).b();
        }
    }
}
