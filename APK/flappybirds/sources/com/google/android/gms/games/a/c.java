package com.google.android.gms.games.a;

import com.google.android.gms.internal.dl;

public final class c {
    public final long a;
    public final String b;
    public final boolean c;

    public c(long j, String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public String toString() {
        return dl.a((Object) this).a("RawScore", Long.valueOf(this.a)).a("FormattedScore", this.b).a("NewBest", Boolean.valueOf(this.c)).toString();
    }
}
