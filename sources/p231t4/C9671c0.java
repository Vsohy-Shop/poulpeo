package p231t4;

import android.app.Activity;
import android.content.Intent;

/* renamed from: t4.c0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C9671c0 extends C9678e0 {

    /* renamed from: b */
    final /* synthetic */ Intent f14411b;

    /* renamed from: c */
    final /* synthetic */ Activity f14412c;

    /* renamed from: d */
    final /* synthetic */ int f14413d;

    C9671c0(Intent intent, Activity activity, int i) {
        this.f14411b = intent;
        this.f14412c = activity;
        this.f14413d = i;
    }

    /* renamed from: a */
    public final void mo44155a() {
        Intent intent = this.f14411b;
        if (intent != null) {
            this.f14412c.startActivityForResult(intent, this.f14413d);
        }
    }
}
