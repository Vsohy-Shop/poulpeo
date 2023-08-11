package p231t4;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: t4.c1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9672c1 extends C9723s0 {
    @Nullable

    /* renamed from: a */
    private C9665c f14414a;

    /* renamed from: b */
    private final int f14415b;

    public C9672c1(@NonNull C9665c cVar, int i) {
        this.f14414a = cVar;
        this.f14415b = i;
    }

    @BinderThread
    /* renamed from: E1 */
    public final void mo44156E1(int i, @NonNull IBinder iBinder, @NonNull C9688h1 h1Var) {
        C9665c cVar = this.f14414a;
        C9713p.m20276k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C9713p.m20275j(h1Var);
        C9665c.m20125d0(cVar, h1Var);
        mo44158y1(i, iBinder, h1Var.f14470b);
    }

    @BinderThread
    /* renamed from: Q0 */
    public final void mo44157Q0(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @BinderThread
    /* renamed from: y1 */
    public final void mo44158y1(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        C9713p.m20276k(this.f14414a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f14414a.mo42810O(i, iBinder, bundle, this.f14415b);
        this.f14414a = null;
    }
}
