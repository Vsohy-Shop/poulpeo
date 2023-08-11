package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6022wb;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final /* synthetic */ class C6130e4 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C6185j4 f7739b;

    /* renamed from: c */
    public final /* synthetic */ String f7740c;

    public /* synthetic */ C6130e4(C6185j4 j4Var, String str) {
        this.f7739b = j4Var;
        this.f7740c = str;
    }

    public final Object call() {
        return new C6022wb("internal.remoteConfig", new C6174i4(this.f7739b, this.f7740c));
    }
}
