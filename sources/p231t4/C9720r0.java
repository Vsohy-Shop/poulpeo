package p231t4;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: t4.r0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C9720r0 extends C9664b1<Boolean> {

    /* renamed from: d */
    public final int f14530d;
    @Nullable

    /* renamed from: e */
    public final Bundle f14531e;

    /* renamed from: f */
    final /* synthetic */ C9665c f14532f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    protected C9720r0(C9665c cVar, @Nullable int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f14532f = cVar;
        this.f14530d = i;
        this.f14531e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo44117a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f14530d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo44186g()
            if (r3 != 0) goto L_0x001b
            t4.c r3 = r2.f14532f
            r3.m20130j0(r0, null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo44185f(r3)
        L_0x001b:
            return
        L_0x001c:
            t4.c r3 = r2.f14532f
            r3.m20130j0(r0, null)
            android.os.Bundle r3 = r2.f14531e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f14530d
            r3.<init>(r0, r1)
            r2.mo44185f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231t4.C9720r0.mo44117a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo44185f(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo44186g();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44118b() {
    }
}
