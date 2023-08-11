package p231t4;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: t4.f1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9682f1 extends C9720r0 {

    /* renamed from: g */
    final /* synthetic */ C9665c f14458g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C9682f1(C9665c cVar, @Nullable int i, Bundle bundle) {
        super(cVar, i, (Bundle) null);
        this.f14458g = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo44185f(ConnectionResult connectionResult) {
        if (!this.f14458g.mo44150t() || !C9665c.m20129i0(this.f14458g)) {
            this.f14458g.f14400q.mo32571a(connectionResult);
            this.f14458g.mo42809M(connectionResult);
            return;
        }
        C9665c.m20126e0(this.f14458g, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo44186g() {
        this.f14458g.f14400q.mo32571a(ConnectionResult.f4869f);
        return true;
    }
}
