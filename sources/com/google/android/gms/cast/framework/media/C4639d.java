package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.cast.C4692h;
import com.google.android.gms.cast.framework.media.C4648h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.C4968j0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;
import p150l4.C8673a;
import p150l4.C8675b;
import p190p4.C9052b;
import p231t4.C9713p;

@MainThread
/* renamed from: com.google.android.gms.cast.framework.media.d */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4639d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8675b f4668a = new C8675b("MediaQueue");
    @VisibleForTesting

    /* renamed from: b */
    long f4669b;

    /* renamed from: c */
    private final C4648h f4670c;
    @VisibleForTesting

    /* renamed from: d */
    List f4671d;
    @VisibleForTesting

    /* renamed from: e */
    final SparseIntArray f4672e;
    @VisibleForTesting

    /* renamed from: f */
    LruCache f4673f;
    @VisibleForTesting

    /* renamed from: g */
    final List f4674g;
    @VisibleForTesting

    /* renamed from: h */
    final Deque f4675h;

    /* renamed from: i */
    private final int f4676i;

    /* renamed from: j */
    private final Handler f4677j;

    /* renamed from: k */
    private final TimerTask f4678k;
    @Nullable

    /* renamed from: l */
    private C9052b f4679l;
    @Nullable

    /* renamed from: m */
    private C9052b f4680m;

    /* renamed from: n */
    private final Set f4681n = Collections.synchronizedSet(new HashSet());

    @VisibleForTesting
    C4639d(C4648h hVar, int i, int i2) {
        this.f4670c = hVar;
        this.f4676i = Math.max(20, 1);
        this.f4671d = new ArrayList();
        this.f4672e = new SparseIntArray();
        this.f4674g = new ArrayList();
        this.f4675h = new ArrayDeque(20);
        this.f4677j = new C4968j0(Looper.getMainLooper());
        this.f4678k = new C4678t0(this);
        hVar.mo32183w(new C4682v0(this));
        m6113t(20);
        this.f4669b = m6109p();
        mo32084o();
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m6102e(C4639d dVar, int i, int i2) {
        synchronized (dVar.f4681n) {
            for (C4640a a : dVar.f4681n) {
                a.mo32085a(i, i2);
            }
        }
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ void m6103f(C4639d dVar, int[] iArr) {
        synchronized (dVar.f4681n) {
            for (C4640a c : dVar.f4681n) {
                c.mo32087c(iArr);
            }
        }
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m6104g(C4639d dVar, List list, int i) {
        synchronized (dVar.f4681n) {
            for (C4640a d : dVar.f4681n) {
                d.mo32088d(list, i);
            }
        }
    }

    /* renamed from: j */
    static /* bridge */ /* synthetic */ void m6107j(C4639d dVar) {
        if (!dVar.f4675h.isEmpty() && dVar.f4679l == null && dVar.f4669b != 0) {
            C9052b J = dVar.f4670c.mo32152J(C8673a.m17456o(dVar.f4675h));
            dVar.f4679l = J;
            J.mo32438e(new C4676s0(dVar));
            dVar.f4675h.clear();
        }
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ void m6108k(C4639d dVar) {
        dVar.f4672e.clear();
        for (int i = 0; i < dVar.f4671d.size(); i++) {
            dVar.f4672e.put(((Integer) dVar.f4671d.get(i)).intValue(), i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final long m6109p() {
        C4692h f = this.f4670c.mo32166f();
        if (f == null || f.mo32279d0()) {
            return 0;
        }
        return f.mo32278c0();
    }

    /* renamed from: q */
    private final void m6110q() {
        this.f4677j.removeCallbacks(this.f4678k);
    }

    /* renamed from: r */
    private final void m6111r() {
        C9052b bVar = this.f4680m;
        if (bVar != null) {
            bVar.mo32437d();
            this.f4680m = null;
        }
    }

    /* renamed from: s */
    private final void m6112s() {
        C9052b bVar = this.f4679l;
        if (bVar != null) {
            bVar.mo32437d();
            this.f4679l = null;
        }
    }

    /* renamed from: t */
    private final void m6113t(int i) {
        this.f4673f = new C4680u0(this, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m6114u() {
        synchronized (this.f4681n) {
            for (C4640a f : this.f4681n) {
                f.mo32090f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m6115v() {
        synchronized (this.f4681n) {
            for (C4640a b : this.f4681n) {
                b.mo32086b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m6116w(int[] iArr) {
        synchronized (this.f4681n) {
            for (C4640a e : this.f4681n) {
                e.mo32089e(iArr);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m6117x() {
        synchronized (this.f4681n) {
            for (C4640a g : this.f4681n) {
                g.mo32091g();
            }
        }
    }

    /* renamed from: y */
    private final void m6118y() {
        m6110q();
        this.f4677j.postDelayed(this.f4678k, 500);
    }

    /* renamed from: l */
    public final void mo32081l() {
        m6117x();
        this.f4671d.clear();
        this.f4672e.clear();
        this.f4673f.evictAll();
        this.f4674g.clear();
        m6110q();
        this.f4675h.clear();
        m6111r();
        m6112s();
        m6115v();
        m6114u();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: m */
    public final void mo32082m(C4648h.C4651c cVar) {
        Status status = cVar.getStatus();
        int F = status.mo32378F();
        if (F != 0) {
            this.f4668a.mo42759f(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(F), status.mo32379G()}), new Object[0]);
        }
        this.f4680m = null;
        if (!this.f4675h.isEmpty()) {
            m6118y();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n */
    public final void mo32083n(C4648h.C4651c cVar) {
        Status status = cVar.getStatus();
        int F = status.mo32378F();
        if (F != 0) {
            this.f4668a.mo42759f(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(F), status.mo32379G()}), new Object[0]);
        }
        this.f4679l = null;
        if (!this.f4675h.isEmpty()) {
            m6118y();
        }
    }

    @VisibleForTesting
    /* renamed from: o */
    public final void mo32084o() {
        C9713p.m20270e("Must be called from the main thread.");
        if (this.f4669b != 0 && this.f4680m == null) {
            m6111r();
            m6112s();
            C9052b I = this.f4670c.mo32151I();
            this.f4680m = I;
            I.mo32438e(new C4674r0(this));
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.d$a */
    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
    public static abstract class C4640a {
        /* renamed from: b */
        public void mo32086b() {
        }

        /* renamed from: f */
        public void mo32090f() {
        }

        /* renamed from: g */
        public void mo32091g() {
        }

        /* renamed from: c */
        public void mo32087c(@NonNull int[] iArr) {
        }

        /* renamed from: e */
        public void mo32089e(@NonNull int[] iArr) {
        }

        /* renamed from: a */
        public void mo32085a(int i, int i2) {
        }

        /* renamed from: d */
        public void mo32088d(@NonNull List<Integer> list, int i) {
        }
    }
}
