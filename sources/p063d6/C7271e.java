package p063d6;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p099g6.C7790l;

/* renamed from: d6.e */
final class C7271e extends ResultReceiver {

    /* renamed from: b */
    final /* synthetic */ C7790l f9998b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7271e(Handler handler, C7790l lVar) {
        super(handler);
        this.f9998b = lVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f9998b.mo41438e(null);
    }
}
