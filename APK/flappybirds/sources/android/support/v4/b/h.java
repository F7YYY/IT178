package android.support.v4.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class h implements Set {
    final /* synthetic */ f a;

    h(f fVar) {
        this.a = fVar;
    }

    /* renamed from: a */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        int a2 = this.a.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.a.a(entry.getKey(), entry.getValue());
        }
        return a2 != this.a.a();
    }

    public void clear() {
        this.a.c();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int a2 = this.a.a(entry.getKey());
        if (a2 >= 0) {
            return c.a(this.a.a(a2, 1), entry.getValue());
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        return f.a((Set) this, obj);
    }

    public int hashCode() {
        int a2 = this.a.a() - 1;
        int i = 0;
        while (a2 >= 0) {
            Object a3 = this.a.a(a2, 0);
            Object a4 = this.a.a(a2, 1);
            a2--;
            i += (a4 == null ? 0 : a4.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
        }
        return i;
    }

    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    public Iterator iterator() {
        return new j(this.a);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.a.a();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
