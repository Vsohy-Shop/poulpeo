package p150l4;

import androidx.annotation.Nullable;

/* renamed from: l4.p */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C8703p implements C8712u {

    /* renamed from: a */
    final /* synthetic */ C8712u f12458a;

    /* renamed from: b */
    final /* synthetic */ C8709s f12459b;

    C8703p(C8709s sVar, C8712u uVar) {
        this.f12459b = sVar;
        this.f12458a = uVar;
    }

    /* renamed from: a */
    public final void mo32238a(long j) {
        C8712u uVar = this.f12458a;
        if (uVar != null) {
            uVar.mo32238a(j);
        }
    }

    /* renamed from: b */
    public final void mo32239b(long j, int i, @Nullable Object obj) {
        if (this.f12458a != null) {
            if (i == 2001) {
                C8709s sVar = this.f12459b;
                sVar.f12428a.mo42759f("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(sVar.f12502i));
                this.f12459b.f12501h.mo32107z();
                i = 2001;
            }
            this.f12458a.mo32239b(j, i, obj);
        }
    }
}
