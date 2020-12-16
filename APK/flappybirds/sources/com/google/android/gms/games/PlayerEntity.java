package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.dl;

public final class PlayerEntity extends av implements Player {
    public static final Parcelable.Creator CREATOR = new g();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = j;
    }

    public PlayerEntity(Player player) {
        boolean z = true;
        this.a = 1;
        this.b = player.b();
        this.c = player.c();
        this.d = player.d();
        this.e = player.e();
        this.f = player.f();
        cn.a((Object) this.b);
        cn.a((Object) this.c);
        cn.a(this.f <= 0 ? false : z);
    }

    static int a(Player player) {
        return dl.a(player.b(), player.c(), player.d(), player.e(), Long.valueOf(player.f()));
    }

    static boolean a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return dl.a(player2.b(), player.b()) && dl.a(player2.c(), player.c()) && dl.a(player2.d(), player.d()) && dl.a(player2.e(), player.e()) && dl.a(Long.valueOf(player2.f()), Long.valueOf(player.f()));
    }

    static String b(Player player) {
        return dl.a((Object) player).a("PlayerId", player.b()).a("DisplayName", player.c()).a("IconImageUri", player.d()).a("HiResImageUri", player.e()).a("RetrievedTimestamp", Long.valueOf(player.f())).toString();
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public Uri d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public long f() {
        return this.f;
    }

    public int g() {
        return this.a;
    }

    /* renamed from: h */
    public Player a() {
        return this;
    }

    public int hashCode() {
        return a((Player) this);
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (!v()) {
            i.a(this, parcel, i);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d == null ? null : this.d.toString());
        if (this.e != null) {
            str = this.e.toString();
        }
        parcel.writeString(str);
        parcel.writeLong(this.f);
    }
}
