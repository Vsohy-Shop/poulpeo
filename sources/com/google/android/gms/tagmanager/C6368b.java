package com.google.android.gms.tagmanager;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;
import p254v5.C9945f;
import p254v5.C9948i;
import p254v5.C9952m;

/* renamed from: com.google.android.gms.tagmanager.b */
final class C6368b extends C9952m {

    /* renamed from: a */
    private final /* synthetic */ AppMeasurement f8473a;

    C6368b(AppMeasurement appMeasurement) {
        this.f8473a = appMeasurement;
    }

    /* renamed from: E2 */
    public final void mo35444E2(C9948i iVar) {
        this.f8473a.mo34694d(new C6369c(this, iVar));
    }

    /* renamed from: S1 */
    public final Map<String, Object> mo35445S1() {
        return this.f8473a.mo34689a(true);
    }

    /* renamed from: t1 */
    public final void mo35446t1(C9945f fVar) {
        this.f8473a.mo34692c(new C6370d(this, fVar));
    }

    /* renamed from: z0 */
    public final void mo35447z0(String str, String str2, Bundle bundle, long j) {
        this.f8473a.mo34690b(str, str2, bundle, j);
    }
}
