package org.andengine.a.c;

import android.media.SoundPool;
import android.util.SparseArray;
import org.andengine.a.b;
import org.andengine.a.c.a.a;

public class c extends b implements SoundPool.OnLoadCompleteListener {
    private final SoundPool c;
    private final SparseArray d;

    public c() {
        this(5);
    }

    public c(int i) {
        this.d = new SparseArray();
        this.c = new SoundPool(i, 3, 0);
        this.c.setOnLoadCompleteListener(this);
    }

    public void a(a aVar) {
        super.a(aVar);
        this.d.put(aVar.h(), aVar);
    }

    public void b() {
        super.b();
        this.c.release();
    }

    public boolean b(a aVar) {
        boolean b = super.b(aVar);
        if (b) {
            this.d.remove(aVar.h());
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    public SoundPool c() {
        return this.c;
    }

    public synchronized void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            a aVar = (a) this.d.get(i);
            if (aVar == null) {
                throw new a("Unexpected soundID: '" + i + "'.");
            }
            aVar.a(true);
        }
    }
}
