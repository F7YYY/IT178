package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;

public final class GameEntity extends av implements Game {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;

    GameEntity(int i2, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i3, int i4, int i5) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = uri;
        this.i = uri2;
        this.j = uri3;
        this.k = z;
        this.l = z2;
        this.m = str7;
        this.n = i3;
        this.o = i4;
        this.p = i5;
    }

    public GameEntity(Game game) {
        this.a = 1;
        this.b = game.b();
        this.d = game.d();
        this.e = game.e();
        this.f = game.f();
        this.g = game.g();
        this.c = game.c();
        this.h = game.h();
        this.i = game.i();
        this.j = game.j();
        this.k = game.k();
        this.l = game.l();
        this.m = game.m();
        this.n = game.n();
        this.o = game.o();
        this.p = game.p();
    }

    static int a(Game game) {
        return dl.a(game.b(), game.c(), game.d(), game.e(), game.f(), game.g(), game.h(), game.i(), game.j(), Boolean.valueOf(game.k()), Boolean.valueOf(game.l()), game.m(), Integer.valueOf(game.n()), Integer.valueOf(game.o()), Integer.valueOf(game.p()));
    }

    static boolean a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        return dl.a(game2.b(), game.b()) && dl.a(game2.c(), game.c()) && dl.a(game2.d(), game.d()) && dl.a(game2.e(), game.e()) && dl.a(game2.f(), game.f()) && dl.a(game2.g(), game.g()) && dl.a(game2.h(), game.h()) && dl.a(game2.i(), game.i()) && dl.a(game2.j(), game.j()) && dl.a(Boolean.valueOf(game2.k()), Boolean.valueOf(game.k())) && dl.a(Boolean.valueOf(game2.l()), Boolean.valueOf(game.l())) && dl.a(game2.m(), game.m()) && dl.a(Integer.valueOf(game2.n()), Integer.valueOf(game.n())) && dl.a(Integer.valueOf(game2.o()), Integer.valueOf(game.o())) && dl.a(Integer.valueOf(game2.p()), Integer.valueOf(game.p()));
    }

    static String b(Game game) {
        return dl.a((Object) game).a("ApplicationId", game.b()).a("DisplayName", game.c()).a("PrimaryCategory", game.d()).a("SecondaryCategory", game.e()).a("Description", game.f()).a("DeveloperName", game.g()).a("IconImageUri", game.h()).a("HiResImageUri", game.i()).a("FeaturedImageUri", game.j()).a("PlayEnabledGame", Boolean.valueOf(game.k())).a("InstanceInstalled", Boolean.valueOf(game.l())).a("InstancePackageName", game.m()).a("GameplayAclStatus", Integer.valueOf(game.n())).a("AchievementTotalCount", Integer.valueOf(game.o())).a("LeaderboardCount", Integer.valueOf(game.p())).toString();
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public Uri h() {
        return this.h;
    }

    public int hashCode() {
        return a((Game) this);
    }

    public Uri i() {
        return this.i;
    }

    public Uri j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public boolean l() {
        return this.l;
    }

    public String m() {
        return this.m;
    }

    public int n() {
        return this.n;
    }

    public int o() {
        return this.o;
    }

    public int p() {
        return this.p;
    }

    public int q() {
        return this.a;
    }

    /* renamed from: r */
    public Game a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 1;
        String str = null;
        if (!v()) {
            h.a(this, parcel, i2);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h == null ? null : this.h.toString());
        parcel.writeString(this.i == null ? null : this.i.toString());
        if (this.j != null) {
            str = this.j.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.k ? 1 : 0);
        if (!this.l) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
    }
}
