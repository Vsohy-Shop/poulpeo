package p413qa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10865d;
import p440ud.C13548a;
import p440ud.C13572p;
import p440ud.C13574r;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;

/* renamed from: qa.h */
/* compiled from: SocialSignUpWarningController */
public class C13227h extends C10865d {

    /* renamed from: qa.h$a */
    /* compiled from: SocialSignUpWarningController */
    public static class C13228a extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final boolean f21039d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final boolean f21040e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final boolean f21041f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13574r f21042g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13548a f21043h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13548a f21044i;

        public C13228a(@NonNull ContextContainer contextContainer, boolean z, boolean z2, boolean z3, @NonNull C13574r rVar, @NonNull C13572p pVar, @NonNull C13548a aVar, @NonNull C13548a aVar2) {
            super(contextContainer, (LogoutListener) null);
            this.f21039d = z;
            this.f21040e = z2;
            this.f21041f = z3;
            this.f21042g = rVar;
            this.f21043h = aVar;
            this.f21044i = aVar2;
        }
    }

    public C13227h(@NonNull C13229i iVar, @NonNull C13228a aVar) {
        super(iVar, aVar);
        m30027z2().f21042g.mo53229f(new C13224e(this));
        m30027z2().f21043h.mo53229f(new C13225f(this));
        m30027z2().f21044i.mo53229f(new C13226g(this));
    }

    @NonNull
    /* renamed from: r2 */
    private String m30023r2() {
        if (m30027z2().f21039d) {
            return "signup-facebook";
        }
        if (m30027z2().f21040e) {
            return "signup-google";
        }
        if (m30027z2().f21041f) {
            return "signup-apple";
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void m30024s2(C13574r rVar) {
        mo52867q2().mo46305S();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void m30025t2(C13574r rVar) {
        C13618g.f21930b.mo53279c("social-signup-warning", "validate", m30023r2());
        mo52867q2().mo46304L1(m30027z2().f21039d, m30027z2().f21040e, m30027z2().f21041f);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void m30026u2(C13574r rVar) {
        C13618g.f21930b.mo53279c("social-signup-warning", "cancel", m30023r2());
        mo52867q2().mo46305S();
    }

    @NonNull
    /* renamed from: z2 */
    private C13228a m30027z2() {
        return (C13228a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: q2 */
    public C13229i mo52867q2() {
        return (C13229i) this.f16655b;
    }

    /* renamed from: y2 */
    public void mo52871y2() {
        C13618g.f21930b.mo53280e(new C13615d("social-signup-warning", C13617f.SIGN_UP));
    }

    /* renamed from: v2 */
    public void mo52868v2() {
    }

    /* renamed from: w2 */
    public void mo52869w2() {
    }

    /* renamed from: x2 */
    public void mo52870x2() {
    }
}
