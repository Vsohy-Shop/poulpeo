package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4721b;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import p190p4.C9056e;
import p200q4.C9220c;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4742b<R extends C9056e, A extends C4719a.C4721b> extends BasePendingResult<R> implements C9220c<R> {

    /* renamed from: o */
    private final C4719a.C4722c<A> f4943o;
    @Nullable

    /* renamed from: p */
    private final C4719a<?> f4944p;

    protected C4742b(@NonNull C4719a<?> aVar, @NonNull C4733c cVar) {
        super((C4733c) C9713p.m20276k(cVar, "GoogleApiClient must not be null"));
        C9713p.m20276k(aVar, "Api must not be null");
        this.f4943o = aVar.mo32389b();
        this.f4944p = aVar;
    }

    /* renamed from: s */
    private void m6497s(@NonNull RemoteException remoteException) {
        mo32474t(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo32470a(@NonNull Object obj) {
        super.mo32442j((C9056e) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo32471p(@NonNull A a);

    /* renamed from: r */
    public final void mo32473r(@NonNull A a) {
        try {
            mo32471p(a);
        } catch (DeadObjectException e) {
            m6497s(e);
            throw e;
        } catch (RemoteException e2) {
            m6497s(e2);
        }
    }

    /* renamed from: t */
    public final void mo32474t(@NonNull Status status) {
        C9713p.m20267b(!status.mo32381I(), "Failed result must not be success");
        C9056e f = mo32075f(status);
        mo32442j(f);
        mo32472q(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo32472q(@NonNull R r) {
    }
}
