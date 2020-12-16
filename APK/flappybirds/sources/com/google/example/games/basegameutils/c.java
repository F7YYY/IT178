package com.google.example.games.basegameutils;

public class c {
    int a;
    int b;

    public c(int i) {
        this(i, -100);
    }

    public c(int i, int i2) {
        this.a = 0;
        this.b = -100;
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "SignInFailureReason(serviceErrorCode:" + a.c(this.a) + (this.b == -100 ? ")" : ",activityResultCode:" + a.b(this.b) + ")");
    }
}
