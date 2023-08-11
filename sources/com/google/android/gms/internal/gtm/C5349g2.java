package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p231t4.C9713p;
import p254v5.C9951l;
import p286y4.C10671e;

/* renamed from: com.google.android.gms.internal.gtm.g2 */
public final class C5349g2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f5994a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f5995b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f5996c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f5997d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5261a4 f5998e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5328eb f5999f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ExecutorService f6000g;

    /* renamed from: h */
    private final ScheduledExecutorService f6001h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C9951l f6002i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C10671e f6003j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5488p2 f6004k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5580v3 f6005l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile int f6006m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<C5564u2> f6007n = new ArrayList();

    /* renamed from: o */
    private ScheduledFuture<?> f6008o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f6009p = false;

    C5349g2(Context context, String str, @Nullable String str2, @Nullable String str3, C5261a4 a4Var, C5328eb ebVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, C9951l lVar, C10671e eVar, C5488p2 p2Var) {
        this.f5994a = context;
        String str4 = (String) C9713p.m20275j(str);
        this.f5995b = str4;
        this.f5998e = (C5261a4) C9713p.m20275j(a4Var);
        this.f5999f = (C5328eb) C9713p.m20275j(ebVar);
        ExecutorService executorService2 = (ExecutorService) C9713p.m20275j(executorService);
        this.f6000g = executorService2;
        this.f6001h = (ScheduledExecutorService) C9713p.m20275j(scheduledExecutorService);
        C9951l lVar2 = (C9951l) C9713p.m20275j(lVar);
        this.f6002i = lVar2;
        this.f6003j = (C10671e) C9713p.m20275j(eVar);
        this.f6004k = (C5488p2) C9713p.m20275j(p2Var);
        this.f5996c = str3;
        this.f5997d = str2;
        this.f6007n.add(new C5564u2("gtm.load", new Bundle(), "gtm", new Date(), false, lVar2));
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 35);
        sb.append("Container ");
        sb.append(str4);
        sb.append("is scheduled for loading.");
        C5426l3.m8133c(sb.toString());
        executorService2.execute(new C5410k2(this, (C5365h2) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m7973v(long j) {
        ScheduledFuture<?> scheduledFuture = this.f6008o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        String str = this.f5995b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
        sb.append("Refresh container ");
        sb.append(str);
        sb.append(" in ");
        sb.append(j);
        sb.append("ms.");
        C5426l3.m8133c(sb.toString());
        this.f6008o = this.f6001h.schedule(new C5380i2(this), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo33217a() {
        this.f6000g.execute(new C5365h2(this));
    }

    /* renamed from: g */
    public final void mo33218g(C5564u2 u2Var) {
        this.f6000g.execute(new C5425l2(this, u2Var));
    }
}
