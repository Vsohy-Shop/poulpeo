package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.gtm.bc */
public final class C5284bc {

    /* renamed from: a */
    private final ScheduledExecutorService f5884a;

    /* renamed from: b */
    private ScheduledFuture<?> f5885b;

    /* renamed from: c */
    private String f5886c;

    /* renamed from: d */
    private boolean f5887d;

    public C5284bc() {
        this(C5593w1.m8623a().mo33574b(1, C5635z1.f6756a));
    }

    /* renamed from: a */
    public final void mo33141a(Context context, C5449mb mbVar, long j, C5313db dbVar) {
        synchronized (this) {
            ScheduledFuture<?> scheduledFuture = this.f5885b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f5885b = this.f5884a.schedule(new C5269ac(context, mbVar, dbVar), 0, TimeUnit.MILLISECONDS);
        }
    }

    private C5284bc(ScheduledExecutorService scheduledExecutorService) {
        this.f5885b = null;
        this.f5886c = null;
        this.f5884a = scheduledExecutorService;
        this.f5887d = false;
    }
}
