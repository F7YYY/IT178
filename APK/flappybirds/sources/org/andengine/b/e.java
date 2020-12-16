package org.andengine.b;

import org.andengine.b.c.b;

public class e extends a {
    private final long e;

    public e(b bVar, int i) {
        super(bVar);
        this.e = 1000000000 / ((long) i);
    }

    public void a(long j) {
        long j2 = this.e - j;
        if (j2 <= 0) {
            super.a(j);
            return;
        }
        Thread.sleep((long) ((int) (j2 / 1000000)));
        super.a(j2 + j);
    }
}
