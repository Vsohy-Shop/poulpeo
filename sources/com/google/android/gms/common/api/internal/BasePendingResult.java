package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p121i5.C8185f;
import p190p4.C9052b;
import p190p4.C9055d;
import p190p4.C9056e;
import p190p4.C9057f;
import p200q4.C9231h0;
import p231t4.C9713p;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class BasePendingResult<R extends C9056e> extends C9052b<R> {

    /* renamed from: n */
    static final ThreadLocal<Boolean> f4922n = new C4770n0();

    /* renamed from: a */
    private final Object f4923a;
    @NonNull

    /* renamed from: b */
    protected final C4738a<R> f4924b;
    @NonNull

    /* renamed from: c */
    protected final WeakReference<C4733c> f4925c;

    /* renamed from: d */
    private final CountDownLatch f4926d;

    /* renamed from: e */
    private final ArrayList<C9052b.C9053a> f4927e;
    @Nullable

    /* renamed from: f */
    private C9057f<? super R> f4928f;

    /* renamed from: g */
    private final AtomicReference<C4748d0> f4929g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public R f4930h;

    /* renamed from: i */
    private Status f4931i;

    /* renamed from: j */
    private volatile boolean f4932j;

    /* renamed from: k */
    private boolean f4933k;

    /* renamed from: l */
    private boolean f4934l;

    /* renamed from: m */
    private boolean f4935m;
    @KeepName
    private C4772o0 mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4738a<R extends C9056e> extends C8185f {
        public C4738a(@NonNull Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo32444a(@NonNull C9057f<? super R> fVar, @NonNull R r) {
            ThreadLocal<Boolean> threadLocal = BasePendingResult.f4922n;
            sendMessage(obtainMessage(1, new Pair((C9057f) C9713p.m20275j(fVar), r)));
        }

        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C9057f fVar = (C9057f) pair.first;
                C9056e eVar = (C9056e) pair.second;
                try {
                    fVar.mo32221a(eVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m6466o(eVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo32439g(Status.f4892j);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f4923a = new Object();
        this.f4926d = new CountDownLatch(1);
        this.f4927e = new ArrayList<>();
        this.f4929g = new AtomicReference<>();
        this.f4935m = false;
        this.f4924b = new C4738a<>(Looper.getMainLooper());
        this.f4925c = new WeakReference<>((Object) null);
    }

    /* renamed from: k */
    private final R m6463k() {
        R r;
        synchronized (this.f4923a) {
            C9713p.m20279n(!this.f4932j, "Result has already been consumed.");
            C9713p.m20279n(mo32441i(), "Result is not ready.");
            r = this.f4930h;
            this.f4930h = null;
            this.f4928f = null;
            this.f4932j = true;
        }
        if (this.f4929g.getAndSet((Object) null) == null) {
            return (C9056e) C9713p.m20275j(r);
        }
        throw null;
    }

    /* renamed from: l */
    private final void m6464l(R r) {
        this.f4930h = r;
        this.f4931i = r.getStatus();
        this.f4926d.countDown();
        if (this.f4933k) {
            this.f4928f = null;
        } else {
            C9057f<? super R> fVar = this.f4928f;
            if (fVar != null) {
                this.f4924b.removeMessages(2);
                this.f4924b.mo32444a(fVar, m6463k());
            } else if (this.f4930h instanceof C9055d) {
                this.mResultGuardian = new C4772o0(this, (C9231h0) null);
            }
        }
        ArrayList<C9052b.C9053a> arrayList = this.f4927e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo32523a(this.f4931i);
        }
        this.f4927e.clear();
    }

    /* renamed from: o */
    public static void m6466o(@Nullable C9056e eVar) {
        if (eVar instanceof C9055d) {
            try {
                ((C9055d) eVar).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(eVar)), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo32435b(@NonNull C9052b.C9053a aVar) {
        boolean z;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20267b(z, "Callback cannot be null.");
        synchronized (this.f4923a) {
            if (mo32441i()) {
                aVar.mo32523a(this.f4931i);
            } else {
                this.f4927e.add(aVar);
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public final R mo32436c(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            C9713p.m20274i("await must not be called on the UI thread when time is greater than zero.");
        }
        C9713p.m20279n(!this.f4932j, "Result has already been consumed.");
        C9713p.m20279n(true, "Cannot await if then() has been called.");
        try {
            if (!this.f4926d.await(j, timeUnit)) {
                mo32439g(Status.f4892j);
            }
        } catch (InterruptedException unused) {
            mo32439g(Status.f4890h);
        }
        C9713p.m20279n(mo32441i(), "Result is not ready.");
        return m6463k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32437d() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4923a
            monitor-enter(r0)
            boolean r1 = r2.f4933k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.f4932j     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.f4930h     // Catch:{ all -> 0x0021 }
            m6466o(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.f4933k = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f4893k     // Catch:{ all -> 0x0021 }
            p4.e r1 = r2.mo32075f(r1)     // Catch:{ all -> 0x0021 }
            r2.m6464l(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo32437d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32438e(@androidx.annotation.Nullable p190p4.C9057f<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4923a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f4928f = r5     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x000a:
            boolean r1 = r4.f4932j     // Catch:{ all -> 0x0034 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            p231t4.C9713p.m20279n(r1, r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            p231t4.C9713p.m20279n(r2, r1)     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.mo32440h()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0020:
            boolean r1 = r4.mo32441i()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0030
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.f4924b     // Catch:{ all -> 0x0034 }
            p4.e r2 = r4.m6463k()     // Catch:{ all -> 0x0034 }
            r1.mo32444a(r5, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0030:
            r4.f4928f = r5     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo32438e(p4.f):void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public abstract R mo32075f(@NonNull Status status);

    @Deprecated
    /* renamed from: g */
    public final void mo32439g(@NonNull Status status) {
        synchronized (this.f4923a) {
            if (!mo32441i()) {
                mo32442j(mo32075f(status));
                this.f4934l = true;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo32440h() {
        boolean z;
        synchronized (this.f4923a) {
            z = this.f4933k;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo32441i() {
        if (this.f4926d.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo32442j(@NonNull R r) {
        synchronized (this.f4923a) {
            if (this.f4934l || this.f4933k) {
                m6466o(r);
                return;
            }
            mo32441i();
            C9713p.m20279n(!mo32441i(), "Results have already been set");
            C9713p.m20279n(!this.f4932j, "Result has already been consumed");
            m6464l(r);
        }
    }

    /* renamed from: n */
    public final void mo32443n() {
        boolean z = true;
        if (!this.f4935m && !f4922n.get().booleanValue()) {
            z = false;
        }
        this.f4935m = z;
    }

    protected BasePendingResult(@Nullable C4733c cVar) {
        this.f4923a = new Object();
        this.f4926d = new CountDownLatch(1);
        this.f4927e = new ArrayList<>();
        this.f4929g = new AtomicReference<>();
        this.f4935m = false;
        this.f4924b = new C4738a<>(cVar != null ? cVar.mo32428c() : Looper.getMainLooper());
        this.f4925c = new WeakReference<>(cVar);
    }
}
