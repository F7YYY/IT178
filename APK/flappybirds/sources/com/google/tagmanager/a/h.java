package com.google.tagmanager.a;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class h implements Iterable {
    public static final h a = new aj(new byte[0]);
    static final /* synthetic */ boolean b = (!h.class.desiredAssertionStatus());

    h() {
    }

    public static h a(Iterable iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((h) it.next());
            }
            collection = arrayList;
        } else {
            collection = (Collection) iterable;
        }
        return collection.isEmpty() ? a : a(collection.iterator(), collection.size());
    }

    private static h a(Iterator it, int i) {
        if (!b && i < 1) {
            throw new AssertionError();
        } else if (i == 1) {
            return (h) it.next();
        } else {
            int i2 = i >>> 1;
            return a(it, i2).a(a(it, i - i2));
        }
    }

    public static h a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new aj(bArr2);
    }

    public static j i() {
        return new j(128);
    }

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public h a(h hVar) {
        int a2 = a();
        int a3 = hVar.a();
        if (((long) a2) + ((long) a3) < 2147483647L) {
            return ar.a(this, hVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + a2 + "+" + a3);
    }

    public abstract String a(String str);

    /* access modifiers changed from: package-private */
    public void a(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i2);
        } else if (i + i2 > a()) {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + (i + i2));
        } else if (i2 > 0) {
            b(outputStream, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract void b(OutputStream outputStream, int i, int i2);

    public void b(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + i2);
        } else if (i3 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i3);
        } else if (i + i3 > a()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + (i + i3));
        } else if (i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + (i2 + i3));
        } else if (i3 > 0) {
            a(bArr, i, i2, i3);
        }
    }

    /* renamed from: c */
    public abstract i iterator();

    public boolean d() {
        return a() == 0;
    }

    public byte[] e() {
        int a2 = a();
        if (a2 == 0) {
            return ac.a;
        }
        byte[] bArr = new byte[a2];
        a(bArr, 0, 0, a2);
        return bArr;
    }

    public String f() {
        try {
            return a("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract boolean g();

    public abstract k h();

    public abstract int hashCode();

    /* access modifiers changed from: protected */
    public abstract int j();

    /* access modifiers changed from: protected */
    public abstract boolean k();

    /* access modifiers changed from: protected */
    public abstract int l();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }
}
