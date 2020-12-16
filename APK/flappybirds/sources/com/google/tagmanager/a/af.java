package com.google.tagmanager.a;

import java.io.IOException;

public class af extends IOException {
    private am a = null;

    public af(String str) {
        super(str);
    }

    static af b() {
        return new af("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static af c() {
        return new af("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static af d() {
        return new af("CodedInputStream encountered a malformed varint.");
    }

    static af e() {
        return new af("Protocol message contained an invalid tag (zero).");
    }

    static af f() {
        return new af("Protocol message end-group tag did not match expected tag.");
    }

    static af g() {
        return new af("Protocol message tag had invalid wire type.");
    }

    static af h() {
        return new af("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static af i() {
        return new af("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static af j() {
        return new af("Protocol message had invalid UTF-8.");
    }

    public af a(am amVar) {
        this.a = amVar;
        return this;
    }

    public am a() {
        return this.a;
    }
}
