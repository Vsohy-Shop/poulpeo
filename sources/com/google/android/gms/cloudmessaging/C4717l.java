package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p131j5.C8418e;
import p170n4.C8913j;
import p297z4.C10822b;

/* renamed from: com.google.android.gms.cloudmessaging.l */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C4717l {
    @Nullable

    /* renamed from: e */
    private static C4717l f4864e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f4865a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f4866b;

    /* renamed from: c */
    private C4712g f4867c = new C4712g(this, (C8913j) null);

    /* renamed from: d */
    private int f4868d = 1;

    @VisibleForTesting
    C4717l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f4866b = scheduledExecutorService;
        this.f4865a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C4717l m6363b(Context context) {
        C4717l lVar;
        synchronized (C4717l.class) {
            if (f4864e == null) {
                C8418e.m16837a();
                f4864e = new C4717l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C10822b("MessengerIpcClient"))));
            }
            lVar = f4864e;
        }
        return lVar;
    }

    /* renamed from: f */
    private final synchronized int m6365f() {
        int i;
        i = this.f4868d;
        this.f4868d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> Task<T> m6366g(C4715j<T> jVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(jVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f4867c.mo32323g(jVar)) {
            C4712g gVar = new C4712g(this, (C8913j) null);
            this.f4867c = gVar;
            gVar.mo32323g(jVar);
        }
        return jVar.f4861b.mo45096a();
    }

    /* renamed from: c */
    public final Task<Void> mo32332c(int i, Bundle bundle) {
        return m6366g(new C4714i(m6365f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task<Bundle> mo32333d(int i, Bundle bundle) {
        return m6366g(new C4716k(m6365f(), 1, bundle));
    }
}
