package org.andengine.d.b.b;

import java.util.Comparator;
import java.util.List;

public abstract class b {
    public abstract void a(List list, int i, int i2, Comparator comparator);

    public final void a(List list, Comparator comparator) {
        a(list, 0, list.size(), comparator);
    }
}
