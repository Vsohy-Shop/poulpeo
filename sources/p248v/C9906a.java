package p248v;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.SourceDebugExtension;
import p135k.C8427b;
import p205r.C9336e;
import p205r.C9342h;
import p205r.C9352o;
import p215s.C9413h;

@SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* renamed from: v.a */
/* compiled from: CrossfadeTransition.kt */
public final class C9906a implements C9909c {

    /* renamed from: a */
    private final C9912d f14829a;

    /* renamed from: b */
    private final C9342h f14830b;

    /* renamed from: c */
    private final int f14831c;

    /* renamed from: d */
    private final boolean f14832d;

    /* renamed from: a */
    public void mo44432a() {
        boolean z;
        Drawable e = this.f14829a.mo30074e();
        Drawable a = this.f14830b.mo43683a();
        C9413h J = this.f14830b.mo43684b().mo43698J();
        int i = this.f14831c;
        C9342h hVar = this.f14830b;
        if (!(hVar instanceof C9352o) || !((C9352o) hVar).mo43770d()) {
            z = true;
        } else {
            z = false;
        }
        C8427b bVar = new C8427b(e, a, J, i, z, this.f14832d);
        C9342h hVar2 = this.f14830b;
        if (hVar2 instanceof C9352o) {
            this.f14829a.mo30071b(bVar);
        } else if (hVar2 instanceof C9336e) {
            this.f14829a.mo30072c(bVar);
        }
    }

    /* renamed from: b */
    public final int mo44433b() {
        return this.f14831c;
    }

    /* renamed from: c */
    public final boolean mo44434c() {
        return this.f14832d;
    }
}
