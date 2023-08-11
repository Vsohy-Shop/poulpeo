package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public class zzkh extends IOException {
    public zzkh(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzkg m10400a() {
        return new zzkg("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static zzkh m10401b() {
        return new zzkh("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static zzkh m10402c() {
        return new zzkh("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static zzkh m10403d() {
        return new zzkh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static zzkh m10404e() {
        return new zzkh("Failed to parse the message.");
    }

    /* renamed from: f */
    static zzkh m10405f() {
        return new zzkh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
