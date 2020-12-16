package org.andengine.d.b.b;

import java.util.Comparator;
import java.util.List;

public class a extends b {
    public void a(List list, int i, int i2, Comparator comparator) {
        int i3;
        for (int i4 = i + 1; i4 < i2; i4++) {
            Object obj = list.get(i4);
            Object obj2 = list.get(i4 - 1);
            if (comparator.compare(obj, obj2) < 0) {
                Object obj3 = obj2;
                int i5 = i4;
                while (true) {
                    i3 = i5 - 1;
                    list.set(i5, obj3);
                    if (i3 <= i) {
                        break;
                    }
                    Object obj4 = list.get(i3 - 1);
                    if (comparator.compare(obj, obj4) >= 0) {
                        break;
                    }
                    obj3 = obj4;
                    i5 = i3;
                }
                list.set(i3, obj);
            }
        }
    }
}
