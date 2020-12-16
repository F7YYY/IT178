package com.google.tagmanager.a;

public enum br {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(h.a),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object j;

    private br(Object obj) {
        this.j = obj;
    }
}
