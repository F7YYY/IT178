package org.andengine.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c extends ReentrantLock {
    final Condition a = newCondition();
    final AtomicBoolean b = new AtomicBoolean(false);

    public c(boolean z) {
        super(z);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.b.set(true);
        this.a.signalAll();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.b.set(false);
        this.a.signalAll();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        while (!this.b.get()) {
            this.a.await();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        while (this.b.get()) {
            this.a.await();
        }
    }
}
