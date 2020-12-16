package org.andengine.d.a.b;

import java.util.ArrayList;

public abstract class a {
    private final ArrayList a;
    private final int b;
    private final int c;
    private int d;

    public a() {
        this(0);
    }

    public a(int i) {
        this(i, 1);
    }

    public a(int i, int i2) {
        this(i, i2, Integer.MAX_VALUE);
    }

    public a(int i, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("pGrowth must be greater than 0!");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("pAvailableItemsMaximum must be at least 0!");
        } else {
            this.b = i2;
            this.c = i3;
            this.a = new ArrayList(i);
            if (i > 0) {
                a(i);
            }
        }
    }

    public synchronized void a(int i) {
        ArrayList arrayList = this.a;
        int size = this.c - arrayList.size();
        if (i >= size) {
            i = size;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            arrayList.add(c());
        }
    }

    /* access modifiers changed from: protected */
    public void a(Object obj) {
    }

    /* access modifiers changed from: protected */
    public abstract Object b();

    /* access modifiers changed from: protected */
    public void b(Object obj) {
    }

    /* access modifiers changed from: protected */
    public Object c() {
        return b();
    }

    public synchronized void c(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot recycle null item!");
        }
        a(obj);
        if (this.a.size() < this.c) {
            this.a.add(obj);
        }
        this.d--;
        if (this.d < 0) {
            org.andengine.d.e.a.d("More items recycled than obtained!");
        }
    }

    public synchronized Object d() {
        Object obj;
        if (this.a.size() > 0) {
            obj = this.a.remove(this.a.size() - 1);
        } else {
            if (this.b == 1 || this.c == 0) {
                obj = c();
            } else {
                a(this.b);
                obj = this.a.remove(this.a.size() - 1);
            }
            org.andengine.d.e.a.a(String.valueOf(getClass().getName()) + "<" + obj.getClass().getSimpleName() + "> was exhausted, with " + this.d + " item not yet recycled. Allocated " + this.b + " more.");
        }
        b(obj);
        this.d++;
        return obj;
    }
}
