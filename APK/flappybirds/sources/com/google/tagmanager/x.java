package com.google.tagmanager;

class x extends Number implements Comparable {
    private double a;
    private long b;
    private boolean c = true;

    private x(long j) {
        this.b = j;
    }

    public static x a(long j) {
        return new x(j);
    }

    /* renamed from: a */
    public int compareTo(x xVar) {
        return (!b() || !xVar.b()) ? Double.compare(doubleValue(), xVar.doubleValue()) : new Long(this.b).compareTo(Long.valueOf(xVar.b));
    }

    public boolean a() {
        return !b();
    }

    public boolean b() {
        return this.c;
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public long c() {
        return b() ? this.b : (long) this.a;
    }

    public int d() {
        return (int) longValue();
    }

    public double doubleValue() {
        return b() ? (double) this.b : this.a;
    }

    public short e() {
        return (short) ((int) longValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && compareTo((x) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return d();
    }

    public long longValue() {
        return c();
    }

    public short shortValue() {
        return e();
    }

    public String toString() {
        return b() ? Long.toString(this.b) : Double.toString(this.a);
    }
}
