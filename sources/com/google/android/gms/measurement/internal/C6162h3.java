package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C4785c;
import p201q5.C9257d;
import p231t4.C9665c;

/* renamed from: com.google.android.gms.measurement.internal.h3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6162h3 extends C9665c<C9257d> {
    public C6162h3(Context context, Looper looper, C9665c.C9666a aVar, C9665c.C9667b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: k */
    public final int mo34955k() {
        return C4785c.f5063a;
    }

    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C9257d) {
            return (C9257d) queryLocalInterface;
        }
        return new C6096b3(iBinder);
    }
}
