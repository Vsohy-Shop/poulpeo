package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6039xc;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6174i4 implements C6039xc {

    /* renamed from: a */
    final /* synthetic */ String f7863a;

    /* renamed from: b */
    final /* synthetic */ C6185j4 f7864b;

    C6174i4(C6185j4 j4Var, String str) {
        this.f7864b = j4Var;
        this.f7863a = str;
    }

    /* renamed from: a */
    public final String mo34613a(String str) {
        Map map = (Map) this.f7864b.f7891d.get(this.f7863a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
