package com.google.tagmanager.a;

public enum bm {
    DOUBLE(br.DOUBLE, 1),
    FLOAT(br.FLOAT, 5),
    INT64(br.LONG, 0),
    UINT64(br.LONG, 0),
    INT32(br.INT, 0),
    FIXED64(br.LONG, 1),
    FIXED32(br.INT, 5),
    BOOL(br.BOOLEAN, 0),
    GROUP(br.MESSAGE, 3),
    MESSAGE(br.MESSAGE, 2),
    BYTES(br.BYTE_STRING, 2),
    UINT32(br.INT, 0),
    ENUM(br.ENUM, 0),
    SFIXED32(br.INT, 5),
    SFIXED64(br.LONG, 1),
    SINT32(br.INT, 0),
    SINT64(br.LONG, 0);
    
    private final br s;
    private final int t;

    private bm(br brVar, int i2) {
        this.s = brVar;
        this.t = i2;
    }

    public br a() {
        return this.s;
    }

    public int b() {
        return this.t;
    }

    public boolean c() {
        return true;
    }
}
