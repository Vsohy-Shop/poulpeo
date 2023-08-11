package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;
import okio.C13133f;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        try {
            String a = C13133f.m29655v((str + ":" + str2).getBytes("ISO-8859-1")).mo52597a();
            return "Basic " + a;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
