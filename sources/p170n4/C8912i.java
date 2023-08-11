package p170n4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: n4.i */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C8912i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C8905b f12933b;

    /* renamed from: c */
    public final /* synthetic */ Intent f12934c;

    /* renamed from: d */
    public final /* synthetic */ Context f12935d;

    /* renamed from: e */
    public final /* synthetic */ boolean f12936e;

    /* renamed from: f */
    public final /* synthetic */ BroadcastReceiver.PendingResult f12937f;

    public /* synthetic */ C8912i(C8905b bVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f12933b = bVar;
        this.f12934c = intent;
        this.f12935d = context;
        this.f12936e = z;
        this.f12937f = pendingResult;
    }

    public final void run() {
        this.f12933b.mo43043d(this.f12934c, this.f12935d, this.f12936e, this.f12937f);
    }
}
