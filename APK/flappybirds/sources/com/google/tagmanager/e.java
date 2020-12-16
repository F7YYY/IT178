package com.google.tagmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class e {
    public static final Object a = new Object();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Map c = new HashMap();
    private final ReentrantLock d = new ReentrantLock();
    private final LinkedList e = new LinkedList();

    e() {
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        this.b.put(fVar, 0);
    }
}
