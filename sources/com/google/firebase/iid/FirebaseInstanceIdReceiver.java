package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.firebase.messaging.C6987j0;
import com.google.firebase.messaging.C6996m;
import java.util.concurrent.ExecutionException;
import p170n4.C8904a;
import p170n4.C8905b;
import p276x5.C10410i;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class FirebaseInstanceIdReceiver extends C8905b {
    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public final int mo39791b(@NonNull Context context, @NonNull C8904a aVar) {
        try {
            return ((Integer) C10410i.m21827a(new C6996m(context).mo39963g(aVar.mo43040A()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: c */
    public final void mo39792c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C6987j0.m12313B(putExtras)) {
            C6987j0.m12333s(putExtras);
        }
    }
}
