package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.gtm.i4 */
final class C5382i4 implements C5367h4 {

    /* renamed from: a */
    private Handler f6050a;

    /* renamed from: b */
    final /* synthetic */ C5321e4 f6051b;

    private C5382i4(C5321e4 e4Var) {
        this.f6051b = e4Var;
        this.f6050a = new C5259a2(e4Var.f5957a.getMainLooper(), new C5397j4(this));
    }

    /* renamed from: c */
    private final Message m8036c() {
        return this.f6050a.obtainMessage(1, C5321e4.f5955n);
    }

    /* renamed from: a */
    public final void mo33233a() {
        this.f6050a.removeMessages(1, C5321e4.f5955n);
        this.f6050a.sendMessage(m8036c());
    }

    /* renamed from: b */
    public final void mo33234b(long j) {
        this.f6050a.removeMessages(1, C5321e4.f5955n);
        this.f6050a.sendMessageDelayed(m8036c(), j);
    }

    public final void cancel() {
        this.f6050a.removeMessages(1, C5321e4.f5955n);
    }

    /* synthetic */ C5382i4(C5321e4 e4Var, C5336f4 f4Var) {
        this(e4Var);
    }
}
