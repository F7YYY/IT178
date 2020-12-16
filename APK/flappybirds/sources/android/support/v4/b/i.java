package android.support.v4.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class i implements Set {
    final /* synthetic */ f a;

    i(f fVar) {
        this.a = fVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.a.c();
    }

    public boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        return f.a(this.a.b(), collection);
    }

    public boolean equals(Object obj) {
        return f.a((Set) this, obj);
    }

    public int hashCode() {
        int i = 0;
        for (int a2 = this.a.a() - 1; a2 >= 0; a2--) {
            Object a3 = this.a.a(a2, 0);
            i += a3 == null ? 0 : a3.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    public Iterator iterator() {
        return new g(this.a, 0);
    }

    public boolean remove(Object obj) {
        int a2 = this.a.a(obj);
        if (a2 < 0) {
            return false;
        }
        this.a.a(a2);
        return true;
    }

    public boolean removeAll(Collection collection) {
        return f.b(this.a.b(), collection);
    }

    public boolean retainAll(Collection collection) {
        return f.c(this.a.b(), collection);
    }

    public int size() {
        return this.a.a();
    }

    public Object[] toArray() {
        return this.a.b(0);
    }

    public Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }
}
