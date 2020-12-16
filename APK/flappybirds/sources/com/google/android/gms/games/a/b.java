package com.google.android.gms.games.a;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.Cdo;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import java.util.HashMap;

public final class b {
    private static final String[] a = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"};
    private String b;
    private String c;
    private int d;
    private HashMap e = new HashMap();

    public b(d dVar) {
        this.d = dVar.e();
        int g = dVar.g();
        Cdo.b(g == 3);
        for (int i = 0; i < g; i++) {
            int a2 = dVar.a(i);
            if (i == 0) {
                this.b = dVar.c("leaderboardId", i, a2);
                this.c = dVar.c("playerId", i, a2);
            }
            if (dVar.d("hasResult", i, a2)) {
                a(new c(dVar.a("rawScore", i, a2), dVar.c("formattedScore", i, a2), dVar.d("newBest", i, a2)), dVar.b("timeSpan", i, a2));
            }
        }
    }

    private void a(c cVar, int i) {
        this.e.put(Integer.valueOf(i), cVar);
    }

    public int a() {
        return this.d;
    }

    public String toString() {
        dn a2 = dl.a((Object) this).a("PlayerId", this.c).a("StatusCode", Integer.valueOf(this.d));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 3) {
                return a2.toString();
            }
            c cVar = (c) this.e.get(Integer.valueOf(i2));
            a2.a("TimesSpan", ao.a(i2));
            a2.a("Result", cVar == null ? "null" : cVar.toString());
            i = i2 + 1;
        }
    }
}
