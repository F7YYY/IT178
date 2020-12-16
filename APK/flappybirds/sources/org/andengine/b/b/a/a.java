package org.andengine.b.b.a;

import java.util.ArrayList;
import org.andengine.b.b.c;

public class a implements c {
    private final ArrayList a = new ArrayList();

    public synchronized void a_(float f) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Runnable) arrayList.remove(size)).run();
        }
    }
}
