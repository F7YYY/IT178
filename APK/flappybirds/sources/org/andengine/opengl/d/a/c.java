package org.andengine.opengl.d.a;

public class c {
    private final int a;
    private final a[] b;

    public c(int i, a... aVarArr) {
        this.b = aVarArr;
        this.a = i;
    }

    public void a() {
        a[] aVarArr = this.b;
        int i = this.a;
        for (a a2 : aVarArr) {
            a2.a(i);
        }
    }
}
