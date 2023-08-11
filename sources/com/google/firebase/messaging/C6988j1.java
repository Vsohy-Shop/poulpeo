package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C6998m1;

/* renamed from: com.google.firebase.messaging.j1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6988j1 extends Binder {

    /* renamed from: a */
    private final C6989a f9317a;

    /* renamed from: com.google.firebase.messaging.j1$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    interface C6989a {
        /* renamed from: a */
        Task<Void> mo39928a(Intent intent);
    }

    C6988j1(C6989a aVar) {
        this.f9317a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39935b(C6998m1.C6999a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f9317a.mo39928a(aVar.f9339a).mo35451b(C6985i1.f9315b, new C6982h1(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
