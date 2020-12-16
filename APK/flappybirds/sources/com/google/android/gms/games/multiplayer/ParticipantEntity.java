package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;

public final class ParticipantEntity extends av implements Participant {
    public static final Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final int f;
    private final String g;
    private final boolean h;
    private final PlayerEntity i;
    private final int j;

    ParticipantEntity(int i2, String str, String str2, Uri uri, Uri uri2, int i3, String str3, boolean z, PlayerEntity playerEntity, int i4) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = i3;
        this.g = str3;
        this.h = z;
        this.i = playerEntity;
        this.j = i4;
    }

    public ParticipantEntity(Participant participant) {
        this.a = 1;
        this.b = participant.i();
        this.c = participant.f();
        this.d = participant.g();
        this.e = participant.h();
        this.f = participant.b();
        this.g = participant.c();
        this.h = participant.e();
        Player j2 = participant.j();
        this.i = j2 == null ? null : new PlayerEntity(j2);
        this.j = participant.d();
    }

    static int a(Participant participant) {
        return dl.a(participant.j(), Integer.valueOf(participant.b()), participant.c(), Boolean.valueOf(participant.e()), participant.f(), participant.g(), participant.h(), Integer.valueOf(participant.d()));
    }

    static boolean a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return dl.a(participant2.j(), participant.j()) && dl.a(Integer.valueOf(participant2.b()), Integer.valueOf(participant.b())) && dl.a(participant2.c(), participant.c()) && dl.a(Boolean.valueOf(participant2.e()), Boolean.valueOf(participant.e())) && dl.a(participant2.f(), participant.f()) && dl.a(participant2.g(), participant.g()) && dl.a(participant2.h(), participant.h()) && dl.a(Integer.valueOf(participant2.d()), Integer.valueOf(participant.d()));
    }

    static String b(Participant participant) {
        return dl.a((Object) participant).a("Player", participant.j()).a("Status", Integer.valueOf(participant.b())).a("ClientAddress", participant.c()).a("ConnectedToRoom", Boolean.valueOf(participant.e())).a("DisplayName", participant.f()).a("IconImage", participant.g()).a("HiResImage", participant.h()).a("Capabilities", Integer.valueOf(participant.d())).toString();
    }

    public int b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public int d() {
        return this.j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.i == null ? this.c : this.i.c();
    }

    public Uri g() {
        return this.i == null ? this.d : this.i.d();
    }

    public Uri h() {
        return this.i == null ? this.e : this.i.e();
    }

    public int hashCode() {
        return a((Participant) this);
    }

    public String i() {
        return this.b;
    }

    public Player j() {
        return this.i;
    }

    public int k() {
        return this.a;
    }

    /* renamed from: l */
    public Participant a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        String str = null;
        int i3 = 0;
        if (!v()) {
            g.a(this, parcel, i2);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d == null ? null : this.d.toString());
        if (this.e != null) {
            str = this.e.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        if (this.i != null) {
            i3 = 1;
        }
        parcel.writeInt(i3);
        if (this.i != null) {
            this.i.writeToParcel(parcel, i2);
        }
    }
}
