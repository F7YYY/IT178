package android.support.v4.b;

import java.util.Collection;
import java.util.Iterator;

final class k implements Collection {
    final /* synthetic */ f a;

    k(f fVar) {
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
        return this.a.b(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.a.a() == 0;
    }

    public Iterator iterator() {
        return new g(this.a, 1);
    }

    public boolean remove(Object obj) {
        int b = this.a.b(obj);
        if (b < 0) {
            return false;
        }
        this.a.a(b);
        return true;
    }

    public boolean removeAll(Collection collection) {
        int i = 0;
        int a2 = this.a.a();
        boolean z = false;
        while (i < a2) {
            if (collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        int i = 0;
        int a2 = this.a.a();
        boolean z = false;
        while (i < a2) {
            if (!collection.contains(this.a.a(i, 1))) {
                this.a.a(i);
                i--;
                a2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.a.a();
    }

    public Object[] toArray() {
        return this.a.b(1);
    }

    public Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}
