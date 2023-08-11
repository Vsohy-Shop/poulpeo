package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.gtm.j4 */
final class C5397j4 implements Handler.Callback {

    /* renamed from: b */
    private final /* synthetic */ C5382i4 f6060b;

    C5397j4(C5382i4 i4Var) {
        this.f6060b = i4Var;
    }

    public final boolean handleMessage(Message message) {
        if (1 == message.what && C5321e4.f5955n.equals(message.obj)) {
            this.f6060b.f6051b.mo33186c();
            if (!this.f6060b.f6051b.m7879d()) {
                C5382i4 i4Var = this.f6060b;
                i4Var.mo33234b((long) i4Var.f6051b.f5960d);
            }
        }
        return true;
    }
}
