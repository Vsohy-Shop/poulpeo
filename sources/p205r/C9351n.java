package p205r;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import coil.request.BaseRequestDelegate;
import coil.request.NullRequestDataException;
import coil.request.ViewTargetRequestDelegate;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p215s.C9406c;
import p215s.C9413h;
import p215s.C9414i;
import p226t.C9587a;
import p226t.C9588b;
import p259w.C10061a;
import p259w.C10066f;
import p259w.C10068h;
import p259w.C10070i;
import p259w.C10075m;
import p259w.C10080q;
import p259w.C10082s;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestService.kt\ncoil/request/RequestService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* renamed from: r.n */
/* compiled from: RequestService.kt */
public final class C9351n {

    /* renamed from: a */
    private final C7539e f13896a;

    /* renamed from: b */
    private final C10082s f13897b;

    /* renamed from: c */
    private final C10075m f13898c;

    public C9351n(C7539e eVar, C10082s sVar, C10080q qVar) {
        this.f13896a = eVar;
        this.f13897b = sVar;
        this.f13898c = C10066f.m21135a(qVar);
    }

    /* renamed from: d */
    private final boolean m19353d(C9339g gVar, C9414i iVar) {
        if (!C10061a.m21123d(gVar.mo43711j())) {
            return true;
        }
        if (!mo43766c(gVar, gVar.mo43711j()) || !this.f13898c.mo44649a(iVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m19354e(C9339g gVar) {
        if (gVar.mo43703O().isEmpty() || C12710p.m28377E(C10070i.m21155o(), gVar.mo43711j())) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo43764a(C9345k kVar) {
        if (!C10061a.m21123d(kVar.mo43741f()) || this.f13898c.mo44650b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C9336e mo43765b(C9339g gVar, Throwable th) {
        Drawable drawable;
        if (th instanceof NullRequestDataException) {
            drawable = gVar.mo43722u();
            if (drawable == null) {
                drawable = gVar.mo43721t();
            }
        } else {
            drawable = gVar.mo43721t();
        }
        return new C9336e(drawable, gVar, th);
    }

    /* renamed from: c */
    public final boolean mo43766c(C9339g gVar, Bitmap.Config config) {
        boolean z;
        if (!C10061a.m21123d(config)) {
            return true;
        }
        if (!gVar.mo43708h()) {
            return false;
        }
        C9587a M = gVar.mo43701M();
        if (M instanceof C9588b) {
            View view = ((C9588b) M).getView();
            if (!view.isAttachedToWindow() || view.isHardwareAccelerated()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C9345k mo43767f(C9339g gVar, C9414i iVar) {
        boolean z;
        Bitmap.Config config;
        C9332a aVar;
        C9413h hVar;
        boolean z2;
        if (!m19354e(gVar) || !m19353d(gVar, iVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            config = gVar.mo43711j();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config2 = config;
        if (this.f13897b.mo44659b()) {
            aVar = gVar.mo43692D();
        } else {
            aVar = C9332a.DISABLED;
        }
        C9332a aVar2 = aVar;
        C9406c b = iVar.mo43835b();
        C9406c.C9408b bVar = C9406c.C9408b.f13982a;
        if (C12775o.m28634d(b, bVar) || C12775o.m28634d(iVar.mo43834a(), bVar)) {
            hVar = C9413h.FIT;
        } else {
            hVar = gVar.mo43698J();
        }
        C9413h hVar2 = hVar;
        if (!gVar.mo43710i() || !gVar.mo43703O().isEmpty() || config2 == Bitmap.Config.ALPHA_8) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new C9345k(gVar.mo43713l(), config2, gVar.mo43712k(), iVar, hVar2, C10068h.m21137a(gVar), z2, gVar.mo43697I(), gVar.mo43719r(), gVar.mo43725x(), gVar.mo43700L(), gVar.mo43693E(), gVar.mo43691C(), gVar.mo43720s(), aVar2);
    }

    /* renamed from: g */
    public final C9350m mo43768g(C9339g gVar, C14054y1 y1Var) {
        Lifecycle z = gVar.mo43727z();
        C9587a M = gVar.mo43701M();
        if (!(M instanceof C9588b)) {
            return new BaseRequestDelegate(z, y1Var);
        }
        return new ViewTargetRequestDelegate(this.f13896a, gVar, (C9588b) M, z, y1Var);
    }
}
