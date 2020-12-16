package com.google.android.gms.b;

import android.os.Bundle;
import java.util.Iterator;

class c implements i {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    public void a(a aVar) {
        a unused = this.a.a = aVar;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this.a.a);
        }
        this.a.c.clear();
        Bundle unused2 = this.a.b = null;
    }
}
