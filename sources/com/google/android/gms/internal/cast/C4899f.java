package com.google.android.gms.internal.cast;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.f */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4899f {
    /* renamed from: a */
    public static Map m6957a(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C4848c1.m6833e();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
