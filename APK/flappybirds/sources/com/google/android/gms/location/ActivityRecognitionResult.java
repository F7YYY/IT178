package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
    public static final a CREATOR = new a();
    List a;
    long b;
    long c;
    private final int d = 1;

    public ActivityRecognitionResult(int i, List list, long j, long j2) {
        this.a = list;
        this.b = j;
        this.c = j2;
    }

    public int a() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityRecognitionResult [probableActivities=" + this.a + ", timeMillis=" + this.b + ", elapsedRealtimeMillis=" + this.c + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
