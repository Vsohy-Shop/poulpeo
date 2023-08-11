package com.squareup.okhttp.internal.framed;

import okio.C13133f;

public final class Header {
    public static final C13133f RESPONSE_STATUS = C13133f.m29652e(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);
    public static final C13133f TARGET_AUTHORITY = C13133f.m29652e(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    public static final C13133f TARGET_HOST = C13133f.m29652e(":host");
    public static final C13133f TARGET_METHOD = C13133f.m29652e(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);
    public static final C13133f TARGET_PATH = C13133f.m29652e(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);
    public static final C13133f TARGET_SCHEME = C13133f.m29652e(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);
    public static final C13133f VERSION = C13133f.m29652e(":version");
    final int hpackSize;
    public final C13133f name;
    public final C13133f value;

    public Header(String str, String str2) {
        this(C13133f.m29652e(str), C13133f.m29652e(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (!this.name.equals(header.name) || !this.value.equals(header.value)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.name.mo52595N(), this.value.mo52595N()});
    }

    public Header(C13133f fVar, String str) {
        this(fVar, C13133f.m29652e(str));
    }

    public Header(C13133f fVar, C13133f fVar2) {
        this.name = fVar;
        this.value = fVar2;
        this.hpackSize = fVar.mo52590H() + 32 + fVar2.mo52590H();
    }
}
