package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.z0 */
final class C5634z0 implements C5453n0<C5258a1> {

    /* renamed from: a */
    private final C5437m f6754a;

    /* renamed from: b */
    private final C5258a1 f6755b = new C5258a1();

    public C5634z0(C5437m mVar) {
        this.f6754a = mVar;
    }

    /* renamed from: F */
    public final void mo33375F(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f6755b.f5797a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.f6755b.f5798b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f6755b.f5799c = str2;
        } else {
            this.f6754a.mo33330e().mo33262E0("String xml configuration name not recognized", str);
        }
    }

    /* renamed from: G */
    public final /* synthetic */ C5423l0 mo33376G() {
        return this.f6755b;
    }

    /* renamed from: H */
    public final void mo33377H(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f6755b.f5800d = i;
        } else {
            this.f6754a.mo33330e().mo33262E0("Int xml configuration name not recognized", str);
        }
    }

    /* renamed from: J */
    public final void mo33379J(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.f6755b.f5801e = z ? 1 : 0;
            return;
        }
        this.f6754a.mo33330e().mo33262E0("Bool xml configuration name not recognized", str);
    }

    /* renamed from: I */
    public final void mo33378I(String str, String str2) {
    }
}
