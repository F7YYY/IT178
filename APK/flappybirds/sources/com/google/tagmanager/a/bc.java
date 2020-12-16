package com.google.tagmanager.a;

import java.util.Map;

class bc implements Comparable, Map.Entry {
    final /* synthetic */ ax a;
    private final Comparable b;
    private Object c;

    bc(ax axVar, Comparable comparable, Object obj) {
        this.a = axVar;
        this.b = comparable;
        this.c = obj;
    }

    bc(ax axVar, Map.Entry entry) {
        this(axVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public int compareTo(bc bcVar) {
        return getKey().compareTo(bcVar.getKey());
    }

    /* renamed from: a */
    public Comparable getKey() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.b, entry.getKey()) && a(this.c, entry.getValue());
    }

    public Object getValue() {
        return this.c;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.b == null ? 0 : this.b.hashCode();
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return hashCode ^ i;
    }

    public Object setValue(Object obj) {
        this.a.e();
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public String toString() {
        return this.b + "=" + this.c;
    }
}
