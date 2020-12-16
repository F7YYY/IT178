package android.support.v4.b;

import java.util.Iterator;

final class g implements Iterator {
    final int a;
    int b;
    int c;
    boolean d = false;
    final /* synthetic */ f e;

    g(f fVar, int i) {
        this.e = fVar;
        this.a = i;
        this.b = fVar.a();
    }

    public boolean hasNext() {
        return this.c < this.b;
    }

    public Object next() {
        Object a2 = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return a2;
    }

    public void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.c--;
        this.b--;
        this.d = false;
        this.e.a(this.c);
    }
}
