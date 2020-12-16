package org.andengine.b;

import android.os.Process;
import org.andengine.b.b.a.a;

public class d extends Thread {
    private a a;
    private final a b = new a();

    public d() {
        super(d.class.getSimpleName());
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void run() {
        Process.setThreadPriority(this.a.d().l());
        while (true) {
            try {
                this.b.a_(0.0f);
                this.a.m();
            } catch (InterruptedException e) {
                org.andengine.d.e.a.a(String.valueOf(getClass().getSimpleName()) + " interrupted. Don't worry - this " + e.getClass().getSimpleName() + " is most likely expected!", e);
                interrupt();
                return;
            }
        }
    }
}
