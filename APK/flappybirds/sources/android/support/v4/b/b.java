package android.support.v4.b;

import java.util.Map;

class b extends f {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    public int a() {
        return this.a.h;
    }

    /* access modifiers changed from: protected */
    public int a(Object obj) {
        return obj == null ? this.a.a() : this.a.a(obj, obj.hashCode());
    }

    /* access modifiers changed from: protected */
    public Object a(int i, int i2) {
        return this.a.g[(i << 1) + i2];
    }

    /* access modifiers changed from: protected */
    public Object a(int i, Object obj) {
        return this.a.a(i, obj);
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        this.a.d(i);
    }

    /* access modifiers changed from: protected */
    public void a(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public int b(Object obj) {
        return this.a.a(obj);
    }

    /* access modifiers changed from: protected */
    public Map b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.a.clear();
    }
}
