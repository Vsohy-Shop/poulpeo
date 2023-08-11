package p296z3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.C5316e;
import com.google.android.gms.internal.gtm.C5437m;
import com.google.android.gms.internal.gtm.C5590vd;
import java.util.ListIterator;
import p231t4.C9713p;

/* renamed from: z3.g */
public class C10803g extends C10811o<C10803g> {

    /* renamed from: d */
    private final C5437m f16536d;

    /* renamed from: e */
    private boolean f16537e;

    public C10803g(C5437m mVar) {
        super(mVar.mo33332g(), mVar.mo33329d());
        this.f16536d = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45731a(C10808l lVar) {
        C5590vd vdVar = (C5590vd) lVar.mo45752n(C5590vd.class);
        if (TextUtils.isEmpty(vdVar.mo33587j())) {
            vdVar.mo33582e(this.f16536d.mo33344s().mo33207U0());
        }
        if (this.f16537e && TextUtils.isEmpty(vdVar.mo33589l())) {
            C5316e r = this.f16536d.mo33343r();
            vdVar.mo33595r(r.mo33183T0());
            vdVar.mo33584g(r.mo33182S0());
        }
    }

    /* renamed from: b */
    public final C10808l mo45732b() {
        C10808l d = this.f16556b.mo45742d();
        d.mo45741c(this.f16536d.mo33337l().mo33622R0());
        d.mo45741c(this.f16536d.mo33338m().mo33508R0());
        mo45755d(d);
        return d;
    }

    /* renamed from: e */
    public final void mo45733e(boolean z) {
        this.f16537e = z;
    }

    /* renamed from: f */
    public final void mo45734f(String str) {
        C9713p.m20271f(str);
        Uri S0 = C10804h.m23021S0(str);
        ListIterator<C10819t> listIterator = this.f16556b.mo45744f().listIterator();
        while (listIterator.hasNext()) {
            if (S0.equals(listIterator.next().mo45737b())) {
                listIterator.remove();
            }
        }
        this.f16556b.mo45744f().add(new C10804h(this.f16536d, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C5437m mo45735g() {
        return this.f16536d;
    }
}
