package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4723d;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C4746d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p180o4.C8974c;
import p200q4.C9218b;
import p200q4.C9225e0;
import p200q4.C9229g0;
import p200q4.C9243p;
import p200q4.C9247t;
import p200q4.C9251x;
import p231t4.C9705n;
import p231t4.C9713p;
import p253v4.C9939e;
import p276x5.C10406g;
import p286y4.C10668b;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4777t<O extends C4719a.C4723d> implements C4733c.C4734a, C4733c.C4735b {

    /* renamed from: a */
    private final Queue<C4760i0> f5029a = new LinkedList();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: b */
    public final C4719a.C4728f f5030b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9218b<O> f5031c;

    /* renamed from: d */
    private final C4765l f5032d;

    /* renamed from: e */
    private final Set<C9229g0> f5033e = new HashSet();

    /* renamed from: f */
    private final Map<C4746d.C4747a<?>, C9251x> f5034f = new HashMap();

    /* renamed from: g */
    private final int f5035g;
    @Nullable

    /* renamed from: h */
    private final C9225e0 f5036h;

    /* renamed from: i */
    private boolean f5037i;

    /* renamed from: j */
    private final List<C4778u> f5038j = new ArrayList();
    @Nullable

    /* renamed from: k */
    private ConnectionResult f5039k = null;

    /* renamed from: l */
    private int f5040l = 0;

    /* renamed from: m */
    final /* synthetic */ C4744c f5041m;

    @WorkerThread
    public C4777t(C4744c cVar, C4730b<O> bVar) {
        this.f5041m = cVar;
        C4719a.C4728f w = bVar.mo32423w(cVar.f4965q.getLooper(), this);
        this.f5030b = w;
        this.f5031c = bVar.mo32416p();
        this.f5032d = new C4765l();
        this.f5035g = bVar.mo32422v();
        if (w.mo32407o()) {
            this.f5036h = bVar.mo32424x(cVar.f4956h, cVar.f4965q);
        } else {
            this.f5036h = null;
        }
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    private final C8974c m6637b(@Nullable C8974c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            C8974c[] l = this.f5030b.mo32404l();
            if (l == null) {
                l = new C8974c[0];
            }
            ArrayMap arrayMap = new ArrayMap(r3);
            for (C8974c cVar : l) {
                arrayMap.put(cVar.mo43146A(), Long.valueOf(cVar.mo43147F()));
            }
            for (C8974c cVar2 : cVarArr) {
                Long l2 = (Long) arrayMap.get(cVar2.mo43146A());
                if (l2 == null || l2.longValue() < cVar2.mo43147F()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    /* renamed from: c */
    private final void m6638c(ConnectionResult connectionResult) {
        String str;
        for (C9229g0 next : this.f5033e) {
            if (C9705n.m20259b(connectionResult, ConnectionResult.f4869f)) {
                str = this.f5030b.mo32398e();
            } else {
                str = null;
            }
            next.mo43528b(this.f5031c, connectionResult, str);
        }
        this.f5033e.clear();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: d */
    public final void m6639d(Status status) {
        C9713p.m20269d(this.f5041m.f4965q);
        m6640e(status, (Exception) null, false);
    }

    @WorkerThread
    /* renamed from: e */
    private final void m6640e(@Nullable Status status, @Nullable Exception exc, boolean z) {
        boolean z2;
        C9713p.m20269d(this.f5041m.f4965q);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator<C4760i0> it = this.f5029a.iterator();
            while (it.hasNext()) {
                C4760i0 next = it.next();
                if (!z || next.f5001a == 2) {
                    if (status != null) {
                        next.mo32491a(status);
                    } else {
                        next.mo32492b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @WorkerThread
    /* renamed from: f */
    private final void m6641f() {
        ArrayList arrayList = new ArrayList(this.f5029a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C4760i0 i0Var = (C4760i0) arrayList.get(i);
            if (this.f5030b.mo32399g()) {
                if (m6647l(i0Var)) {
                    this.f5029a.remove(i0Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: g */
    public final void m6642g() {
        mo32546A();
        m6638c(ConnectionResult.f4869f);
        m6646k();
        Iterator<C9251x> it = this.f5034f.values().iterator();
        while (it.hasNext()) {
            C9251x next = it.next();
            if (m6637b(next.f13596a.mo32502c()) != null) {
                it.remove();
            } else {
                try {
                    next.f13596a.mo32503d(this.f5030b, new C10406g());
                } catch (DeadObjectException unused) {
                    mo32550E(3);
                    this.f5030b.mo32395b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m6641f();
        m6644i();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h */
    public final void m6643h(int i) {
        mo32546A();
        this.f5037i = true;
        this.f5032d.mo32529e(i, this.f5030b.mo32405m());
        C4744c cVar = this.f5041m;
        cVar.f4965q.sendMessageDelayed(Message.obtain(cVar.f4965q, 9, this.f5031c), this.f5041m.f4950b);
        C4744c cVar2 = this.f5041m;
        cVar2.f4965q.sendMessageDelayed(Message.obtain(cVar2.f4965q, 11, this.f5031c), this.f5041m.f4951c);
        this.f5041m.f4958j.mo44196c();
        for (C9251x xVar : this.f5034f.values()) {
            xVar.f13598c.run();
        }
    }

    /* renamed from: i */
    private final void m6644i() {
        this.f5041m.f4965q.removeMessages(12, this.f5031c);
        C4744c cVar = this.f5041m;
        cVar.f4965q.sendMessageDelayed(cVar.f4965q.obtainMessage(12, this.f5031c), this.f5041m.f4952d);
    }

    @WorkerThread
    /* renamed from: j */
    private final void m6645j(C4760i0 i0Var) {
        i0Var.mo32499d(this.f5032d, mo32560P());
        try {
            i0Var.mo32493c(this);
        } catch (DeadObjectException unused) {
            mo32550E(1);
            this.f5030b.mo32395b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    /* renamed from: k */
    private final void m6646k() {
        if (this.f5037i) {
            this.f5041m.f4965q.removeMessages(11, this.f5031c);
            this.f5041m.f4965q.removeMessages(9, this.f5031c);
            this.f5037i = false;
        }
    }

    @WorkerThread
    /* renamed from: l */
    private final boolean m6647l(C4760i0 i0Var) {
        if (!(i0Var instanceof C9247t)) {
            m6645j(i0Var);
            return true;
        }
        C9247t tVar = (C9247t) i0Var;
        C8974c b = m6637b(tVar.mo32507g(this));
        if (b == null) {
            m6645j(i0Var);
            return true;
        }
        String name = this.f5030b.getClass().getName();
        String A = b.mo43146A();
        long F = b.mo43147F();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(A).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(A);
        sb.append(", ");
        sb.append(F);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f5041m.f4966r || !tVar.mo32506f(this)) {
            tVar.mo32492b(new UnsupportedApiCallException(b));
            return true;
        }
        C4778u uVar = new C4778u(this.f5031c, b, (C9243p) null);
        int indexOf = this.f5038j.indexOf(uVar);
        if (indexOf >= 0) {
            C4778u uVar2 = this.f5038j.get(indexOf);
            this.f5041m.f4965q.removeMessages(15, uVar2);
            C4744c cVar = this.f5041m;
            cVar.f4965q.sendMessageDelayed(Message.obtain(cVar.f4965q, 15, uVar2), this.f5041m.f4950b);
            return false;
        }
        this.f5038j.add(uVar);
        C4744c cVar2 = this.f5041m;
        cVar2.f4965q.sendMessageDelayed(Message.obtain(cVar2.f4965q, 15, uVar), this.f5041m.f4950b);
        C4744c cVar3 = this.f5041m;
        cVar3.f4965q.sendMessageDelayed(Message.obtain(cVar3.f4965q, 16, uVar), this.f5041m.f4951c);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m6648m(connectionResult)) {
            return false;
        }
        this.f5041m.mo32487h(connectionResult, this.f5035g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m6648m(@androidx.annotation.NonNull com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C4744c.f4948u
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.c r1 = r3.f5041m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.m r2 = r1.f4962n     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f4963o     // Catch:{ all -> 0x002a }
            q4.b<O> r2 = r3.f5031c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.c r1 = r3.f5041m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.m r1 = r1.f4962n     // Catch:{ all -> 0x002a }
            int r2 = r3.f5035g     // Catch:{ all -> 0x002a }
            r1.mo32537s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C4777t.m6648m(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: n */
    public final boolean m6649n(boolean z) {
        C9713p.m20269d(this.f5041m.f4965q);
        if (!this.f5030b.mo32399g() || this.f5034f.size() != 0) {
            return false;
        }
        if (this.f5032d.mo32531g()) {
            if (z) {
                m6644i();
            }
            return false;
        }
        this.f5030b.mo32395b("Timing out service connection.");
        return true;
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ void m6655y(C4777t tVar, C4778u uVar) {
        if (!tVar.f5038j.contains(uVar) || tVar.f5037i) {
            return;
        }
        if (!tVar.f5030b.mo32399g()) {
            tVar.mo32547B();
        } else {
            tVar.m6641f();
        }
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m6656z(C4777t tVar, C4778u uVar) {
        C8974c[] g;
        if (tVar.f5038j.remove(uVar)) {
            tVar.f5041m.f4965q.removeMessages(15, uVar);
            tVar.f5041m.f4965q.removeMessages(16, uVar);
            C8974c a = uVar.f5043b;
            ArrayList arrayList = new ArrayList(tVar.f5029a.size());
            for (C4760i0 next : tVar.f5029a) {
                if ((next instanceof C9247t) && (g = ((C9247t) next).mo32507g(tVar)) != null && C10668b.m22668c(g, a)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4760i0 i0Var = (C4760i0) arrayList.get(i);
                tVar.f5029a.remove(i0Var);
                i0Var.mo32492b(new UnsupportedApiCallException(a));
            }
        }
    }

    @WorkerThread
    /* renamed from: A */
    public final void mo32546A() {
        C9713p.m20269d(this.f5041m.f4965q);
        this.f5039k = null;
    }

    @WorkerThread
    /* renamed from: B */
    public final void mo32547B() {
        C9713p.m20269d(this.f5041m.f4965q);
        if (!this.f5030b.mo32399g() && !this.f5030b.mo32397d()) {
            try {
                C4744c cVar = this.f5041m;
                int b = cVar.f4958j.mo44195b(cVar.f4956h, this.f5030b);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f5030b.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    mo32551F(connectionResult, (Exception) null);
                    return;
                }
                C4744c cVar2 = this.f5041m;
                C4719a.C4728f fVar = this.f5030b;
                C4780w wVar = new C4780w(cVar2, fVar, this.f5031c);
                if (fVar.mo32407o()) {
                    ((C9225e0) C9713p.m20275j(this.f5036h)).mo43516e3(wVar);
                }
                try {
                    this.f5030b.mo32400h(wVar);
                } catch (SecurityException e) {
                    mo32551F(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo32551F(new ConnectionResult(10), e2);
            }
        }
    }

    @WorkerThread
    /* renamed from: C */
    public final void mo32548C(C4760i0 i0Var) {
        C9713p.m20269d(this.f5041m.f4965q);
        if (!this.f5030b.mo32399g()) {
            this.f5029a.add(i0Var);
            ConnectionResult connectionResult = this.f5039k;
            if (connectionResult == null || !connectionResult.mo32337H()) {
                mo32547B();
            } else {
                mo32551F(this.f5039k, (Exception) null);
            }
        } else if (m6647l(i0Var)) {
            m6644i();
        } else {
            this.f5029a.add(i0Var);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: D */
    public final void mo32549D() {
        this.f5040l++;
    }

    /* renamed from: E */
    public final void mo32550E(int i) {
        if (Looper.myLooper() == this.f5041m.f4965q.getLooper()) {
            m6643h(i);
        } else {
            this.f5041m.f4965q.post(new C4774q(this, i));
        }
    }

    @WorkerThread
    /* renamed from: F */
    public final void mo32551F(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        C9713p.m20269d(this.f5041m.f4965q);
        C9225e0 e0Var = this.f5036h;
        if (e0Var != null) {
            e0Var.mo43517f3();
        }
        mo32546A();
        this.f5041m.f4958j.mo44196c();
        m6638c(connectionResult);
        if ((this.f5030b instanceof C9939e) && connectionResult.mo32334A() != 24) {
            this.f5041m.f4953e = true;
            C4744c cVar = this.f5041m;
            cVar.f4965q.sendMessageDelayed(cVar.f4965q.obtainMessage(19), 300000);
        }
        if (connectionResult.mo32334A() == 4) {
            m6639d(C4744c.f4947t);
        } else if (this.f5029a.isEmpty()) {
            this.f5039k = connectionResult;
        } else if (exc != null) {
            C9713p.m20269d(this.f5041m.f4965q);
            m6640e((Status) null, exc, false);
        } else if (this.f5041m.f4966r) {
            m6640e(C4744c.m6510i(this.f5031c, connectionResult), (Exception) null, true);
            if (!this.f5029a.isEmpty() && !m6648m(connectionResult) && !this.f5041m.mo32487h(connectionResult, this.f5035g)) {
                if (connectionResult.mo32334A() == 18) {
                    this.f5037i = true;
                }
                if (this.f5037i) {
                    C4744c cVar2 = this.f5041m;
                    cVar2.f4965q.sendMessageDelayed(Message.obtain(cVar2.f4965q, 9, this.f5031c), this.f5041m.f4950b);
                    return;
                }
                m6639d(C4744c.m6510i(this.f5031c, connectionResult));
            }
        } else {
            m6639d(C4744c.m6510i(this.f5031c, connectionResult));
        }
    }

    @WorkerThread
    /* renamed from: G */
    public final void mo32552G(@NonNull ConnectionResult connectionResult) {
        mo32551F(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo32553H(@NonNull ConnectionResult connectionResult) {
        C9713p.m20269d(this.f5041m.f4965q);
        C4719a.C4728f fVar = this.f5030b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo32395b(sb.toString());
        mo32551F(connectionResult, (Exception) null);
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo32554I(C9229g0 g0Var) {
        C9713p.m20269d(this.f5041m.f4965q);
        this.f5033e.add(g0Var);
    }

    /* renamed from: J */
    public final void mo32555J(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f5041m.f4965q.getLooper()) {
            m6642g();
        } else {
            this.f5041m.f4965q.post(new C4773p(this));
        }
    }

    @WorkerThread
    /* renamed from: K */
    public final void mo32556K() {
        C9713p.m20269d(this.f5041m.f4965q);
        if (this.f5037i) {
            mo32547B();
        }
    }

    @WorkerThread
    /* renamed from: L */
    public final void mo32557L() {
        C9713p.m20269d(this.f5041m.f4965q);
        m6639d(C4744c.f4946s);
        this.f5032d.mo32530f();
        for (C4746d.C4747a h0Var : (C4746d.C4747a[]) this.f5034f.keySet().toArray(new C4746d.C4747a[0])) {
            mo32548C(new C4758h0(h0Var, new C10406g()));
        }
        m6638c(new ConnectionResult(4));
        if (this.f5030b.mo32399g()) {
            this.f5030b.mo32401i(new C4776s(this));
        }
    }

    @WorkerThread
    /* renamed from: M */
    public final void mo32558M() {
        Status status;
        C9713p.m20269d(this.f5041m.f4965q);
        if (this.f5037i) {
            m6646k();
            C4744c cVar = this.f5041m;
            if (cVar.f4957i.mo32346g(cVar.f4956h) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m6639d(status);
            this.f5030b.mo32395b("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo32559O() {
        return this.f5030b.mo32399g();
    }

    /* renamed from: P */
    public final boolean mo32560P() {
        return this.f5030b.mo32407o();
    }

    @WorkerThread
    /* renamed from: a */
    public final boolean mo32561a() {
        return m6649n(true);
    }

    /* renamed from: o */
    public final int mo32562o() {
        return this.f5035g;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final int mo32563p() {
        return this.f5040l;
    }

    @WorkerThread
    @Nullable
    /* renamed from: q */
    public final ConnectionResult mo32564q() {
        C9713p.m20269d(this.f5041m.f4965q);
        return this.f5039k;
    }

    /* renamed from: s */
    public final C4719a.C4728f mo32565s() {
        return this.f5030b;
    }

    /* renamed from: u */
    public final Map<C4746d.C4747a<?>, C9251x> mo32566u() {
        return this.f5034f;
    }
}
