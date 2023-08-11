package p231t4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: t4.e1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9679e1 extends C9720r0 {
    @Nullable

    /* renamed from: g */
    public final IBinder f14441g;

    /* renamed from: h */
    final /* synthetic */ C9665c f14442h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C9679e1(C9665c cVar, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f14442h = cVar;
        this.f14441g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo44185f(ConnectionResult connectionResult) {
        if (this.f14442h.f14406w != null) {
            this.f14442h.f14406w.mo34795G(connectionResult);
        }
        this.f14442h.mo42809M(connectionResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo44186g() {
        try {
            IBinder iBinder = this.f14441g;
            C9713p.m20275j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f14442h.mo34953F().equals(interfaceDescriptor)) {
                String F = this.f14442h.mo34953F();
                StringBuilder sb = new StringBuilder(String.valueOf(F).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(F);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface s = this.f14442h.mo34956s(this.f14441g);
            if (s == null || (!C9665c.m20128h0(this.f14442h, 2, 4, s) && !C9665c.m20128h0(this.f14442h, 3, 4, s))) {
                return false;
            }
            this.f14442h.f14381A = null;
            Bundle x = this.f14442h.mo42811x();
            C9665c cVar = this.f14442h;
            if (cVar.f14405v == null) {
                return true;
            }
            cVar.f14405v.mo34796J(x);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
