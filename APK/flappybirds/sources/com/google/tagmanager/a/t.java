package com.google.tagmanager.a;

import java.io.Serializable;

public abstract class t extends a implements Serializable {
    protected t() {
    }

    protected t(v vVar) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        r0 = (com.google.tagmanager.a.am) r6.a((com.google.tagmanager.a.s) r4.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.google.tagmanager.a.q r6, com.google.tagmanager.a.am r7, com.google.tagmanager.a.k r8, com.google.tagmanager.a.m r9, com.google.tagmanager.a.o r10, int r11) {
        /*
            r2 = 0
            r1 = 1
            int r0 = com.google.tagmanager.a.bk.a(r11)
            int r3 = com.google.tagmanager.a.bk.b(r11)
            com.google.tagmanager.a.aa r4 = r10.a(r7, r3)
            if (r4 != 0) goto L_0x0019
            r0 = r2
            r3 = r1
        L_0x0012:
            if (r3 == 0) goto L_0x004a
            boolean r0 = r8.a((int) r11, (com.google.tagmanager.a.m) r9)
        L_0x0018:
            return r0
        L_0x0019:
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.bm r3 = r3.a()
            int r3 = com.google.tagmanager.a.q.a((com.google.tagmanager.a.bm) r3, (boolean) r2)
            if (r0 != r3) goto L_0x0028
            r0 = r2
            r3 = r2
            goto L_0x0012
        L_0x0028:
            com.google.tagmanager.a.z r3 = r4.b
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0047
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.bm r3 = r3.c
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x0047
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.bm r3 = r3.a()
            int r3 = com.google.tagmanager.a.q.a((com.google.tagmanager.a.bm) r3, (boolean) r1)
            if (r0 != r3) goto L_0x0047
            r0 = r1
            r3 = r2
            goto L_0x0012
        L_0x0047:
            r0 = r2
            r3 = r1
            goto L_0x0012
        L_0x004a:
            if (r0 == 0) goto L_0x009c
            int r0 = r8.s()
            int r0 = r8.c(r0)
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.bm r3 = r3.a()
            com.google.tagmanager.a.bm r5 = com.google.tagmanager.a.bm.ENUM
            if (r3 != r5) goto L_0x0080
        L_0x005e:
            int r2 = r8.w()
            if (r2 <= 0) goto L_0x0096
            int r2 = r8.n()
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.ae r3 = r3.e()
            com.google.tagmanager.a.ad r2 = r3.b(r2)
            if (r2 != 0) goto L_0x0076
            r0 = r1
            goto L_0x0018
        L_0x0076:
            com.google.tagmanager.a.z r3 = r4.b
            java.lang.Object r2 = r4.a(r2)
            r6.b(r3, r2)
            goto L_0x005e
        L_0x0080:
            int r3 = r8.w()
            if (r3 <= 0) goto L_0x0096
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.bm r3 = r3.a()
            java.lang.Object r3 = com.google.tagmanager.a.q.a(r8, r3, r2)
            com.google.tagmanager.a.z r5 = r4.b
            r6.b(r5, r3)
            goto L_0x0080
        L_0x0096:
            r8.d(r0)
        L_0x0099:
            r0 = r1
            goto L_0x0018
        L_0x009c:
            int[] r0 = com.google.tagmanager.a.u.a
            com.google.tagmanager.a.z r3 = r4.b
            com.google.tagmanager.a.br r3 = r3.b()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            switch(r0) {
                case 1: goto L_0x00c9;
                case 2: goto L_0x0104;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            com.google.tagmanager.a.z r0 = r4.b
            com.google.tagmanager.a.bm r0 = r0.a()
            java.lang.Object r0 = com.google.tagmanager.a.q.a(r8, r0, r2)
        L_0x00b7:
            com.google.tagmanager.a.z r2 = r4.b
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x011d
            com.google.tagmanager.a.z r2 = r4.b
            java.lang.Object r0 = r4.a(r0)
            r6.b(r2, r0)
            goto L_0x0099
        L_0x00c9:
            r2 = 0
            com.google.tagmanager.a.z r0 = r4.b
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0128
            com.google.tagmanager.a.z r0 = r4.b
            java.lang.Object r0 = r6.a((com.google.tagmanager.a.s) r0)
            com.google.tagmanager.a.am r0 = (com.google.tagmanager.a.am) r0
            if (r0 == 0) goto L_0x0128
            com.google.tagmanager.a.an r0 = r0.n()
        L_0x00e0:
            if (r0 != 0) goto L_0x00ea
            com.google.tagmanager.a.am r0 = r4.b()
            com.google.tagmanager.a.an r0 = r0.o()
        L_0x00ea:
            com.google.tagmanager.a.z r2 = r4.b
            com.google.tagmanager.a.bm r2 = r2.a()
            com.google.tagmanager.a.bm r3 = com.google.tagmanager.a.bm.GROUP
            if (r2 != r3) goto L_0x0100
            int r2 = r4.a()
            r8.a(r2, r0, r10)
        L_0x00fb:
            com.google.tagmanager.a.am r0 = r0.h()
            goto L_0x00b7
        L_0x0100:
            r8.a((com.google.tagmanager.a.an) r0, (com.google.tagmanager.a.o) r10)
            goto L_0x00fb
        L_0x0104:
            int r2 = r8.n()
            com.google.tagmanager.a.z r0 = r4.b
            com.google.tagmanager.a.ae r0 = r0.e()
            com.google.tagmanager.a.ad r0 = r0.b(r2)
            if (r0 != 0) goto L_0x00b7
            r9.d((int) r11)
            r9.b((int) r2)
            r0 = r1
            goto L_0x0018
        L_0x011d:
            com.google.tagmanager.a.z r2 = r4.b
            java.lang.Object r0 = r4.a(r0)
            r6.a((com.google.tagmanager.a.s) r2, (java.lang.Object) r0)
            goto L_0x0099
        L_0x0128:
            r0 = r2
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.a.t.b(com.google.tagmanager.a.q, com.google.tagmanager.a.am, com.google.tagmanager.a.k, com.google.tagmanager.a.m, com.google.tagmanager.a.o, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void R() {
    }

    /* access modifiers changed from: protected */
    public boolean a(k kVar, m mVar, o oVar, int i) {
        return kVar.a(i, mVar);
    }

    public aq c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}
