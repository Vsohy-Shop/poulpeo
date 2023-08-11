package p112h7;

import android.net.Uri;
import androidx.annotation.Nullable;
import p123i7.C8188a;
import p123i7.C8190c;
import p286y4.C10674h;

/* renamed from: h7.c */
/* compiled from: PendingDynamicLinkData */
public class C8026c {
    @Nullable

    /* renamed from: a */
    private final C8190c f11263a;
    @Nullable

    /* renamed from: b */
    private final C8188a f11264b;

    public C8026c(C8188a aVar) {
        if (aVar == null) {
            this.f11264b = null;
            this.f11263a = null;
            return;
        }
        if (aVar.mo42081A() == 0) {
            aVar.mo42087K(C10674h.m22680c().mo33547a());
        }
        this.f11264b = aVar;
        this.f11263a = new C8190c(aVar);
    }

    @Nullable
    /* renamed from: a */
    public Uri mo41857a() {
        String F;
        C8188a aVar = this.f11264b;
        if (aVar == null || (F = aVar.mo42082F()) == null) {
            return null;
        }
        return Uri.parse(F);
    }
}
