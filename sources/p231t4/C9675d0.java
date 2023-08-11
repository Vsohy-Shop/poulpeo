package p231t4;

import android.content.Intent;
import p200q4.C9226f;

/* renamed from: t4.d0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C9675d0 extends C9678e0 {

    /* renamed from: b */
    final /* synthetic */ Intent f14431b;

    /* renamed from: c */
    final /* synthetic */ C9226f f14432c;

    C9675d0(Intent intent, C9226f fVar, int i) {
        this.f14431b = intent;
        this.f14432c = fVar;
    }

    /* renamed from: a */
    public final void mo44155a() {
        Intent intent = this.f14431b;
        if (intent != null) {
            this.f14432c.startActivityForResult(intent, 2);
        }
    }
}
