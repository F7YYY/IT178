package org.andengine.c;

import java.util.Comparator;
import java.util.List;
import org.andengine.d.b.b.a;

public class d extends a {
    private static d a;
    private final Comparator b = new e(this);

    private d() {
    }

    public static d a() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    public void a(List list) {
        a(list, this.b);
    }
}
