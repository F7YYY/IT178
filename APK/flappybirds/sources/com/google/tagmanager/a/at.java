package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class at {
    private final Deque a;

    private at() {
        this.a = new ArrayDeque(ar.c.length);
    }

    private int a(int i) {
        int binarySearch = Arrays.binarySearch(ar.c, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* access modifiers changed from: private */
    public h a(h hVar, h hVar2) {
        a(hVar);
        a(hVar2);
        ar arVar = (h) this.a.pop();
        while (!this.a.isEmpty()) {
            arVar = new ar((h) this.a.pop(), arVar);
        }
        return arVar;
    }

    private void a(h hVar) {
        if (hVar.k()) {
            b(hVar);
        } else if (hVar instanceof ar) {
            ar arVar = (ar) hVar;
            a(arVar.e);
            a(arVar.f);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + hVar.getClass());
        }
    }

    private void b(h hVar) {
        int a2 = a(hVar.a());
        int i = ar.c[a2 + 1];
        if (this.a.isEmpty() || ((h) this.a.peek()).a() >= i) {
            this.a.push(hVar);
            return;
        }
        int i2 = ar.c[a2];
        ar arVar = (h) this.a.pop();
        while (!this.a.isEmpty() && ((h) this.a.peek()).a() < i2) {
            arVar = new ar((h) this.a.pop(), arVar);
        }
        ar arVar2 = new ar(arVar, hVar);
        while (!this.a.isEmpty()) {
            if (((h) this.a.peek()).a() >= ar.c[a(arVar2.a()) + 1]) {
                break;
            }
            arVar2 = new ar((h) this.a.pop(), arVar2);
        }
        this.a.push(arVar2);
    }
}
