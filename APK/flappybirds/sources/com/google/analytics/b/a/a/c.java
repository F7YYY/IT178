package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.w;
import com.google.tagmanager.a.x;
import java.util.Collections;
import java.util.List;

public final class c extends x implements j {
    public static aq a = new d();
    private static final c c = new c(true);
    private static volatile ap t = null;
    /* access modifiers changed from: private */
    public final h d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public h f;
    /* access modifiers changed from: private */
    public Object g;
    /* access modifiers changed from: private */
    public List h;
    /* access modifiers changed from: private */
    public List i;
    /* access modifiers changed from: private */
    public List j;
    /* access modifiers changed from: private */
    public Object k;
    /* access modifiers changed from: private */
    public Object l;
    /* access modifiers changed from: private */
    public long m;
    /* access modifiers changed from: private */
    public boolean n;
    /* access modifiers changed from: private */
    public List o;
    /* access modifiers changed from: private */
    public List p;
    /* access modifiers changed from: private */
    public boolean q;
    private byte r;
    private int s;

    static {
        c.J();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f6, code lost:
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r2 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0187  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x0144=Splitter:B:64:0x0144, B:95:0x01b5=Splitter:B:95:0x01b5} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c(com.google.tagmanager.a.k r11, com.google.tagmanager.a.o r12) {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.r = r0
            r0 = -1
            r10.s = r0
            r10.J()
            r2 = 0
            com.google.tagmanager.a.j r3 = com.google.tagmanager.a.h.i()
            com.google.tagmanager.a.m r4 = com.google.tagmanager.a.m.a((java.io.OutputStream) r3)
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x01fa
            int r5 = r11.a()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            switch(r5) {
                case 0: goto L_0x002a;
                case 8: goto L_0x002d;
                case 18: goto L_0x004b;
                case 26: goto L_0x005a;
                case 34: goto L_0x0077;
                case 42: goto L_0x0095;
                case 50: goto L_0x00b4;
                case 58: goto L_0x00c4;
                case 64: goto L_0x00d4;
                case 72: goto L_0x00e4;
                case 80: goto L_0x00f4;
                case 82: goto L_0x0121;
                case 90: goto L_0x01cb;
                case 96: goto L_0x01ea;
                default: goto L_0x001f;
            }     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
        L_0x001f:
            boolean r0 = r10.a(r11, r4, r12, r5)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            if (r0 != 0) goto L_0x01f6
            r0 = 1
            r1 = r2
        L_0x0027:
            r2 = r1
            r1 = r0
            goto L_0x0016
        L_0x002a:
            r0 = 1
            r1 = r2
            goto L_0x0027
        L_0x002d:
            int r0 = r11.n()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            com.google.analytics.b.a.a.h r6 = com.google.analytics.b.a.a.h.a(r0)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            if (r6 != 0) goto L_0x0040
            r4.d((int) r5)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r4.d((int) r0)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x0040:
            int r0 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r0 | 1
            r10.e = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.f = r6     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x004b:
            com.google.tagmanager.a.h r0 = r11.l()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            int r5 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r5 = r5 | 2
            r10.e = r5     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.g = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x005a:
            r0 = r2 & 4
            r5 = 4
            if (r0 == r5) goto L_0x0284
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0.<init>()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.h = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r2 | 4
        L_0x0068:
            java.util.List r2 = r10.h     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.aq r5 = a     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.am r5 = r11.a((com.google.tagmanager.a.aq) r5, (com.google.tagmanager.a.o) r12)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.add(r5)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x0077:
            r0 = r2 & 8
            r5 = 8
            if (r0 == r5) goto L_0x0281
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0.<init>()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.i = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r2 | 8
        L_0x0086:
            java.util.List r2 = r10.i     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.aq r5 = a     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.am r5 = r11.a((com.google.tagmanager.a.aq) r5, (com.google.tagmanager.a.o) r12)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.add(r5)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x0095:
            r0 = r2 & 16
            r5 = 16
            if (r0 == r5) goto L_0x027e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0.<init>()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.j = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r2 | 16
        L_0x00a4:
            java.util.List r2 = r10.j     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.aq r5 = a     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.am r5 = r11.a((com.google.tagmanager.a.aq) r5, (com.google.tagmanager.a.o) r12)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.add(r5)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x00b4:
            com.google.tagmanager.a.h r0 = r11.l()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            int r5 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r5 = r5 | 4
            r10.e = r5     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.k = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x00c4:
            com.google.tagmanager.a.h r0 = r11.l()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            int r5 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r5 = r5 | 8
            r10.e = r5     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.l = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x00d4:
            int r0 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r0 | 16
            r10.e = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            long r5 = r11.e()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.m = r5     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x00e4:
            int r0 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r0 | 64
            r10.e = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            boolean r0 = r11.i()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.q = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x00f4:
            int r0 = r11.n()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            com.google.analytics.b.a.a.f r6 = com.google.analytics.b.a.a.f.a(r0)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            if (r6 != 0) goto L_0x0108
            r4.d((int) r5)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r4.d((int) r0)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x0108:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r0 == r5) goto L_0x027b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0.<init>()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.p = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r2 | 1024(0x400, float:1.435E-42)
        L_0x0117:
            java.util.List r2 = r10.p     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.add(r6)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x0121:
            int r0 = r11.s()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            int r6 = r11.c(r0)     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r2
        L_0x012a:
            int r2 = r11.w()     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            if (r2 <= 0) goto L_0x01c3
            int r2 = r11.n()     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.analytics.b.a.a.f r7 = com.google.analytics.b.a.a.f.a(r2)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            if (r7 != 0) goto L_0x019c
            r4.d((int) r5)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r4.d((int) r2)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            goto L_0x012a
        L_0x0141:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0144:
            com.google.tagmanager.a.af r0 = r0.a(r10)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
        L_0x014a:
            r1 = r2 & 4
            r5 = 4
            if (r1 != r5) goto L_0x0157
            java.util.List r1 = r10.h
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r10.h = r1
        L_0x0157:
            r1 = r2 & 8
            r5 = 8
            if (r1 != r5) goto L_0x0165
            java.util.List r1 = r10.i
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r10.i = r1
        L_0x0165:
            r1 = r2 & 16
            r5 = 16
            if (r1 != r5) goto L_0x0173
            java.util.List r1 = r10.j
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r10.j = r1
        L_0x0173:
            r1 = r2 & 1024(0x400, float:1.435E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r1 != r5) goto L_0x0181
            java.util.List r1 = r10.p
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r10.p = r1
        L_0x0181:
            r1 = r2 & 512(0x200, float:7.175E-43)
            r2 = 512(0x200, float:7.175E-43)
            if (r1 != r2) goto L_0x018f
            java.util.List r1 = r10.o
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r10.o = r1
        L_0x018f:
            r4.a()     // Catch:{ IOException -> 0x025c, all -> 0x0265 }
            com.google.tagmanager.a.h r1 = r3.a()
            r10.d = r1
        L_0x0198:
            r10.R()
            throw r0
        L_0x019c:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            r8 = 1024(0x400, float:1.435E-42)
            if (r2 == r8) goto L_0x01ab
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.<init>()     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r10.p = r2     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r0 = r0 | 1024(0x400, float:1.435E-42)
        L_0x01ab:
            java.util.List r2 = r10.p     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.add(r7)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            goto L_0x012a
        L_0x01b2:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x01b5:
            com.google.tagmanager.a.af r1 = new com.google.tagmanager.a.af     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0149 }
            r1.<init>(r0)     // Catch:{ all -> 0x0149 }
            com.google.tagmanager.a.af r0 = r1.a(r10)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x01c3:
            r11.d(r6)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x01cb:
            r0 = r2 & 512(0x200, float:7.175E-43)
            r5 = 512(0x200, float:7.175E-43)
            if (r0 == r5) goto L_0x0278
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0.<init>()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.o = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r2 | 512(0x200, float:7.175E-43)
        L_0x01da:
            java.util.List r2 = r10.o     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.aq r5 = a     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            com.google.tagmanager.a.am r5 = r11.a((com.google.tagmanager.a.aq) r5, (com.google.tagmanager.a.o) r12)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r2.add(r5)     // Catch:{ af -> 0x0141, IOException -> 0x01b2, all -> 0x026d }
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0027
        L_0x01ea:
            int r0 = r10.e     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r0 = r0 | 32
            r10.e = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            boolean r0 = r11.i()     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
            r10.n = r0     // Catch:{ af -> 0x0275, IOException -> 0x0272 }
        L_0x01f6:
            r0 = r1
            r1 = r2
            goto L_0x0027
        L_0x01fa:
            r0 = r2 & 4
            r1 = 4
            if (r0 != r1) goto L_0x0207
            java.util.List r0 = r10.h
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r10.h = r0
        L_0x0207:
            r0 = r2 & 8
            r1 = 8
            if (r0 != r1) goto L_0x0215
            java.util.List r0 = r10.i
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r10.i = r0
        L_0x0215:
            r0 = r2 & 16
            r1 = 16
            if (r0 != r1) goto L_0x0223
            java.util.List r0 = r10.j
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r10.j = r0
        L_0x0223:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 != r1) goto L_0x0231
            java.util.List r0 = r10.p
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r10.p = r0
        L_0x0231:
            r0 = r2 & 512(0x200, float:7.175E-43)
            r1 = 512(0x200, float:7.175E-43)
            if (r0 != r1) goto L_0x023f
            java.util.List r0 = r10.o
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r10.o = r0
        L_0x023f:
            r4.a()     // Catch:{ IOException -> 0x024c, all -> 0x0254 }
            com.google.tagmanager.a.h r0 = r3.a()
            r10.d = r0
        L_0x0248:
            r10.R()
            return
        L_0x024c:
            r0 = move-exception
            com.google.tagmanager.a.h r0 = r3.a()
            r10.d = r0
            goto L_0x0248
        L_0x0254:
            r0 = move-exception
            com.google.tagmanager.a.h r1 = r3.a()
            r10.d = r1
            throw r0
        L_0x025c:
            r1 = move-exception
            com.google.tagmanager.a.h r1 = r3.a()
            r10.d = r1
            goto L_0x0198
        L_0x0265:
            r0 = move-exception
            com.google.tagmanager.a.h r1 = r3.a()
            r10.d = r1
            throw r0
        L_0x026d:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x014a
        L_0x0272:
            r0 = move-exception
            goto L_0x01b5
        L_0x0275:
            r0 = move-exception
            goto L_0x0144
        L_0x0278:
            r0 = r2
            goto L_0x01da
        L_0x027b:
            r0 = r2
            goto L_0x0117
        L_0x027e:
            r0 = r2
            goto L_0x00a4
        L_0x0281:
            r0 = r2
            goto L_0x0086
        L_0x0284:
            r0 = r2
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.b.a.a.c.<init>(com.google.tagmanager.a.k, com.google.tagmanager.a.o):void");
    }

    private c(w wVar) {
        super(wVar);
        this.r = -1;
        this.s = -1;
        this.d = wVar.r();
    }

    private c(boolean z) {
        this.r = -1;
        this.s = -1;
        this.d = h.a;
    }

    public static e F() {
        return e.u();
    }

    private void J() {
        this.f = h.STRING;
        this.g = "";
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = "";
        this.l = "";
        this.m = 0;
        this.n = false;
        this.o = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = false;
    }

    public static c a() {
        return c;
    }

    public static e a(c cVar) {
        return F().a(cVar);
    }

    public int A() {
        return this.o.size();
    }

    public List B() {
        return this.p;
    }

    public int C() {
        return this.p.size();
    }

    public boolean D() {
        return (this.e & 64) == 64;
    }

    public boolean E() {
        return this.q;
    }

    /* renamed from: G */
    public e o() {
        return F();
    }

    /* renamed from: H */
    public e n() {
        return a(this);
    }

    public c a(int i2) {
        return (c) this.h.get(i2);
    }

    /* renamed from: b */
    public c p() {
        return c;
    }

    public c b(int i2) {
        return (c) this.i.get(i2);
    }

    public c c(int i2) {
        return (c) this.j.get(i2);
    }

    public aq c() {
        return a;
    }

    public c d(int i2) {
        return (c) this.o.get(i2);
    }

    public boolean d() {
        return (this.e & 1) == 1;
    }

    public h e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return super.equals(obj);
        }
        c cVar = (c) obj;
        boolean z = d() == cVar.d();
        if (d()) {
            z = z && e() == cVar.e();
        }
        boolean z2 = z && f() == cVar.f();
        if (f()) {
            z2 = z2 && g().equals(cVar.g());
        }
        boolean z3 = (((z2 && h().equals(cVar.h())) && k().equals(cVar.k())) && m().equals(cVar.m())) && r() == cVar.r();
        if (r()) {
            z3 = z3 && s().equals(cVar.s());
        }
        boolean z4 = z3 && t() == cVar.t();
        if (t()) {
            z4 = z4 && u().equals(cVar.u());
        }
        boolean z5 = z4 && v() == cVar.v();
        if (v()) {
            z5 = z5 && w() == cVar.w();
        }
        boolean z6 = z5 && x() == cVar.x();
        if (x()) {
            z6 = z6 && y() == cVar.y();
        }
        boolean z7 = ((z6 && z().equals(cVar.z())) && B().equals(cVar.B())) && D() == cVar.D();
        return D() ? z7 && E() == cVar.E() : z7;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public String g() {
        Object obj = this.g;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f2 = hVar.f();
        if (hVar.g()) {
            this.g = f2;
        }
        return f2;
    }

    public List h() {
        return this.h;
    }

    public int hashCode() {
        if (this.b != 0) {
            return this.b;
        }
        int hashCode = c.class.hashCode() + 779;
        if (d()) {
            hashCode = (((hashCode * 37) + 1) * 53) + ac.a((ad) e());
        }
        if (f()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        if (i() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (l() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + k().hashCode();
        }
        if (q() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + m().hashCode();
        }
        if (r()) {
            hashCode = (((hashCode * 37) + 6) * 53) + s().hashCode();
        }
        if (t()) {
            hashCode = (((hashCode * 37) + 7) * 53) + u().hashCode();
        }
        if (v()) {
            hashCode = (((hashCode * 37) + 8) * 53) + ac.a(w());
        }
        if (x()) {
            hashCode = (((hashCode * 37) + 12) * 53) + ac.a(y());
        }
        if (A() > 0) {
            hashCode = (((hashCode * 37) + 11) * 53) + z().hashCode();
        }
        if (C() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + ac.a(B());
        }
        if (D()) {
            hashCode = (((hashCode * 37) + 9) * 53) + ac.a(E());
        }
        int hashCode2 = (hashCode * 29) + this.d.hashCode();
        this.b = hashCode2;
        return hashCode2;
    }

    public int i() {
        return this.h.size();
    }

    public final boolean j() {
        boolean z = true;
        byte b = this.r;
        if (b != -1) {
            if (b != 1) {
                z = false;
            }
            return z;
        } else if (!d()) {
            this.r = 0;
            return false;
        } else {
            for (int i2 = 0; i2 < i(); i2++) {
                if (!a(i2).j()) {
                    this.r = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < l(); i3++) {
                if (!b(i3).j()) {
                    this.r = 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < q(); i4++) {
                if (!c(i4).j()) {
                    this.r = 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < A(); i5++) {
                if (!d(i5).j()) {
                    this.r = 0;
                    return false;
                }
            }
            if (!I()) {
                this.r = 0;
                return false;
            }
            this.r = 1;
            return true;
        }
    }

    public List k() {
        return this.i;
    }

    public int l() {
        return this.i.size();
    }

    public List m() {
        return this.j;
    }

    public int q() {
        return this.j.size();
    }

    public boolean r() {
        return (this.e & 4) == 4;
    }

    public String s() {
        Object obj = this.k;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f2 = hVar.f();
        if (hVar.g()) {
            this.k = f2;
        }
        return f2;
    }

    public boolean t() {
        return (this.e & 8) == 8;
    }

    public String u() {
        Object obj = this.l;
        if (obj instanceof String) {
            return (String) obj;
        }
        h hVar = (h) obj;
        String f2 = hVar.f();
        if (hVar.g()) {
            this.l = f2;
        }
        return f2;
    }

    public boolean v() {
        return (this.e & 16) == 16;
    }

    public long w() {
        return this.m;
    }

    public boolean x() {
        return (this.e & 32) == 32;
    }

    public boolean y() {
        return this.n;
    }

    public List z() {
        return this.o;
    }
}
