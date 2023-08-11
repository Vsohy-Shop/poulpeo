package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import p130j4.C8395a;

/* renamed from: com.google.android.gms.cast.framework.media.o0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4668o0 implements C8395a {

    /* renamed from: a */
    final /* synthetic */ C4672q0 f4751a;

    /* renamed from: b */
    final /* synthetic */ MediaNotificationService f4752b;

    C4668o0(MediaNotificationService mediaNotificationService, C4672q0 q0Var) {
        this.f4752b = mediaNotificationService;
        this.f4751a = q0Var;
    }

    /* renamed from: a */
    public final void mo32220a(Bitmap bitmap) {
        C4672q0 q0Var = this.f4751a;
        q0Var.f4764b = bitmap;
        this.f4752b.f4646m = q0Var;
        this.f4752b.m6082h();
    }
}
