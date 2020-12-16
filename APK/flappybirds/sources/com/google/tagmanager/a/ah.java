package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class ah extends AbstractList implements ai, RandomAccess {
    public static final ai a = new bg(new ah());
    private final List b;

    public ah() {
        this.b = new ArrayList();
    }

    public ah(ai aiVar) {
        this.b = new ArrayList(aiVar.size());
        addAll(aiVar);
    }

    private static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h ? ((h) obj).f() : ac.b((byte[]) obj);
    }

    /* renamed from: a */
    public String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String f = hVar.f();
            if (hVar.g()) {
                this.b.set(i, f);
            }
            return f;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = ac.b(bArr);
        if (ac.a(bArr)) {
            this.b.set(i, b2);
        }
        return b2;
    }

    /* renamed from: a */
    public String set(int i, String str) {
        return a(this.b.set(i, str));
    }

    public List a() {
        return Collections.unmodifiableList(this.b);
    }

    public void a(h hVar) {
        this.b.add(hVar);
        this.modCount++;
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof ai) {
            collection = ((ai) collection).a();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public String remove(int i) {
        Object remove = this.b.remove(i);
        this.modCount++;
        return a(remove);
    }

    /* renamed from: b */
    public void add(int i, String str) {
        this.b.add(i, str);
        this.modCount++;
    }

    public void clear() {
        this.b.clear();
        this.modCount++;
    }

    public int size() {
        return this.b.size();
    }
}
