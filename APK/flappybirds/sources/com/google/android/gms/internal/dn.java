package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class dn {
    private final List a;
    private final Object b;

    private dn(Object obj) {
        this.b = Cdo.a(obj);
        this.a = new ArrayList();
    }

    public dn a(String str, Object obj) {
        this.a.add(((String) Cdo.a((Object) str)) + "=" + String.valueOf(obj));
        return this;
    }

    public String toString() {
        StringBuilder append = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            append.append((String) this.a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
