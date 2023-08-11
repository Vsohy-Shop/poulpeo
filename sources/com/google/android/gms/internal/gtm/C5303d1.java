package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.d1 */
public final class C5303d1 extends C5511qa implements C5288c1 {
    C5303d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: f2 */
    public final void mo33153f2(Map map, long j, String str, List<C5378i0> list) {
        Parcel E = mo33480E();
        E.writeMap(map);
        E.writeLong(j);
        E.writeString(str);
        E.writeTypedList(list);
        mo33482J(1, E);
    }
}
