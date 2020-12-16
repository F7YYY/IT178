package android.support.v4.b;

import java.util.Iterator;
import java.util.Map;

final class j implements Iterator, Map.Entry {
    int a;
    int b;
    boolean c = false;
    final /* synthetic */ f d;

    j(f fVar) {
        this.d = fVar;
        this.a = fVar.a() - 1;
        this.b = -1;
    }

    /* renamed from: a */
    public Map.Entry next() {
        this.b++;
        this.c = true;
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            if (!c.a(entry.getKey(), this.d.a(this.b, 0)) || !c.a(entry.getValue(), this.d.a(this.b, 1))) {
                z = false;
            }
            return z;
        }
    }

    public Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return this.b < this.a;
    }

    public final int hashCode() {
        int i = 0;
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object a2 = this.d.a(this.b, 0);
        Object a3 = this.d.a(this.b, 1);
        int hashCode = a2 == null ? 0 : a2.hashCode();
        if (a3 != null) {
            i = a3.hashCode();
        }
        return i ^ hashCode;
    }

    public void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.b--;
        this.a--;
        this.c = false;
        this.d.a(this.b);
    }

    public Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
