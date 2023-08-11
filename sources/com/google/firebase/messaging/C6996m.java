package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p276x5.C10410i;
import p286y4.C10680n;

/* renamed from: com.google.firebase.messaging.m */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class C6996m {

    /* renamed from: c */
    private static final Object f9329c = new Object();

    /* renamed from: d */
    private static C6998m1 f9330d;

    /* renamed from: a */
    private final Context f9331a;

    /* renamed from: b */
    private final Executor f9332b = C6993l.f9326b;

    public C6996m(@NonNull Context context) {
        this.f9331a = context;
    }

    /* renamed from: a */
    private static Task<Integer> m12379a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m12380b(context, "com.google.firebase.MESSAGING_EVENT").mo39965c(intent).mo35457h(C6993l.f9326b, C6983i.f9313a);
    }

    /* renamed from: b */
    private static C6998m1 m12380b(Context context, String str) {
        C6998m1 m1Var;
        synchronized (f9329c) {
            if (f9330d == null) {
                f9330d = new C6998m1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            m1Var = f9330d;
        }
        return m1Var;
    }

    /* renamed from: c */
    static /* synthetic */ Integer m12381c(Task task) {
        return -1;
    }

    /* renamed from: f */
    static /* synthetic */ Task m12384f(Context context, Intent intent, Task task) {
        if (!C10680n.m22704h() || ((Integer) task.mo35461l()).intValue() != 402) {
            return task;
        }
        return m12379a(context, intent).mo35457h(C6993l.f9326b, C6986j.f9316a);
    }

    @NonNull
    /* renamed from: g */
    public Task<Integer> mo39963g(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo39964h(this.f9331a, intent);
    }

    @NonNull
    /* renamed from: h */
    public Task<Integer> mo39964h(@NonNull Context context, @NonNull Intent intent) {
        boolean z = false;
        if (C10680n.m22704h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (!z || flags != 0) {
            return C10410i.m21829c(this.f9332b, new C6990k(context, intent)).mo35459j(this.f9332b, new C6980h(context, intent));
        }
        return m12379a(context, intent);
    }
}
