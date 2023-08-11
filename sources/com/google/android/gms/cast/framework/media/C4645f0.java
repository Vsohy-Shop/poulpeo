package com.google.android.gms.cast.framework.media;

import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.media.f0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4645f0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Set f4686a;

    /* renamed from: b */
    private final long f4687b;

    /* renamed from: c */
    private final Runnable f4688c;

    /* renamed from: d */
    private boolean f4689d;

    /* renamed from: e */
    final /* synthetic */ C4648h f4690e;

    /* renamed from: b */
    public final void mo32109b() {
        this.f4690e.f4730b.removeCallbacks(this.f4688c);
        this.f4689d = true;
        this.f4690e.f4730b.postDelayed(this.f4688c, this.f4687b);
    }

    /* renamed from: c */
    public final void mo32110c() {
        this.f4690e.f4730b.removeCallbacks(this.f4688c);
        this.f4689d = false;
    }

    /* renamed from: d */
    public final boolean mo32111d() {
        return this.f4689d;
    }
}
