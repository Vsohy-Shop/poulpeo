package p253v4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p121i5.C8183d;
import p180o4.C8974c;
import p200q4.C9222d;
import p200q4.C9230h;
import p231t4.C9673d;
import p231t4.C9683g;
import p231t4.C9734w;

/* renamed from: v4.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9939e extends C9683g<C9935a> {

    /* renamed from: J */
    private final C9734w f14936J;

    public C9939e(Context context, Looper looper, C9673d dVar, C9734w wVar, C9222d dVar2, C9230h hVar) {
        super(context, looper, 270, dVar, dVar2, hVar);
        this.f14936J = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Bundle mo41420A() {
        return this.f14936J.mo44262b();
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo44128J() {
        return true;
    }

    /* renamed from: k */
    public final int mo34955k() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C9935a) {
            return (C9935a) queryLocalInterface;
        }
        return new C9935a(iBinder);
    }

    /* renamed from: v */
    public final C8974c[] mo42784v() {
        return C8183d.f11506b;
    }
}
