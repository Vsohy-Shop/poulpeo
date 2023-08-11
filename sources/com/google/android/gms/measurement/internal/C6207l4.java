package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6207l4<V> extends FutureTask<V> implements Comparable<C6207l4<V>> {

    /* renamed from: b */
    private final long f7947b;

    /* renamed from: c */
    final boolean f7948c;

    /* renamed from: d */
    private final String f7949d;

    /* renamed from: e */
    final /* synthetic */ C6229n4 f7950e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6207l4(C6229n4 n4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f7950e = n4Var;
        C9713p.m20275j(str);
        long andIncrement = C6229n4.f7998l.getAndIncrement();
        this.f7947b = andIncrement;
        this.f7949d = str;
        this.f7948c = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            n4Var.f7899a.mo34920b().mo35075r().mo35037a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        C6207l4 l4Var = (C6207l4) obj;
        boolean z = this.f7948c;
        if (z == l4Var.f7948c) {
            int i = (this.f7947b > l4Var.f7947b ? 1 : (this.f7947b == l4Var.f7947b ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                return 1;
            }
            this.f7950e.f7899a.mo34920b().mo35077t().mo35038b("Two tasks share the same index. index", Long.valueOf(this.f7947b));
            return 0;
        } else if (!z) {
            return 1;
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f7950e.f7899a.mo34920b().mo35075r().mo35038b(this.f7949d, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6207l4(C6229n4 n4Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f7950e = n4Var;
        C9713p.m20275j("Task exception on worker thread");
        long andIncrement = C6229n4.f7998l.getAndIncrement();
        this.f7947b = andIncrement;
        this.f7949d = "Task exception on worker thread";
        this.f7948c = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            n4Var.f7899a.mo34920b().mo35075r().mo35037a("Tasks index overflow");
        }
    }
}
