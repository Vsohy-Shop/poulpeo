package p123i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.api.C4733c;
import p123i7.C8201h;
import p123i7.C8203i;
import p231t4.C9673d;
import p231t4.C9683g;

/* renamed from: i7.e */
/* compiled from: DynamicLinksClient */
public class C8193e extends C9683g<C8203i> {
    public C8193e(Context context, Looper looper, C9673d dVar, C4733c.C4734a aVar, C4733c.C4735b bVar) {
        super(context, looper, 131, dVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public String mo34953F() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public String mo34954G() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    /* renamed from: T */
    public boolean mo42094T() {
        return true;
    }

    /* renamed from: k */
    public int mo34955k() {
        return C4785c.f5063a;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: n0 */
    public C8203i mo34956s(IBinder iBinder) {
        return C8203i.C8204a.m16244E(iBinder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo42096o0(C8201h.C8202a aVar, Bundle bundle) {
        try {
            ((C8203i) mo44125E()).mo42108O2(aVar, bundle);
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo42097p0(C8201h.C8202a aVar, @Nullable String str) {
        try {
            ((C8203i) mo44125E()).mo42107C0(aVar, str);
        } catch (RemoteException unused) {
        }
    }
}
