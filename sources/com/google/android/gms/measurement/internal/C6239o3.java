package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import java.util.Map;
import p201q5.C9259f;
import p231t4.C9713p;

@WorkerThread
/* renamed from: com.google.android.gms.measurement.internal.o3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6239o3 implements Runnable {

    /* renamed from: b */
    private final C6228n3 f8045b;

    /* renamed from: c */
    private final int f8046c;

    /* renamed from: d */
    private final Throwable f8047d;

    /* renamed from: e */
    private final byte[] f8048e;

    /* renamed from: f */
    private final String f8049f;

    /* renamed from: g */
    private final Map<String, List<String>> f8050g;

    /* synthetic */ C6239o3(String str, C6228n3 n3Var, int i, Throwable th, byte[] bArr, Map map, C9259f fVar) {
        C9713p.m20275j(n3Var);
        this.f8045b = n3Var;
        this.f8046c = i;
        this.f8047d = th;
        this.f8048e = bArr;
        this.f8049f = str;
        this.f8050g = map;
    }

    public final void run() {
        this.f8045b.mo34748a(this.f8049f, this.f8046c, this.f8047d, this.f8048e, this.f8050g);
    }
}
