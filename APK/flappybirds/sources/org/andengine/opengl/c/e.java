package org.andengine.opengl.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.andengine.d.e.a;

public class e {
    private final HashSet a = new HashSet();
    private final HashMap b = new HashMap();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private g f;

    public synchronized void a() {
        this.f = new g();
    }

    public synchronized void a(org.andengine.opengl.util.e eVar) {
        HashSet hashSet = this.a;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar.e()) {
                try {
                    aVar.c(eVar);
                } catch (IOException e2) {
                    a.a((Throwable) e2);
                }
            }
        }
        int size2 = arrayList2.size();
        if (size2 > 0) {
            for (int i = size2 - 1; i >= 0; i--) {
                a aVar2 = (a) arrayList2.remove(i);
                if (!aVar2.c()) {
                    try {
                        aVar2.a(eVar);
                        this.f.a(eVar, aVar2);
                    } catch (IOException e3) {
                        a.a((Throwable) e3);
                    }
                }
                arrayList.add(aVar2);
            }
        }
        int size3 = arrayList3.size();
        if (size3 > 0) {
            for (int i2 = size3 - 1; i2 >= 0; i2--) {
                a aVar3 = (a) arrayList3.remove(i2);
                if (aVar3.c()) {
                    aVar3.b(eVar);
                }
                arrayList.remove(aVar3);
                hashSet.remove(aVar3);
            }
        }
        if (size2 > 0 || size3 > 0) {
            System.gc();
        }
    }

    public synchronized boolean a(a aVar) {
        boolean z;
        if (aVar == null) {
            throw new IllegalArgumentException("pTexture must not be null!");
        } else if (this.a.contains(aVar)) {
            this.e.remove(aVar);
            z = false;
        } else {
            this.a.add(aVar);
            this.d.add(aVar);
            z = true;
        }
        return z;
    }

    public synchronized void b() {
        HashSet hashSet = this.a;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d();
            }
        }
        if (!this.c.isEmpty()) {
            this.d.addAll(this.c);
            this.c.clear();
        }
        if (!this.e.isEmpty()) {
            this.a.removeAll(this.e);
            this.e.clear();
        }
        this.f.e();
    }

    public synchronized void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).d();
        }
        this.d.clear();
        this.c.clear();
        this.a.clear();
        this.b.clear();
        this.f.n();
        this.f = null;
    }
}
