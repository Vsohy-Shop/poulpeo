package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5756g6 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f6955a;

    C5756g6(Map<String, Map<String, String>> map) {
        this.f6955a = map;
    }

    /* renamed from: a */
    public final String mo34040a(Uri uri, String str, String str2, String str3) {
        Map map;
        String str4;
        if (uri == null || (map = this.f6955a.get(uri.toString())) == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "".concat(valueOf);
        } else {
            str4 = new String("");
        }
        return (String) map.get(str4);
    }
}
