package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import java.util.ArrayList;

public final class RoomEntity extends av implements Room {
    public static final Parcelable.Creator CREATOR = new d();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    private final String f;
    private final int g;
    private final Bundle h;
    private final ArrayList i;
    private final int j;

    RoomEntity(int i2, String str, String str2, long j2, int i3, String str3, int i4, Bundle bundle, ArrayList arrayList, int i5) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i3;
        this.f = str3;
        this.g = i4;
        this.h = bundle;
        this.i = arrayList;
        this.j = i5;
    }

    public RoomEntity(Room room) {
        this.a = 2;
        this.b = room.b();
        this.c = room.c();
        this.d = room.d();
        this.e = room.e();
        this.f = room.f();
        this.g = room.g();
        this.h = room.h();
        ArrayList i2 = room.i();
        int size = i2.size();
        this.i = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.i.add((ParticipantEntity) ((Participant) i2.get(i3)).a());
        }
        this.j = room.j();
    }

    static int a(Room room) {
        return dl.a(room.b(), room.c(), Long.valueOf(room.d()), Integer.valueOf(room.e()), room.f(), Integer.valueOf(room.g()), room.h(), room.i(), Integer.valueOf(room.j()));
    }

    static boolean a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return dl.a(room2.b(), room.b()) && dl.a(room2.c(), room.c()) && dl.a(Long.valueOf(room2.d()), Long.valueOf(room.d())) && dl.a(Integer.valueOf(room2.e()), Integer.valueOf(room.e())) && dl.a(room2.f(), room.f()) && dl.a(Integer.valueOf(room2.g()), Integer.valueOf(room.g())) && dl.a(room2.h(), room.h()) && dl.a(room2.i(), room.i()) && dl.a(Integer.valueOf(room2.j()), Integer.valueOf(room.j()));
    }

    static String b(Room room) {
        return dl.a((Object) room).a("RoomId", room.b()).a("CreatorId", room.c()).a("CreationTimestamp", Long.valueOf(room.d())).a("RoomStatus", Integer.valueOf(room.e())).a("Description", room.f()).a("Variant", Integer.valueOf(room.g())).a("AutoMatchCriteria", room.h()).a("Participants", room.i()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.j())).toString();
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public Bundle h() {
        return this.h;
    }

    public int hashCode() {
        return a((Room) this);
    }

    public ArrayList i() {
        return new ArrayList(this.i);
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.a;
    }

    /* renamed from: l */
    public Room a() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (!v()) {
            e.a(this, parcel, i2);
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeBundle(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((ParticipantEntity) this.i.get(i3)).writeToParcel(parcel, i2);
        }
    }
}
