package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: b */
    private C7149p0 f9501b = null;

    /* renamed from: c */
    private boolean f9502c;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: b */
    static InvalidProtocolBufferException m12752b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static InvalidProtocolBufferException m12753c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static InvalidProtocolBufferException m12754d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static InvalidWireTypeException m12755e() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static InvalidProtocolBufferException m12756f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    static InvalidProtocolBufferException m12757g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    static InvalidProtocolBufferException m12758h() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: i */
    static InvalidProtocolBufferException m12759i() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: l */
    static InvalidProtocolBufferException m12760l() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: m */
    static InvalidProtocolBufferException m12761m() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40145a() {
        return this.f9502c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo40146j() {
        this.f9502c = true;
    }

    /* renamed from: k */
    public InvalidProtocolBufferException mo40147k(C7149p0 p0Var) {
        this.f9501b = p0Var;
        return this;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
