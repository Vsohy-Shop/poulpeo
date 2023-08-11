package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C4648h;
import com.google.android.gms.cast.internal.zzaq;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p150l4.C8712u;
import p190p4.C9056e;

/* renamed from: com.google.android.gms.cast.framework.media.b0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
abstract class C4636b0 extends BasePendingResult {

    /* renamed from: o */
    private C8712u f4661o;

    /* renamed from: p */
    private final boolean f4662p;

    /* renamed from: q */
    final /* synthetic */ C4648h f4663q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4636b0(C4648h hVar, boolean z) {
        super((C4733c) null);
        this.f4663q = hVar;
        this.f4662p = z;
    }

    /* renamed from: f */
    public final /* synthetic */ C9056e mo32075f(Status status) {
        return new C4634a0(this, status);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo32076p();

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C8712u mo32077q() {
        if (this.f4661o == null) {
            this.f4661o = new C4688z(this);
        }
        return this.f4661o;
    }

    /* renamed from: r */
    public final void mo32078r() {
        if (!this.f4662p) {
            for (C4648h.C4650b c : this.f4663q.f4736h) {
                c.mo32203c();
            }
            for (C4648h.C4649a f : this.f4663q.f4737i) {
                f.mo32192f();
            }
        }
        try {
            synchronized (this.f4663q.f4729a) {
                mo32076p();
            }
        } catch (zzaq unused) {
            mo32442j(new C4634a0(this, new Status(2100)));
        }
    }
}
